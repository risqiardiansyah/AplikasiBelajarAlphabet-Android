package com.belajar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HasilQuiz extends Activity {
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hasil_quiz);
        
        TextView hasil = (TextView) findViewById(R.id.hasil);
        TextView nilai = (TextView) findViewById(R.id.nilai);
        
        hasil.setText("Jawaban Benar : "+Quiz.benar+"\nJawaban Salah : "+Quiz.salah);
        nilai.setText(""+Quiz.hasil);
        
        final Button buttonE = (Button) findViewById(R.id.buttonExit);  
        buttonE.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				HasilQuiz.this.finish();
				Intent itn = new Intent(arg0.getContext(), AplikasiBelajarAlphabetActivity.class);
				startActivityForResult(itn, 0);
			}
		});
	}
	
	public void ulangi(View view) {
		HasilQuiz.this.finish();
		Intent itn = new Intent(getApplicationContext(), Quiz.class);
		startActivityForResult(itn, 0);
//		Intent i = new Intent(getApplicationContext(),Quiz.class);
//		startActivity(i);
	}
	
	public void onBackPressed() {
		HasilQuiz.this.finish();
		Intent itn = new Intent(getApplicationContext(), AplikasiBelajarAlphabetActivity.class);
		startActivityForResult(itn, 0);
	}
}
