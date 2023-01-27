package com.example.addtwonumber;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	EditText firstNumber,secondNumber;
	Button btn;
	TextView answerText;
	
	int num1,num2,sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        firstNumber = (EditText)findViewById(R.id.firstNumber);
        secondNumber = (EditText)findViewById(R.id.secondNumber);
        btn = (Button)findViewById(R.id.AnswerButton);
        answerText = (TextView)findViewById(R.id.AnswerText);
        
        btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				num1 = Integer.parseInt(firstNumber.getText().toString());
				num2 = Integer.parseInt(secondNumber.getText().toString());
				sum = num1+num2;
				answerText.setText(Integer.toString(sum));
			}
		});
    }


    
}
