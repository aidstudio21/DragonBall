package hu.aidstudio.dragonball.beta.dbz;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.TextView;
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
import java.util.Objects;
import java.util.Random;

import hu.aidstudio.dragonball.beta.player.PlayActivity;
import hu.aidstudio.dragonball.beta.R;
import hu.aidstudio.dragonball.beta.sk.SketchwareUtil;


public class Dbz_6Activity extends Activity {
	
	RewardedAd rewardad;
	
	private final ArrayList<HashMap<String, Object>> map = new ArrayList<>();

	private LinearLayout banner;
	private ListView listview1;
	
	private final Intent acti = new Intent();
	private AlertDialog.Builder d;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.dbz_1);
		initialize();
		FirebaseApp.initializeApp(this);
		MobileAds.initialize(this);
		
		initializeLogic();
	}
	
	private void initialize() {

		banner = findViewById(R.id.banner);
		listview1 = findViewById(R.id.listview1);
		d = new AlertDialog.Builder(this);
	}
	
	private void initializeLogic() {
		getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
		Window w = getWindow();
		w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "1");
			map.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "2");
			map.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "3");
			map.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "4");
			map.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "5");
			map.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "6");
			map.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "7");
			map.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "8");
			map.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "9");
			map.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "10");
			map.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "11");
			map.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "12");
			map.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "13");
			map.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "14");
			map.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "15");
			map.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "16");
			map.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "17");
			map.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "18");
			map.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "19");
			map.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "20");
			map.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "21");
			map.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "22");
			map.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "23");
			map.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "24");
			map.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "25");
			map.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "26");
			map.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "27");
			map.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "28");
			map.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "29");
			map.add(_item);
		}
		
		listview1.setAdapter(new Listview1Adapter(map));
		((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
		_Admob_Ads_Banner();

		AdRequest rewardad_request = new AdRequest.Builder().build();

		RewardedAd.load(Dbz_6Activity.this, "ca-app-pub-9399905616386219/1829002391",
				rewardad_request, new RewardedAdLoadCallback() {


					@Override
					public void onAdLoaded(@NonNull RewardedAd rewardedAd) {

						rewardad = rewardedAd;


					}
					@Override
					public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {

						rewardad = null;

						SketchwareUtil.showMessage(getApplicationContext(), "Failed Video Loading");


					}


				});

	}
	
	
	@Override
	public void onBackPressed() {
		finish();
	}
	
	@Override
	public void onResume() {
		super.onResume();

		AdRequest rewardad_request = new AdRequest.Builder().build();

		RewardedAd.load(Dbz_6Activity.this, "ca-app-pub-9399905616386219/1829002391",
				rewardad_request, new RewardedAdLoadCallback() {


					@Override
					public void onAdLoaded(@NonNull RewardedAd rewardedAd) {

						rewardad = rewardedAd;


					}
					@Override
					public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {

						rewardad = null;

						SketchwareUtil.showMessage(getApplicationContext(), "Failed Video Loading");


					}


				});
		
	}
	public void _dbz1() {

		if (rewardad != null) {
			rewardad.show(Dbz_6Activity.this, rewardItem -> {
				d.setTitle(R.string.dbze6);
				d.setMessage(R.string.megakkarja);
				d.setPositiveButton(R.string.megnezem, (_dialog, _which) -> {
					acti.setClass(getApplicationContext(), PlayActivity.class);
					acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbz/hu/Dragon_Ball_Z_E166.mp4");
					acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbz/hu/Dragon_Ball_Z_E166.mp4");
					startActivity(acti);
				});
				d.setNegativeButton("M??gsem", (_dialog, _which) -> {

				});
				d.create().show();

			});
		}
	}

	public void _dbz2() {
		d.setTitle(R.string.dbze6);
		d.setMessage(R.string.megakkarja);
		d.setPositiveButton(R.string.megnezem, (_dialog, _which) -> {
			acti.setClass(getApplicationContext(), PlayActivity.class);
			acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbz/hu/Dragon_Ball_Z_E167.mp4");
			acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbz/hu/Dragon_Ball_Z_E167.mp4");
			startActivity(acti);
		});
		d.setNegativeButton("M??gsem", (_dialog, _which) -> {

		});
		d.create().show();
	}

	public void _dbz3() {

		if (rewardad != null) {
			rewardad.show(Dbz_6Activity.this, rewardItem -> {
				d.setTitle(R.string.dbze6);
				d.setMessage(R.string.megakkarja);
				d.setPositiveButton(R.string.megnezem, (_dialog, _which) -> {
					acti.setClass(getApplicationContext(), PlayActivity.class);
					acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbz/hu/Dragon_Ball_Z_E168.mp4");
					acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbz/hu/Dragon_Ball_Z_E168.mp4");
					startActivity(acti);
				});
				d.setNegativeButton("M??gsem", (_dialog, _which) -> {

				});
				d.create().show();

			});
		}
	}

	public void _dbz4() {
		d.setTitle(R.string.dbze6);
		d.setMessage(R.string.megakkarja);
		d.setPositiveButton(R.string.megnezem, (_dialog, _which) -> {
			acti.setClass(getApplicationContext(), PlayActivity.class);
			acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbz/hu/Dragon_Ball_Z_E169.mp4");
			acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbz/hu/Dragon_Ball_Z_E169.mp4");
			startActivity(acti);
		});
		d.setNegativeButton("M??gsem", (_dialog, _which) -> {

		});
		d.create().show();
	}

	public void _dbz5() {

		if (rewardad != null) {
			rewardad.show(Dbz_6Activity.this, rewardItem -> {
				d.setTitle(R.string.dbze6);
				d.setMessage(R.string.megakkarja);
				d.setPositiveButton(R.string.megnezem, (_dialog, _which) -> {
					acti.setClass(getApplicationContext(), PlayActivity.class);
					acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbz/hu/Dragon_Ball_Z_E170.mp4");
					acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbz/hu/Dragon_Ball_Z_E170.mp4");
					startActivity(acti);
				});
				d.setNegativeButton("M??gsem", (_dialog, _which) -> {

				});
				d.create().show();

			});
		}
	}

	public void _dbz6() {
		d.setTitle(R.string.dbze6);
		d.setMessage(R.string.megakkarja);
		d.setPositiveButton(R.string.megnezem, (_dialog, _which) -> {
			acti.setClass(getApplicationContext(), PlayActivity.class);
			acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbz/hu/Dragon_Ball_Z_E171.mp4");
			acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbz/hu/Dragon_Ball_Z_E171.mp4");
			startActivity(acti);
		});
		d.setNegativeButton("M??gsem", (_dialog, _which) -> {

		});
		d.create().show();
	}
	public void _dbz7() {

		if (rewardad != null) {
			rewardad.show(Dbz_6Activity.this, rewardItem -> {
				d.setTitle(R.string.dbze6);
				d.setMessage(R.string.megakkarja);
				d.setPositiveButton(R.string.megnezem, (_dialog, _which) -> {
					acti.setClass(getApplicationContext(), PlayActivity.class);
					acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbz/hu/Dragon_Ball_Z_E172.mp4");
					acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbz/hu/Dragon_Ball_Z_E172.mp4");
					startActivity(acti);
				});
				d.setNegativeButton("M??gsem", (_dialog, _which) -> {

				});
				d.create().show();

			});
		}
	}
	public void _dbz8() {
		d.setTitle(R.string.dbze6);
		d.setMessage(R.string.megakkarja);
		d.setPositiveButton(R.string.megnezem, (_dialog, _which) -> {
			acti.setClass(getApplicationContext(), PlayActivity.class);
			acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbz/hu/Dragon_Ball_Z_E173.mp4");
			acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbz/hu/Dragon_Ball_Z_E173.mp4");
			startActivity(acti);
		});
		d.setNegativeButton("M??gsem", (_dialog, _which) -> {

		});
		d.create().show();
	}
	public void _dbz9() {

		if (rewardad != null) {
			rewardad.show(Dbz_6Activity.this, rewardItem -> {
				d.setTitle(R.string.dbze6);
				d.setMessage(R.string.megakkarja);
				d.setPositiveButton(R.string.megnezem, (_dialog, _which) -> {
					acti.setClass(getApplicationContext(), PlayActivity.class);
					acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbz/hu/Dragon_Ball_Z_E174.mp4");
					acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbz/hu/Dragon_Ball_Z_E174.mp4");
					startActivity(acti);
				});
				d.setNegativeButton("M??gsem", (_dialog, _which) -> {

				});
				d.create().show();

			});
		}
	}
	public void _dbz10() {
		d.setTitle(R.string.dbze6);
		d.setMessage(R.string.megakkarja);
		d.setPositiveButton(R.string.megnezem, (_dialog, _which) -> {
			acti.setClass(getApplicationContext(), PlayActivity.class);
			acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbz/hu/Dragon_Ball_Z_E175.mp4");
			acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbz/hu/Dragon_Ball_Z_E175.mp4");
			startActivity(acti);
		});
		d.setNegativeButton("M??gsem", (_dialog, _which) -> {

		});
		d.create().show();
	}
	public void _dbz11() {

		if (rewardad != null) {
			rewardad.show(Dbz_6Activity.this, rewardItem -> {
				d.setTitle(R.string.dbze6);
				d.setMessage(R.string.megakkarja);
				d.setPositiveButton(R.string.megnezem, (_dialog, _which) -> {
					acti.setClass(getApplicationContext(), PlayActivity.class);
					acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbz/hu/Dragon_Ball_Z_E176.mp4");
					acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbz/hu/Dragon_Ball_Z_E176.mp4");
					startActivity(acti);
				});
				d.setNegativeButton("M??gsem", (_dialog, _which) -> {

				});
				d.create().show();

			});
		}
	}
	public void _dbz12() {
		d.setTitle(R.string.dbze6);
		d.setMessage(R.string.megakkarja);
		d.setPositiveButton(R.string.megnezem, (_dialog, _which) -> {
			acti.setClass(getApplicationContext(), PlayActivity.class);
			acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbz/hu/Dragon_Ball_Z_E177.mp4");
			acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbz/hu/Dragon_Ball_Z_E177.mp4");
			startActivity(acti);
		});
		d.setNegativeButton("M??gsem", (_dialog, _which) -> {

		});
		d.create().show();
	}
	public void _dbz13() {

		if (rewardad != null) {
			rewardad.show(Dbz_6Activity.this, rewardItem -> {
				d.setTitle(R.string.dbze6);
				d.setMessage(R.string.megakkarja);
				d.setPositiveButton(R.string.megnezem, (_dialog, _which) -> {
					acti.setClass(getApplicationContext(), PlayActivity.class);
					acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbz/hu/Dragon_Ball_Z_E178.mp4");
					acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbz/hu/Dragon_Ball_Z_E178.mp4");
					startActivity(acti);
				});
				d.setNegativeButton("M??gsem", (_dialog, _which) -> {

				});
				d.create().show();

			});
		}
	}
	public void _dbz14() {
		d.setTitle(R.string.dbze6);
		d.setMessage(R.string.megakkarja);
		d.setPositiveButton(R.string.megnezem, (_dialog, _which) -> {
			acti.setClass(getApplicationContext(), PlayActivity.class);
			acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbz/hu/Dragon_Ball_Z_E179.mp4");
			acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbz/hu/Dragon_Ball_Z_E179.mp4");
			startActivity(acti);
		});
		d.setNegativeButton("M??gsem", (_dialog, _which) -> {

		});
		d.create().show();
	}
	public void _dbz15() {

		if (rewardad != null) {
			rewardad.show(Dbz_6Activity.this, rewardItem -> {
				d.setTitle(R.string.dbze6);
				d.setMessage(R.string.megakkarja);
				d.setPositiveButton(R.string.megnezem, (_dialog, _which) -> {
					acti.setClass(getApplicationContext(), PlayActivity.class);
					acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbz/hu/Dragon_Ball_Z_E180.mp4");
					acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbz/hu/Dragon_Ball_Z_E180.mp4");
					startActivity(acti);
				});
				d.setNegativeButton("M??gsem", (_dialog, _which) -> {

				});
				d.create().show();

			});
		}
	}
	public void _dbz16() {
		d.setTitle(R.string.dbze6);
		d.setMessage(R.string.megakkarja);
		d.setPositiveButton(R.string.megnezem, (_dialog, _which) -> {
			acti.setClass(getApplicationContext(), PlayActivity.class);
			acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbz/hu/Dragon_Ball_Z_E181.mp4");
			acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbz/hu/Dragon_Ball_Z_E181.mp4");
			startActivity(acti);
		});
		d.setNegativeButton("M??gsem", (_dialog, _which) -> {

		});
		d.create().show();
	}
	public void _dbz17() {

		if (rewardad != null) {
			rewardad.show(Dbz_6Activity.this, rewardItem -> {
				d.setTitle(R.string.dbze6);
				d.setMessage(R.string.megakkarja);
				d.setPositiveButton(R.string.megnezem, (_dialog, _which) -> {
					acti.setClass(getApplicationContext(), PlayActivity.class);
					acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbz/hu/Dragon_Ball_Z_E182.mp4");
					acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbz/hu/Dragon_Ball_Z_E182.mp4");
					startActivity(acti);
				});
				d.setNegativeButton("M??gsem", (_dialog, _which) -> {

				});
				d.create().show();

			});
		}
	}
	public void _dbz18() {
		d.setTitle(R.string.dbze6);
		d.setMessage(R.string.megakkarja);
		d.setPositiveButton(R.string.megnezem, (_dialog, _which) -> {
			acti.setClass(getApplicationContext(), PlayActivity.class);
			acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbz/hu/Dragon_Ball_Z_E183.mp4");
			acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbz/hu/Dragon_Ball_Z_E183.mp4");
			startActivity(acti);
		});
		d.setNegativeButton("M??gsem", (_dialog, _which) -> {

		});
		d.create().show();
	}
	public void _dbz19() {

		if (rewardad != null) {
			rewardad.show(Dbz_6Activity.this, rewardItem -> {
				d.setTitle(R.string.dbze6);
				d.setMessage(R.string.megakkarja);
				d.setPositiveButton(R.string.megnezem, (_dialog, _which) -> {
					acti.setClass(getApplicationContext(), PlayActivity.class);
					acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbz/hu/Dragon_Ball_Z_E184.mp4");
					acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbz/hu/Dragon_Ball_Z_E184.mp4");
					startActivity(acti);
				});
				d.setNegativeButton("M??gsem", (_dialog, _which) -> {

				});
				d.create().show();

			});
		}
	}
	public void _dbz20() {
		d.setTitle(R.string.dbze6);
		d.setMessage(R.string.megakkarja);
		d.setPositiveButton(R.string.megnezem, (_dialog, _which) -> {
			acti.setClass(getApplicationContext(), PlayActivity.class);
			acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbz/hu/Dragon_Ball_Z_E185.mp4");
			acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbz/hu/Dragon_Ball_Z_E185.mp4");
			startActivity(acti);
		});
		d.setNegativeButton("M??gsem", (_dialog, _which) -> {

		});
		d.create().show();
	}
	public void _dbz21() {

		if (rewardad != null) {
			rewardad.show(Dbz_6Activity.this, rewardItem -> {
				d.setTitle(R.string.dbze6);
				d.setMessage(R.string.megakkarja);
				d.setPositiveButton(R.string.megnezem, (_dialog, _which) -> {
					acti.setClass(getApplicationContext(), PlayActivity.class);
					acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbz/hu/Dragon_Ball_Z_E186.mp4");
					acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbz/hu/Dragon_Ball_Z_E186.mp4");
					startActivity(acti);
				});
				d.setNegativeButton("M??gsem", (_dialog, _which) -> {

				});
				d.create().show();

			});
		}
	}
	public void _dbz22() {
		d.setTitle(R.string.dbze6);
		d.setMessage(R.string.megakkarja);
		d.setPositiveButton(R.string.megnezem, (_dialog, _which) -> {
			acti.setClass(getApplicationContext(), PlayActivity.class);
			acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbz/hu/Dragon_Ball_Z_E187.mp4");
			acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbz/hu/Dragon_Ball_Z_E187.mp4");
			startActivity(acti);
		});
		d.setNegativeButton("M??gsem", (_dialog, _which) -> {

		});
		d.create().show();
	}
	public void _dbz23() {

		if (rewardad != null) {
			rewardad.show(Dbz_6Activity.this, rewardItem -> {
				d.setTitle(R.string.dbze6);
				d.setMessage(R.string.megakkarja);
				d.setPositiveButton(R.string.megnezem, (_dialog, _which) -> {
					acti.setClass(getApplicationContext(), PlayActivity.class);
					acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbz/hu/Dragon_Ball_Z_E188.mp4");
					acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbz/hu/Dragon_Ball_Z_E188.mp4");
					startActivity(acti);
				});
				d.setNegativeButton("M??gsem", (_dialog, _which) -> {

				});
				d.create().show();

			});
		}
	}
	public void _dbz24() {
		d.setTitle(R.string.dbze6);
		d.setMessage(R.string.megakkarja);
		d.setPositiveButton(R.string.megnezem, (_dialog, _which) -> {
			acti.setClass(getApplicationContext(), PlayActivity.class);
			acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbz/hu/Dragon_Ball_Z_E189.mp4");
			acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbz/hu/Dragon_Ball_Z_E189.mp4");
			startActivity(acti);
		});
		d.setNegativeButton("M??gsem", (_dialog, _which) -> {

		});
		d.create().show();
	}
	public void _dbz25() {

		if (rewardad != null) {
			rewardad.show(Dbz_6Activity.this, rewardItem -> {
				d.setTitle(R.string.dbze6);
				d.setMessage(R.string.megakkarja);
				d.setPositiveButton(R.string.megnezem, (_dialog, _which) -> {
					acti.setClass(getApplicationContext(), PlayActivity.class);
					acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbz/hu/Dragon_Ball_Z_E190.mp4");
					acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbz/hu/Dragon_Ball_Z_E190.mp4");
					startActivity(acti);
				});
				d.setNegativeButton("M??gsem", (_dialog, _which) -> {

				});
				d.create().show();

			});
		}
	}
	public void _dbz26() {
		d.setTitle(R.string.dbze6);
		d.setMessage(R.string.megakkarja);
		d.setPositiveButton(R.string.megnezem, (_dialog, _which) -> {
			acti.setClass(getApplicationContext(), PlayActivity.class);
			acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbz/hu/Dragon_Ball_Z_E191.mp4");
			acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbz/hu/Dragon_Ball_Z_E191.mp4");
			startActivity(acti);
		});
		d.setNegativeButton("M??gsem", (_dialog, _which) -> {

		});
		d.create().show();
	}
	public void _dbz27() {

		if (rewardad != null) {
			rewardad.show(Dbz_6Activity.this, rewardItem -> {
				d.setTitle(R.string.dbze6);
				d.setMessage(R.string.megakkarja);
				d.setPositiveButton(R.string.megnezem, (_dialog, _which) -> {
					acti.setClass(getApplicationContext(), PlayActivity.class);
					acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbz/hu/Dragon_Ball_Z_E192.mp4");
					acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbz/hu/Dragon_Ball_Z_E192.mp4");
					startActivity(acti);
				});
				d.setNegativeButton("M??gsem", (_dialog, _which) -> {

				});
				d.create().show();

			});
		}
	}
	public void _dbz28() {
		d.setTitle(R.string.dbze6);
		d.setMessage(R.string.megakkarja);
		d.setPositiveButton(R.string.megnezem, (_dialog, _which) -> {
			acti.setClass(getApplicationContext(), PlayActivity.class);
			acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbz/hu/Dragon_Ball_Z_E193.mp4");
			acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbz/hu/Dragon_Ball_Z_E193.mp4");
			startActivity(acti);
		});
		d.setNegativeButton("M??gsem", (_dialog, _which) -> {

		});
		d.create().show();
	}
	public void _dbz29() {

		if (rewardad != null) {
			rewardad.show(Dbz_6Activity.this, rewardItem -> {
				d.setTitle(R.string.dbze6);
				d.setMessage(R.string.megakkarja);
				d.setPositiveButton(R.string.megnezem, (_dialog, _which) -> {
					acti.setClass(getApplicationContext(), PlayActivity.class);
					acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbz/hu/Dragon_Ball_Z_E194.mp4");
					acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbz/hu/Dragon_Ball_Z_E194.mp4");
					startActivity(acti);
				});
				d.setNegativeButton("M??gsem", (_dialog, _which) -> {

				});
				d.create().show();

			});
		}
	}

	
	
	public void _Admob_Ads_Banner() {
		AdView adView1 = new AdView(Dbz_6Activity.this);
		adView1.setAdSize(AdSize.BANNER);
		adView1.setAdUnitId("ca-app-pub-9399905616386219/3692748408");
		AdRequest adRequest = new AdRequest.Builder().build();
		adView1.loadAd(adRequest);
		LayoutParams layoutparams = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
		banner.addView(adView1,layoutparams);
	}
	
	public class Listview1Adapter extends BaseAdapter {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public Listview1Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public int getCount() {
			return _data.size();
		}
		
		@Override
		public HashMap<String, Object> getItem(int _index) {
			return _data.get(_index);
		}
		
		@Override
		public long getItemId(int _index) {
			return _index;
		}
		
		@SuppressLint({"SetTextI18n", "InflateParams"})
		@Override
		public View getView(final int _position, View _v, ViewGroup _container) {
			LayoutInflater _inflater = getLayoutInflater();
			View _view = _v;
			if (_view == null) {
				_view = _inflater.inflate(R.layout.video_items_3, null);
			}
			

			final LinearLayout Banner = _view.findViewById(R.id.Banner);
			final LinearLayout Banner2 = _view.findViewById(R.id.Banner2);
			final ImageView imageview2 = _view.findViewById(R.id.imageview2);
			final TextView textview1 = _view.findViewById(R.id.textview1);
			final Button db19 = _view.findViewById(R.id.db19);
			
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("1")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Z 166.R??sz");
				db19.setText("Megn??zem");
				db19.setOnClickListener(_view120 -> _dbz1());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("2")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Z 167.R??sz");
				db19.setText("Megn??zem");
				db19.setOnClickListener(_view119 -> _dbz2());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("3")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Z 168.R??sz");
				db19.setText("Megn??zem");
				db19.setOnClickListener(_view118 -> _dbz3());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("4")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Z 169.R??sz");
				db19.setText("Megn??zem");
				db19.setOnClickListener(_view117 -> _dbz4());
				Banner.setVisibility(View.GONE);
				AdView adView1 = new AdView(Dbz_6Activity.this);
				adView1.setAdSize(AdSize.MEDIUM_RECTANGLE);
				adView1.setAdUnitId("ca-app-pub-9399905616386219/3692748408");
				AdRequest adRequest = new AdRequest.Builder().build();
				adView1.loadAd(adRequest);
				LayoutParams layoutparams = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
				Banner2.addView(adView1,layoutparams);
				Banner2.setVisibility(View.VISIBLE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("5")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Z 170.R??sz");
				db19.setText("Megn??zem");
				db19.setOnClickListener(_view116 -> _dbz5());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("6")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Z 171.R??sz");
				db19.setText("Megn??zem");
				db19.setOnClickListener(_view115 -> _dbz6());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("7")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Z 172.R??sz");
				db19.setText("Megn??zem");
				db19.setOnClickListener(_view114 -> _dbz7());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("8")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Z 173.R??sz");
				db19.setText("Megn??zem");
				db19.setOnClickListener(_view113 -> _dbz8());
				Banner.setVisibility(View.VISIBLE);
				AdView adView2 = new AdView(Dbz_6Activity.this);
				adView2.setAdSize(AdSize.BANNER);
				adView2.setAdUnitId("ca-app-pub-9399905616386219/3692748408");
				AdRequest adRequest = new AdRequest.Builder().build();
				adView2.loadAd(adRequest);
				LayoutParams layoutparams = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
				Banner.addView(adView2,layoutparams);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("9")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Z 174.R??sz");
				db19.setText("Megn??zem");
				db19.setOnClickListener(_view112 -> _dbz9());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("10")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Z 175.R??sz");
				db19.setText("Megn??zem");
				db19.setOnClickListener(_view111 -> _dbz10());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("11")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Z 176.R??sz");
				db19.setText("Megn??zem");
				db19.setOnClickListener(_view110 -> _dbz11());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("12")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Z 177.R??sz");
				db19.setText("Megn??zem");
				db19.setOnClickListener(_view19 -> _dbz12());
				Banner.setVisibility(View.GONE);
				AdView adView3 = new AdView(Dbz_6Activity.this);
				adView3.setAdSize(AdSize.MEDIUM_RECTANGLE);
				adView3.setAdUnitId("ca-app-pub-9399905616386219/3692748408");
				AdRequest adRequest = new AdRequest.Builder().build();
				adView3.loadAd(adRequest);
				LayoutParams layoutparams = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
				Banner2.addView(adView3,layoutparams);
				Banner2.setVisibility(View.VISIBLE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("13")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Z 178.R??sz");
				db19.setText("Megn??zem");
				db19.setOnClickListener(_view18 -> _dbz13());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("14")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Z 179.R??sz");
				db19.setText("Megn??zem");
				db19.setOnClickListener(_view17 -> _dbz14());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("15")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Z 180.R??sz");
				db19.setText("Megn??zem");
				db19.setOnClickListener(_view16 -> _dbz15());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("16")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Z 181.R??sz");
				db19.setText("Megn??zem");
				db19.setOnClickListener(_view15 -> _dbz16());
				Banner.setVisibility(View.VISIBLE);
				AdView adView4 = new AdView(Dbz_6Activity.this);
				adView4.setAdSize(AdSize.BANNER);
				adView4.setAdUnitId("ca-app-pub-9399905616386219/3692748408");
				AdRequest adRequest = new AdRequest.Builder().build();
				adView4.loadAd(adRequest);
				LayoutParams layoutparams = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
				Banner.addView(adView4,layoutparams);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("17")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Z 182.R??sz");
				db19.setText("Megn??zem");
				db19.setOnClickListener(_view14 -> _dbz17());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("18")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Z 183.R??sz");
				db19.setText("Megn??zem");
				db19.setOnClickListener(_view13 -> _dbz18());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("19")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Z 184.R??sz");
				db19.setText("Megn??zem");
				db19.setOnClickListener(_view12 -> _dbz19());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("20")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Z 185.R??sz");
				db19.setText("Megn??zem");
				db19.setOnClickListener(_view1 -> _dbz20());
				Banner.setVisibility(View.GONE);
				AdView adView5 = new AdView(Dbz_6Activity.this);
				adView5.setAdSize(AdSize.MEDIUM_RECTANGLE);
				adView5.setAdUnitId("ca-app-pub-9399905616386219/3692748408");
				AdRequest adRequest = new AdRequest.Builder().build();
				adView5.loadAd(adRequest);
				LayoutParams layoutparams = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
				Banner2.addView(adView5,layoutparams);
				Banner2.setVisibility(View.VISIBLE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("21")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Z 186.R??sz");
				db19.setText("Megn??zem");
				db19.setOnClickListener(_view1 -> _dbz21());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("22")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Z 187.R??sz");
				db19.setText("Megn??zem");
				db19.setOnClickListener(_view1 -> _dbz22());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("23")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Z 188.R??sz");
				db19.setText("Megn??zem");
				db19.setOnClickListener(_view1 -> _dbz23());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("24")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Z 189.R??sz");
				db19.setText("Megn??zem");
				db19.setOnClickListener(_view1 -> _dbz24());
				Banner.setVisibility(View.VISIBLE);
				AdView adView6 = new AdView(Dbz_6Activity.this);
				adView6.setAdSize(AdSize.BANNER);
				adView6.setAdUnitId("ca-app-pub-9399905616386219/3692748408");
				AdRequest adRequest = new AdRequest.Builder().build();
				adView6.loadAd(adRequest);
				LayoutParams layoutparams = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
				Banner.addView(adView6,layoutparams);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("25")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Z 190.R??sz");
				db19.setText("Megn??zem");
				db19.setOnClickListener(_view1 -> _dbz25());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("26")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Z 191.R??sz");
				db19.setText("Megn??zem");
				db19.setOnClickListener(_view1 -> _dbz26());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("27")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Z 192.R??sz");
				db19.setText("Megn??zem");
				db19.setOnClickListener(_view1 -> _dbz27());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("28")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Z 193.R??sz");
				db19.setText("Megn??zem");
				db19.setOnClickListener(_view1 -> _dbz28());
				Banner.setVisibility(View.GONE);
				AdView adView7 = new AdView(Dbz_6Activity.this);
				adView7.setAdSize(AdSize.MEDIUM_RECTANGLE);
				adView7.setAdUnitId("ca-app-pub-9399905616386219/3692748408");
				AdRequest adRequest = new AdRequest.Builder().build();
				adView7.loadAd(adRequest);
				LayoutParams layoutparams = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
				Banner2.addView(adView7,layoutparams);
				Banner2.setVisibility(View.VISIBLE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("29")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Z 194.R??sz");
				db19.setText("Megn??zem");
				db19.setOnClickListener(_view1 -> _dbz29());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			
			return _view;
		}
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
	
	@SuppressLint("SuspiciousIndentation")
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
