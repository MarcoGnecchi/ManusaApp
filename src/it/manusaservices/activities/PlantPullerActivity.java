package it.manusaservices.activities;

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
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
	}
	
	
	public void onActivityResult(int requestCode, int resultCode, Intent intent) {
		IntentResult scanResult = IntentIntegrator.parseActivityResult(
				requestCode, resultCode, intent);

		if (scanResult.getContents() != null) {
			String barCode = scanResult.getContents().toString();

//			resultIntent.putExtra("barCode", barCode);
//			setResult(RESULT_OK, resultIntent);
			
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

		@Override
		protected Boolean doInBackground(String... params) {
			
			// Instantiate new Plant
			Log.i("manusApp", params[0]);
			
			manusaApp.plant = manusaApp.retrievePlantData(params[0]);
			 
			
			if (manusaApp.plant != null)
				return true;
			else
				return false;
		}

		@Override
		protected void onPostExecute(Boolean result) {
			super.onPostExecute(result);
			pd.dismiss();

			if (!result) {
				Alert("Si è verificato un problema nel download dei dati, verificare i parametri di connessione");
				finish();
			} else {
				showPlant(manusaApp.plant);
			}
		}

	
}
