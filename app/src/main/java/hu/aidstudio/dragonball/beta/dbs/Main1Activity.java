package hu.aidstudio.dragonball.beta.dbs;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.*;
import android.util.*;
import android.view.*;
import android.view.View;
import android.widget.*;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.*;

import com.google.android.gms.ads.MobileAds;
import com.google.firebase.FirebaseApp;

import java.util.*;

import android.app.Activity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.AdSize;
import android.widget.LinearLayout.LayoutParams;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.nativead.NativeAdView;

import hu.aidstudio.dragonball.beta.player.PlayActivity;
import hu.aidstudio.dragonball.beta.R;
import hu.aidstudio.dragonball.beta.sk.SketchwareUtil;


public class Main1Activity extends Activity {
	
	RewardedAd rewardad;
	private String language = "";
	
	private LinearLayout linear1;
	private LinearLayout linear2;
	private LinearLayout linear4;
	private ImageView imageview1;
	private LinearLayout linear5;
	private LinearLayout banner;
	private ScrollView vscroll1;
	private LinearLayout linear6;
	private LinearLayout linear7;
	private LinearLayout linear26;
	private LinearLayout linear21;
	private LinearLayout linear16;
	private LinearLayout linear11;
	private LinearLayout linear31;
	private LinearLayout linear36;
	private LinearLayout linear41;
	private FrameLayout nativead2;
	private LinearLayout linear46;
	private LinearLayout linear8;
	private LinearLayout linear3;
	private ImageView imageview2;
	private LinearLayout linear9;
	private LinearLayout linear10;
	private TextView textview1;
	private Button db19;
	private LinearLayout linear27;
	private LinearLayout linear28;
	private ImageView imageview6;
	private LinearLayout linear29;
	private LinearLayout linear30;
	private TextView textview5;
	private Button db20;
	private LinearLayout linear22;
	private LinearLayout linear23;
	private ImageView imageview5;
	private LinearLayout linear24;
	private LinearLayout linear25;
	private TextView textview4;
	private Button db21;
	private LinearLayout linear17;
	private LinearLayout linear18;
	private ImageView imageview4;
	private LinearLayout linear19;
	private LinearLayout linear20;
	private TextView textview3;
	private Button db22;
	private LinearLayout linear12;
	private LinearLayout linear13;
	private ImageView imageview3;
	private LinearLayout linear14;
	private LinearLayout linear15;
	private TextView textview2;
	private Button db23;
	private LinearLayout linear32;
	private LinearLayout linear33;
	private ImageView imageview7;
	private LinearLayout linear34;
	private LinearLayout linear35;
	private TextView textview6;
	private Button db24;
	private LinearLayout linear37;
	private LinearLayout linear38;
	private ImageView imageview8;
	private LinearLayout linear39;
	private LinearLayout linear40;
	private TextView textview7;
	private Button db25;
	private LinearLayout linear42;
	private LinearLayout linear43;
	private ImageView imageview9;
	private LinearLayout linear44;
	private LinearLayout linear45;
	private TextView textview8;
	private Button db26;
	private LinearLayout linear47;
	private LinearLayout linear48;
	private ImageView imageview10;
	private LinearLayout linear49;
	private LinearLayout linear50;
	private TextView textview9;
	private Button db27;
	
