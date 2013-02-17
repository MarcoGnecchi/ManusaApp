package it.manusaservices.activities;

import it.manusaserveces.activities.R;
import android.os.Bundle;
import android.preference.PreferenceFragment;

public class PrefsActivity extends ManusaActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getFragmentManager().beginTransaction().replace(android.R.id.content, new SettingsFragment()).commit();
	}

	
	public static class SettingsFragment extends PreferenceFragment {
	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
            addPreferencesFromResource(R.xml.prefs);
	    }
	    
	}


}
