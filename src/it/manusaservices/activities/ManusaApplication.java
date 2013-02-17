package it.manusaservices.activities;

import it.manusaservices.model.Plant;
import it.manusaservices.model.Work;

import java.net.MalformedURLException;
import java.net.URL;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class ManusaApplication extends Application {
	
	private SharedPreferences prefs;
	
	Plant plant;
	Work work;
	URL url;
	
	public ManusaApplication() {
		
	}

	public Plant getPlant() {
		return plant;
	}

	public void setPlant(Plant plant) {
		this.plant = plant;
	}

	public Work getWork() {
		return work;
	}

	public void setWork(Work work) {
		this.work = work;
	}
	
	
	

}
