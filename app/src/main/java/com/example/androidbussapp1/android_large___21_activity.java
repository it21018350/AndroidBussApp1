


package com.example.androidbussapp1;

import android.app.Activity;
import android.os.Bundle;


import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class android_large___21_activity extends Activity {

	
	private View _bg__android_large___21_ek2;
	private View rectangle_4_ek21;
	private View rectangle_1_ek36;
	private TextView sound;
	private View rectangle_18_ek5;
	private View rectangle_19_ek1;
	private TextView reminder_settings;
	private View rectangle_11_ek5;
	private TextView vibrate;
	private View rectangle_18_ek6;
	private View rectangle_19_ek2;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.android_large___21);

		
		_bg__android_large___21_ek2 = (View) findViewById(R.id._bg__android_large___21_ek2);

		rectangle_1_ek36 = (View) findViewById(R.id.rectangle_1_ek36);
		sound = (TextView) findViewById(R.id.sound);
		reminder_settings = (TextView) findViewById(R.id.reminder_settings);
		rectangle_11_ek5 = (View) findViewById(R.id.rectangle_11_ek5);
	//	vibrate = (TextView) findViewById(R.id.vibrate);

		final Button aswitch = findViewById(R.id.VON);
		final Vibrator vibr = (Vibrator) getSystemService(VIBRATOR_SERVICE);
		final long[] pattern = {2000,1000};
		aswitch.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				if(aswitch.getText().toString().equals("Start")){
					vibr.vibrate(pattern,0);
					Toast.makeText(android_large___21_activity.this,"Started",Toast.LENGTH_SHORT).show();
					aswitch.setText("STOP");



				}else {
					vibr.cancel();
					aswitch.setText("Start");
					Toast.makeText(android_large___21_activity.this,"Canseled",Toast.LENGTH_SHORT).show();

				}
			}
		});



	}


}
	
	