	private Intent acti = new Intent();
	private AlertDialog.Builder d;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main1);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		MobileAds.initialize(this);
		
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		linear2 = findViewById(R.id.linear2);
		linear4 = findViewById(R.id.linear4);
		imageview1 = findViewById(R.id.imageview1);
		linear5 = findViewById(R.id.linear5);
		banner = findViewById(R.id.banner);
		vscroll1 = findViewById(R.id.vscroll1);
		linear6 = findViewById(R.id.linear6);
		linear7 = findViewById(R.id.linear7);
		linear26 = findViewById(R.id.linear26);
		linear21 = findViewById(R.id.linear21);
		linear16 = findViewById(R.id.linear16);
		linear11 = findViewById(R.id.linear11);
		linear31 = findViewById(R.id.linear31);
		linear36 = findViewById(R.id.linear36);
		linear41 = findViewById(R.id.linear41);
		nativead2 = findViewById(R.id.nativead2);
		linear46 = findViewById(R.id.linear46);
		linear8 = findViewById(R.id.linear8);
		linear3 = findViewById(R.id.linear3);
		imageview2 = findViewById(R.id.imageview2);
		linear9 = findViewById(R.id.linear9);
		linear10 = findViewById(R.id.linear10);
		textview1 = findViewById(R.id.textview1);
		db19 = findViewById(R.id.db19);
		linear27 = findViewById(R.id.linear27);
		linear28 = findViewById(R.id.linear28);
		imageview6 = findViewById(R.id.imageview6);
		linear29 = findViewById(R.id.linear29);
		linear30 = findViewById(R.id.linear30);
		textview5 = findViewById(R.id.textview5);
		db20 = findViewById(R.id.db20);
		linear22 = findViewById(R.id.linear22);
		linear23 = findViewById(R.id.linear23);
		imageview5 = findViewById(R.id.imageview5);
		linear24 = findViewById(R.id.linear24);
		linear25 = findViewById(R.id.linear25);
		textview4 = findViewById(R.id.textview4);
		db21 = findViewById(R.id.db21);
		linear17 = findViewById(R.id.linear17);
		linear18 = findViewById(R.id.linear18);
		imageview4 = findViewById(R.id.imageview4);
		linear19 = findViewById(R.id.linear19);
		linear20 = findViewById(R.id.linear20);
		textview3 = findViewById(R.id.textview3);
		db22 = findViewById(R.id.db22);
		linear12 = findViewById(R.id.linear12);
		linear13 = findViewById(R.id.linear13);
		imageview3 = findViewById(R.id.imageview3);
		linear14 = findViewById(R.id.linear14);
		linear15 = findViewById(R.id.linear15);
		textview2 = findViewById(R.id.textview2);
		db23 = findViewById(R.id.db23);
		linear32 = findViewById(R.id.linear32);
		linear33 = findViewById(R.id.linear33);
		imageview7 = findViewById(R.id.imageview7);
		linear34 = findViewById(R.id.linear34);
		linear35 = findViewById(R.id.linear35);
		textview6 = findViewById(R.id.textview6);
		db24 = findViewById(R.id.db24);
		linear37 = findViewById(R.id.linear37);
		linear38 = findViewById(R.id.linear38);
		imageview8 = findViewById(R.id.imageview8);
		linear39 = findViewById(R.id.linear39);
		linear40 = findViewById(R.id.linear40);
		textview7 = findViewById(R.id.textview7);
		db25 = findViewById(R.id.db25);
		linear42 = findViewById(R.id.linear42);
		linear43 = findViewById(R.id.linear43);
		imageview9 = findViewById(R.id.imageview9);
		linear44 = findViewById(R.id.linear44);
		linear45 = findViewById(R.id.linear45);
		textview8 = findViewById(R.id.textview8);
		db26 = findViewById(R.id.db26);
		linear47 = findViewById(R.id.linear47);
		linear48 = findViewById(R.id.linear48);
		imageview10 = findViewById(R.id.imageview10);
		linear49 = findViewById(R.id.linear49);
		linear50 = findViewById(R.id.linear50);
		textview9 = findViewById(R.id.textview9);
		db27 = findViewById(R.id.db27);
		d = new AlertDialog.Builder(this);
		
		db19.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (rewardad != null) {
					           rewardad.show(Main1Activity.this, rewardItem -> {

									 d.setTitle("Dragon Ball Super 2.Évad 19.Rész");
				   d.setMessage("Meg akkarja tekinteni?");
				   d.setPositiveButton("Megtekintem", (_dialog, _which) -> {

					   language = Locale.getDefault().getDisplayLanguage();
					   if (language.equals("magyar")) {
						   acti.setClass(getApplicationContext(), PlayActivity.class);
						   acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E019.mp4");
						   acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E019.mp4");
						   startActivity(acti);
					   } else {
							   acti.setClass(getApplicationContext(), PlayActivity.class);
							   acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/jp/Dragon_Ball_Super_E019.mp4");
							   acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/jp/Dragon_Ball_Super_E019.mp4");
							   startActivity(acti);
						   }
					   });
				   d.setNegativeButton("Mégsem", new DialogInterface.OnClickListener() {
					   @Override
					   public void onClick(DialogInterface _dialog, int _which) {

					   }
				   });
				   d.create().show();
								   });
					
					        }
			}
		});
		
		db20.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d.setTitle("Dragon Ball Super 2.Évad 20.Rész");
				d.setMessage("Meg akkarja tekinteni?");
				d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						acti.setClass(getApplicationContext(), PlayActivity.class);
						acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E020.mp4");
						acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E020.mp4");
						startActivity(acti);
					}
				});
				d.setNegativeButton("Mégsem", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				d.create().show();
			}
		});
		
		db21.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (rewardad != null) {
					           rewardad.show(Main1Activity.this, new OnUserEarnedRewardListener() {
						                @Override
						                public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
							
							                  d.setTitle("Dragon Ball Super 2.Évad 21.Rész");
							d.setMessage("Meg akkarja tekinteni?");
							d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									acti.setClass(getApplicationContext(), PlayActivity.class);
									acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E021.mp4");
									acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E021.mp4");
									startActivity(acti);
								}
							});
							d.setNegativeButton("Mégsem", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									
								}
							});
							d.create().show();
							                }
						            });
					
					        } else {
					            
					        }
			}
		});
		
		db22.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d.setTitle("Dragon Ball Super 2.Évad 22.Rész");
				d.setMessage("Meg akkarja tekinteni?");
				d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						acti.setClass(getApplicationContext(), PlayActivity.class);
						acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E022.mp4");
						acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E022.mp4");
						startActivity(acti);
					}
				});
				d.setNegativeButton("Mégsem", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				d.create().show();
			}
		});
		
		db23.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (rewardad != null) {
					           rewardad.show(Main1Activity.this, new OnUserEarnedRewardListener() {
						                @Override
						                public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
							
							                  d.setTitle("Dragon Ball Super 2.Évad 23.Rész");
							d.setMessage("Meg akkarja tekinteni?");
							d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									acti.setClass(getApplicationContext(), PlayActivity.class);
									acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E023.mp4");
									acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E023.mp4");
									startActivity(acti);
								}
							});
							d.setNegativeButton("Mégsem", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									
								}
							});
							d.create().show();
							                }
						            });
					
					        } else {
					            
					        }
			}
		});
		
		db24.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d.setTitle("Dragon Ball Super 2.Évad 24.Rész");
				d.setMessage("Meg akkarja tekinteni?");
				d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						acti.setClass(getApplicationContext(), PlayActivity.class);
						acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E024.mp4");
						acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E024.mp4");
						startActivity(acti);
					}
				});
				d.setNegativeButton("Mégsem", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				d.create().show();
			}
		});
		
		db25.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (rewardad != null) {
					           rewardad.show(Main1Activity.this, new OnUserEarnedRewardListener() {
						                @Override
						                public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
							
							                  d.setTitle("Dragon Ball Super 2.Évad 25.Rész");
							d.setMessage("Meg akkarja tekinteni?");
							d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									acti.setClass(getApplicationContext(), PlayActivity.class);
									acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E025.mp4");
									acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E025.mp4");
									startActivity(acti);
								}
							});
							d.setNegativeButton("Mégsem", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									
								}
							});
							d.create().show();
							                }
						            });
					
					        } else {
					            
					        }
			}
		});
		
		db26.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d.setTitle("Dragon Ball Super 2.Évad 26.Rész");
				d.setMessage("Meg akkarja tekinteni?");
				d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						acti.setClass(getApplicationContext(), PlayActivity.class);
						acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E026.mp4");
						acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E026.mp4");
						startActivity(acti);
					}
				});
				d.setNegativeButton("Mégsem", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				d.create().show();
			}
		});
		
		db27.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (rewardad != null) {
					           rewardad.show(Main1Activity.this, new OnUserEarnedRewardListener() {
						                @Override
						                public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
							
							                  d.setTitle("Dragon Ball Super 2.Évad 27.Rész");
							d.setMessage("Meg akkarja tekinteni?");
							d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									acti.setClass(getApplicationContext(), PlayActivity.class);
									acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E027.mp4");
									acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E027.mp4");
									startActivity(acti);
								}
							});
							d.setNegativeButton("Mégsem", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									
								}
							});
							d.create().show();
							                }
						            });
					
					        } else {
					            
					        }
			}
		});
	}
	
	private void initializeLogic() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) { Window w = getWindow();  w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS); };
		
		AdLoader.Builder builder = new AdLoader.Builder(Main1Activity.this, "ca-app-pub-9399905616386219/6457716380");
		
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
				
				
				               nativead2.removeAllViews();
				                nativead2.addView(adView);
				            }
			        }).build();
		        NativeAdOptions adOptions = new NativeAdOptions.Builder().build();
		        builder.withNativeAdOptions(adOptions);
		        AdLoader adLoader = builder.withAdListener(new AdListener() {
			            public void onAdFailedToLoad(int i) {
				
				
				            }
			        }).build();
		
		        adLoader.loadAd(new AdRequest.Builder().build());
		
		
		        AdRequest rewardad_request = new AdRequest.Builder().build();
		
		        RewardedAd.load(Main1Activity.this, "ca-app-pub-9399905616386219/1829002391",
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
		    
		AdView adView1 = new AdView(Main1Activity.this);
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
		
		        RewardedAd.load(Main1Activity.this, "ca-app-pub-9399905616386219/1829002391",
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
