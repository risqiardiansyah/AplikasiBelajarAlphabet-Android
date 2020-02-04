package com.belajar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bb extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.b);
        
        Button next = (Button) findViewById(R.id.buttonNextOnB);
        next.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent flsh = new Intent(arg0.getContext(), CapterC.class);
				startActivityForResult(flsh, 0);
			}
		});
        
        Button prev = (Button) findViewById(R.id.buttonSblmOnB);
        prev.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent flsh = new Intent(arg0.getContext(), Flashcard.class);
				startActivityForResult(flsh, 0);
			}
		});
        
        Button kembali = (Button) findViewById(R.id.buttonKembali);
        kembali.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent flsh = new Intent(arg0.getContext(), MenuFlashcard.class);
				startActivityForResult(flsh, 0);
			}
		});
	}
	
	public void onBackPressed() {
		Intent intent;
	    intent = new Intent(this, MenuFlashcard.class);
	    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
	    finish();
	    startActivity(intent);
	}
}
