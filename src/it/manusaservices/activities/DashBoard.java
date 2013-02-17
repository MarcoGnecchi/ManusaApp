package it.manusaservices.activities;

import it.manusaserveces.activities.R;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class DashBoard extends ManusaActivity {

	public static final int VIEW_PLANT = 1;
	public static final int CREATE_REPORT = 2;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dashboard);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.settings, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.preferences:
			startActivity(new Intent(this, PrefsActivity.class));
			break;
		}
		return true;
	}

	public void onPreviewAction(View v) {
		Intent intent = new Intent(this, PlantPullerActivity.class);
		startActivityForResult(intent, VIEW_PLANT);

	}

	public void onReportAction(View v) {
		Intent intent = new Intent(this, PlantPullerActivity.class);
		startActivityForResult(intent, CREATE_REPORT);

	}

	public void onActivityResult(int requestCode, int resultCode, Intent intent) {
		IntentResult scanResult = IntentIntegrator.parseActivityResult(
				requestCode, resultCode, intent);
		Intent i= null;
		if (resultCode == RESULT_OK) {
			switch (requestCode) {
			case VIEW_PLANT: {
				i = new Intent(this, ViewPlantActivity.class);
			}
				break;

			case CREATE_REPORT: {
				i = new Intent(this, ReportActivity.class);
			}
				break;

			default:
				break;
			}
			
			if (i!=null){
				startActivity(i);
			}
		}
		// else continue with any other code you need in the method

	}
}