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


public class Main3Activity extends Activity {
	
	RewardedAd rewardad;
	
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
	private LinearLayout linear51;
	private LinearLayout linear56;
	private LinearLayout linear61;
	private LinearLayout linear66;
	private LinearLayout linear71;
	private LinearLayout linear76;
	private LinearLayout linear81;
	private LinearLayout linear86;
	private LinearLayout linear91;
	private LinearLayout linear96;
	private LinearLayout linear101;
	private LinearLayout linear106;
	private LinearLayout linear111;
	private LinearLayout linear116;
	private LinearLayout linear121;
	private LinearLayout linear126;
	private LinearLayout linear131;
	private LinearLayout linear141;
	private LinearLayout linear146;
	private LinearLayout linear151;
	private LinearLayout linear156;
	private LinearLayout linear8;
	private LinearLayout linear3;
	private ImageView imageview2;
	private LinearLayout linear9;
	private LinearLayout linear10;
	private TextView textview1;
	private Button db47;
	private LinearLayout linear27;
	private LinearLayout linear28;
	private ImageView imageview6;
	private LinearLayout linear29;
	private LinearLayout linear30;
	private TextView textview5;
	private Button db48;
	private LinearLayout linear22;
	private LinearLayout linear23;
	private ImageView imageview5;
	private LinearLayout linear24;
	private LinearLayout linear25;
	private TextView textview4;
	private Button db49;
	private LinearLayout linear17;
	private LinearLayout linear18;
	private ImageView imageview4;
	private LinearLayout linear19;
	private LinearLayout linear20;
	private TextView textview3;
	private Button db50;
	private LinearLayout linear12;
	private LinearLayout linear13;
	private ImageView imageview3;
	private LinearLayout linear14;
	private LinearLayout linear15;
	private TextView textview2;
	private Button db51;
	private LinearLayout linear32;
	private LinearLayout linear33;
	private ImageView imageview7;
	private LinearLayout linear34;
	private LinearLayout linear35;
	private TextView textview6;
	private Button db52;
	private LinearLayout linear37;
	private LinearLayout linear38;
	private ImageView imageview8;
	private LinearLayout linear39;
	private LinearLayout linear40;
	private TextView textview7;
	private Button db53;
	private LinearLayout linear42;
	private LinearLayout linear43;
	private ImageView imageview9;
	private LinearLayout linear44;
	private LinearLayout linear45;
	private TextView textview8;
	private Button db54;
	private LinearLayout linear47;
	private LinearLayout linear48;
	private ImageView imageview10;
	private LinearLayout linear49;
	private LinearLayout linear50;
	private TextView textview9;
	private Button db55;
	private LinearLayout linear52;
	private LinearLayout linear53;
	private ImageView imageview11;
	private LinearLayout linear54;
	private LinearLayout linear55;
	private TextView textview10;
	private Button db56;
	private LinearLayout linear57;
	private LinearLayout linear58;
	private ImageView imageview12;
	private LinearLayout linear59;
	private LinearLayout linear60;
	private TextView textview11;
	private Button db57;
	private LinearLayout linear62;
	private LinearLayout linear63;
	private ImageView imageview13;
	private LinearLayout linear64;
	private LinearLayout linear65;
	private TextView textview12;
	private Button db58;
	private LinearLayout linear67;
	private LinearLayout linear68;
	private ImageView imageview14;
	private LinearLayout linear69;
	private LinearLayout linear70;
	private TextView textview13;
	private Button db59;
	private LinearLayout linear72;
	private LinearLayout linear73;
	private ImageView imageview15;
	private LinearLayout linear74;
	private LinearLayout linear75;
	private TextView textview14;
	private Button db60;
	private LinearLayout linear77;
	private LinearLayout linear78;
	private ImageView imageview16;
	private LinearLayout linear79;
	private LinearLayout linear80;
	private TextView textview15;
	private Button db61;
	private LinearLayout linear82;
	private LinearLayout linear83;
	private ImageView imageview17;
	private LinearLayout linear84;
	private LinearLayout linear85;
	private TextView textview16;
	private Button db62;
	private LinearLayout linear87;
	private LinearLayout linear88;
	private ImageView imageview18;
	private LinearLayout linear89;
	private LinearLayout linear90;
	private TextView textview17;
	private Button db63;
	private LinearLayout linear92;
	private LinearLayout linear93;
	private ImageView imageview19;
	private LinearLayout linear94;
	private LinearLayout linear95;
	private TextView textview18;
	private Button db64;
	private LinearLayout linear97;
	private LinearLayout linear98;
	private ImageView imageview20;
	private LinearLayout linear99;
	private LinearLayout linear100;
	private TextView textview19;
	private Button db65;
	private LinearLayout linear102;
	private LinearLayout linear103;
	private ImageView imageview21;
	private LinearLayout linear104;
	private LinearLayout linear105;
	private TextView textview20;
	private Button db66;
	private LinearLayout linear107;
	private LinearLayout linear108;
	private ImageView imageview22;
	private LinearLayout linear109;
	private LinearLayout linear110;
	private TextView textview21;
	private Button db67;
	private LinearLayout linear112;
	private LinearLayout linear113;
	private ImageView imageview23;
	private LinearLayout linear114;
	private LinearLayout linear115;
	private TextView textview22;
	private Button db68;
	private LinearLayout linear117;
	private LinearLayout linear118;
	private ImageView imageview24;
	private LinearLayout linear119;
	private LinearLayout linear120;
	private TextView textview23;
	private Button db69;
	private LinearLayout linear122;
	private LinearLayout linear123;
	private ImageView imageview25;
	private LinearLayout linear124;
	private LinearLayout linear125;
	private TextView textview24;
	private Button db70;
	private LinearLayout linear127;
	private LinearLayout linear128;
	private ImageView imageview26;
	private LinearLayout linear129;
	private LinearLayout linear130;
	private TextView textview25;
	private Button db71;
	private LinearLayout linear132;
	private LinearLayout linear133;
	private ImageView imageview27;
	private LinearLayout linear134;
	private LinearLayout linear135;
	private TextView textview26;
	private Button db72;
	private LinearLayout linear142;
	private LinearLayout linear143;
	private ImageView imageview29;
	private LinearLayout linear144;
	private LinearLayout linear145;
	private TextView textview28;
	private Button db73;
	private LinearLayout linear147;
	private LinearLayout linear148;
	private ImageView imageview30;
	private LinearLayout linear149;
	private LinearLayout linear150;
	private TextView textview29;
	private Button db74;
	private LinearLayout linear152;
	private LinearLayout linear153;
	private ImageView imageview31;
	private LinearLayout linear154;
	private LinearLayout linear155;
	private TextView textview30;
	private Button db75;
	private LinearLayout linear157;
	private LinearLayout linear158;
	private ImageView imageview32;
	private LinearLayout linear159;
	private LinearLayout linear160;
	private TextView textview31;
	private Button db76;
	
