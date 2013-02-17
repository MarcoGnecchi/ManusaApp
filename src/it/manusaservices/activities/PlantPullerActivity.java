package it.manusaservices.activities;

import it.manusaserveces.activities.R;
import it.manusaservices.model.Plant;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class PlantPullerActivity extends ManusaActivity implements
		OnClickListener {

	public final int SUCCESS_RETURN_CODE = 1;
	public final int CODE_NOT_FOUND = 2;
	public final int CANCELED = 3;

	EditText mBarcode;
	ProgressDialog pd;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.plantpuller);
		ImageButton mSearch = (ImageButton) findViewById(R.id.search);
		mBarcode = (EditText) findViewById(R.id.barcode);

		mSearch.setOnClickListener(this);

	}

	public void onActivityResult(int requestCode, int resultCode, Intent intent) {
		IntentResult scanResult = IntentIntegrator.parseActivityResult(
				requestCode, resultCode, intent);

		if (scanResult.getContents() != null) {
			String barCode = scanResult.getContents().toString();

			// resultIntent.putExtra("barCode", barCode);
			// setResult(RESULT_OK, resultIntent);
			new RetrievePlant().execute(mBarcode.getText().toString());
			Log.i("PlantSelectorActivity", "BarCode found:" + barCode);

		} else {
			setResult(RESULT_CANCELED, null);
			Log.i("PlantSelectorActivity", "BarCode not found");
			finish();
		}

	}

	@Override
	public void onClick(View v) {
		if (!"".equals(mBarcode.getText().toString())) {
			new RetrievePlant().execute(mBarcode.getText().toString());
		} else {
			Toast.makeText(this, "the ID is empty", Toast.LENGTH_SHORT).show();
		}

	}

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.pull_plant, menu);
		return true;
	}

	private class RetrievePlant extends AsyncTask<String, Integer, Boolean> {

		ManusaApplication mApplication;
		
		
		@Override
		protected void onPreExecute() {
			super.onPreExecute();
			mApplication = ((ManusaApplication) getApplication());
			 pd = ProgressDialog.show(PlantPullerActivity.this, "", "Downloading...");

		}

		@Override
		protected Boolean doInBackground(String... params) {

			// I'm not going to implement the network layer today, therefore
			// this
			// is a custom standard plant
			mApplication.plant = new Plant();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return true;
		}

		@Override
		protected void onPostExecute(Boolean result) {
			super.onPostExecute(result);
			pd.dismiss();

			Intent resultIntent = new Intent();
			setResult(RESULT_OK, resultIntent);
			Log.i("PlantPullerActivity", "BarCode found!");
			finish();
		}

	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.camera:
			IntentIntegrator integrator = new IntentIntegrator(this);
			integrator.initiateScan();
			break;
		}
		return super.onOptionsItemSelected(item);

	}
}