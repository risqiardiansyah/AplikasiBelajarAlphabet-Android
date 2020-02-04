package com.belajar;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ToggleButton;

public class AplikasiBelajarAlphabetActivity extends Activity {
	MediaPlayer mp;
	ToggleButton tg;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        mp = MediaPlayer.create(this, R.raw.bg);
        mp.setVolume(1, 1);
        mp.start();
        
        final Button button1 = (Button) findViewById(R.id.buttonAlphabet);  
        button1.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				mp.stop();
				Intent itn = new Intent(arg0.getContext(), MenuAplhabet.class);
				startActivityForResult(itn, 0);
			}
		});
        
        final Button button2 = (Button) findViewById(R.id.buttonFlsh);  
        button2.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent itn = new Intent(arg0.getContext(), MenuFlashcard.class);
				startActivityForResult(itn, 0);
			}
		});
        
        final Button button3 = (Button) findViewById(R.id.buttonQuiz);  
        button3.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				AplikasiBelajarAlphabetActivity.this.finish();
				Intent itn = new Intent(arg0.getContext(), Quiz.class);
				startActivityForResult(itn, 0);
			}
		});
        
        final Button Close = (Button) findViewById(R.id.buttonClose);
        Close.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				alert();
			}
		});
    }
    
    public void alert() {
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setTitle("Keluar");
		builder.setMessage("Kamu Yakin Ingin Keluar???");
		
		builder.setPositiveButton("Yakin", new DialogInterface.OnClickListener() {
		
		    public void onClick(DialogInterface dialog, int which) {
		    	AplikasiBelajarAlphabetActivity.this.finish();
		    	mp.stop();
		        System.exit(0);
		    }
		});
		
		builder.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
		
		    public void onClick(DialogInterface dialog, int which) {
		        dialog.dismiss();
		    }
		});
		
		AlertDialog alert = builder.create();
		alert.show();
	}
    
    public void onBackPressed() {
    	alert();
	}
}