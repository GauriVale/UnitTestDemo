package com.quickheal.unittest.demo.android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.quickheal.androidunittestdemo.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

	private Button btnClickHere;
	private TextView tvTitle;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		tvTitle = (TextView) findViewById(R.id.tvTitle);
		btnClickHere = (Button) findViewById(R.id.btnClickHere);
		btnClickHere.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		if (R.id.btnClickHere == v.getId()) {
			tvTitle.setText("Button is clicked!!!");
		}
	}
}
