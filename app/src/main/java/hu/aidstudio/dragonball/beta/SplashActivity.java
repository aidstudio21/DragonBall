package hu.aidstudio.dragonball.beta;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import de.hdodenhof.circleimageview.CircleImageView;
import hu.aidstudio.dragonball.beta.menu.DbMainMenuActivity;


public class SplashActivity extends Activity {

	private Timer _timer = new Timer();

	private String title = "";

	private LinearLayout linear1;
	private LinearLayout splash;
	private LinearLayout linear6;
	private ProgressBar progressbar1;
	private TextView textview10;
	private CircleImageView circleimageview1;
	private LinearLayout linear7;
	private TextView textview3;
	private LinearLayout linear15;
	private TextView version;

	private TimerTask timer;
	private Intent in = new Intent();

	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.splash);
		initialize(_savedInstanceState);
		initializeLogic();
	}

	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		splash = findViewById(R.id.splash);
		linear6 = findViewById(R.id.linear6);
		progressbar1 = findViewById(R.id.progressbar1);
		textview10 = findViewById(R.id.textview10);
		circleimageview1 = findViewById(R.id.circleimageview1);
		linear7 = findViewById(R.id.linear7);
		textview3 = findViewById(R.id.textview3);
		linear15 = findViewById(R.id.linear15);
		version = findViewById(R.id.version);
	}

	private void initializeLogic() {
		try{
			progressbar1.getIndeterminateDrawable().setColorFilter(0xff90caf9, PorterDuff.Mode.SRC_IN);
		}catch(Exception e){

		}
		int nightModeFlags = getResources().getConfiguration().uiMode & android.content.res.Configuration.UI_MODE_NIGHT_MASK;
		if (nightModeFlags == android.content.res.Configuration.UI_MODE_NIGHT_YES) {
			// ACTION WHEN DARK MODE IS ON
			circleimageview1.setImageResource(R.drawable.app_icon);
			version.setTextColor(0xFFFFFFFF);
			textview10.setTextColor(0xFFFFFFFF);
			splash.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)30, 0xFF212121));
			try{
				progressbar1.getIndeterminateDrawable().setColorFilter(0xFF214663, PorterDuff.Mode.SRC_IN);
			}catch(Exception e){

			}
		} else {
			// ACTION IF DARK MODE IS OFF
			splash.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)30, 0xFFFFFFFF));
		};

		getActionBar().show();
		title = getTitle().toString();
		getActionBar().hide();
		if (title.equals("DBO Player")) {
			textview3.setText("DBO Player");
			textview10.setText("Starting DBO Player...");
		} else {
			textview3.setText("DBO Player");
			textview10.setText("Starting DBO Player...");
		}

		timer = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						if (title.equals("DBO Player")) {
							in.setClass(getApplicationContext(), DbMainMenuActivity.class);
							startActivity(in);
							finish();
						} else {
							in.setClass(getApplicationContext(), DbMainMenuActivity.class);
							startActivity(in);
							finish();
						}

					}
				});
			}
		};
		_timer.schedule(timer, (int)(15000));
		{ Window w = getWindow();  w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS); }
		{
			Window w =SplashActivity.this.getWindow();
			w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setNavigationBarColor(0xFF000000);
		}
		Window w =SplashActivity.this.getWindow();
		w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
		w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
		w.setStatusBarColor(0xFF000000);
		circleimageview1.setCircleBackgroundColor(Color.TRANSPARENT);
	}

	@Override
	public void onBackPressed() {

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
