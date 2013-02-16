package it.manusaservices.activities;


import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import it.manusaserveces.activities.R;

public class DashBoard extends ManusaActivity {


	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dashboard);
		android.app.ActionBar actionBar = getActionBar();

	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu){
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.settings,menu);
		return true;
	}
	
}