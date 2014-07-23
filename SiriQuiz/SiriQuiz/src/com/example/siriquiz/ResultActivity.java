package com.example.siriquiz;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
public class ResultActivity extends Activity {
	
	Button butn;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_result);
		//get rating bar object
		RatingBar bar=(RatingBar)findViewById(R.id.ratingBar1); 
		bar.setNumStars(5);
		bar.setStepSize(0.5f);
		//get text view
		TextView t=(TextView)findViewById(R.id.textResult);
		//get score
		Bundle b = getIntent().getExtras();
		int score= b.getInt("score");
		//display score
		bar.setRating(score);
		switch (score)
		{
		case 1: t.setText("Oye! try again");
		case 2: t.setText("Your Score is 2");
		break;
		case 3: t.setText("Your score is 3");
		case 4:t.setText("Your Score is 4");
		break;
		case 5:t.setText("Excellent");
		break;
		}
	
		butn=(Button)findViewById(R.id.button1);
		butn.setOnClickListener(new View.OnClickListener() {		
			@Override
			public void onClick(View v) {
	
				Intent in = new Intent(ResultActivity.this,MainActivity.class);
				startActivity(in);
	
	
			}
			
		} );
	
	
	
	}
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.result, menu);
		return true;
	}

}
