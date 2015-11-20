package com.example.deneme1;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.example.YunusEmre.R;

public class Splash extends Activity {
	
	
	
	public void onCreate(Bundle tohli) {
		super.onCreate(tohli);
		setContentView(R.layout.splash);
		
		
		
		Thread splashThread = new Thread() {
			@Override
			public void run() {
			try {
			int waited = 0;
			while (waited < 3000) { //Five second timer
			sleep(100);
			waited += 100;
			
			}
			} catch (InterruptedException e) { //Any errors that might occur
			// do nothing
			} finally {
			finish();
			Intent ide = new Intent(getApplicationContext(),Main.class);
			
			startActivity(ide);
			}
			}
			};
			splashThread.start();
			}
			@Override
			public void onBackPressed() {
			 
			return;
			}
			
		
		
		
	}


