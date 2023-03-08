package hu.aidstudio.dragonball.beta.dbs;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
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
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.firebase.FirebaseApp;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

import hu.aidstudio.dragonball.beta.player.PlayActivity;
import hu.aidstudio.dragonball.beta.R;
import hu.aidstudio.dragonball.beta.sk.SketchwareUtil;


public class Main2Activity extends Activity {
	
	RewardedAd rewardad;
	
	private LinearLayout linear1;
	private LinearLayout linear2;
	private LinearLayout linear100;
	private ImageView imageview20;
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
	private LinearLayout linear51;
	private LinearLayout linear55;
	private LinearLayout linear60;
	private LinearLayout linear65;
	private LinearLayout linear70;
	private LinearLayout linear75;
	private LinearLayout linear80;
	private LinearLayout linear85;
	private LinearLayout linear90;
	private LinearLayout linear95;
	private LinearLayout linear8;
	private LinearLayout linear3;
	private ImageView imageview2;
	private LinearLayout linear9;
	private LinearLayout linear10;
	private TextView textview1;
	private Button db28;
	private LinearLayout linear27;
	private LinearLayout linear28;
	private ImageView imageview6;
	private LinearLayout linear29;
	private LinearLayout linear30;
	private TextView textview5;
	private Button db29;
	private LinearLayout linear22;
	private LinearLayout linear23;
	private ImageView imageview5;
	private LinearLayout linear24;
	private LinearLayout linear25;
	private TextView textview4;
	private Button db30;
	private LinearLayout linear17;
	private LinearLayout linear18;
	private ImageView imageview4;
	private LinearLayout linear19;
	private LinearLayout linear20;
	private TextView textview3;
	private Button db31;
	private LinearLayout linear12;
	private LinearLayout linear13;
	private ImageView imageview3;
	private LinearLayout linear14;
	private LinearLayout linear15;
	private TextView textview2;
	private Button db32;
	private LinearLayout linear32;
	private LinearLayout linear33;
	private ImageView imageview7;
	private LinearLayout linear34;
	private LinearLayout linear35;
	private TextView textview6;
	private Button db33;
	private LinearLayout linear37;
	private LinearLayout linear38;
	private ImageView imageview8;
	private LinearLayout linear39;
	private LinearLayout linear40;
	private TextView textview7;
	private Button db34;
	private LinearLayout linear42;
	private LinearLayout linear43;
	private ImageView imageview9;
	private LinearLayout linear44;
	private LinearLayout linear45;
	private TextView textview8;
	private Button db35;
	private LinearLayout linear47;
	private LinearLayout linear48;
	private ImageView imageview10;
	private LinearLayout linear49;
	private LinearLayout linear50;
	private TextView textview9;
	private Button db36;
	private LinearLayout linear52;
	private LinearLayout linear53;
	private ImageView imageview1;
	private LinearLayout linear4;
	private LinearLayout linear54;
	private TextView textview10;
	private Button db37;
	private LinearLayout linear56;
	private LinearLayout linear57;
	private ImageView imageview11;
	private LinearLayout linear58;
	private LinearLayout linear59;
	private TextView textview11;
	private Button db38;
	private LinearLayout linear61;
	private LinearLayout linear62;
	private ImageView imageview12;
	private LinearLayout linear63;
	private LinearLayout linear64;
	private TextView textview12;
	private Button db39;
	private LinearLayout linear66;
	private LinearLayout linear67;
	private ImageView imageview13;
	private LinearLayout linear68;
	private LinearLayout linear69;
	private TextView textview13;
	private Button db40;
	private LinearLayout linear71;
	private LinearLayout linear72;
	private ImageView imageview14;
	private LinearLayout linear73;
	private LinearLayout linear74;
	private TextView textview14;
	private Button db41;
	private LinearLayout linear76;
	private LinearLayout linear77;
	private ImageView imageview15;
	private LinearLayout linear78;
	private LinearLayout linear79;
	private TextView textview15;
	private Button db42;
	private LinearLayout linear81;
	private LinearLayout linear82;
	private ImageView imageview16;
	private LinearLayout linear83;
	private LinearLayout linear84;
	private TextView textview16;
	private Button db43;
	private LinearLayout linear86;
	private LinearLayout linear87;
	private ImageView imageview17;
	private LinearLayout linear88;
	private LinearLayout linear89;
	private TextView textview17;
	private Button db44;
	private LinearLayout linear91;
	private LinearLayout linear92;
	private ImageView imageview18;
	private LinearLayout linear93;
	private LinearLayout linear94;
	private TextView textview18;
	private Button db45;
	private LinearLayout linear96;
	private LinearLayout linear97;
	private ImageView imageview19;
	private LinearLayout linear98;
	private LinearLayout linear99;
	private TextView textview19;
	private Button db46;
	
