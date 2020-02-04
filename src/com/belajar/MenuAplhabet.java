package com.belajar;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MenuAplhabet extends Activity{
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menualphabet);
        
        final MediaPlayer a = MediaPlayer.create(this, R.raw.a);
        
        ImageView Aa = (ImageView) findViewById(R.id.imageViewA);
		Aa.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View view) {
				a.start();
			}
		});
		
		final MediaPlayer b = MediaPlayer.create(this, R.raw.b);
		
		ImageView Bb = (ImageView) findViewById(R.id.imageViewB);
		Bb.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View view) {
				b.start();
			}
		});
		
		final MediaPlayer c = MediaPlayer.create(this, R.raw.c);
		
		ImageView Cc = (ImageView) findViewById(R.id.imageViewC);
		Cc.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View view) {
				c.start();
			}
		});
		
		final MediaPlayer d = MediaPlayer.create(this, R.raw.d);
		
		ImageView Dd = (ImageView) findViewById(R.id.imageViewD);
		Dd.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View view) {
				d.start();
			}
		});
		
		final MediaPlayer e = MediaPlayer.create(this, R.raw.e);
		
		ImageView Ee = (ImageView) findViewById(R.id.imageViewE);
		Ee.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View view) {
				e.start();
			}
		});
		
		final MediaPlayer f = MediaPlayer.create(this, R.raw.f);
		
		ImageView Ff = (ImageView) findViewById(R.id.imageViewF);
		Ff.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View view) {
				f.start();
			}
		});
		
		final MediaPlayer g = MediaPlayer.create(this, R.raw.g);
		
		ImageView Gg = (ImageView) findViewById(R.id.imageViewG);
		Gg.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View view) {
				g.start();
			}
		});
		
		final MediaPlayer h = MediaPlayer.create(this, R.raw.h);
		
		ImageView Hh = (ImageView) findViewById(R.id.imageViewH);
		Hh.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View view) {
				h.start();
			}
		});
		
		final MediaPlayer i = MediaPlayer.create(this, R.raw.i);
		
		ImageView Ii = (ImageView) findViewById(R.id.imageViewI);
		Ii.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View view) {
				i.start();
			}
		});
		
		final MediaPlayer j = MediaPlayer.create(this, R.raw.j);
		
		ImageView Jj = (ImageView) findViewById(R.id.imageView1);
		Jj.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View view) {
				j.start();
			}
		});
		
		final MediaPlayer k = MediaPlayer.create(this, R.raw.k);
		
		ImageView Kk = (ImageView) findViewById(R.id.imageViewK);
		Kk.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View view) {
				k.start();
			}
		});
		
		 final MediaPlayer l = MediaPlayer.create(this, R.raw.l);
		
		ImageView Ll = (ImageView) findViewById(R.id.imageViewL);
		Ll.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View view) {
				l.start();
			}
		});
		
		final MediaPlayer m = MediaPlayer.create(this, R.raw.m);
		
		ImageView Mm = (ImageView) findViewById(R.id.imageViewM);
		Mm.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View view) {
				m.start();
			}
		});
		
		final MediaPlayer n = MediaPlayer.create(this, R.raw.n);
		
		ImageView Nn = (ImageView) findViewById(R.id.imageViewN);
		Nn.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View view) {
				n.start();
			}
		});
		
        final MediaPlayer o = MediaPlayer.create(this, R.raw.o);
		
		ImageView Oo = (ImageView) findViewById(R.id.imageViewO);
		Oo.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View view) {
				o.start();
			}
		});
		
        final MediaPlayer p = MediaPlayer.create(this, R.raw.p);
		
		ImageView Pp = (ImageView) findViewById(R.id.imageViewP);
		Pp.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View view) {
				p.start();
			}
		});
		
        final MediaPlayer q = MediaPlayer.create(this, R.raw.q);
		
		ImageView Qq = (ImageView) findViewById(R.id.imageViewQ);
		Qq.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View view) {
				q.start();
			}
		});
		
        final MediaPlayer r = MediaPlayer.create(this, R.raw.r);
		
		ImageView Rr = (ImageView) findViewById(R.id.imageViewR);
		Rr.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View view) {
				r.start();
			}
		});
		
        final MediaPlayer s = MediaPlayer.create(this, R.raw.s);
		
		ImageView Ss = (ImageView) findViewById(R.id.imageViewS);
		Ss.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View view) {
				s.start();
			}
		});
		
        final MediaPlayer t = MediaPlayer.create(this, R.raw.t);
		
		ImageView Tt = (ImageView) findViewById(R.id.imageViewT);
		Tt.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View view) {
				t.start();
			}
		});
		
        final MediaPlayer u = MediaPlayer.create(this, R.raw.u);
		
		ImageView Uu = (ImageView) findViewById(R.id.imageViewU);
		Uu.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View view) {
				u.start();
			}
		});
		
        final MediaPlayer v = MediaPlayer.create(this, R.raw.v);
		
		ImageView Vv = (ImageView) findViewById(R.id.imageViewV);
		Vv.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View view) {
				v.start();
			}
		});
		
        final MediaPlayer w = MediaPlayer.create(this, R.raw.w);
		
		ImageView Ww = (ImageView) findViewById(R.id.imageViewW);
		Ww.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View view) {
				w.start();
			}
		});
		
        final MediaPlayer x = MediaPlayer.create(this, R.raw.x);
		
		ImageView Xx = (ImageView) findViewById(R.id.imageViewX);
		Xx.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View view) {
				x.start();
			}
		});
		
        final MediaPlayer y = MediaPlayer.create(this, R.raw.y);
		
		ImageView Yy = (ImageView) findViewById(R.id.imageViewY);
		Yy.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View view) {
				y.start();
			}
		});

        final MediaPlayer z = MediaPlayer.create(this, R.raw.z);
		
		ImageView Zz = (ImageView) findViewById(R.id.imageViewZ);
		Zz.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View view) {
				z.start();
			}
		});
    }
	
	public void onBackPressed() {
		MenuAplhabet.this.finish();
	}
}
