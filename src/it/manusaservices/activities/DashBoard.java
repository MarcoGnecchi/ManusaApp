package it.manusaservices.activities;



import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

import android.app.ActionBar;
import android.app.DialogFragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import it.manusaserveces.activities.R;
import it.manusaservices.dialogs.ScanMethodDialog;

public class DashBoard extends ManusaActivity {


	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dashboard);
		ActionBar actionBar = getActionBar();

	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu){
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.settings,menu);
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
	
	public void onPreviewAction(View v){
		DialogFragment dialog  = new ScanMethodDialog(ScanMethodDialog.VIEW_DETAILS);
		dialog.show(getFragmentManager(), "dialog");
		
//		
//		IntentIntegrator integrator = new IntentIntegrator(DashBoard.this);
//		integrator.initiateScan();
	}
	
	public void onActivityResult(int requestCode, int resultCode, Intent intent) {
		  IntentResult scanResult = IntentIntegrator.parseActivityResult(requestCode, resultCode, intent);
		  if (scanResult != null) {
		    // handle scan result
		  }
		  // else continue with any other code you need in the method
		  
		}
}