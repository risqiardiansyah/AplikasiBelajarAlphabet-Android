package com.belajar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Quiz extends Activity{
	TextView pertanyaan;
	RadioGroup rg;
	RadioButton PilihanA, PilihanB, PilihanC, PilihanD;
	int nomor = 0;
	public static int hasil, benar, salah;
	
	String[] pertanyaan_kuis = new String[]{
		"1. Manakah contoh kata yang diawali huruf A?",
		"2. Manakah contoh kata yang diawali huruf Z?",
		"3. Manakah contoh kata yang diawali huruf C?",
		"4. Manakah contoh kata yang diawali huruf S?",
		"5. Manakah contoh kata yang diawali huruf G?",
		"6. Manakah contoh kata yang diawali huruf H?",
		"7. Manakah contoh kata yang diawali huruf P?",
		"8. Manakah contoh kata yang diawali huruf Q?",
		"9. Manakah contoh kata yang diawali huruf V?",
		"10. Manakah contoh kata yang diawali huruf B?"
	};
	
	String[] pilihan_jawaban = new String[]{
		"Singa","Harimau","Itik","Anjing",
		"Sapi","Zebra","Ayam","Entok",
		"Cacing","Zebra","Macan","Angsa",
		"Singa","Kucing","Gajah","Cicak",
		"Burung","Gajah","Itik","Leopard",
		"Harimau","Buaya","Ayam","Cacing",
		"Pisang","Semangka","Melon","Susu",
		"Quran","Kitab","Zabur","Injil",
		"Vas","Halaman","Tanaman","Bunga",
		"Sapi","Zebra","Burung","Kuda",
	};
	
	String[] jawaban_benar = new String[]{
		"Anjing",
		"Zebra",
		"Cacing",
		"Singa",
		"Gajah",
		"Harimau",
		"Pisang",
		"Quran",
		"Vas",
		"Burung",
	};
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz);
        
        pertanyaan = (TextView) findViewById(R.id.pertanyaan);
        rg = (RadioGroup) findViewById(R.id.radio_group);
        PilihanA = (RadioButton) findViewById(R.id.pilihanA);
        PilihanB = (RadioButton) findViewById(R.id.pilihanB);
        PilihanC = (RadioButton) findViewById(R.id.pilihanC);
        PilihanD = (RadioButton) findViewById(R.id.pilihanD);
        
        pertanyaan.setText(pertanyaan_kuis[nomor]);
        PilihanA.setText(pilihan_jawaban[0]);
        PilihanB.setText(pilihan_jawaban[1]);
        PilihanC.setText(pilihan_jawaban[2]);
        PilihanD.setText(pilihan_jawaban[3]);
        
        rg.check(0);
        benar = 0;
        salah = 0;
	}
	
	public void next(View view) {
		RadioButton jawaban_user = (RadioButton) findViewById(rg.getCheckedRadioButtonId());
		String ambil_jawaban_user = jawaban_user.getText().toString();
		rg.check(0);
		if (ambil_jawaban_user.equalsIgnoreCase(jawaban_benar[nomor]))benar++;
        else salah++;
		nomor++;
		if (nomor<pertanyaan_kuis.length) {
			pertanyaan.setText(pertanyaan_kuis[nomor]);
			PilihanA.setText(pilihan_jawaban[(nomor*4)+0]);
			PilihanA.setChecked(true);
			PilihanA.isChecked();
	        PilihanB.setText(pilihan_jawaban[(nomor*4)+1]);
	        PilihanC.setText(pilihan_jawaban[(nomor*4)+2]);
	        PilihanD.setText(pilihan_jawaban[(nomor*4)+3]);
		}else {
			hasil = benar * 10;
			Quiz.this.finish();
			Intent selesai = new Intent(getApplicationContext(),HasilQuiz.class);
			startActivity(selesai);
		}
	}
	
	public void onBackPressed() {
		Quiz.this.finish();
		Intent itn = new Intent(getApplicationContext(), AplikasiBelajarAlphabetActivity.class);
		startActivityForResult(itn, 0);
	}
}
