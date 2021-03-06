package edu.upenn.cis350.cancerDog;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class RandomizeActivity extends Activity {
	
	public static final int ButtonClickActivity_ID = 4;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_randomize);
		WheelView gv = (WheelView)findViewById(R.id.wheelView);
	}
	
	public void onExitButtonClick (View v) {
		finish();
        System.exit(0);
	}
	
	public void onNextButtonClick (View v) {
		Intent i = new Intent(this, TrialActivity.class);
		startActivityForResult(i,ButtonClickActivity_ID);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.launcher, menu);
		return true;
	}
}
