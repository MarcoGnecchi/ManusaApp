package it.manusaservices.activities;

import it.manusaserveces.activities.R;
import it.manusaservices.model.Plant;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class PlantPullerActivity extends ManusaActivity {

	public final int SUCCESS_RETURN_CODE = 1;
	public final int CODE_NOT_FOUND = 2;
	public final int CANCELED = 3;
	ManusaApplication mApplication;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.plantpuller);

	}

	public void onActivityResult(int requestCode, int resultCode, Intent intent) {
		IntentResult scanResult = IntentIntegrator.parseActivityResult(
				requestCode, resultCode, intent);

		if (scanResult.getContents() != null) {
			String barCode = scanResult.getContents().toString();

			// resultIntent.putExtra("barCode", barCode);
			// setResult(RESULT_OK, resultIntent);

			Log.i("PlantSelectorActivity", "BarCode found:" + barCode);
			
			new RetrievePlant().execute(barCode);
		} else {
			Intent resultIntent = new Intent();
			setResult(RESULT_CANCELED, null);
			Log.i("PlantSelectorActivity", "BarCode not found");
			finish();
		}

	}

	private class RetrievePlant extends AsyncTask<String, Integer, Boolean> {

		ProgressDialog progressDialog; 

		@Override
		protected void onPreExecute() {
			super.onPreExecute();
			ProgressDialog.show(PlantPullerActivity.this, "", "Downloading...");
			
		}
		
		@Override
		protected Boolean doInBackground(String... params) {

			// Instantiate new Plant
			Log.i("manusApp", params[0]);

			mApplication = ((ManusaApplication) getApplication());
			// I'm not going to implement the network layer today, therefore this
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
			progressDialog.dismiss();
		}

	}
}