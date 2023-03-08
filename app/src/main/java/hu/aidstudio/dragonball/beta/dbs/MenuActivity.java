package hu.aidstudio.dragonball.beta.dbs;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.firebase.FirebaseApp;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;

import hu.aidstudio.dragonball.beta.R;


public class MenuActivity extends Activity {
	
	private String language = "";
	
	private LinearLayout linear3;
	private LinearLayout linear4;
	private ScrollView vscroll1;
	private ImageView imageview1;
	private LinearLayout linear5;
	private LinearLayout linear1;
	private LinearLayout banner;
	private LinearLayout linear14;
	private LinearLayout linear19;
	private LinearLayout linear24;
	private LinearLayout linear9;
	private FrameLayout native_ads;
	private LinearLayout linear29;
	private LinearLayout linear2;
	private LinearLayout linear6;
	private ImageView imageview2;
	private LinearLayout linear7;
	private LinearLayout linear8;
	private TextView eved1;
	private TextView evad1_alcim;
	private Button db1;
	private LinearLayout linear15;
	private LinearLayout linear16;
	private ImageView imageview4;
	private LinearLayout linear17;
	private LinearLayout linear18;
	private TextView evad2;
	private TextView evad2_alcim;
	private Button db2;
	private LinearLayout linear20;
	private LinearLayout linear21;
	private ImageView imageview5;
	private LinearLayout linear22;
	private LinearLayout linear23;
	private TextView evad3;
	private TextView evad3_alcim;
	private Button db3;
	private LinearLayout linear25;
	private LinearLayout linear26;
	private ImageView imageview6;
	private LinearLayout linear27;
	private LinearLayout linear28;
	private TextView evad4;
	private TextView evad4_alcim;
	private Button db4;
	private LinearLayout linear10;
	private LinearLayout linear11;
	private ImageView imageview3;
	private LinearLayout linear12;
	private LinearLayout linear13;
	private TextView evad5;
	private TextView evad5_alcim;
	private Button db5;
	private LinearLayout linear30;
	private LinearLayout linear31;
	private ImageView imageview7;
	private LinearLayout linear32;
	private LinearLayout linear33;
	private TextView evad5_2;
	private TextView evad5_2_alcim;
	private Button db6;
	
