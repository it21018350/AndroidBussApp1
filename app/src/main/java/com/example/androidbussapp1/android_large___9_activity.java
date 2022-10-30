
	 
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

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Map;

	public class android_large___9_activity extends Activity {

	
	private View _bg__android_large___9_ek2;
	private View rectangle_4_ek9;
	private TextView txtfName2;
	private TextView txtlName2;
	private TextView txtemail2;
	private TextView txtpNo;
	private View ellipse_7_ek1;
	private ImageView _296_2969961_no_image_user_profile_icon_removebg_preview_1_ek1;
	private View rectangle_1_ek20;
	private View rectangle_1_ek21;
	private TextView user_account_ek1;
	private ImageView ellipse_1_ek10;
	private ImageView microsoftteams_image__7__1_ek8;
	private View ellipse_5_ek2;
	private View ellipse_2_ek2;
	private View ellipse_3_ek2;
	private View ellipse_4_ek2;
	private FirebaseDatabase database ;
	private DatabaseReference mdatabase;

	private Map<String, String> userMap;
	private String fName;
	private String lName;
	private String email;
	private int Pno;
	private static final String USER = "user";

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.android_large___9);

		txtfName2 = findViewById(R.id.txtfName2);
		txtlName2 = findViewById(R.id.txtlName2);
		txtemail2 = findViewById(R.id.txtemail2);
		txtpNo = findViewById(R.id.txtpNo);


		_bg__android_large___9_ek2 = (View) findViewById(R.id._bg__android_large___9_ek2);
		rectangle_4_ek9 = (View) findViewById(R.id.rectangle_4_ek9);

		ellipse_7_ek1 = (View) findViewById(R.id.ellipse_7_ek1);
		_296_2969961_no_image_user_profile_icon_removebg_preview_1_ek1 = (ImageView) findViewById(R.id._296_2969961_no_image_user_profile_icon_removebg_preview_1_ek1);

		user_account_ek1 = (TextView) findViewById(R.id.user_account_ek1);
		ellipse_1_ek10 = (ImageView) findViewById(R.id.ellipse_1_ek10);
		microsoftteams_image__7__1_ek8 = (ImageView) findViewById(R.id.microsoftteams_image__7__1_ek8);
		ellipse_5_ek2 = (View) findViewById(R.id.ellipse_5_ek2);
		ellipse_2_ek2 = (View) findViewById(R.id.ellipse_2_ek2);
		ellipse_3_ek2 = (View) findViewById(R.id.ellipse_3_ek2);
		ellipse_4_ek2 = (View) findViewById(R.id.ellipse_4_ek2);
	
		
		//custom code goes here
	
	}
}
	
	