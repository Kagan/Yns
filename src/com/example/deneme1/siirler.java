package com.example.deneme1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import com.example.YunusEmre.R;

public class siirler extends Activity{	
	protected void onCreate(Bundle savedInstanceState) {
		TextView siira ;
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.siirler);
		
		siira = (TextView)findViewById(R.id.textView2);
		
		Bundle bundle = getIntent().getExtras();
		siira.setText(bundle.getString("siir"));
		
	
		
	}
}