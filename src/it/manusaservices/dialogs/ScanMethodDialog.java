package it.manusaservices.dialogs;

import it.manusaserveces.activities.R;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

public class ScanMethodDialog extends DialogFragment {
	
	int mParam;
	
	public static int CREATE_REPORT = 1;
	public static int VIEW_DETAILS = 2;
	
	public ScanMethodDialog(int mode) {
		mParam = mode;
	}
	
	@Override
	public Dialog onCreateDialog(Bundle savedInstanceState) {
	    AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
	    builder.setTitle("Pick")
	           .setItems(R.array.dialogchoices, new DialogInterface.OnClickListener() {
	               public void onClick(DialogInterface dialog, int which) {
	               
	           }
	    });
	    return builder.create();
	}
	
}