	private Intent acti = new Intent();
	private AlertDialog.Builder d;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main3);
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
		linear51 = findViewById(R.id.linear51);
		linear56 = findViewById(R.id.linear56);
		linear61 = findViewById(R.id.linear61);
		linear66 = findViewById(R.id.linear66);
		linear71 = findViewById(R.id.linear71);
		linear76 = findViewById(R.id.linear76);
		linear81 = findViewById(R.id.linear81);
		linear86 = findViewById(R.id.linear86);
		linear91 = findViewById(R.id.linear91);
		linear96 = findViewById(R.id.linear96);
		linear101 = findViewById(R.id.linear101);
		linear106 = findViewById(R.id.linear106);
		linear111 = findViewById(R.id.linear111);
		linear116 = findViewById(R.id.linear116);
		linear121 = findViewById(R.id.linear121);
		linear126 = findViewById(R.id.linear126);
		linear131 = findViewById(R.id.linear131);
		linear141 = findViewById(R.id.linear141);
		linear146 = findViewById(R.id.linear146);
		linear151 = findViewById(R.id.linear151);
		linear156 = findViewById(R.id.linear156);
		linear8 = findViewById(R.id.linear8);
		linear3 = findViewById(R.id.linear3);
		imageview2 = findViewById(R.id.imageview2);
		linear9 = findViewById(R.id.linear9);
		linear10 = findViewById(R.id.linear10);
		textview1 = findViewById(R.id.textview1);
		db47 = findViewById(R.id.db47);
		linear27 = findViewById(R.id.linear27);
		linear28 = findViewById(R.id.linear28);
		imageview6 = findViewById(R.id.imageview6);
		linear29 = findViewById(R.id.linear29);
		linear30 = findViewById(R.id.linear30);
		textview5 = findViewById(R.id.textview5);
		db48 = findViewById(R.id.db48);
		linear22 = findViewById(R.id.linear22);
		linear23 = findViewById(R.id.linear23);
		imageview5 = findViewById(R.id.imageview5);
		linear24 = findViewById(R.id.linear24);
		linear25 = findViewById(R.id.linear25);
		textview4 = findViewById(R.id.textview4);
		db49 = findViewById(R.id.db49);
		linear17 = findViewById(R.id.linear17);
		linear18 = findViewById(R.id.linear18);
		imageview4 = findViewById(R.id.imageview4);
		linear19 = findViewById(R.id.linear19);
		linear20 = findViewById(R.id.linear20);
		textview3 = findViewById(R.id.textview3);
		db50 = findViewById(R.id.db50);
		linear12 = findViewById(R.id.linear12);
		linear13 = findViewById(R.id.linear13);
		imageview3 = findViewById(R.id.imageview3);
		linear14 = findViewById(R.id.linear14);
		linear15 = findViewById(R.id.linear15);
		textview2 = findViewById(R.id.textview2);
		db51 = findViewById(R.id.db51);
		linear32 = findViewById(R.id.linear32);
		linear33 = findViewById(R.id.linear33);
		imageview7 = findViewById(R.id.imageview7);
		linear34 = findViewById(R.id.linear34);
		linear35 = findViewById(R.id.linear35);
		textview6 = findViewById(R.id.textview6);
		db52 = findViewById(R.id.db52);
		linear37 = findViewById(R.id.linear37);
		linear38 = findViewById(R.id.linear38);
		imageview8 = findViewById(R.id.imageview8);
		linear39 = findViewById(R.id.linear39);
		linear40 = findViewById(R.id.linear40);
		textview7 = findViewById(R.id.textview7);
		db53 = findViewById(R.id.db53);
		linear42 = findViewById(R.id.linear42);
		linear43 = findViewById(R.id.linear43);
		imageview9 = findViewById(R.id.imageview9);
		linear44 = findViewById(R.id.linear44);
		linear45 = findViewById(R.id.linear45);
		textview8 = findViewById(R.id.textview8);
		db54 = findViewById(R.id.db54);
		linear47 = findViewById(R.id.linear47);
		linear48 = findViewById(R.id.linear48);
		imageview10 = findViewById(R.id.imageview10);
		linear49 = findViewById(R.id.linear49);
		linear50 = findViewById(R.id.linear50);
		textview9 = findViewById(R.id.textview9);
		db55 = findViewById(R.id.db55);
		linear52 = findViewById(R.id.linear52);
		linear53 = findViewById(R.id.linear53);
		imageview11 = findViewById(R.id.imageview11);
		linear54 = findViewById(R.id.linear54);
		linear55 = findViewById(R.id.linear55);
		textview10 = findViewById(R.id.textview10);
		db56 = findViewById(R.id.db56);
		linear57 = findViewById(R.id.linear57);
		linear58 = findViewById(R.id.linear58);
		imageview12 = findViewById(R.id.imageview12);
		linear59 = findViewById(R.id.linear59);
		linear60 = findViewById(R.id.linear60);
		textview11 = findViewById(R.id.textview11);
		db57 = findViewById(R.id.db57);
		linear62 = findViewById(R.id.linear62);
		linear63 = findViewById(R.id.linear63);
		imageview13 = findViewById(R.id.imageview13);
		linear64 = findViewById(R.id.linear64);
		linear65 = findViewById(R.id.linear65);
		textview12 = findViewById(R.id.textview12);
		db58 = findViewById(R.id.db58);
		linear67 = findViewById(R.id.linear67);
		linear68 = findViewById(R.id.linear68);
		imageview14 = findViewById(R.id.imageview14);
		linear69 = findViewById(R.id.linear69);
		linear70 = findViewById(R.id.linear70);
		textview13 = findViewById(R.id.textview13);
		db59 = findViewById(R.id.db59);
		linear72 = findViewById(R.id.linear72);
		linear73 = findViewById(R.id.linear73);
		imageview15 = findViewById(R.id.imageview15);
		linear74 = findViewById(R.id.linear74);
		linear75 = findViewById(R.id.linear75);
		textview14 = findViewById(R.id.textview14);
		db60 = findViewById(R.id.db60);
		linear77 = findViewById(R.id.linear77);
		linear78 = findViewById(R.id.linear78);
		imageview16 = findViewById(R.id.imageview16);
		linear79 = findViewById(R.id.linear79);
		linear80 = findViewById(R.id.linear80);
		textview15 = findViewById(R.id.textview15);
		db61 = findViewById(R.id.db61);
		linear82 = findViewById(R.id.linear82);
		linear83 = findViewById(R.id.linear83);
		imageview17 = findViewById(R.id.imageview17);
		linear84 = findViewById(R.id.linear84);
		linear85 = findViewById(R.id.linear85);
		textview16 = findViewById(R.id.textview16);
		db62 = findViewById(R.id.db62);
		linear87 = findViewById(R.id.linear87);
		linear88 = findViewById(R.id.linear88);
		imageview18 = findViewById(R.id.imageview18);
		linear89 = findViewById(R.id.linear89);
		linear90 = findViewById(R.id.linear90);
		textview17 = findViewById(R.id.textview17);
		db63 = findViewById(R.id.db63);
		linear92 = findViewById(R.id.linear92);
		linear93 = findViewById(R.id.linear93);
		imageview19 = findViewById(R.id.imageview19);
		linear94 = findViewById(R.id.linear94);
		linear95 = findViewById(R.id.linear95);
		textview18 = findViewById(R.id.textview18);
		db64 = findViewById(R.id.db64);
		linear97 = findViewById(R.id.linear97);
		linear98 = findViewById(R.id.linear98);
		imageview20 = findViewById(R.id.imageview20);
		linear99 = findViewById(R.id.linear99);
		linear100 = findViewById(R.id.linear100);
		textview19 = findViewById(R.id.textview19);
		db65 = findViewById(R.id.db65);
		linear102 = findViewById(R.id.linear102);
		linear103 = findViewById(R.id.linear103);
		imageview21 = findViewById(R.id.imageview21);
		linear104 = findViewById(R.id.linear104);
		linear105 = findViewById(R.id.linear105);
		textview20 = findViewById(R.id.textview20);
		db66 = findViewById(R.id.db66);
		linear107 = findViewById(R.id.linear107);
		linear108 = findViewById(R.id.linear108);
		imageview22 = findViewById(R.id.imageview22);
		linear109 = findViewById(R.id.linear109);
		linear110 = findViewById(R.id.linear110);
		textview21 = findViewById(R.id.textview21);
		db67 = findViewById(R.id.db67);
		linear112 = findViewById(R.id.linear112);
		linear113 = findViewById(R.id.linear113);
		imageview23 = findViewById(R.id.imageview23);
		linear114 = findViewById(R.id.linear114);
		linear115 = findViewById(R.id.linear115);
		textview22 = findViewById(R.id.textview22);
		db68 = findViewById(R.id.db68);
		linear117 = findViewById(R.id.linear117);
		linear118 = findViewById(R.id.linear118);
		imageview24 = findViewById(R.id.imageview24);
		linear119 = findViewById(R.id.linear119);
		linear120 = findViewById(R.id.linear120);
		textview23 = findViewById(R.id.textview23);
		db69 = findViewById(R.id.db69);
		linear122 = findViewById(R.id.linear122);
		linear123 = findViewById(R.id.linear123);
		imageview25 = findViewById(R.id.imageview25);
		linear124 = findViewById(R.id.linear124);
		linear125 = findViewById(R.id.linear125);
		textview24 = findViewById(R.id.textview24);
		db70 = findViewById(R.id.db70);
		linear127 = findViewById(R.id.linear127);
		linear128 = findViewById(R.id.linear128);
		imageview26 = findViewById(R.id.imageview26);
		linear129 = findViewById(R.id.linear129);
		linear130 = findViewById(R.id.linear130);
		textview25 = findViewById(R.id.textview25);
		db71 = findViewById(R.id.db71);
		linear132 = findViewById(R.id.linear132);
		linear133 = findViewById(R.id.linear133);
		imageview27 = findViewById(R.id.imageview27);
		linear134 = findViewById(R.id.linear134);
		linear135 = findViewById(R.id.linear135);
		textview26 = findViewById(R.id.textview26);
		db72 = findViewById(R.id.db72);
		linear142 = findViewById(R.id.linear142);
		linear143 = findViewById(R.id.linear143);
		imageview29 = findViewById(R.id.imageview29);
		linear144 = findViewById(R.id.linear144);
		linear145 = findViewById(R.id.linear145);
		textview28 = findViewById(R.id.textview28);
		db73 = findViewById(R.id.db73);
		linear147 = findViewById(R.id.linear147);
		linear148 = findViewById(R.id.linear148);
		imageview30 = findViewById(R.id.imageview30);
		linear149 = findViewById(R.id.linear149);
		linear150 = findViewById(R.id.linear150);
		textview29 = findViewById(R.id.textview29);
		db74 = findViewById(R.id.db74);
		linear152 = findViewById(R.id.linear152);
		linear153 = findViewById(R.id.linear153);
		imageview31 = findViewById(R.id.imageview31);
		linear154 = findViewById(R.id.linear154);
		linear155 = findViewById(R.id.linear155);
		textview30 = findViewById(R.id.textview30);
		db75 = findViewById(R.id.db75);
		linear157 = findViewById(R.id.linear157);
		linear158 = findViewById(R.id.linear158);
		imageview32 = findViewById(R.id.imageview32);
		linear159 = findViewById(R.id.linear159);
		linear160 = findViewById(R.id.linear160);
		textview31 = findViewById(R.id.textview31);
		db76 = findViewById(R.id.db76);
		d = new AlertDialog.Builder(this);
		
		db47.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (rewardad != null) {
					           rewardad.show(Main3Activity.this, new OnUserEarnedRewardListener() {
						                @Override
						                public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
							
							                  d.setTitle("Dragon Ball Super 4.Évad 47.Rész");
							d.setMessage("Meg akkarja tekinteni?");
							d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									acti.setClass(getApplicationContext(), PlayActivity.class);
									acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E047.mp4");
									acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E047.mp4");
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
		
		db48.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d.setTitle("Dragon Ball Super 4.Évad 48.Rész");
				d.setMessage("Meg akkarja tekinteni?");
				d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						acti.setClass(getApplicationContext(), PlayActivity.class);
						acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E048.mp4");
						acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E048.mp4");
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
		
		db49.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (rewardad != null) {
					           rewardad.show(Main3Activity.this, new OnUserEarnedRewardListener() {
						                @Override
						                public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
							
							                  d.setTitle("Dragon Ball Super 4.Évad 49.Rész");
							d.setMessage("Meg akkarja tekinteni?");
							d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									acti.setClass(getApplicationContext(), PlayActivity.class);
									acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E049.mp4");
									acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E049.mp4");
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
		
		db50.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d.setTitle("Dragon Ball Super 4.Évad 50.Rész");
				d.setMessage("Meg akkarja tekinteni?");
				d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						acti.setClass(getApplicationContext(), PlayActivity.class);
						acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E050.mp4");
						acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E050.mp4");
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
		
		db51.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (rewardad != null) {
					           rewardad.show(Main3Activity.this, new OnUserEarnedRewardListener() {
						                @Override
						                public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
							
							                  d.setTitle("Dragon Ball Super 4.Évad 51.Rész");
							d.setMessage("Meg akkarja tekinteni?");
							d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									acti.setClass(getApplicationContext(), PlayActivity.class);
									acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E051.mp4");
									acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E051.mp4");
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
		
		db52.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d.setTitle("Dragon Ball Super 4.Évad 52.Rész");
				d.setMessage("Meg akkarja tekinteni?");
				d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						acti.setClass(getApplicationContext(), PlayActivity.class);
						acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E052.mp4");
						acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E001.mp4");
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
		
		db53.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (rewardad != null) {
					           rewardad.show(Main3Activity.this, new OnUserEarnedRewardListener() {
						                @Override
						                public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
							
							                  d.setTitle("Dragon Ball Super 4.Évad 53.Rész");
							d.setMessage("Meg akkarja tekinteni?");
							d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									acti.setClass(getApplicationContext(), PlayActivity.class);
									acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E053.mp4");
									acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E001.mp4");
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
		
		db54.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d.setTitle("Dragon Ball Super 4.Évad 54.Rész");
				d.setMessage("Meg akkarja tekinteni?");
				d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						acti.setClass(getApplicationContext(), PlayActivity.class);
						acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E054.mp4");
						acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E001.mp4");
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
		
		db55.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (rewardad != null) {
					           rewardad.show(Main3Activity.this, new OnUserEarnedRewardListener() {
						                @Override
						                public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
							
							                  d.setTitle("Dragon Ball Super 4.Évad 55.Rész");
							d.setMessage("Meg akkarja tekinteni?");
							d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									acti.setClass(getApplicationContext(), PlayActivity.class);
									acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E055.mp4");
									acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E001.mp4");
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
		
		db56.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d.setTitle("Dragon Ball Super 4.Évad 56.Rész");
				d.setMessage("Meg akkarja tekinteni?");
				d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						acti.setClass(getApplicationContext(), PlayActivity.class);
						acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E056.mp4");
						acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E001.mp4");
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
		
		db57.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (rewardad != null) {
					           rewardad.show(Main3Activity.this, new OnUserEarnedRewardListener() {
						                @Override
						                public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
							
							                  d.setTitle("Dragon Ball Super 4.Évad 57.Rész");
							d.setMessage("Meg akkarja tekinteni?");
							d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									acti.setClass(getApplicationContext(), PlayActivity.class);
									acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E057.mp4");
									acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E001.mp4");
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
		
		db58.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d.setTitle("Dragon Ball Super 4.Évad 58.Rész");
				d.setMessage("Meg akkarja tekinteni?");
				d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						acti.setClass(getApplicationContext(), PlayActivity.class);
						acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E058.mp4");
						acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E001.mp4");
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
		
		db59.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (rewardad != null) {
					           rewardad.show(Main3Activity.this, new OnUserEarnedRewardListener() {
						                @Override
						                public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
							
							                  d.setTitle("Dragon Ball Super 4.Évad 59.Rész");
							d.setMessage("Meg akkarja tekinteni?");
							d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									acti.setClass(getApplicationContext(), PlayActivity.class);
									acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E059.mp4");
									acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E001.mp4");
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
		
		db60.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d.setTitle("Dragon Ball Super 4.Évad 60.Rész");
				d.setMessage("Meg akkarja tekinteni?");
				d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						acti.setClass(getApplicationContext(), PlayActivity.class);
						acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E060.mp4");
						acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E001.mp4");
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
		
		db61.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (rewardad != null) {
					           rewardad.show(Main3Activity.this, new OnUserEarnedRewardListener() {
						                @Override
						                public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
							
							                  d.setTitle("Dragon Ball Super 4.Évad 61.Rész");
							d.setMessage("Meg akkarja tekinteni?");
							d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									acti.setClass(getApplicationContext(), PlayActivity.class);
									acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E061.mp4");
									acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E001.mp4");
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
		
		db62.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d.setTitle("Dragon Ball Super 4.Évad 62.Rész");
				d.setMessage("Meg akkarja tekinteni?");
				d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						acti.setClass(getApplicationContext(), PlayActivity.class);
						acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E062.mp4");
						acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E001.mp4");
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
		
		db63.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (rewardad != null) {
					           rewardad.show(Main3Activity.this, new OnUserEarnedRewardListener() {
						                @Override
						                public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
							
							                  d.setTitle("Dragon Ball Super 4.Évad 63.Rész");
							d.setMessage("Meg akkarja tekinteni?");
							d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									acti.setClass(getApplicationContext(), PlayActivity.class);
									acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E063.mp4");
									acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E001.mp4");
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
		
		db64.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d.setTitle("Dragon Ball Super 4.Évad 64.Rész");
				d.setMessage("Meg akkarja tekinteni?");
				d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						acti.setClass(getApplicationContext(), PlayActivity.class);
						acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E064.mp4");
						acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E001.mp4");
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
		
		db65.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (rewardad != null) {
					           rewardad.show(Main3Activity.this, new OnUserEarnedRewardListener() {
						                @Override
						                public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
							
							                  d.setTitle("Dragon Ball Super 4.Évad 65.Rész");
							d.setMessage("Meg akkarja tekinteni?");
							d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									acti.setClass(getApplicationContext(), PlayActivity.class);
									acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E065.mp4");
									acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E001.mp4");
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
		
		db66.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d.setTitle("Dragon Ball Super 4.Évad 66.Rész");
				d.setMessage("Meg akkarja tekinteni?");
				d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						acti.setClass(getApplicationContext(), PlayActivity.class);
						acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E066.mp4");
						acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E001.mp4");
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
		
		db67.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (rewardad != null) {
					           rewardad.show(Main3Activity.this, new OnUserEarnedRewardListener() {
						                @Override
						                public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
							
							                  d.setTitle("Dragon Ball Super 4.Évad 67.Rész");
							d.setMessage("Meg akkarja tekinteni?");
							d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									acti.setClass(getApplicationContext(), PlayActivity.class);
									acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E067.mp4");
									acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E001.mp4");
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
		
		db68.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d.setTitle("Dragon Ball Super 4.Évad 68.Rész");
				d.setMessage("Meg akkarja tekinteni?");
				d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						acti.setClass(getApplicationContext(), PlayActivity.class);
						acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E068.mp4");
						acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E001.mp4");
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
		
		db69.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (rewardad != null) {
					           rewardad.show(Main3Activity.this, new OnUserEarnedRewardListener() {
						                @Override
						                public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
							
							                  d.setTitle("Dragon Ball Super 4.Évad 69.Rész");
							d.setMessage("Meg akkarja tekinteni?");
							d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									acti.setClass(getApplicationContext(), PlayActivity.class);
									acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E069.mp4");
									acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E001.mp4");
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
		
		db70.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d.setTitle("Dragon Ball Super 4.Évad 70.Rész");
				d.setMessage("Meg akkarja tekinteni?");
				d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						acti.setClass(getApplicationContext(), PlayActivity.class);
						acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E070.mp4");
						acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E001.mp4");
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
		
		db71.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (rewardad != null) {
					           rewardad.show(Main3Activity.this, new OnUserEarnedRewardListener() {
						                @Override
						                public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
							
							                  d.setTitle("Dragon Ball Super 4.Évad 71.Rész");
							d.setMessage("Meg akkarja tekinteni?");
							d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									acti.setClass(getApplicationContext(), PlayActivity.class);
									acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E071.mp4");
									acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E001.mp4");
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
		
		db72.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d.setTitle("Dragon Ball Super 4.Évad 72.Rész");
				d.setMessage("Meg akkarja tekinteni?");
				d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						acti.setClass(getApplicationContext(), PlayActivity.class);
						acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E072.mp4");
						acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E001.mp4");
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
		
		db73.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (rewardad != null) {
					           rewardad.show(Main3Activity.this, new OnUserEarnedRewardListener() {
						                @Override
						                public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
							
							                  d.setTitle("Dragon Ball Super 4.Évad 73.Rész");
							d.setMessage("Meg akkarja tekinteni?");
							d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									acti.setClass(getApplicationContext(), PlayActivity.class);
									acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E073.mp4");
									acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E001.mp4");
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
		
		db74.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d.setTitle("Dragon Ball Super 4.Évad 74.Rész");
				d.setMessage("Meg akkarja tekinteni?");
				d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						acti.setClass(getApplicationContext(), PlayActivity.class);
						acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E074.mp4");
						acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E001.mp4");
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
		
		db75.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (rewardad != null) {
					           rewardad.show(Main3Activity.this, new OnUserEarnedRewardListener() {
						                @Override
						                public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
							
							                  d.setTitle("Dragon Ball Super 4.Évad 75.Rész");
							d.setMessage("Meg akkarja tekinteni?");
							d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									acti.setClass(getApplicationContext(), PlayActivity.class);
									acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E075.mp4");
									acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E001.mp4");
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
		
		db76.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d.setTitle("Dragon Ball Super 4.Évad 76.Rész");
				d.setMessage("Meg akkarja tekinteni?");
				d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						acti.setClass(getApplicationContext(), PlayActivity.class);
						acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E076.mp4");
						acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E001.mp4");
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
		
		AdLoader.Builder builder = new AdLoader.Builder(Main3Activity.this, "ca-app-pub-9399905616386219/6457716380");
		
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
		
		        RewardedAd.load(Main3Activity.this, "ca-app-pub-9399905616386219/1829002391",
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
		    
		AdView adView1 = new AdView(Main3Activity.this);
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
		
		        RewardedAd.load(Main3Activity.this, "ca-app-pub-9399905616386219/1829002391",
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
