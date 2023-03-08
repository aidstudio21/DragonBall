package hu.aidstudio.dragonball.beta.menu;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.firebase.FirebaseApp;
import com.mxn.soul.flowingdrawer_core.ElasticDrawer;
import com.mxn.soul.flowingdrawer_core.FlowingDrawer;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;

import hu.aidstudio.dragonball.beta.R;
import hu.aidstudio.dragonball.beta.db.DbMainActivity;
import hu.aidstudio.dragonball.beta.dbgt.DbGtMainActivity;
import hu.aidstudio.dragonball.beta.dbs.MenuActivity;
import hu.aidstudio.dragonball.beta.dbz.DbzMainActivity;


public class DbMainMenuActivity extends Activity {

	private String language = "";

	private FlowingDrawer mDrawer;


	TextView textview;

	private FrameLayout nativead;
	private FrameLayout banner;
	private FrameLayout banners;
	private final Intent i = new Intent();

	private LinearLayout appinfo;
	private LinearLayout dev;
	private LinearLayout update;
	private LinearLayout donate;


	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.db_main_menu);
		initialize();
		FirebaseApp.initializeApp(this);
		MobileAds.initialize(this);
		initializeLogic();

	}
	
	@SuppressLint("WrongViewCast")
	private void initialize() {

		nativead = findViewById(R.id.nativead);
		banner = findViewById(R.id.banner);
		banners = findViewById(R.id.banners);
		Button go_db1 = findViewById(R.id.go_db1);
		Button go_db = findViewById(R.id.go_db);
		Button go_dbz = findViewById(R.id.go_dbz);
		Button go_dbgt = findViewById(R.id.go_dbgt);
		textview = findViewById(R.id.textview);
		appinfo = findViewById(R.id.app_info);
		dev = findViewById(R.id.developer);
		update = findViewById(R.id.update);
		donate = findViewById(R.id.donate);


		donate.setOnClickListener(v -> {
			Toast.makeText(DbMainMenuActivity.this, "Donate", Toast.LENGTH_SHORT).show();
		});

		update.setOnClickListener(v -> {
			Toast.makeText(DbMainMenuActivity.this, "Update", Toast.LENGTH_SHORT).show();
		});

		dev.setOnClickListener(v -> {
			Toast.makeText(DbMainMenuActivity.this, "Developer", Toast.LENGTH_SHORT).show();
		});

		appinfo.setOnClickListener(v -> {
			Toast.makeText(DbMainMenuActivity.this, "App Info", Toast.LENGTH_SHORT).show();
		});



		go_db.setOnClickListener(v -> {
			i.setAction(Intent.ACTION_VIEW);
			i.setClass(getApplicationContext(), MenuActivity.class);
			startActivity(i);
		});

		go_dbz.setOnClickListener(v -> {
			i.setAction(Intent.ACTION_VIEW);
			i.setClass(getApplicationContext(), DbzMainActivity.class);
			startActivity(i);
		});

		go_db1.setOnClickListener(v -> {
			i.setAction(Intent.ACTION_VIEW);
			i.setClass(getApplicationContext(), DbMainActivity.class);
			startActivity(i);

		//	 _button_click_link();
		});

		go_dbgt.setOnClickListener(v -> {
			i.setAction(Intent.ACTION_VIEW);
			i.setClass(getApplicationContext(), DbGtMainActivity.class);
			startActivity(i);


		});

		mDrawer = (FlowingDrawer) findViewById(R.id.drawerlayout);
		mDrawer.setTouchMode(ElasticDrawer.TOUCH_MODE_BEZEL);
		mDrawer.setOnDrawerStateChangeListener(new ElasticDrawer.OnDrawerStateChangeListener() {
			@Override
			public void onDrawerStateChange(int oldState, int newState) {
				if (newState == ElasticDrawer.STATE_CLOSED) {
					Log.i("DbMainMenuActivity", "Drawer STATE_CLOSED");
				}
			}

			@Override
			public void onDrawerSlide(float openRatio, int offsetPixels) {
				Log.i("DbMainMenuActivity", "openRatio=" + openRatio + " ,offsetPixels=" + offsetPixels);
			}
		});


	}
	
	private void initializeLogic() {
		Window w = getWindow();
		w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
		getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
		_Smart_Banner();
		_Banner();
		_Banners();
		_lang();

	}

	@SuppressLint("SetTextI18n")
	public void _lang() {
		language = Locale.getDefault().getDisplayLanguage();
		if (language.equals("magyar")) {
			textview.setText("Dragon Ball Széria");
		}
		else
		{
			if (language.equals("English")) {
				textview.setText("Dragon Ball Series");
			}
		}
	}

	public void _button_click_link() {
		language = Locale.getDefault().getDisplayLanguage();
		if (language.equals("magyar")) {
			Toast.makeText(DbMainMenuActivity.this,
					"Hamarosan!!!", Toast.LENGTH_LONG).show();
		} else {
			if (language.equals("English")) {
				Toast.makeText(DbMainMenuActivity.this,
						"Coming Soon!!!", Toast.LENGTH_LONG).show();
			}
		}
	}
	
	
	@Override
	public void onBackPressed() {

		finish();
	}

	public void _Banner() {
		AdView adView2 = new AdView(DbMainMenuActivity.this);
		adView2.setAdSize(AdSize.BANNER);
		adView2.setAdUnitId("ca-app-pub-9399905616386219/3692748408");
		AdRequest adRequest1 = new AdRequest.Builder().build();
		adView2.loadAd(adRequest1);
		LinearLayout.LayoutParams layoutparams = new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
		banner.addView(adView2,layoutparams);
	}
	public void _Smart_Banner() {
		AdView adView1 = new AdView(DbMainMenuActivity.this);
		adView1.setAdSize(AdSize.MEDIUM_RECTANGLE);
		adView1.setAdUnitId("ca-app-pub-9399905616386219/3692748408");
		AdRequest adRequest = new AdRequest.Builder().build();
		adView1.loadAd(adRequest);
		LinearLayout.LayoutParams layoutparams = new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
		nativead.addView(adView1,layoutparams);
	}
	public void _Banners() {
		AdView adView3 = new AdView(DbMainMenuActivity.this);
		adView3.setAdSize(AdSize.BANNER);
		adView3.setAdUnitId("ca-app-pub-9399905616386219/3692748408");
		AdRequest adRequest2 = new AdRequest.Builder().build();
		adView3.loadAd(adRequest2);
		LinearLayout.LayoutParams layoutparams = new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
		banners.addView(adView3,layoutparams);
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
