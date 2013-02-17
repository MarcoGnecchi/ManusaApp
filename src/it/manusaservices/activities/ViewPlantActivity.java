package it.manusaservices.activities;

import it.manusaserveces.activities.R;
import it.manusaservices.model.Plant;
import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ViewPlantActivity extends Activity {

	LinearLayout plantFeatures;
	Button viewDoorDetails;
	ManusaApplication manusaApp;
	ProgressDialog pd;
	String barCode;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.viewplant);
		manusaApp = ((ManusaApplication) getApplication());		
		showPlant(manusaApp.plant);
	}

	
	/**
	 * Funzione per l'assegnamento dei risultati ai campi delle TextBox della UI
	 * 
	 */
	private void showPlant(Plant plant) {
		// Setting plant number
		TextView plantNumber = (TextView) findViewById(R.id.plantNumberText);
		TextView plantAddress = (TextView) findViewById(R.id.plantAddressText);
		TextView plantCity = (TextView) findViewById(R.id.plantCityText);
		TextView plantDateWarranty = (TextView) findViewById(R.id.plantDateWarrantyText);
		TextView plantShipmentDate = (TextView) findViewById(R.id.plantShipmentDateText);
		TextView plantState = (TextView) findViewById(R.id.plantStateText);
		TextView plantWarrantyType = (TextView) findViewById(R.id.plantWarrantyTypeText);
		TextView plantSupplyType = (TextView) findViewById(R.id.plantSupplyTypeText);

		try {

			plantNumber.setText(plant.getNumber());
			plantAddress.setText(plant.getAddress());
			plantCity.setText(plant.getCity());
			plantDateWarranty.setText(plant.getWarrantyDate());
			plantShipmentDate.setText(plant.getShipmentDate());
			plantState.setText(plant.getState());
			plantWarrantyType.setText(plant.getWarranty());
			plantSupplyType.setText(plant.getSupply());
		
		} catch (NullPointerException e) {
			// TODO: handle exception
		}

	}

	
}// Class
