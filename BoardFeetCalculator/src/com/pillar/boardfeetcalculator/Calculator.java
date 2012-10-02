package com.pillar.boardfeetcalculator;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;


public class Calculator extends Activity {
	private static final String TAG = "Calculator";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_calculator, menu);
        return true;
    }
    
    @Override
    public void onPause() {
    	super.onPause();
    	Log.v(TAG, "onPause()" );
    }
    
    @Override
    public void onResume() {
    	super.onResume();
    	Log.v(TAG, "onResume()" );
    }
}
