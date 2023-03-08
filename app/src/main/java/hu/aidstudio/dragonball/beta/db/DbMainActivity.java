package hu.aidstudio.dragonball.beta.db;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.firebase.FirebaseApp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import hu.aidstudio.dragonball.beta.R;
import hu.aidstudio.dragonball.beta.dbz.Dbz_1Activity;
import hu.aidstudio.dragonball.beta.dbz.Dbz_2Activity;
import hu.aidstudio.dragonball.beta.dbz.Dbz_3Activity;
import hu.aidstudio.dragonball.beta.dbz.Dbz_4Activity;
import hu.aidstudio.dragonball.beta.dbz.Dbz_5Activity;
import hu.aidstudio.dragonball.beta.dbz.Dbz_6Activity;
import hu.aidstudio.dragonball.beta.dbz.Dbz_7Activity;
import hu.aidstudio.dragonball.beta.dbz.Dbz_8Activity;
import hu.aidstudio.dragonball.beta.dbz.Dbz_9Activity;


public class DbMainActivity extends Activity {
	
	RewardedAd rewardad;
	
	private ArrayList<HashMap<String, Object>> map = new ArrayList<>();
	

	private LinearLayout banner;

	private final Intent i = new Intent();
	private final Intent acti = new Intent();
	private AlertDialog.Builder d;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.dbz_main);
		initialize();
		FirebaseApp.initializeApp(this);
		MobileAds.initialize(this);
		
		initializeLogic();
	}
	
	private void initialize() {

		banner = findViewById(R.id.banner);
		Button go_dbz1 = findViewById(R.id.go_dbz1);
		Button go_dbz2 = findViewById(R.id.go_dbz2);
		Button go_dbz3 = findViewById(R.id.go_dbz3);
		Button go_dbz4 = findViewById(R.id.go_dbz4);
		Button go_dbz5 = findViewById(R.id.go_dbz5);
		Button go_dbz6 = findViewById(R.id.go_dbz6);
		Button go_dbz7 = findViewById(R.id.go_dbz7);
		Button go_dbz8 = findViewById(R.id.go_dbz8);
		Button go_dbz9 = findViewById(R.id.go_dbz9);

		d = new AlertDialog.Builder(this);
		
		go_dbz1.setOnClickListener(_view -> {
			d.setTitle("Dragon Ball Z 1.Évad");
			d.setMessage("Meg akkarja tekinteni?");
			d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
				i.setAction(Intent.ACTION_VIEW);
				i.setClass(getApplicationContext(), Dbz_1Activity.class);
				startActivity(i);
			});
			d.setNegativeButton("Mégsem", (_dialog, _which) -> {

			});
			d.create().show();
		});

	go_dbz2.setOnClickListener(_view -> {
		d.setTitle("Dragon Ball Z 2.Évad");
		d.setMessage("Meg akkarja tekinteni?");
		d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
			i.setAction(Intent.ACTION_VIEW);
			i.setClass(getApplicationContext(), Dbz_2Activity.class);
			startActivity(i);
		});
		d.setNegativeButton("Mégsem", (_dialog, _which) -> {

		});
		d.create().show();
	});

		go_dbz3.setOnClickListener(_view -> {
			d.setTitle("Dragon Ball Z 3.Évad");
			d.setMessage("Meg akkarja tekinteni?");
			d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
			i.setAction(Intent.ACTION_VIEW);
			i.setClass(getApplicationContext(), Dbz_3Activity.class);
			startActivity(i);
			});
			d.setNegativeButton("Mégsem", (_dialog, _which) -> {

			});
			d.create().show();
		});

		go_dbz4.setOnClickListener(_view -> {
			d.setTitle("Dragon Ball Z 4.Évad");
			d.setMessage("Meg akkarja tekinteni?");
			d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
			i.setAction(Intent.ACTION_VIEW);
			i.setClass(getApplicationContext(), Dbz_4Activity.class);
			startActivity(i);
			});
			d.setNegativeButton("Mégsem", (_dialog, _which) -> {

			});
			d.create().show();
		});

		go_dbz5.setOnClickListener(_view -> {
			d.setTitle("Dragon Ball Z 5.Évad");
			d.setMessage("Meg akkarja tekinteni?");
			d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
			i.setAction(Intent.ACTION_VIEW);
			i.setClass(getApplicationContext(), Dbz_5Activity.class);
			startActivity(i);
			});
			d.setNegativeButton("Mégsem", (_dialog, _which) -> {

			});
			d.create().show();
		});

		go_dbz6.setOnClickListener(_view -> {
			d.setTitle("Dragon Ball Z 6.Évad");
			d.setMessage("Meg akkarja tekinteni?");
			d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
			i.setAction(Intent.ACTION_VIEW);
			i.setClass(getApplicationContext(), Dbz_6Activity.class);
			startActivity(i);

			});
			d.setNegativeButton("Mégsem", (_dialog, _which) -> {

			});
			d.create().show();
		});

		go_dbz7.setOnClickListener(_view -> {
			d.setTitle("Dragon Ball Z 7.Évad");
			d.setMessage("Meg akkarja tekinteni?");
			d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
			i.setAction(Intent.ACTION_VIEW);
			i.setClass(getApplicationContext(), Dbz_7Activity.class);
			startActivity(i);

			});
			d.setNegativeButton("Mégsem", (_dialog, _which) -> {

			});
			d.create().show();
		});

		go_dbz8.setOnClickListener(_view -> {
			d.setTitle("Dragon Ball Z 8.Évad");
			d.setMessage("Meg akkarja tekinteni?");
			d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
			i.setAction(Intent.ACTION_VIEW);
			i.setClass(getApplicationContext(), Dbz_8Activity.class);
			startActivity(i);


			});
			d.setNegativeButton("Mégsem", (_dialog, _which) -> {

			});
			d.create().show();
		});

		go_dbz9.setOnClickListener(_view -> {
			d.setTitle("Dragon Ball Z 9.Évad");
			d.setMessage("Meg akkarja tekinteni?");
			d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
			i.setAction(Intent.ACTION_VIEW);
			i.setClass(getApplicationContext(), Dbz_9Activity.class);
			startActivity(i);


			});
			d.setNegativeButton("Mégsem", (_dialog, _which) -> {

			});
			d.create().show();
		});

}
	
	private void initializeLogic() {
		getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
		Window w = getWindow();
		w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
		AdView adView1 = new AdView(DbMainActivity.this);
		adView1.setAdSize(AdSize.BANNER);
		adView1.setAdUnitId("ca-app-pub-9399905616386219/3692748408");
		AdRequest adRequest = new AdRequest.Builder().build();
		adView1.loadAd(adRequest);
		LayoutParams layoutparams = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
		banner.addView(adView1,layoutparams);
	}
	
	
	@Override
	public void onBackPressed() {
		finish();
	}
	
	@Override
	public void onResume() {
		super.onResume();
		
		
		        AdRequest rewardad_request = new AdRequest.Builder().build();
		
		        RewardedAd.load(DbMainActivity.this, "ca-app-pub-9399905616386219/1829002391",
		                rewardad_request, new RewardedAdLoadCallback() {
			
			
			                    @Override
			                    public void onAdLoaded(@NonNull RewardedAd rewardedAd) {
				
				                       rewardad = rewardedAd;
				 
				                 
				                    }
			@Override
			                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
				
				                        rewardad = null;
				
				 
				                       
				
				                    }
			
			                    
			                });
		    
	}
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}
