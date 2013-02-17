package it.manusaservices.fragments;

import it.manusaserveces.activities.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;


public class CustomerFragment extends Fragment {

	    public static CustomerFragment newInstance() {
	        CustomerFragment fragment = new CustomerFragment();
	        return fragment;
	    }


	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);

	    }

	    @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
	        View layout = inflater.inflate(R.layout.customerdata,container,false); 

	        return layout;
	    }

	   
}
