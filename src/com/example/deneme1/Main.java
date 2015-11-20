package com.example.deneme1;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import com.example.YunusEmre.R;

public class Main extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button buton1 = (Button) findViewById(R.id.button1);
		Button buton2 = (Button) findViewById(R.id.button2);
		Button buton3 = (Button) findViewById(R.id.button3);

		buton1.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				startActivity(new Intent(getApplicationContext(), hayati.class));
			}
		});

		buton2.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				startActivity(new Intent(getApplicationContext(), eser.class));
			}
		});

		buton3.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				startActivity(new Intent(getApplicationContext(),
						ListView1.class));
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
