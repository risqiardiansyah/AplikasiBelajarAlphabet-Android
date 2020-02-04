package com.belajar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MenuFlashcard extends Activity{
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menuflashcard);
        
        final ImageView a = (ImageView) findViewById(R.id.imageViewAa);
		a.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				Intent itn = new Intent(arg0.getContext(), Flashcard.class);
				startActivityForResult(itn, 0);
			}
		});
		
		final ImageView b = (ImageView) findViewById(R.id.imageViewBb);
		b.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				Intent itn = new Intent(arg0.getContext(), Bb.class);
				startActivityForResult(itn, 0);
			}
		});
		
		final ImageView c = (ImageView) findViewById(R.id.imageViewCc);
		c.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				Intent itn = new Intent(arg0.getContext(), CapterC.class);
				startActivityForResult(itn, 0);
			}
		});
		
		final ImageView d = (ImageView) findViewById(R.id.imageView2);
		d.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				Intent itn = new Intent(arg0.getContext(), Dd.class);
				startActivityForResult(itn, 0);
			}
		});
		
		final ImageView e = (ImageView) findViewById(R.id.imageViewEe);
		e.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				Intent itn = new Intent(arg0.getContext(), Ee.class);
				startActivityForResult(itn, 0);
			}
		});
		
		final ImageView f = (ImageView) findViewById(R.id.imageViewFf);
		f.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				Intent itn = new Intent(arg0.getContext(), Ff.class);
				startActivityForResult(itn, 0);
			}
		});
		
		final ImageView g = (ImageView) findViewById(R.id.imageViewGg);
		g.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				Intent itn = new Intent(arg0.getContext(), Gg.class);
				startActivityForResult(itn, 0);
			}
		});
		
		final ImageView h = (ImageView) findViewById(R.id.imageViewHh);
		h.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				Intent itn = new Intent(arg0.getContext(), Hh.class);
				startActivityForResult(itn, 0);
			}
		});
		
		final ImageView i = (ImageView) findViewById(R.id.imageViewIi);
		i.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				Intent itn = new Intent(arg0.getContext(), Ii.class);
				startActivityForResult(itn, 0);
			}
		});
		
		final ImageView j = (ImageView) findViewById(R.id.imageViewJj);
		j.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				Intent itn = new Intent(arg0.getContext(), Jj.class);
				startActivityForResult(itn, 0);
			}
		});
		
		final ImageView k = (ImageView) findViewById(R.id.imageViewKk);
		k.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				Intent itn = new Intent(arg0.getContext(), Kk.class);
				startActivityForResult(itn, 0);
			}
		});
		
		final ImageView l = (ImageView) findViewById(R.id.imageViewLl);
		l.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				Intent itn = new Intent(arg0.getContext(), Ll.class);
				startActivityForResult(itn, 0);
			}
		});
		
		final ImageView m = (ImageView) findViewById(R.id.imageViewMm);
		m.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				Intent itn = new Intent(arg0.getContext(), Mm.class);
				startActivityForResult(itn, 0);
			}
		});
		
		final ImageView n = (ImageView) findViewById(R.id.imageViewNn);
		n.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				Intent itn = new Intent(arg0.getContext(), Nn.class);
				startActivityForResult(itn, 0);
			}
		});
		
		final ImageView o = (ImageView) findViewById(R.id.imageViewOo);
		o.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				Intent itn = new Intent(arg0.getContext(), Oo.class);
				startActivityForResult(itn, 0);
			}
		});
		
		final ImageView p = (ImageView) findViewById(R.id.imageViewPp);
		p.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				Intent itn = new Intent(arg0.getContext(), Pp.class);
				startActivityForResult(itn, 0);
			}
		});
		
		final ImageView q = (ImageView) findViewById(R.id.imageViewQq);
		q.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				Intent itn = new Intent(arg0.getContext(), Qq.class);
				startActivityForResult(itn, 0);
			}
		});
		
		final ImageView r = (ImageView) findViewById(R.id.imageViewRr);
		r.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				Intent itn = new Intent(arg0.getContext(), Rr.class);
				startActivityForResult(itn, 0);
			}
		});
		
		final ImageView s = (ImageView) findViewById(R.id.imageViewSs);
		s.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				Intent itn = new Intent(arg0.getContext(), Ss.class);
				startActivityForResult(itn, 0);
			}
		});
		
		final ImageView t = (ImageView) findViewById(R.id.imageViewTt);
		t.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				Intent itn = new Intent(arg0.getContext(), Tt.class);
				startActivityForResult(itn, 0);
			}
		});
		
		final ImageView u = (ImageView) findViewById(R.id.imageViewUu);
		u.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				Intent itn = new Intent(arg0.getContext(), Uu.class);
				startActivityForResult(itn, 0);
			}
		});
		
		final ImageView v = (ImageView) findViewById(R.id.imageViewVv);
		v.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				Intent itn = new Intent(arg0.getContext(), Vv.class);
				startActivityForResult(itn, 0);
			}
		});
		
		final ImageView w = (ImageView) findViewById(R.id.imageViewWw);
		w.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				Intent itn = new Intent(arg0.getContext(), Ww.class);
				startActivityForResult(itn, 0);
			}
		});
		
		final ImageView x = (ImageView) findViewById(R.id.imageViewXx);
		x.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				Intent itn = new Intent(arg0.getContext(), Xx.class);
				startActivityForResult(itn, 0);
			}
		});
		
		final ImageView y = (ImageView) findViewById(R.id.imageViewYy);
		y.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				Intent itn = new Intent(arg0.getContext(), Yy.class);
				startActivityForResult(itn, 0);
			}
		});
		
		final ImageView z = (ImageView) findViewById(R.id.imageViewZz);
		z.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				Intent itn = new Intent(arg0.getContext(), Zz.class);
				startActivityForResult(itn, 0);
			}
		});
	}
	
	public void onBackPressed() {
		Intent intent;
	    intent = new Intent(this, AplikasiBelajarAlphabetActivity.class);
	    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
	    finish();
	    startActivity(intent);
	}
}
