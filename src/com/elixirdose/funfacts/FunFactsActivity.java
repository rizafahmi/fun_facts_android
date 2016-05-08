package com.elixirdose.funfacts;


import java.util.Random;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


public class FunFactsActivity extends Activity {
	private Button mButton;
	private TextView mFactTextView;
	private RelativeLayout mRelativeLayout;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fun_facts);		
		
		mButton = (Button) findViewById(R.id.button1);
		mFactTextView = (TextView) findViewById(R.id.factTextView);
		mRelativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
		
		View.OnClickListener listener = new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String[] facts = {
					    "Ants stretch when they wake up in the morning.",
					    "Ostriches can run faster than horses.",
					    "Olympic gold medals are actually made mostly of silver.",
					    "You are born with 300 bones; by the time you are an adult you will have 206.",
					    "It takes about 8 minutes for light from the Sun to reach Earth.",
					    "Some bamboo plants can grow almost a meter in just one day.",
					    "The state of Florida is bigger than England.",
					    "Some penguins can leap 2-3 meters out of the water.",
					    "On average, it takes 66 days to form a new habit.",
					    "Mammoths still walked the earth when the Great Pyramid was being built." 
					   };
				String[] mColors = {
					    "#39add1", // light blue
					    "#3079ab", // dark blue
					    "#c25975", // mauve
					    "#e15258", // red
					    "#f9845b", // orange
					    "#838cc7", // lavender
					    "#7d669e", // purple
					    "#53bbb4", // aqua
					    "#51b46d", // green
					    "#e0ab18", // mustard
					    "#637a91", // dark gray
					    "#f092b0", // pink
					    "#b7c0c7"  // light gray
					  };
				
				Random randomGenerator = new Random();
				int randomNumber = randomGenerator.nextInt(facts.length);
				mFactTextView.setText(facts[randomNumber]);
				String randomColor = mColors[randomNumber];
				mRelativeLayout.setBackgroundColor(Color.parseColor(randomColor));
				
			}
		};
		Toast.makeText(FunFactsActivity.this, "We're on funfactsactivity", Toast.LENGTH_LONG).show();
		mButton.setOnClickListener(listener);
		
		
	}
}
