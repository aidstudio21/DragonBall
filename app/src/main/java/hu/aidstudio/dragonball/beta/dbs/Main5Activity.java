package hu.aidstudio.dragonball.beta.dbs;

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


public class Main5Activity extends Activity {
	
	RewardedAd rewardad;
	
	private final ArrayList<HashMap<String, Object>> map = new ArrayList<>();

	private LinearLayout banner;
	private ListView listview1;
	
	private final Intent acti = new Intent();
	private AlertDialog.Builder d;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main5);
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
		Window w = getWindow();
		w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
		getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "103");
			map.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "104");
			map.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "105");
			map.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "106");
			map.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "107");
			map.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "108");
			map.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "109");
			map.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "111");
			map.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "112");
			map.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "113");
			map.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "114");
			map.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "115");
			map.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "116");
			map.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "117");
			map.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "118");
			map.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "119");
			map.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "120");
			map.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "121");
			map.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "122");
			map.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "123");
			map.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "124");
			map.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "125");
			map.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "126");
			map.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "127");
			map.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "128");
			map.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "129");
			map.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "130");
			map.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "131");
			map.add(_item);
		}
		
		listview1.setAdapter(new Listview1Adapter(map));
		((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
		
		
		        AdRequest rewardad_request = new AdRequest.Builder().build();
		
		        RewardedAd.load(Main5Activity.this, "ca-app-pub-9399905616386219/1829002391",
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
		    
		AdView adView1 = new AdView(Main5Activity.this);
		adView1.setAdSize(AdSize.BANNER);
		adView1.setAdUnitId("ca-app-pub-9399905616386219/3692748408");
		AdRequest adRequest = new AdRequest.Builder().build();
		adView1.loadAd(adRequest);
		LinearLayout.LayoutParams layoutparams = new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
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
		
		        RewardedAd.load(Main5Activity.this, "ca-app-pub-9399905616386219/1829002391",
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

	@SuppressLint("SuspiciousIndentation")

	public void _go1() {
		if (rewardad != null) {
			           rewardad.show(Main5Activity.this, rewardItem -> {

							 d.setTitle("Dragon Ball Super 5.Évad 103.Rész");
		   d.setMessage("Meg akkarja tekinteni?");
		   d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
			   acti.setClass(getApplicationContext(), PlayActivity.class);
			   acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E103.mp4");
			   acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E103.mp4");
			   startActivity(acti);
		   });
		   d.setNegativeButton("Mégsem", (_dialog, _which) -> {

		   });
		   d.create().show();
						   });
			
			        }
	}
	
	
	public void _go104() {
		d.setTitle("Dragon Ball Super 5.Évad 104.Rész");
		d.setMessage("Meg akkarja tekinteni?");
		d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
			acti.setClass(getApplicationContext(), PlayActivity.class);
			acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E104.mp4");
			acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E104.mp4");
			startActivity(acti);
		});
		d.setNegativeButton("Mégsem", (_dialog, _which) -> {

		});
		d.create().show();
	}
	
	

	public void _go105() {
		if (rewardad != null) {
			           rewardad.show(Main5Activity.this, rewardItem -> {

							 d.setTitle("Dragon Ball Super 5.Évad 105.Rész");
		   d.setMessage("Meg akkarja tekinteni?");
		   d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
			   acti.setClass(getApplicationContext(), PlayActivity.class);
			   acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E105.mp4");
			   acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E105.mp4");
			   startActivity(acti);
		   });
		   d.setNegativeButton("Mégsem", (_dialog, _which) -> {

		   });
		   d.create().show();
						   });
			
			        }
	}
	
	
	public void _go106() {
		d.setTitle("Dragon Ball Super 5.Évad 106.Rész");
		d.setMessage("Meg akkarja tekinteni?");
		d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
			acti.setClass(getApplicationContext(), PlayActivity.class);
			acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E106.mp4");
			acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E106.mp4");
			startActivity(acti);
		});
		d.setNegativeButton("Mégsem", (_dialog, _which) -> {

		});
		d.create().show();
	}
	
	
	public void _go107() {
		if (rewardad != null) {
			           rewardad.show(Main5Activity.this, rewardItem -> {

							 d.setTitle("Dragon Ball Super 5.Évad 107.Rész");
		   d.setMessage("Meg akkarja tekinteni?");
		   d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
			   acti.setClass(getApplicationContext(), PlayActivity.class);
			   acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E107.mp4");
			   acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E107.mp4");
			   startActivity(acti);
		   });
		   d.setNegativeButton("Mégsem", (_dialog, _which) -> {

		   });
		   d.create().show();
						   });
			
			        }
	}
	
	
	public void _go108() {
		d.setTitle("Dragon Ball Super 5.Évad 108.Rész");
		d.setMessage("Meg akkarja tekinteni?");
		d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
			acti.setClass(getApplicationContext(), PlayActivity.class);
			acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E108.mp4");
			acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E108.mp4");
			startActivity(acti);
		});
		d.setNegativeButton("Mégsem", (_dialog, _which) -> {

		});
		d.create().show();
	}
	
	
	public void _go109() {
		if (rewardad != null) {
			           rewardad.show(Main5Activity.this, rewardItem -> {

							 d.setTitle("Dragon Ball Super 5.Évad 109-110.Rész");
		   d.setMessage("Meg akkarja tekinteni?");
		   d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
			   acti.setClass(getApplicationContext(), PlayActivity.class);
			   acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E109-110.mp4");
			   acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E109-110.mp4");
			   startActivity(acti);
		   });
		   d.setNegativeButton("Mégsem", (_dialog, _which) -> {

		   });
		   d.create().show();
						   });
			
			        }
	}
	
	
	public void _go110() {
		if (rewardad != null) {
			           rewardad.show(Main5Activity.this, rewardItem -> {

							 d.setTitle("Dragon Ball Super 5.Évad 111.Rész");
		   d.setMessage("Meg akkarja tekinteni?");
		   d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
			   acti.setClass(getApplicationContext(), PlayActivity.class);
			   acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E111.mp4");
			   acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E111.mp4");
			   startActivity(acti);
		   });
		   d.setNegativeButton("Mégsem", (_dialog, _which) -> {

		   });
		   d.create().show();
						   });
			
			        }
	}
	
	
	public void _go112() {
		d.setTitle("Dragon Ball Super 5.Évad 112.Rész");
		d.setMessage("Meg akkarja tekinteni?");
		d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
			acti.setClass(getApplicationContext(), PlayActivity.class);
			acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E112.mp4");
			acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E112.mp4");
			startActivity(acti);
		});
		d.setNegativeButton("Mégsem", (_dialog, _which) -> {

		});
		d.create().show();
	}
	
	
	public void _go113() {
		if (rewardad != null) {
			           rewardad.show(Main5Activity.this, rewardItem -> {

							 d.setTitle("Dragon Ball Super 5.Évad 113.Rész");
		   d.setMessage("Meg akkarja tekinteni?");
		   d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
			   acti.setClass(getApplicationContext(), PlayActivity.class);
			   acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E113.mp4");
			   acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E113.mp4");
			   startActivity(acti);
		   });
		   d.setNegativeButton("Mégsem", (_dialog, _which) -> {

		   });
		   d.create().show();
						   });
			
			        }
	}
	
	
	public void _vo114() {
		d.setTitle("Dragon Ball Super 5.Évad 114.Rész");
		d.setMessage("Meg akkarja tekinteni?");
		d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
			acti.setClass(getApplicationContext(), PlayActivity.class);
			acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E114.mp4");
			acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E114.mp4");
			startActivity(acti);
		});
		d.setNegativeButton("Mégsem", (_dialog, _which) -> {

		});
		d.create().show();
	}
	
	
	public void _go115() {
		if (rewardad != null) {
			           rewardad.show(Main5Activity.this, rewardItem -> {

							 d.setTitle("Dragon Ball Super 5.Évad 115.Rész");
		   d.setMessage("Meg akkarja tekinteni?");
		   d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
			   acti.setClass(getApplicationContext(), PlayActivity.class);
			   acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E115.mp4");
			   acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E115.mp4");
			   startActivity(acti);
		   });
		   d.setNegativeButton("Mégsem", (_dialog, _which) -> {

		   });
		   d.create().show();
						   });
			
			        }
	}
	
	
	public void _go116() {
		d.setTitle("Dragon Ball Super 5.Évad 116.Rész");
		d.setMessage("Meg akkarja tekinteni?");
		d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
			acti.setClass(getApplicationContext(), PlayActivity.class);
			acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E116.mp4");
			acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E116.mp4");
			startActivity(acti);
		});
		d.setNegativeButton("Mégsem", (_dialog, _which) -> {

		});
		d.create().show();
	}
	
	
	public void _go117() {
		if (rewardad != null) {
			           rewardad.show(Main5Activity.this, rewardItem -> {

							 d.setTitle("Dragon Ball Super 5.Évad 117.Rész");
		   d.setMessage("Meg akkarja tekinteni?");
		   d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
			   acti.setClass(getApplicationContext(), PlayActivity.class);
			   acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E117.mp4");
			   acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E117.mp4");
			   startActivity(acti);
		   });
		   d.setNegativeButton("Mégsem", (_dialog, _which) -> {

		   });
		   d.create().show();
						   });
			
			        }
	}
	
	
	public void _go118() {
		d.setTitle("Dragon Ball Super 5.Évad 118.Rész");
		d.setMessage("Meg akkarja tekinteni?");
		d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
			acti.setClass(getApplicationContext(), PlayActivity.class);
			acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E118.mp4");
			acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E118.mp4");
			startActivity(acti);
		});
		d.setNegativeButton("Mégsem", (_dialog, _which) -> {

		});
		d.create().show();
	}
	
	
	public void _go119() {
		if (rewardad != null) {
			           rewardad.show(Main5Activity.this, rewardItem -> {

							 d.setTitle("Dragon Ball Super 5.Évad 119.Rész");
		   d.setMessage("Meg akkarja tekinteni?");
		   d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
			   acti.setClass(getApplicationContext(), PlayActivity.class);
			   acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E119.mp4");
			   acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E119.mp4");
			   startActivity(acti);
		   });
		   d.setNegativeButton("Mégsem", (_dialog, _which) -> {

		   });
		   d.create().show();
						   });
			
			        }
	}
	
	
	public void _go120() {
		d.setTitle("Dragon Ball Super 5.Évad 120.Rész");
		d.setMessage("Meg akkarja tekinteni?");
		d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
			acti.setClass(getApplicationContext(), PlayActivity.class);
			acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E120.mp4");
			acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E120.mp4");
			startActivity(acti);
		});
		d.setNegativeButton("Mégsem", (_dialog, _which) -> {

		});
		d.create().show();
	}
	
	
	public void _go121() {
		if (rewardad != null) {
			           rewardad.show(Main5Activity.this, rewardItem -> {

							 d.setTitle("Dragon Ball Super 5.Évad 121.Rész");
		   d.setMessage("Meg akkarja tekinteni?");
		   d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
			   acti.setClass(getApplicationContext(), PlayActivity.class);
			   acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E121.mp4");
			   acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E121.mp4");
			   startActivity(acti);
		   });
		   d.setNegativeButton("Mégsem", (_dialog, _which) -> {

		   });
		   d.create().show();
						   });
			
			        }
	}
	
	
	public void _go122() {
		d.setTitle("Dragon Ball Super 5.Évad 122.Rész");
		d.setMessage("Meg akkarja tekinteni?");
		d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
			acti.setClass(getApplicationContext(), PlayActivity.class);
			acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E122.mp4");
			acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E122.mp4");
			startActivity(acti);
		});
		d.setNegativeButton("Mégsem", (_dialog, _which) -> {

		});
		d.create().show();
	}
	
	
	public void _go123() {
		if (rewardad != null) {
			           rewardad.show(Main5Activity.this, rewardItem -> {

							 d.setTitle("Dragon Ball Super 5.Évad 123.Rész");
		   d.setMessage("Meg akkarja tekinteni?");
		   d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
			   acti.setClass(getApplicationContext(), PlayActivity.class);
			   acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E123.mp4");
			   acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E123.mp4");
			   startActivity(acti);
		   });
		   d.setNegativeButton("Mégsem", (_dialog, _which) -> {

		   });
		   d.create().show();
						   });
			
			        }
	}
	
	
	public void _go124() {
		d.setTitle("Dragon Ball Super 5.Évad 124.Rész");
		d.setMessage("Meg akkarja tekinteni?");
		d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
			acti.setClass(getApplicationContext(), PlayActivity.class);
			acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E124.mp4");
			acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E124.mp4");
			startActivity(acti);
		});
		d.setNegativeButton("Mégsem", (_dialog, _which) -> {

		});
		d.create().show();
	}
	
	
	public void _go125() {
		if (rewardad != null) {
			           rewardad.show(Main5Activity.this, rewardItem -> {

							 d.setTitle("Dragon Ball Super 5.Évad 125.Rész");
		   d.setMessage("Meg akkarja tekinteni?");
		   d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
			   acti.setClass(getApplicationContext(), PlayActivity.class);
			   acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E125.mp4");
			   acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E125.mp4");
			   startActivity(acti);
		   });
		   d.setNegativeButton("Mégsem", (_dialog, _which) -> {

		   });
		   d.create().show();
						   });
			
			        }
	}
	
	
	public void _go126() {
		d.setTitle("Dragon Ball Super 5.Évad 126.Rész");
		d.setMessage("Meg akkarja tekinteni?");
		d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
			acti.setClass(getApplicationContext(), PlayActivity.class);
			acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E126.mp4");
			acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E126.mp4");
			startActivity(acti);
		});
		d.setNegativeButton("Mégsem", (_dialog, _which) -> {

		});
		d.create().show();
	}
	
	
	public void _go127() {
		if (rewardad != null) {
			           rewardad.show(Main5Activity.this, rewardItem -> {

							 d.setTitle("Dragon Ball Super 5.Évad 127.Rész");
		   d.setMessage("Meg akkarja tekinteni?");
		   d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
			   acti.setClass(getApplicationContext(), PlayActivity.class);
			   acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E127.mp4");
			   acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E127.mp4");
			   startActivity(acti);
		   });
		   d.setNegativeButton("Mégsem", (_dialog, _which) -> {

		   });
		   d.create().show();
						   });
			
			        }
	}
	
	
	public void _go128() {
		d.setTitle("Dragon Ball Super 5.Évad 128.Rész");
		d.setMessage("Meg akkarja tekinteni?");
		d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
			acti.setClass(getApplicationContext(), PlayActivity.class);
			acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E128.mp4");
			acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E128.mp4");
			startActivity(acti);
		});
		d.setNegativeButton("Mégsem", (_dialog, _which) -> {

		});
		d.create().show();
	}
	
	
	public void _go129() {
		if (rewardad != null) {
			           rewardad.show(Main5Activity.this, rewardItem -> {

							 d.setTitle("Dragon Ball Super 5.Évad 129.Rész");
		   d.setMessage("Meg akkarja tekinteni?");
		   d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
			   acti.setClass(getApplicationContext(), PlayActivity.class);
			   acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E129.mp4");
			   acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E129.mp4");
			   startActivity(acti);
		   });
		   d.setNegativeButton("Mégsem", (_dialog, _which) -> {

		   });
		   d.create().show();
						   });
			
			        }
	}
	
	
	public void _go130() {
		if (rewardad != null) {
			           rewardad.show(Main5Activity.this, rewardItem -> {

							 d.setTitle("Dragon Ball Super 5.Évad 130.Rész");
		   d.setMessage("Meg akkarja tekinteni?");
		   d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
			   acti.setClass(getApplicationContext(), PlayActivity.class);
			   acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E130.mp4");
			   acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E130.mp4");
			   startActivity(acti);
		   });
		   d.setNegativeButton("Mégsem", (_dialog, _which) -> {

		   });
		   d.create().show();
						   });
			
			        }
	}
	
	
	public void _go131() {
		if (rewardad != null) {
			           rewardad.show(Main5Activity.this, rewardItem -> {

							 d.setTitle("Dragon Ball Super 5.Évad 131.Rész");
		   d.setMessage("Meg akkarja tekinteni?");
		   d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
			   acti.setClass(getApplicationContext(), PlayActivity.class);
			   acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E131.mp4");
			   acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E131.mp4");
			   startActivity(acti);
		   });
		   d.setNegativeButton("Mégsem", (_dialog, _which) -> {

		   });
		   d.create().show();
						   });
			
			        }
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
		
		@SuppressLint({"InflateParams", "SetTextI18n"})
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
			
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("103")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Super 103 Rész");
				db19.setText("Megnézem");
				db19.setOnClickListener(_view1 -> _go1());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("104")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Super 104 Rész");
				db19.setText("Megnézem");
				db19.setOnClickListener(_view12 -> _go104());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("105")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Super 105 Rész");
				db19.setText("Megnézem");
				db19.setOnClickListener(_view13 -> _go105());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("106")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Super 106 Rész");
				db19.setText("Megnézem");
				db19.setOnClickListener(_view14 -> _go106());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("107")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Super 107 Rész");
				db19.setText("Megnézem");
				db19.setOnClickListener(_view15 -> _go107());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("108")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Super 108 Rész");
				db19.setText("Megnézem");
				db19.setOnClickListener(_view16 -> _go108());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("109")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Super 109-110 Rész");
				db19.setText("Megnézem");
				db19.setOnClickListener(_view17 -> _go109());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("111")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Super 111 Rész");
				db19.setText("Megnézem");
				db19.setOnClickListener(_view18 -> _go110());
				Banner.setVisibility(View.GONE);
				AdView adView1 = new AdView(Main5Activity.this);
				adView1.setAdSize(AdSize.MEDIUM_RECTANGLE);
				adView1.setAdUnitId("ca-app-pub-9399905616386219/3692748408");
				AdRequest adRequest = new AdRequest.Builder().build();
				adView1.loadAd(adRequest);
				LinearLayout.LayoutParams layoutparams = new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
				Banner2.addView(adView1,layoutparams);
				Banner2.setVisibility(View.VISIBLE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("112")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Super 112 Rész");
				db19.setText("Megnézem");
				db19.setOnClickListener(_view19 -> _go112());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("113")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Super 113 Rész");
				db19.setText("Megnézem");
				db19.setOnClickListener(_view110 -> _go113());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("114")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Super 104 Rész");
				db19.setText("Megnézem");
				db19.setOnClickListener(_view111 -> _vo114());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("115")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Super 115 Rész");
				db19.setText("Megnézem");
				db19.setOnClickListener(_view112 -> _go115());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("116")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Super 116 Rész");
				db19.setText("Megnézem");
				db19.setOnClickListener(_view113 -> _go116());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("117")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Super 117 Rész");
				db19.setText("Megnézem");
				db19.setOnClickListener(_view114 -> _go117());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("118")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Super 118 Rész");
				db19.setText("Megnézem");
				db19.setOnClickListener(_view115 -> _go118());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("119")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Super 119 Rész");
				db19.setText("Megnézem");
				db19.setOnClickListener(_view116 -> _go119());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("120")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Super 120 Rész");
				db19.setText("Megnézem");
				db19.setOnClickListener(_view117 -> _go120());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("121")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Super 121 Rész");
				db19.setText("Megnézem");
				db19.setOnClickListener(_view118 -> _go121());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("122")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Super 122 Rész");
				db19.setText("Megnézem");
				db19.setOnClickListener(_view119 -> _go122());
				Banner.setVisibility(View.VISIBLE);
				AdView adView1 = new AdView(Main5Activity.this);
				adView1.setAdSize(AdSize.BANNER);
				adView1.setAdUnitId("ca-app-pub-9399905616386219/3692748408");
				AdRequest adRequest = new AdRequest.Builder().build();
				adView1.loadAd(adRequest);
				LinearLayout.LayoutParams layoutparams = new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
				Banner.addView(adView1,layoutparams);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("123")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Super 123 Rész");
				db19.setText("Megnézem");
				db19.setOnClickListener(_view120 -> _go123());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("124")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Super 124 Rész");
				db19.setText("Megnézem");
				db19.setOnClickListener(_view121 -> _go124());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.VISIBLE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("125")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Super 125 Rész");
				db19.setText("Megnézem");
				db19.setOnClickListener(_view122 -> _go125());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("126")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Super 126 Rész");
				db19.setText("Megnézem");
				db19.setOnClickListener(_view123 -> _go126());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("127")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Super 127 Rész");
				db19.setText("Megnézem");
				db19.setOnClickListener(_view124 -> _go127());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("128")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Super 128 Rész");
				db19.setText("Megnézem");
				db19.setOnClickListener(_view125 -> _go128());
				Banner.setVisibility(View.GONE);
				AdView adView1 = new AdView(Main5Activity.this);
				adView1.setAdSize(AdSize.MEDIUM_RECTANGLE);
				adView1.setAdUnitId("ca-app-pub-9399905616386219/3692748408");
				AdRequest adRequest = new AdRequest.Builder().build();
				adView1.loadAd(adRequest);
				LinearLayout.LayoutParams layoutparams = new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
				Banner2.addView(adView1,layoutparams);
				Banner2.setVisibility(View.VISIBLE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("129")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Super 129 Rész");
				db19.setText("Megnézem");
				db19.setOnClickListener(_view126 -> _go129());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("130")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Super 130 Rész");
				db19.setText("Megnézem");
				db19.setOnClickListener(_view127 -> _go130());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("131")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Super 131 Rész");
				db19.setText("Megnézem");
				db19.setOnClickListener(_view128 -> _go131());
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