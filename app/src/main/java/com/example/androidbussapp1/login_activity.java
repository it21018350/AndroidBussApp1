
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		login
	 *	@date 		Sunday 30th of October 2022 06:47:49 AM
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package com.example.androidbussapp1;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import android.content.Intent;

public class login_activity extends Activity {

	
	private View _bg__login_ek2;
	private View rectangle_4;
	private TextView login_ek3;
	private View rectangle_1;
	private TextView email;
	private View rectangle_1_ek1;
	private TextView password;
	private View rectangle_3;
	private TextView login_ek4;
	private View rectangle_3_ek1;
	private TextView login_with_google;
	private ImageView image_1;
	private TextView _forgot_password_;
	private TextView _new_to_bus_app__register_now;
	private TextView or;
	private View line_1;
	private View line_2;
	private ImageView ellipse_1;
	private ImageView microsoftteams_image__7__1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);

		
		_bg__login_ek2 = (View) findViewById(R.id._bg__login_ek2);
		rectangle_4 = (View) findViewById(R.id.rectangle_4);
		login_ek3 = (TextView) findViewById(R.id.login_ek3);
//		rectangle_1 = (View) findViewById(R.id.rectangle_1);
//		email = (TextView) findViewById(R.id.email);
//		rectangle_1_ek1 = (View) findViewById(R.id.rectangle_1_ek1);
//		password = (TextView) findViewById(R.id.password);
		rectangle_3 = (View) findViewById(R.id.rectangle_3);
		login_ek4 = (TextView) findViewById(R.id.login_ek4);
		rectangle_3_ek1 = (View) findViewById(R.id.rectangle_3_ek1);
		login_with_google = (TextView) findViewById(R.id.login_with_google);
		image_1 = (ImageView) findViewById(R.id.image_1);
		_forgot_password_ = (TextView) findViewById(R.id._forgot_password_);
		_new_to_bus_app__register_now = (TextView) findViewById(R.id._new_to_bus_app__register_now);
		or = (TextView) findViewById(R.id.or);
		line_1 = (View) findViewById(R.id.line_1);
		line_2 = (View) findViewById(R.id.line_2);
		ellipse_1 = (ImageView) findViewById(R.id.ellipse_1);
		microsoftteams_image__7__1 = (ImageView) findViewById(R.id.microsoftteams_image__7__1);


		_forgot_password_.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), android_large___4_activity.class);
				startActivity(nextScreen);

			}
		});
		
		
		_new_to_bus_app__register_now.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), android_large___2_activity.class);
				startActivity(nextScreen);

			}
		});

		_new_to_bus_app__register_now.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				Intent nextScreen = new Intent(getApplicationContext(), android_large___2_activity.class);
				startActivity(nextScreen);

			}
		});

		
		
		//custom code goes here
	
	}


	public void login(View v) {

		Intent nextScreen = new Intent(getApplicationContext(), android_large___14_activity.class);
		startActivity(nextScreen);

	}

}
	
	