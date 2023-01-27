package com.example.radiobutton;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	Button btn;
	RadioGroup radiogrp;
	TextView answerAsText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button)findViewById(R.id.button1);
        radiogrp = (RadioGroup)findViewById(R.id.radioGroup1);
        answerAsText = (TextView)findViewById(R.id.showAsText);
        
        btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int selectId = radiogrp.getCheckedRadioButtonId();
				RadioButton rdb = (RadioButton)findViewById(selectId);
				Toast.makeText(MainActivity.this, rdb.getText(), 500).show();
				answerAsText.setText(rdb.getText().toString());
				
			}
		});
    }

    
}
