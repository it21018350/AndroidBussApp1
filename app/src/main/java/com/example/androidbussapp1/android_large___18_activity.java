

package com.example.androidbussapp1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;

public class android_large___18_activity extends Activity {

	
	private View _bg__android_large___18_ek2;
	private View rectangle_4_ek18;
	private View rectangle_1_ek32;
	private TextView about;
	private View rectangle_1_ek33;
	private TextView sleep_track;
	private View rectangle_18_ek4;
	private View rectangle_19;
	private TextView settings_ek1;
	private View rectangle_1_ek34;
	private TextView reminder_ek2;
	private View rectangle_11_ek4;
	private ImageView vector_ek20;
	private TextView clear_data;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.android_large___18);

		
		_bg__android_large___18_ek2 = (View) findViewById(R.id._bg__android_large___18_ek2);
		rectangle_4_ek18 = (View) findViewById(R.id.rectangle_4_ek18);
		rectangle_1_ek32 = (View) findViewById(R.id.rectangle_1_ek32);
		about = (TextView) findViewById(R.id.about);

		settings_ek1 = (TextView) findViewById(R.id.settings_ek1);
		rectangle_1_ek34 = (View) findViewById(R.id.rectangle_1_ek34);
		reminder_ek2 = (TextView) findViewById(R.id.reminder_ek2);
		rectangle_11_ek4 = (View) findViewById(R.id.rectangle_11_ek4);


	}

	public void About(View v) {
		Intent nextScreen = new Intent(getApplicationContext(), android_large___25_activity.class);
		startActivity(nextScreen);
	}
	public void Reminder(View v) {
		Intent nextScreen = new Intent(getApplicationContext(), android_large___24_activity.class);
		startActivity(nextScreen);
	}
}
	
	