package it.manusaservices.activities;


import android.os.Bundle;
import it.manusaserveces.activities.R;

public class DashBoard extends ManusaActivity {


	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dashboard);
		android.app.ActionBar actionBar = getActionBar();

	}

}