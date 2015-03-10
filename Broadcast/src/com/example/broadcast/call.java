package com.example.broadcast;

import android.app.Activity;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.widget.TextView;

public class call extends Activity {
	
	TextView txt;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.call);
		txt=(TextView) findViewById(R.id.txt_num);
		
		Bundle bun=getIntent().getExtras();
		
		txt.setText(bun.getString(TelephonyManager.EXTRA_INCOMING_NUMBER)+"  "+bun.getString( TelephonyManager.EXTRA_STATE));
		
	}

}