	private Intent i = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.menu);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		MobileAds.initialize(this);
		
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear3 = findViewById(R.id.linear3);
		linear4 = findViewById(R.id.linear4);
		vscroll1 = findViewById(R.id.vscroll1);
		imageview1 = findViewById(R.id.imageview1);
		linear5 = findViewById(R.id.linear5);
		linear1 = findViewById(R.id.linear1);
		banner = findViewById(R.id.banner);
		linear14 = findViewById(R.id.linear14);
		linear19 = findViewById(R.id.linear19);
		linear24 = findViewById(R.id.linear24);
		linear9 = findViewById(R.id.linear9);
		native_ads = findViewById(R.id.native_ads);
		linear29 = findViewById(R.id.linear29);
		linear2 = findViewById(R.id.linear2);
		linear6 = findViewById(R.id.linear6);
		imageview2 = findViewById(R.id.imageview2);
		linear7 = findViewById(R.id.linear7);
		linear8 = findViewById(R.id.linear8);
		eved1 = findViewById(R.id.eved1);
		evad1_alcim = findViewById(R.id.evad1_alcim);
		db1 = findViewById(R.id.db1);
		linear15 = findViewById(R.id.linear15);
		linear16 = findViewById(R.id.linear16);
		imageview4 = findViewById(R.id.imageview4);
		linear17 = findViewById(R.id.linear17);
		linear18 = findViewById(R.id.linear18);
		evad2 = findViewById(R.id.evad2);
		evad2_alcim = findViewById(R.id.evad2_alcim);
		db2 = findViewById(R.id.db2);
		linear20 = findViewById(R.id.linear20);
		linear21 = findViewById(R.id.linear21);
		imageview5 = findViewById(R.id.imageview5);
		linear22 = findViewById(R.id.linear22);
		linear23 = findViewById(R.id.linear23);
		evad3 = findViewById(R.id.evad3);
		evad3_alcim = findViewById(R.id.evad3_alcim);
		db3 = findViewById(R.id.db3);
		linear25 = findViewById(R.id.linear25);
		linear26 = findViewById(R.id.linear26);
		imageview6 = findViewById(R.id.imageview6);
		linear27 = findViewById(R.id.linear27);
		linear28 = findViewById(R.id.linear28);
		evad4 = findViewById(R.id.evad4);
		evad4_alcim = findViewById(R.id.evad4_alcim);
		db4 = findViewById(R.id.db4);
		linear10 = findViewById(R.id.linear10);
		linear11 = findViewById(R.id.linear11);
		imageview3 = findViewById(R.id.imageview3);
		linear12 = findViewById(R.id.linear12);
		linear13 = findViewById(R.id.linear13);
		evad5 = findViewById(R.id.evad5);
		evad5_alcim = findViewById(R.id.evad5_alcim);
		db5 = findViewById(R.id.db5);
		linear30 = findViewById(R.id.linear30);
		linear31 = findViewById(R.id.linear31);
		imageview7 = findViewById(R.id.imageview7);
		linear32 = findViewById(R.id.linear32);
		linear33 = findViewById(R.id.linear33);
		evad5_2 = findViewById(R.id.evad5_2);
		evad5_2_alcim = findViewById(R.id.evad5_2_alcim);
		db6 = findViewById(R.id.db6);
		
		db1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setClass(getApplicationContext(), MainActivity.class);
				startActivity(i);
			}
		});
		
		db2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setClass(getApplicationContext(), Main1Activity.class);
				startActivity(i);
			}
		});
		
		db3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setClass(getApplicationContext(), Main2Activity.class);
				startActivity(i);
			}
		});
		
		db4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setClass(getApplicationContext(), Main3Activity.class);
				startActivity(i);
			}
		});
		
		db5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setClass(getApplicationContext(), Main4Activity.class);
				startActivity(i);
			}
		});
		
		db6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setClass(getApplicationContext(), Main5Activity.class);
				startActivity(i);
			}
		});
	}
	
	private void initializeLogic() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) { Window w = getWindow();  w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS); };
		
		AdView adView1 = new AdView(MenuActivity.this);
		adView1.setAdSize(AdSize.BANNER);
		adView1.setAdUnitId("ca-app-pub-9399905616386219/3692748408");
		AdRequest adRequest = new AdRequest.Builder().build();
		adView1.loadAd(adRequest);
		LinearLayout.LayoutParams layoutparams = new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
		banner.addView(adView1,layoutparams);
		AdLoader.Builder builder = new AdLoader.Builder(MenuActivity.this, "ca-app-pub-9399905616386219/6457716380");
		
		        builder.withAdListener(new AdListener() {
			            @Override
			            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
				                super.onAdFailedToLoad(loadAdError);
				
				            }
			
			        });
		
		        builder.forNativeAd(new NativeAd.OnNativeAdLoadedListener() {
			
			            @Override
			            public void onNativeAdLoaded(@NonNull NativeAd nativeAd) {
				
				            
				
				                NativeAdView adView = (NativeAdView) getLayoutInflater().inflate(R.layout.admob_native_layout, null);
				
				                adView.setMediaView((MediaView) adView.findViewById(R.id.ad_media));
				                adView.setHeadlineView(adView.findViewById(R.id.ad_headline));
				                adView.setBodyView(adView.findViewById(R.id.ad_body));
				                adView.setCallToActionView(adView.findViewById(R.id.ad_call_to_action));
				                adView.setIconView(adView.findViewById(R.id.ad_app_icon));
				                adView.setPriceView(adView.findViewById(R.id.ad_price));
				                adView.setStarRatingView(adView.findViewById(R.id.ad_stars));
				                adView.setStoreView(adView.findViewById(R.id.ad_store));
				                adView.setAdvertiserView(adView.findViewById(R.id.ad_advertiser));
				
				
				                ((TextView) Objects.requireNonNull(adView.getHeadlineView())).setText(nativeAd.getHeadline());
				                Objects.requireNonNull(adView.getMediaView()).setMediaContent(Objects.requireNonNull(nativeAd.getMediaContent()));
				
				
				                if (nativeAd.getBody() == null) {
					                    Objects.requireNonNull(adView.getBodyView()).setVisibility(View.INVISIBLE);
					
					                } else {
					                    adView.getBodyView().setVisibility(View.VISIBLE);
					                    ((TextView) adView.getBodyView()).setText(nativeAd.getBody());
					                }
				                if (nativeAd.getCallToAction() == null) {
					                    Objects.requireNonNull(adView.getCallToActionView()).setVisibility(View.INVISIBLE);
					                } else {
					                    Objects.requireNonNull(adView.getCallToActionView()).setVisibility(View.VISIBLE);
					                    ((Button) adView.getCallToActionView()).setText(nativeAd.getCallToAction());
					                }
				                if (nativeAd.getIcon() == null) {
					                    Objects.requireNonNull(adView.getIconView()).setVisibility(View.GONE);
					                } else {
					                    ((ImageView) Objects.requireNonNull(adView.getIconView())).setImageDrawable(nativeAd.getIcon().getDrawable());
					                    adView.getIconView().setVisibility(View.VISIBLE);
					                }
				
				                if (nativeAd.getPrice() == null) {
					                    Objects.requireNonNull(adView.getPriceView()).setVisibility(View.INVISIBLE);
					
					                } else {
					                    Objects.requireNonNull(adView.getPriceView()).setVisibility(View.VISIBLE);
					                    ((TextView) adView.getPriceView()).setText(nativeAd.getPrice());
					                }
				                if (nativeAd.getStore() == null) {
					                    Objects.requireNonNull(adView.getStoreView()).setVisibility(View.INVISIBLE);
					                } else {
					                    Objects.requireNonNull(adView.getStoreView()).setVisibility(View.VISIBLE);
					                    ((TextView) adView.getStoreView()).setText(nativeAd.getStore());
					                }
				                if (nativeAd.getStarRating() == null) {
					                    Objects.requireNonNull(adView.getStarRatingView()).setVisibility(View.INVISIBLE);
					                } else {
					                    ((RatingBar) Objects.requireNonNull(adView.getStarRatingView())).setRating(nativeAd.getStarRating().floatValue());
					                    adView.getStarRatingView().setVisibility(View.VISIBLE);
					                }
				
				                if (nativeAd.getAdvertiser() == null) {
					                    Objects.requireNonNull(adView.getAdvertiserView()).setVisibility(View.INVISIBLE);
					                } else
				                    ((TextView) Objects.requireNonNull(adView.getAdvertiserView())).setText(nativeAd.getAdvertiser());
				                adView.getAdvertiserView().setVisibility(View.VISIBLE);
				
				
				                adView.setNativeAd(nativeAd);
				
				
				               native_ads.removeAllViews();
				                native_ads.addView(adView);
				            }
			        }).build();
		        NativeAdOptions adOptions = new NativeAdOptions.Builder().build();
		        builder.withNativeAdOptions(adOptions);
		        AdLoader adLoader = builder.withAdListener(new AdListener() {
			            public void onAdFailedToLoad(int i) {
				
				
				            }
			        }).build();
		
		        adLoader.loadAd(new AdRequest.Builder().build());
	}
	
	
	@Override
	public void onBackPressed() {
		finish();
	}
	public void _Lang_Magyar() {
		eved1.setText("Dragon Ball Super 1.Évad");
		evad1_alcim.setText("Pusztítás Isten Saga");
		db1.setText("Tovább");
		db1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setClass(getApplicationContext(), MainActivity.class);
				startActivity(i);
			}
		});
		evad2.setText("Dragon Ball Super 2.Évad");
		evad2_alcim.setText("Pusztítás Isten Saga");
		db2.setText("Tovább");
		db2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setClass(getApplicationContext(), MainActivity.class);
				startActivity(i);
			}
		});
	}
	
	
	public void _Language() {
		language = Locale.getDefault().getDisplayLanguage();
		if (language.equals("magyar")) {
			_Lang_Magyar();
		}
		else {
			if (language.equals("English")) {
				
			}
			else {
				if (language.equals("简体中文")) {
					
				}
			}
		}
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