	private Intent acti = new Intent();
	private AlertDialog.Builder d;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main2);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		MobileAds.initialize(this);
		
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		linear2 = findViewById(R.id.linear2);
		linear100 = findViewById(R.id.linear100);
		imageview20 = findViewById(R.id.imageview20);
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
		linear51 = findViewById(R.id.linear51);
		linear55 = findViewById(R.id.linear55);
		linear60 = findViewById(R.id.linear60);
		linear65 = findViewById(R.id.linear65);
		linear70 = findViewById(R.id.linear70);
		linear75 = findViewById(R.id.linear75);
		linear80 = findViewById(R.id.linear80);
		linear85 = findViewById(R.id.linear85);
		linear90 = findViewById(R.id.linear90);
		linear95 = findViewById(R.id.linear95);
		linear8 = findViewById(R.id.linear8);
		linear3 = findViewById(R.id.linear3);
		imageview2 = findViewById(R.id.imageview2);
		linear9 = findViewById(R.id.linear9);
		linear10 = findViewById(R.id.linear10);
		textview1 = findViewById(R.id.textview1);
		db28 = findViewById(R.id.db28);
		linear27 = findViewById(R.id.linear27);
		linear28 = findViewById(R.id.linear28);
		imageview6 = findViewById(R.id.imageview6);
		linear29 = findViewById(R.id.linear29);
		linear30 = findViewById(R.id.linear30);
		textview5 = findViewById(R.id.textview5);
		db29 = findViewById(R.id.db29);
		linear22 = findViewById(R.id.linear22);
		linear23 = findViewById(R.id.linear23);
		imageview5 = findViewById(R.id.imageview5);
		linear24 = findViewById(R.id.linear24);
		linear25 = findViewById(R.id.linear25);
		textview4 = findViewById(R.id.textview4);
		db30 = findViewById(R.id.db30);
		linear17 = findViewById(R.id.linear17);
		linear18 = findViewById(R.id.linear18);
		imageview4 = findViewById(R.id.imageview4);
		linear19 = findViewById(R.id.linear19);
		linear20 = findViewById(R.id.linear20);
		textview3 = findViewById(R.id.textview3);
		db31 = findViewById(R.id.db31);
		linear12 = findViewById(R.id.linear12);
		linear13 = findViewById(R.id.linear13);
		imageview3 = findViewById(R.id.imageview3);
		linear14 = findViewById(R.id.linear14);
		linear15 = findViewById(R.id.linear15);
		textview2 = findViewById(R.id.textview2);
		db32 = findViewById(R.id.db32);
		linear32 = findViewById(R.id.linear32);
		linear33 = findViewById(R.id.linear33);
		imageview7 = findViewById(R.id.imageview7);
		linear34 = findViewById(R.id.linear34);
		linear35 = findViewById(R.id.linear35);
		textview6 = findViewById(R.id.textview6);
		db33 = findViewById(R.id.db33);
		linear37 = findViewById(R.id.linear37);
		linear38 = findViewById(R.id.linear38);
		imageview8 = findViewById(R.id.imageview8);
		linear39 = findViewById(R.id.linear39);
		linear40 = findViewById(R.id.linear40);
		textview7 = findViewById(R.id.textview7);
		db34 = findViewById(R.id.db34);
		linear42 = findViewById(R.id.linear42);
		linear43 = findViewById(R.id.linear43);
		imageview9 = findViewById(R.id.imageview9);
		linear44 = findViewById(R.id.linear44);
		linear45 = findViewById(R.id.linear45);
		textview8 = findViewById(R.id.textview8);
		db35 = findViewById(R.id.db35);
		linear47 = findViewById(R.id.linear47);
		linear48 = findViewById(R.id.linear48);
		imageview10 = findViewById(R.id.imageview10);
		linear49 = findViewById(R.id.linear49);
		linear50 = findViewById(R.id.linear50);
		textview9 = findViewById(R.id.textview9);
		db36 = findViewById(R.id.db36);
		linear52 = findViewById(R.id.linear52);
		linear53 = findViewById(R.id.linear53);
		imageview1 = findViewById(R.id.imageview1);
		linear4 = findViewById(R.id.linear4);
		linear54 = findViewById(R.id.linear54);
		textview10 = findViewById(R.id.textview10);
		db37 = findViewById(R.id.db37);
		linear56 = findViewById(R.id.linear56);
		linear57 = findViewById(R.id.linear57);
		imageview11 = findViewById(R.id.imageview11);
		linear58 = findViewById(R.id.linear58);
		linear59 = findViewById(R.id.linear59);
		textview11 = findViewById(R.id.textview11);
		db38 = findViewById(R.id.db38);
		linear61 = findViewById(R.id.linear61);
		linear62 = findViewById(R.id.linear62);
		imageview12 = findViewById(R.id.imageview12);
		linear63 = findViewById(R.id.linear63);
		linear64 = findViewById(R.id.linear64);
		textview12 = findViewById(R.id.textview12);
		db39 = findViewById(R.id.db39);
		linear66 = findViewById(R.id.linear66);
		linear67 = findViewById(R.id.linear67);
		imageview13 = findViewById(R.id.imageview13);
		linear68 = findViewById(R.id.linear68);
		linear69 = findViewById(R.id.linear69);
		textview13 = findViewById(R.id.textview13);
		db40 = findViewById(R.id.db40);
		linear71 = findViewById(R.id.linear71);
		linear72 = findViewById(R.id.linear72);
		imageview14 = findViewById(R.id.imageview14);
		linear73 = findViewById(R.id.linear73);
		linear74 = findViewById(R.id.linear74);
		textview14 = findViewById(R.id.textview14);
		db41 = findViewById(R.id.db41);
		linear76 = findViewById(R.id.linear76);
		linear77 = findViewById(R.id.linear77);
		imageview15 = findViewById(R.id.imageview15);
		linear78 = findViewById(R.id.linear78);
		linear79 = findViewById(R.id.linear79);
		textview15 = findViewById(R.id.textview15);
		db42 = findViewById(R.id.db42);
		linear81 = findViewById(R.id.linear81);
		linear82 = findViewById(R.id.linear82);
		imageview16 = findViewById(R.id.imageview16);
		linear83 = findViewById(R.id.linear83);
		linear84 = findViewById(R.id.linear84);
		textview16 = findViewById(R.id.textview16);
		db43 = findViewById(R.id.db43);
		linear86 = findViewById(R.id.linear86);
		linear87 = findViewById(R.id.linear87);
		imageview17 = findViewById(R.id.imageview17);
		linear88 = findViewById(R.id.linear88);
		linear89 = findViewById(R.id.linear89);
		textview17 = findViewById(R.id.textview17);
		db44 = findViewById(R.id.db44);
		linear91 = findViewById(R.id.linear91);
		linear92 = findViewById(R.id.linear92);
		imageview18 = findViewById(R.id.imageview18);
		linear93 = findViewById(R.id.linear93);
		linear94 = findViewById(R.id.linear94);
		textview18 = findViewById(R.id.textview18);
		db45 = findViewById(R.id.db45);
		linear96 = findViewById(R.id.linear96);
		linear97 = findViewById(R.id.linear97);
		imageview19 = findViewById(R.id.imageview19);
		linear98 = findViewById(R.id.linear98);
		linear99 = findViewById(R.id.linear99);
		textview19 = findViewById(R.id.textview19);
		db46 = findViewById(R.id.db46);
		d = new AlertDialog.Builder(this);
		
		db28.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d.setTitle("Dragon Ball Super 3.Évad 28.Rész");
				d.setMessage("Meg akkarja tekinteni?");
				d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						acti.setClass(getApplicationContext(), PlayActivity.class);
						acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E028.mp4");
						acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E028.mp4");
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
		
		db29.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (rewardad != null) {
					           rewardad.show(Main2Activity.this, new OnUserEarnedRewardListener() {
						                @Override
						                public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
							
							                  d.setTitle("Dragon Ball Super 3.Évad 29.Rész");
							d.setMessage("Meg akkarja tekinteni?");
							d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									acti.setClass(getApplicationContext(), PlayActivity.class);
									acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E029.mp4");
									acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E029.mp4");
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
		
		db30.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d.setTitle("Dragon Ball Super 3.Évad 30.Rész");
				d.setMessage("Meg akkarja tekinteni?");
				d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						acti.setClass(getApplicationContext(), PlayActivity.class);
						acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E030.mp4");
						acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E030.mp4");
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
		
		db31.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (rewardad != null) {
					           rewardad.show(Main2Activity.this, new OnUserEarnedRewardListener() {
						                @Override
						                public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
							
							                  d.setTitle("Dragon Ball Super 3.Évad 31.Rész");
							d.setMessage("Meg akkarja tekinteni?");
							d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									acti.setClass(getApplicationContext(), PlayActivity.class);
									acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E031.mp4");
									acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E031.mp4");
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
		
		db32.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d.setTitle("Dragon Ball Super 3.Évad 32.Rész");
				d.setMessage("Meg akkarja tekinteni?");
				d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						acti.setClass(getApplicationContext(), PlayActivity.class);
						acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E032.mp4");
						acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E032.mp4");
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
		
		db33.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (rewardad != null) {
					           rewardad.show(Main2Activity.this, new OnUserEarnedRewardListener() {
						                @Override
						                public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
							
							                  d.setTitle("Dragon Ball Super 3.Évad 33.Rész");
							d.setMessage("Meg akkarja tekinteni?");
							d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									acti.setClass(getApplicationContext(), PlayActivity.class);
									acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E033.mp4");
									acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E033.mp4");
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
		
		db34.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d.setTitle("Dragon Ball Super 3.Évad 34.Rész");
				d.setMessage("Meg akkarja tekinteni?");
				d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						acti.setClass(getApplicationContext(), PlayActivity.class);
						acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E034.mp4");
						acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E034.mp4");
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
		
		db35.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (rewardad != null) {
					           rewardad.show(Main2Activity.this, new OnUserEarnedRewardListener() {
						                @Override
						                public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
							
							                  d.setTitle("Dragon Ball Super 3.Évad 35.Rész");
							d.setMessage("Meg akkarja tekinteni?");
							d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									acti.setClass(getApplicationContext(), PlayActivity.class);
									acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E035.mp4");
									acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E035.mp4");
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
		
		db36.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d.setTitle("Dragon Ball Super 3.Évad 36.Rész");
				d.setMessage("Meg akkarja tekinteni?");
				d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						acti.setClass(getApplicationContext(), PlayActivity.class);
						acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E036.mp4");
						acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E036.mp4");
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
		
		db37.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (rewardad != null) {
					           rewardad.show(Main2Activity.this, new OnUserEarnedRewardListener() {
						                @Override
						                public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
							
							                  d.setTitle("Dragon Ball Super 3.Évad 37.Rész");
							d.setMessage("Meg akkarja tekinteni?");
							d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									acti.setClass(getApplicationContext(), PlayActivity.class);
									acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E037.mp4");
									acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E037.mp4");
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
		
		db38.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d.setTitle("Dragon Ball Super 3.Évad 38.Rész");
				d.setMessage("Meg akkarja tekinteni?");
				d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						acti.setClass(getApplicationContext(), PlayActivity.class);
						acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E038.mp4");
						acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E038.mp4");
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
		
		db39.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (rewardad != null) {
					           rewardad.show(Main2Activity.this, new OnUserEarnedRewardListener() {
						                @Override
						                public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
							
							                  d.setTitle("Dragon Ball Super 3.Évad 39.Rész");
							d.setMessage("Meg akkarja tekinteni?");
							d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									acti.setClass(getApplicationContext(), PlayActivity.class);
									acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E039.mp4");
									acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E039.mp4");
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
		
		db40.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d.setTitle("Dragon Ball Super 3.Évad 40.Rész");
				d.setMessage("Meg akkarja tekinteni?");
				d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						acti.setClass(getApplicationContext(), PlayActivity.class);
						acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E040.mp4");
						acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E040.mp4");
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
		
		db41.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (rewardad != null) {
					           rewardad.show(Main2Activity.this, new OnUserEarnedRewardListener() {
						                @Override
						                public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
							
							                  d.setTitle("Dragon Ball Super 3.Évad 41.Rész");
							d.setMessage("Meg akkarja tekinteni?");
							d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									acti.setClass(getApplicationContext(), PlayActivity.class);
									acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E041.mp4");
									acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E041.mp4");
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
		
		db42.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d.setTitle("Dragon Ball Super 3.Évad 42.Rész");
				d.setMessage("Meg akkarja tekinteni?");
				d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						acti.setClass(getApplicationContext(), PlayActivity.class);
						acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E042.mp4");
						acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E042.mp4");
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
		
		db43.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (rewardad != null) {
					           rewardad.show(Main2Activity.this, new OnUserEarnedRewardListener() {
						                @Override
						                public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
							
							                  d.setTitle("Dragon Ball Super 3.Évad 43.Rész");
							d.setMessage("Meg akkarja tekinteni?");
							d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									acti.setClass(getApplicationContext(), PlayActivity.class);
									acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E043.mp4");
									acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E043.mp4");
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
		
		db44.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d.setTitle("Dragon Ball Super 3.Évad 44.Rész");
				d.setMessage("Meg akkarja tekinteni?");
				d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						acti.setClass(getApplicationContext(), PlayActivity.class);
						acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E044.mp4");
						acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E044.mp4");
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
		
		db45.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (rewardad != null) {
					           rewardad.show(Main2Activity.this, new OnUserEarnedRewardListener() {
						                @Override
						                public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
							
							                  d.setTitle("Dragon Ball Super 3.Évad 45.Rész");
							d.setMessage("Meg akkarja tekinteni?");
							d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									acti.setClass(getApplicationContext(), PlayActivity.class);
									acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E045.mp4");
									acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E045.mp4");
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
		
		db46.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d.setTitle("Dragon Ball Super 3.Évad 46.Rész");
				d.setMessage("Meg akkarja tekinteni?");
				d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						acti.setClass(getApplicationContext(), PlayActivity.class);
						acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E046.mp4");
						acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E046.mp4");
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
	}
	
	private void initializeLogic() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) { Window w = getWindow();  w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS); };
		
		AdLoader.Builder builder = new AdLoader.Builder(Main2Activity.this, "ca-app-pub-9399905616386219/6457716380");
		
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
		
		        RewardedAd.load(Main2Activity.this, "ca-app-pub-9399905616386219/1829002391",
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
		    
		AdView adView1 = new AdView(Main2Activity.this);
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
		
		        RewardedAd.load(Main2Activity.this, "ca-app-pub-9399905616386219/1829002391",
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
