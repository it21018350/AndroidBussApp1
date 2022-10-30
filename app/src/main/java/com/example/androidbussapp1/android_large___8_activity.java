
	 
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
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;

public class android_large___8_activity extends Activity {

	
	private View _bg__android_large___8_ek2;
	private View rectangle_4_ek8;
	private View rectangle_15;
	private View rectangle_1_ek17;
	private TextView location_sharing;
	private View rectangle_1_ek18;
	private TextView settings;
	private TextView home_ek1;
	private ImageView ellipse_1_ek9;
	private ImageView microsoftteams_image__7__1_ek7;
	private View ellipse_5_ek1;
	private View ellipse_2_ek1;
	private View ellipse_3_ek1;
	private View ellipse_4_ek1;
	private View ellipse_7;
	private TextView sajana_dewmina;
	private ImageView _296_2969961_no_image_user_profile_icon_removebg_preview_1;
	private View rectangle_1_ek19;
	private TextView user_account;


	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.android_large___8);

		
		_bg__android_large___8_ek2 = (View) findViewById(R.id._bg__android_large___8_ek2);
		rectangle_4_ek8 = (View) findViewById(R.id.rectangle_4_ek8);
		rectangle_15 = (View) findViewById(R.id.rectangle_15);
		rectangle_1_ek17 = (View) findViewById(R.id.rectangle_1_ek17);
		location_sharing = (TextView) findViewById(R.id.location_sharing);
		rectangle_1_ek18 = (View) findViewById(R.id.rectangle_1_ek18);
		settings = (TextView) findViewById(R.id.settings);
		home_ek1 = (TextView) findViewById(R.id.home_ek1);
		ellipse_1_ek9 = (ImageView) findViewById(R.id.ellipse_1_ek9);
		microsoftteams_image__7__1_ek7 = (ImageView) findViewById(R.id.microsoftteams_image__7__1_ek7);
		ellipse_5_ek1 = (View) findViewById(R.id.ellipse_5_ek1);
		ellipse_2_ek1 = (View) findViewById(R.id.ellipse_2_ek1);
		ellipse_3_ek1 = (View) findViewById(R.id.ellipse_3_ek1);
		ellipse_4_ek1 = (View) findViewById(R.id.ellipse_4_ek1);
		ellipse_7 = (View) findViewById(R.id.ellipse_7);
		sajana_dewmina = (TextView) findViewById(R.id.sajana_dewmina);
		_296_2969961_no_image_user_profile_icon_removebg_preview_1 = (ImageView) findViewById(R.id._296_2969961_no_image_user_profile_icon_removebg_preview_1);
		rectangle_1_ek19 = (View) findViewById(R.id.rectangle_1_ek19);
		user_account = (TextView) findViewById(R.id.user_account);


		
		//custom code goes here
	
	}

	public void OpenUserAccount(View v) {

		Intent nextScreen = new Intent(getApplicationContext(), android_large___15_activity.class);
		startActivity(nextScreen);

	}

}
	
	