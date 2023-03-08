package hu.aidstudio.dragonball.beta.dbgt;

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


public class DbGtMainActivity extends Activity {
	
	RewardedAd rewardad;
	
	private final ArrayList<HashMap<String, Object>> map = new ArrayList<>();
	

	private LinearLayout banner;

	private final Intent i = new Intent();
	private final Intent acti = new Intent();
	private AlertDialog.Builder d;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.dbgt_main);
		initialize();
		FirebaseApp.initializeApp(this);
		MobileAds.initialize(this);
		
		initializeLogic();
	}
	
	private void initialize() {

		banner = findViewById(R.id.banner);
		Button go_dbgt1 = findViewById(R.id.go_dbgt1);
		Button go_dbgt2 = findViewById(R.id.go_dbgt2);
		Button go_dbgt3 = findViewById(R.id.go_dbgt3);
		Button go_dbgt4 = findViewById(R.id.go_dbgt4);
		Button go_dbgt5 = findViewById(R.id.go_dbgt5);


		d = new AlertDialog.Builder(this);
		
		go_dbgt1.setOnClickListener(_view -> {
			d.setTitle(R.string.dbgte1);
			d.setMessage(R.string.megakkarja);
			d.setPositiveButton(R.string.megnezem, (_dialog, _which) -> {
				i.setAction(Intent.ACTION_VIEW);
				i.setClass(getApplicationContext(), Db_Gt_1Activity.class);
				startActivity(i);
			});
			d.setNegativeButton(R.string.megsem, (_dialog, _which) -> {

			});
			d.create().show();
		});

	go_dbgt2.setOnClickListener(_view -> {
		d.setTitle(R.string.dbgte2);
		d.setMessage(R.string.megakkarja);
		d.setPositiveButton(R.string.megnezem, (_dialog, _which) -> {
		/*	i.setAction(Intent.ACTION_VIEW);
			i.setClass(getApplicationContext(), Dbz_2Activity.class);
			startActivity(i);
		 */
		});
		d.setNegativeButton("Mégsem", (_dialog, _which) -> {

		});
		d.create().show();
	});

		go_dbgt3.setOnClickListener(_view -> {
			d.setTitle(R.string.dbgte3);
			d.setMessage(R.string.megakkarja);
			d.setPositiveButton(R.string.megnezem, (_dialog, _which) -> {
		/*	i.setAction(Intent.ACTION_VIEW);
			i.setClass(getApplicationContext(), Dbz_3Activity.class);
			startActivity(i);
		 */
			});
			d.setNegativeButton("Mégsem", (_dialog, _which) -> {

			});
			d.create().show();
		});

		go_dbgt4.setOnClickListener(_view -> {
			d.setTitle(R.string.dbgte4);
			d.setMessage(R.string.megakkarja);
			d.setPositiveButton(R.string.megnezem, (_dialog, _which) -> {
		/*	i.setAction(Intent.ACTION_VIEW);
			i.setClass(getApplicationContext(), Dbz_4Activity.class);
			startActivity(i);
		 */
			});
			d.setNegativeButton("Mégsem", (_dialog, _which) -> {

			});
			d.create().show();
		});

		go_dbgt5.setOnClickListener(_view -> {
			d.setTitle(R.string.dbgte5);
			d.setMessage(R.string.megakkarja);
			d.setPositiveButton(R.string.megnezem, (_dialog, _which) -> {
		/*	i.setAction(Intent.ACTION_VIEW);
			i.setClass(getApplicationContext(), Dbz_5Activity.class);
			startActivity(i);
		 */
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
		AdView adView1 = new AdView(DbGtMainActivity.this);
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
		
		        RewardedAd.load(DbGtMainActivity.this, "ca-app-pub-9399905616386219/1829002391",
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
		int[] _location = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int[] _location = new int[2];
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
		ArrayList<Double> _result = new ArrayList<>();
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
