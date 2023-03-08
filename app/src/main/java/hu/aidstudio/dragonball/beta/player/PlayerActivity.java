package hu.aidstudio.dragonball.beta.player;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.gms.ads.MobileAds;
import com.google.firebase.FirebaseApp;

import java.util.ArrayList;
import java.util.Random;

import hu.aidstudio.dragonball.beta.R;

public class PlayerActivity extends Activity {
	
	private String img = "";
	private String url = "";
	
	private LinearLayout linear1;
	private WebView webview1;
	
	private SharedPreferences ply;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.player);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		MobileAds.initialize(this);
		
		initializeLogic();
	}
	
	@SuppressLint("SetJavaScriptEnabled")
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		webview1 = findViewById(R.id.webview1);
		webview1.getSettings().setJavaScriptEnabled(true);
		webview1.getSettings().setSupportZoom(true);
		ply = getSharedPreferences("ply", Activity.MODE_PRIVATE);
		
		webview1.setWebViewClient(new WebViewClient() {
			@Override
			public void onPageStarted(WebView _param1, String _param2, Bitmap _param3) {
				final String _url = _param2;
				
				super.onPageStarted(_param1, _param2, _param3);
			}
			
			@Override
			public void onPageFinished(WebView _param1, String _param2) {
				final String _url = _param2;
				
				super.onPageFinished(_param1, _param2);
			}
		});
	}
	
	private void initializeLogic() {
		Window w = getWindow();
		w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
		getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
	}
	
	@Override
	public void onStart() {
		super.onStart();
		url = getIntent().getStringExtra("url");
		img = getIntent().getStringExtra("img");
		webview1.loadUrl("data:text/html,".concat("<!DOCTYPE html>\n<html>\n<head>\n    <title>Video Player plyr.js</title>\n    <link rel=\"stylesheet\" href=\"https://cdn.plyr.io/3.6.12/plyr.css\" />\n    <script src=\"https://cdn.plyr.io/3.6.12/plyr.polyfilled.js\"></script>\n</head>\n<body style=\"background-color:black;>\n    <div class=\"container\">\n    <video controls crossorigin playsinline poster=\"".concat(img.concat("\">\n  <source src=\"".concat(url.concat("\" type=\"video/mp4\" size=\"576\">\n\n<!-- Caption files -->\n            <track kind=\"captions\" label=\"English\" srclang=\"en\" src=\"https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E001.mp4\" >\n           \n            <!-- Fallback for browsers that don't support the <video> element -->\n            <a href=\"".concat(url.concat("   \" download>Download</a>\n    </video>\n</div>\n<!-- Plyr resources and browser polyfills are specified in the pen settings -->\n\n<style type=\"text/css\">\n    .container {\n    min-width: 100%; min-height: 100%;\nwidth: auto; height: auto; z-index: -100;\n}\n</style>\n\n<script type=\"text/javascript\">\n    const player = new Plyr('video', {captions: {active: true}});\n\n// Expose player so it can be used from the console\nwindow.player = player;\n</script>\n\n</body>\n</html>"))))))));
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