package com.example.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.sax.StartElementListener;
import android.telephony.TelephonyManager;
import android.widget.Toast;


public class Details extends BroadcastReceiver {
	
	
	//onReceive is called when a broadcast is received

	@Override
	public void onReceive(Context context, Intent intent) {
		
		//the broadcast receivers registered in the manifest receive intents broadcasted by the system when a call or message is received by the phone
		Bundle bundle=intent.getExtras();
		
		//   CALLS: iF I RECEIVE A CALL, TOAST THE NUMBER CALLING ME AT WHATEVER CONTEXT 

		//Get the state of the phone from the bundle
			String phone_state=bundle.getString(TelephonyManager.EXTRA_STATE);
			
			// if the phones state is that its ringing....
			if(phone_state.equals(TelephonyManager.EXTRA_STATE_RINGING))
			{
				//get the number
				String phone_number=bundle.getString(TelephonyManager.EXTRA_INCOMING_NUMBER);
				
				//toast the number calling
				Toast.makeText(context, "Call from : "+ phone_number, Toast.LENGTH_LONG).show();
				
				Intent goIntent= new Intent(context, call.class);
				goIntent.putExtras(bundle);
				
				goIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
				context.startActivity(goIntent);
				
			}
			else
			{
				Toast.makeText(context, "Call Endend", Toast.LENGTH_LONG).show();
			}
		
		

	}
	
	
	

}
