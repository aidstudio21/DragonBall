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


public class Main4Activity extends Activity {

	RewardedAd rewardad;

	private final ArrayList<HashMap<String, Object>> map = new ArrayList<>();

	private LinearLayout banner;
	private ListView listview1;

	private final Intent acti = new Intent();
	private AlertDialog.Builder d;


	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main4);
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
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "77");
			map.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "78");
			map.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "79");
			map.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "80");
			map.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "81");
			map.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "82");
			map.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "83");
			map.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "84");
			map.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "85");
			map.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "86");
			map.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "87");
			map.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "88");
			map.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "89");
			map.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "90");
			map.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "91");
			map.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "92");
			map.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "93");
			map.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "94");
			map.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "95");
			map.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "96");
			map.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "97");
			map.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "98");
			map.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "99");
			map.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "100");
			map.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "101");
			map.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "102");
			map.add(_item);
		}
		
		listview1.setAdapter(new Listview1Adapter(map));
		((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
		
		
		        AdRequest rewardad_request = new AdRequest.Builder().build();
		
		        RewardedAd.load(Main4Activity.this, "ca-app-pub-9399905616386219/1829002391",
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
		    
		AdView adView1 = new AdView(Main4Activity.this);
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
		
		        RewardedAd.load(Main4Activity.this, "ca-app-pub-9399905616386219/1829002391",
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
			           rewardad.show(Main4Activity.this, rewardItem -> {

							 d.setTitle("Dragon Ball Super 5.??vad 77.R??sz");
		   d.setMessage("Meg akkarja tekinteni?");
		   d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
			   acti.setClass(getApplicationContext(), PlayActivity.class);
			   acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E077.mp4");
			   acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E077.mp4");
			   startActivity(acti);
		   });
		   d.setNegativeButton("M??gsem", (_dialog, _which) -> {

		   });
		   d.create().show();
						   });
			
			        }
	}
	
	
	public void _go2() {
		d.setTitle("Dragon Ball Super 5.??vad 78.R??sz");
		d.setMessage("Meg akkarja tekinteni?");
		d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
			acti.setClass(getApplicationContext(), PlayActivity.class);
			acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E078.mp4");
			acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E078.mp4");
			startActivity(acti);
		});
		d.setNegativeButton("M??gsem", (_dialog, _which) -> {

		});
		d.create().show();
	}
	
	
	public void _go79() {
		if (rewardad != null) {
			           rewardad.show(Main4Activity.this, rewardItem -> {

							 d.setTitle("Dragon Ball Super 5.??vad 79.R??sz");
		   d.setMessage("Meg akkarja tekinteni?");
		   d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
			   acti.setClass(getApplicationContext(), PlayActivity.class);
			   acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E079.mp4");
			   acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E079.mp4");
			   startActivity(acti);
		   });
		   d.setNegativeButton("M??gsem", (_dialog, _which) -> {

		   });
		   d.create().show();
						   });
			
			        }
	}
	
	
	public void _db80() {
		d.setTitle("Dragon Ball Super 5.??vad 80.R??sz");
		d.setMessage("Meg akkarja tekinteni?");
		d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
			acti.setClass(getApplicationContext(), PlayActivity.class);
			acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E080.mp4");
			acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E080.mp4");
			startActivity(acti);
		});
		d.setNegativeButton("M??gsem", (_dialog, _which) -> {

		});
		d.create().show();
	}
	
	
	public void _go81() {
		if (rewardad != null) {
			           rewardad.show(Main4Activity.this, rewardItem -> {

							 d.setTitle("Dragon Ball Super 5.??vad 81.R??sz");
		   d.setMessage("Meg akkarja tekinteni?");
		   d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
			   acti.setClass(getApplicationContext(), PlayActivity.class);
			   acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E081.mp4");
			   acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E081.mp4");
			   startActivity(acti);
		   });
		   d.setNegativeButton("M??gsem", (_dialog, _which) -> {

		   });
		   d.create().show();
						   });
			
			        }
	}
	
	
	public void _go82() {
		d.setTitle("Dragon Ball Super 5.??vad 82.R??sz");
		d.setMessage("Meg akkarja tekinteni?");
		d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
			acti.setClass(getApplicationContext(), PlayActivity.class);
			acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E082.mp4");
			acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E082.mp4");
			startActivity(acti);
		});
		d.setNegativeButton("M??gsem", (_dialog, _which) -> {

		});
		d.create().show();
	}
	
	
	public void _go83() {
		if (rewardad != null) {
			           rewardad.show(Main4Activity.this, rewardItem -> {

							 d.setTitle("Dragon Ball Super 5.??vad 83.R??sz");
		   d.setMessage("Meg akkarja tekinteni?");
		   d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
			   acti.setClass(getApplicationContext(), PlayActivity.class);
			   acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E083.mp4");
			   acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E083.mp4");
			   startActivity(acti);
		   });
		   d.setNegativeButton("M??gsem", (_dialog, _which) -> {

		   });
		   d.create().show();
						   });
			
			        }
	}
	
	
	public void _go84() {
		d.setTitle("Dragon Ball Super 5.??vad 84.R??sz");
		d.setMessage("Meg akkarja tekinteni?");
		d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
			acti.setClass(getApplicationContext(), PlayActivity.class);
			acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E084.mp4");
			acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E084.mp4");
			startActivity(acti);
		});
		d.setNegativeButton("M??gsem", (_dialog, _which) -> {

		});
		d.create().show();
	}
	
	
	public void _go85() {
		if (rewardad != null) {
			           rewardad.show(Main4Activity.this, rewardItem -> {

							 d.setTitle("Dragon Ball Super 5.??vad 85.R??sz");
		   d.setMessage("Meg akkarja tekinteni?");
		   d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
			   acti.setClass(getApplicationContext(), PlayActivity.class);
			   acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E085.mp4");
			   acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E085.mp4");
			   startActivity(acti);
		   });
		   d.setNegativeButton("M??gsem", (_dialog, _which) -> {

		   });
		   d.create().show();
						   });
			
			        }
	}
	
	
	public void _go86() {
		d.setTitle("Dragon Ball Super 5.??vad 86.R??sz");
		d.setMessage("Meg akkarja tekinteni?");
		d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
			acti.setClass(getApplicationContext(), PlayActivity.class);
			acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E086.mp4");
			acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E086.mp4");
			startActivity(acti);
		});
		d.setNegativeButton("M??gsem", (_dialog, _which) -> {

		});
		d.create().show();
	}
	
	
	public void _go87() {
		if (rewardad != null) {
			           rewardad.show(Main4Activity.this, rewardItem -> {

							 d.setTitle("Dragon Ball Super 5.??vad 87.R??sz");
		   d.setMessage("Meg akkarja tekinteni?");
		   d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
			   acti.setClass(getApplicationContext(), PlayActivity.class);
			   acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E087.mp4");
			   acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E087.mp4");
			   startActivity(acti);
		   });
		   d.setNegativeButton("M??gsem", (_dialog, _which) -> {

		   });
		   d.create().show();
						   });
			
			        }
	}
	
	
	public void _go88() {
		d.setTitle("Dragon Ball Super 5.??vad 88.R??sz");
		d.setMessage("Meg akkarja tekinteni?");
		d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
			acti.setClass(getApplicationContext(), PlayActivity.class);
			acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E088.mp4");
			acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E088.mp4");
			startActivity(acti);
		});
		d.setNegativeButton("M??gsem", (_dialog, _which) -> {

		});
		d.create().show();
	}
	
	
	public void _go89() {
		if (rewardad != null) {
			           rewardad.show(Main4Activity.this, rewardItem -> {

							 d.setTitle("Dragon Ball Super 5.??vad 89.R??sz");
		   d.setMessage("Meg akkarja tekinteni?");
		   d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
			   acti.setClass(getApplicationContext(), PlayActivity.class);
			   acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E089.mp4");
			   acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E089.mp4");
			   startActivity(acti);
		   });
		   d.setNegativeButton("M??gsem", (_dialog, _which) -> {

		   });
		   d.create().show();
						   });
			
			        }
	}
	
	
	public void _go90() {
		d.setTitle("Dragon Ball Super 5.??vad 90.R??sz");
		d.setMessage("Meg akkarja tekinteni?");
		d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
			acti.setClass(getApplicationContext(), PlayActivity.class);
			acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E090.mp4");
			acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E090.mp4");
			startActivity(acti);
		});
		d.setNegativeButton("M??gsem", (_dialog, _which) -> {

		});
		d.create().show();
	}
	
	
	public void _go91() {
		if (rewardad != null) {
			           rewardad.show(Main4Activity.this, rewardItem -> {

							 d.setTitle("Dragon Ball Super 5.??vad 91.R??sz");
		   d.setMessage("Meg akkarja tekinteni?");
		   d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
			   acti.setClass(getApplicationContext(), PlayActivity.class);
			   acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E091.mp4");
			   acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E091.mp4");
			   startActivity(acti);
		   });
		   d.setNegativeButton("M??gsem", (_dialog, _which) -> {

		   });
		   d.create().show();
						   });
			
			        }
	}
	
	
	public void _go92() {
		d.setTitle("Dragon Ball Super 5.??vad 92.R??sz");
		d.setMessage("Meg akkarja tekinteni?");
		d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
			acti.setClass(getApplicationContext(), PlayActivity.class);
			acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E092.mp4");
			acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E092.mp4");
			startActivity(acti);
		});
		d.setNegativeButton("M??gsem", (_dialog, _which) -> {

		});
		d.create().show();
	}
	
	
	public void _go93() {
		if (rewardad != null) {
			           rewardad.show(Main4Activity.this, rewardItem -> {

							 d.setTitle("Dragon Ball Super 5.??vad 93.R??sz");
		   d.setMessage("Meg akkarja tekinteni?");
		   d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
			   acti.setClass(getApplicationContext(), PlayActivity.class);
			   acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E093.mp4");
			   acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E093.mp4");
			   startActivity(acti);
		   });
		   d.setNegativeButton("M??gsem", (_dialog, _which) -> {

		   });
		   d.create().show();
						   });
			
			        }
	}
	
	
	public void _go94() {
		d.setTitle("Dragon Ball Super 5.??vad 94.R??sz");
		d.setMessage("Meg akkarja tekinteni?");
		d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
			acti.setClass(getApplicationContext(), PlayActivity.class);
			acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E094.mp4");
			acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E094.mp4");
			startActivity(acti);
		});
		d.setNegativeButton("M??gsem", (_dialog, _which) -> {

		});
		d.create().show();
	}
	
	
	public void _go95() {
		if (rewardad != null) {
			           rewardad.show(Main4Activity.this, rewardItem -> {

							 d.setTitle("Dragon Ball Super 5.??vad 95.R??sz");
		   d.setMessage("Meg akkarja tekinteni?");
		   d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
			   acti.setClass(getApplicationContext(), PlayActivity.class);
			   acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E095.mp4");
			   acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E095.mp4");
			   startActivity(acti);
		   });
		   d.setNegativeButton("M??gsem", (_dialog, _which) -> {

		   });
		   d.create().show();
						   });
			
			        }
	}
	
	
	public void _go96() {
		d.setTitle("Dragon Ball Super 5.??vad 96.R??sz");
		d.setMessage("Meg akkarja tekinteni?");
		d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
			acti.setClass(getApplicationContext(), PlayActivity.class);
			acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E096.mp4");
			acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E096.mp4");
			startActivity(acti);
		});
		d.setNegativeButton("M??gsem", (_dialog, _which) -> {

		});
		d.create().show();
	}
	
	
	public void _go97() {
		if (rewardad != null) {
			           rewardad.show(Main4Activity.this, rewardItem -> {

							 d.setTitle("Dragon Ball Super 5.??vad 97.R??sz");
		   d.setMessage("Meg akkarja tekinteni?");
		   d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
			   acti.setClass(getApplicationContext(), PlayActivity.class);
			   acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E097.mp4");
			   acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E097.mp4");
			   startActivity(acti);
		   });
		   d.setNegativeButton("M??gsem", (_dialog, _which) -> {

		   });
		   d.create().show();
						   });
			
			        }
	}
	
	
	public void _go98() {
		d.setTitle("Dragon Ball Super 5.??vad 98.R??sz");
		d.setMessage("Meg akkarja tekinteni?");
		d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
			acti.setClass(getApplicationContext(), PlayActivity.class);
			acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E098.mp4");
			acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E098.mp4");
			startActivity(acti);
		});
		d.setNegativeButton("M??gsem", (_dialog, _which) -> {

		});
		d.create().show();
	}
	
	
	public void _go99() {
		if (rewardad != null) {
			           rewardad.show(Main4Activity.this, rewardItem -> {

							 d.setTitle("Dragon Ball Super 5.??vad 99.R??sz");
		   d.setMessage("Meg akkarja tekinteni?");
		   d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
			   acti.setClass(getApplicationContext(), PlayActivity.class);
			   acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E099.mp4");
			   acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E099.mp4");
			   startActivity(acti);
		   });
		   d.setNegativeButton("M??gsem", (_dialog, _which) -> {

		   });
		   d.create().show();
						   });
			
			        }
	}
	
	
	public void _go100() {
		d.setTitle("Dragon Ball Super 5.??vad 100.R??sz");
		d.setMessage("Meg akkarja tekinteni?");
		d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
			acti.setClass(getApplicationContext(), PlayActivity.class);
			acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E100.mp4");
			acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E100.mp4");
			startActivity(acti);
		});
		d.setNegativeButton("M??gsem", (_dialog, _which) -> {

		});
		d.create().show();
	}
	
	
	public void _go101() {
		if (rewardad != null) {
			           rewardad.show(Main4Activity.this, rewardItem -> {

							 d.setTitle("Dragon Ball Super 5.??vad 101.R??sz");
		   d.setMessage("Meg akkarja tekinteni?");
		   d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
			   acti.setClass(getApplicationContext(), PlayActivity.class);
			   acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E101.mp4");
			   acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E101.mp4");
			   startActivity(acti);
		   });
		   d.setNegativeButton("M??gsem", (_dialog, _which) -> {

		   });
		   d.create().show();
						   });
			
			        }
	}
	
	
	public void _go102() {
		d.setTitle("Dragon Ball Super 5.??vad 102.R??sz");
		d.setMessage("Meg akkarja tekinteni?");
		d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
			acti.setClass(getApplicationContext(), PlayActivity.class);
			acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E102.mp4");
			acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E102.mp4");
			startActivity(acti);
		});
		d.setNegativeButton("M??gsem", (_dialog, _which) -> {

		});
		d.create().show();
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
			
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("77")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Super 77 R??sz");
				db19.setText("Megn??zem");
				db19.setOnClickListener(_view1 -> _go1());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("78")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Super 78 R??sz");
				db19.setText("Megn??zem");
				db19.setOnClickListener(_view12 -> _go2());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("79")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Super 79 R??sz");
				db19.setText("Megn??zem");
				db19.setOnClickListener(_view13 -> _go79());
				Banner.setVisibility(View.VISIBLE);
				AdView adView1 = new AdView(Main4Activity.this);
				adView1.setAdSize(AdSize.BANNER);
				adView1.setAdUnitId("ca-app-pub-9399905616386219/3692748408");
				AdRequest adRequest = new AdRequest.Builder().build();
				adView1.loadAd(adRequest);
				LinearLayout.LayoutParams layoutparams = new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
				Banner.addView(adView1,layoutparams);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("80")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Super 80 R??sz");
				db19.setText("Megn??zem");
				db19.setOnClickListener(_view14 -> _db80());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("81")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Super 81 R??sz");
				db19.setText("Megn??zem");
				db19.setOnClickListener(_view15 -> _go81());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("82")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Super 82 R??sz");
				db19.setText("Megn??zem");
				db19.setOnClickListener(_view16 -> _go82());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("83")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Super 83 R??sz");
				db19.setText("Megn??zem");
				db19.setOnClickListener(_view17 -> _go83());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("84")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Super 84 R??sz");
				db19.setText("Megn??zem");
				db19.setOnClickListener(_view18 -> _go84());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("85")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Super 85 R??sz");
				db19.setText("Megn??zem");
				db19.setOnClickListener(_view19 -> _go85());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("86")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Super 86 R??sz");
				db19.setText("Megn??zem");
				db19.setOnClickListener(_view110 -> _go86());
				Banner.setVisibility(View.VISIBLE);
				AdView adView1 = new AdView(Main4Activity.this);
				adView1.setAdSize(AdSize.MEDIUM_RECTANGLE);
				adView1.setAdUnitId("ca-app-pub-9399905616386219/3692748408");
				AdRequest adRequest = new AdRequest.Builder().build();
				adView1.loadAd(adRequest);
				LinearLayout.LayoutParams layoutparams = new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
				Banner.addView(adView1,layoutparams);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("87")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Super 87 R??sz");
				db19.setText("Megn??zem");
				db19.setOnClickListener(_view111 -> _go87());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("88")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Super 88 R??sz");
				db19.setText("Megn??zem");
				db19.setOnClickListener(_view112 -> _go88());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("89")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Super 89 R??sz");
				db19.setText("Megn??zem");
				db19.setOnClickListener(_view113 -> _go89());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("90")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Super 90 R??sz");
				db19.setText("Megn??zem");
				db19.setOnClickListener(_view114 -> _go90());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("91")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Super 91 R??sz");
				db19.setText("Megn??zem");
				db19.setOnClickListener(_view115 -> _go91());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("92")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Super 92 R??sz");
				db19.setText("Megn??zem");
				db19.setOnClickListener(_view116 -> _go92());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("93")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Super 93 R??sz");
				db19.setText("Megn??zem");
				db19.setOnClickListener(_view117 -> _go93());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("94")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Super 94 R??sz");
				db19.setText("Megn??zem");
				db19.setOnClickListener(_view118 -> _go94());
				Banner.setVisibility(View.VISIBLE);
				AdView adView1 = new AdView(Main4Activity.this);
				adView1.setAdSize(AdSize.BANNER);
				adView1.setAdUnitId("ca-app-pub-9399905616386219/3692748408");
				AdRequest adRequest = new AdRequest.Builder().build();
				adView1.loadAd(adRequest);
				LinearLayout.LayoutParams layoutparams = new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
				Banner.addView(adView1,layoutparams);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("95")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Super 95 R??sz");
				db19.setText("Megn??zem");
				db19.setOnClickListener(_view119 -> _go95());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("96")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Super 96 R??sz");
				db19.setText("Megn??zem");
				db19.setOnClickListener(_view120 -> _go96());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("97")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Super 97 R??sz");
				db19.setText("Megn??zem");
				db19.setOnClickListener(_view121 -> _go97());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("98")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Super 98 R??sz");
				db19.setText("Megn??zem");
				db19.setOnClickListener(_view122 -> _go98());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("99")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Super 99 R??sz");
				db19.setText("Megn??zem");
				db19.setOnClickListener(_view123 -> _go99());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("100")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Super 100 R??sz");
				db19.setText("Megn??zem");
				db19.setOnClickListener(_view124 -> _go100());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("101")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Super 101 R??sz");
				db19.setText("Megn??zem");
				db19.setOnClickListener(_view125 -> _go101());
				Banner.setVisibility(View.GONE);
				Banner2.setVisibility(View.GONE);
			}
			if (Objects.requireNonNull(map.get(_position).get("key")).toString().equals("102")) {
				imageview2.setImageResource(R.drawable.logo);
				textview1.setText("Dragon Ball Super 102 R??sz");
				db19.setText("Megn??zem");
				db19.setOnClickListener(_view126 -> _go102());
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
