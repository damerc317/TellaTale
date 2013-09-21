package com.example.storyboard;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseFacebookUtils;

public class IntegratingFacebook extends Application {

	static final String TAG = "storyBoard";

	@Override
	public void onCreate() {
		super.onCreate();

		Parse.initialize(this, "HVnzwiOKfW7SoZLV95VIGLBOu6pKWQ8dBVujYuAM",
				"Q94S6LjcHITk0nG02ePOu2spJ9I2NGikTz2hgOHX");

		// Set your Facebook App Id in strings.xml
		ParseFacebookUtils.initialize(getString(R.string.app_id));

	}

}