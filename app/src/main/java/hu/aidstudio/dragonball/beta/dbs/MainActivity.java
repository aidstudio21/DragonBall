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
import java.util.TimerTask;

import hu.aidstudio.dragonball.beta.player.PlayActivity;
import hu.aidstudio.dragonball.beta.R;
import hu.aidstudio.dragonball.beta.sk.SketchwareUtil;


public class MainActivity extends Activity {

	private String language = "";

	RewardedAd rewardad;
	private LinearLayout banner;
	private FrameLayout nativead;


	
	private TimerTask t;
	private final Intent acti = new Intent();
	private AlertDialog.Builder d;

	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize();
		FirebaseApp.initializeApp(this);
		MobileAds.initialize(this);
		
		initializeLogic();
	}



	private void initialize() {

		banner = findViewById(R.id.banner);

		nativead = findViewById(R.id.nativead);

		Button db1 = findViewById(R.id.db1);
		Button db2 = findViewById(R.id.db2);
		Button db3 = findViewById(R.id.db3);
		Button db4 = findViewById(R.id.db4);
		Button db5 = findViewById(R.id.db5);
		Button db6 = findViewById(R.id.db6);
		Button db7 = findViewById(R.id.db7);
		Button db8 = findViewById(R.id.db8);
		Button db9 = findViewById(R.id.db9);
		Button db10 = findViewById(R.id.db10);
		Button db11 = findViewById(R.id.db11);
		Button db12 = findViewById(R.id.db12);
		Button db13 = findViewById(R.id.db13);
		Button db14 = findViewById(R.id.db14);
		Button db15 = findViewById(R.id.db15);
		Button db16 = findViewById(R.id.db16);
		Button db17 = findViewById(R.id.db17);
		Button db18 = findViewById(R.id.db18);
		d = new AlertDialog.Builder(this);

		db1.setOnClickListener(_view -> {
			d.setTitle(R.string.dbse1);
			d.setIcon(R.drawable.logo_small);
			d.setMessage(R.string.megakkarja);
			d.setPositiveButton(R.string.megnezem, (_dialog, _which) -> {
				if (language.equals("magyar")) {
					acti.setClass(getApplicationContext(), PlayActivity.class);
					acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E001.mp4");
					acti.putExtra("img", "https://www1566.ff-04.com/token=S6RhFsjRHGIDyLU_MpM8yg/1666576427/46.35.0.0/14/f/19/f5fb4f6c690ec14953721a6406f9319f-1080p.mp4");
					startActivity(acti);
				} else {
					if (language.equals("English")) {
						acti.setClass(getApplicationContext(), PlayActivity.class);
						acti.putExtra("url", "https://www1566.ff-04.com/token=S6RhFsjRHGIDyLU_MpM8yg/1666576427/46.35.0.0/14/f/19/f5fb4f6c690ec14953721a6406f9319f-1080p.mp4");
						acti.putExtra("img", "https://www1566.ff-04.com/token=S6RhFsjRHGIDyLU_MpM8yg/1666576427/46.35.0.0/14/f/19/f5fb4f6c690ec14953721a6406f9319f-1080p.mp4");
						startActivity(acti);
					} else {
						acti.setClass(getApplicationContext(), PlayActivity.class);
						acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/jp/Dragon_Ball_Super_E001.mp4");
						acti.putExtra("img", "https://www1566.ff-04.com/token=S6RhFsjRHGIDyLU_MpM8yg/1666576427/46.35.0.0/14/f/19/f5fb4f6c690ec14953721a6406f9319f-1080p.mp4");
						startActivity(acti);
					}
				}});

			d.setNegativeButton(R.string.megsem, (_dialog, _which) -> {

			});
			d.create().show();
		});

		db2.setOnClickListener(_view -> {
			if (rewardad != null) {
				rewardad.show(MainActivity.this, rewardItem -> {
					d.setTitle(R.string.dbse1);
					d.setIcon(R.drawable.logo_small);
					d.setMessage(R.string.megakkarja);
					d.setPositiveButton(R.string.megnezem, (_dialog, _which) -> {
						if (language.equals("magyar")) {
							acti.setClass(getApplicationContext(), PlayActivity.class);
							acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E002.mp4");
							acti.putExtra("img", "https://www935.ff-02.com/token=6dTpUzJSL749q5QsWmG89Q/1666584272/46.35.0.0/14/5/85/db969a2cf459eb87089ff6ee03513855-1080p.mp4");
							startActivity(acti);
						} else {
							if (language.equals("English")) {
								acti.setClass(getApplicationContext(), PlayActivity.class);
								acti.putExtra("url", "https://www935.ff-02.com/token=6dTpUzJSL749q5QsWmG89Q/1666584272/46.35.0.0/14/5/85/db969a2cf459eb87089ff6ee03513855-1080p.mp4");
								acti.putExtra("img", "https://www935.ff-02.com/token=6dTpUzJSL749q5QsWmG89Q/1666584272/46.35.0.0/14/5/85/db969a2cf459eb87089ff6ee03513855-1080p.mp4");
								startActivity(acti);
							} else {
								acti.setClass(getApplicationContext(), PlayActivity.class);
								acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/jp/Dragon_Ball_Super_E002.mp4");
								acti.putExtra("img", "https://www935.ff-02.com/token=6dTpUzJSL749q5QsWmG89Q/1666584272/46.35.0.0/14/5/85/db969a2cf459eb87089ff6ee03513855-1080p.mp4");
								startActivity(acti);
							}
						}
					});

					d.setNegativeButton(R.string.megsem, (_dialog, _which) -> {

					});
					d.create().show();
				});
			}
		});

		db3.setOnClickListener(_view -> {
			d.setTitle("Dragon Ball Super 1.Évad 3.Rész");
			d.setMessage("Meg akkarja tekinteni?");
			d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
				if (language.equals("magyar")) {
					acti.setClass(getApplicationContext(), PlayActivity.class);
					acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E003.mp4");
					acti.putExtra("img", "https://www1566.ff-04.com/token=S6RhFsjRHGIDyLU_MpM8yg/1666576427/46.35.0.0/14/f/19/f5fb4f6c690ec14953721a6406f9319f-1080p.mp4");
					startActivity(acti);
				} else {
					if (language.equals("English")) {
						acti.setClass(getApplicationContext(), PlayActivity.class);
						acti.putExtra("url", "https://www1566.ff-04.com/token=S6RhFsjRHGIDyLU_MpM8yg/1666576427/46.35.0.0/14/f/19/f5fb4f6c690ec14953721a6406f9319f-1080p.mp4");
						acti.putExtra("img", "https://www1566.ff-04.com/token=S6RhFsjRHGIDyLU_MpM8yg/1666576427/46.35.0.0/14/f/19/f5fb4f6c690ec14953721a6406f9319f-1080p.mp4");
						startActivity(acti);
					} else {
						acti.setClass(getApplicationContext(), PlayActivity.class);
						acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/jp/Dragon_Ball_Super_E003.mp4");
						acti.putExtra("img", "https://www1566.ff-04.com/token=S6RhFsjRHGIDyLU_MpM8yg/1666576427/46.35.0.0/14/f/19/f5fb4f6c690ec14953721a6406f9319f-1080p.mp4");
						startActivity(acti);
					}
				}
			});
			d.setNegativeButton("Mégsem", (_dialog, _which) -> {

			});
			d.create().show();
		});

		db4.setOnClickListener(_view -> {
			if (rewardad != null) {
				rewardad.show(MainActivity.this, rewardItem -> {
					d.setTitle("Dragon Ball Super 1.Évad 4.Rész");
					d.setMessage("Meg akkarja tekinteni?");
					d.setPositiveButton("Megtekintem", (_dialog, _which) -> {
				   		acti.setClass(getApplicationContext(), PlayActivity.class);
				   		acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E004.mp4");
				   		acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E004.mp4");
				   		startActivity(acti);
			   		});
			   		d.setNegativeButton("Mégsem", (_dialog, _which) -> {

					});
			   d.create().show();
				});
			}
		});

		db5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d.setTitle("Dragon Ball Super 1.Évad 5.Rész");
				d.setMessage("Meg akkarja tekinteni?");
				d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						acti.setClass(getApplicationContext(), PlayActivity.class);
						acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E005.mp4");
						acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E005.mp4");
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

		db6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (rewardad != null) {
					           rewardad.show(MainActivity.this, new OnUserEarnedRewardListener() {
						                @Override
						                public void onUserEarnedReward(@NonNull RewardItem rewardItem) {

							                  d.setTitle("Dragon Ball Super 1.Évad 6.Rész");
							d.setMessage("Meg akkarja tekinteni?");
							d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									acti.setClass(getApplicationContext(), PlayActivity.class);
									acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E006.mp4");
									acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E006.mp4");
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
			}
		});

		db7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d.setTitle("Dragon Ball Super 1.Évad 7.Rész");
				d.setMessage("Meg akkarja tekinteni?");
				d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						acti.setClass(getApplicationContext(), PlayActivity.class);
						acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E007.mp4");
						acti.putExtra("img", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E007.mp4");
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

		db8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (rewardad != null) {
					           rewardad.show(MainActivity.this, new OnUserEarnedRewardListener() {
						                @Override
						                public void onUserEarnedReward(@NonNull RewardItem rewardItem) {

							                  d.setTitle("Dragon Ball Super 1.Évad 8.Rész");
							d.setMessage("Meg akkarja tekinteni?");
							d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									acti.setClass(getApplicationContext(), PlayActivity.class);
									acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E008.mp4");
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
			}
		});

		db9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d.setTitle("Dragon Ball Super 1.Évad 9.Rész");
				d.setMessage("Meg akkarja tekinteni?");
				d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						acti.setClass(getApplicationContext(), PlayActivity.class);
						acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E009.mp4");
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

		db10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (rewardad != null) {
					           rewardad.show(MainActivity.this, new OnUserEarnedRewardListener() {
						                @Override
						                public void onUserEarnedReward(@NonNull RewardItem rewardItem) {

							                  d.setTitle("Dragon Ball Super 1.Évad 10.Rész");
							d.setMessage("Meg akkarja tekinteni?");
							d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									acti.setClass(getApplicationContext(), PlayActivity.class);
									acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E010.mp4");
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
			}
		});

		db11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d.setTitle("Dragon Ball Super 1.Évad 11.Rész");
				d.setMessage("Meg akkarja tekinteni?");
				d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						acti.setClass(getApplicationContext(), PlayActivity.class);
						acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E011.mp4");
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

		db12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (rewardad != null) {
					           rewardad.show(MainActivity.this, new OnUserEarnedRewardListener() {
						                @Override
						                public void onUserEarnedReward(@NonNull RewardItem rewardItem) {

							                  d.setTitle("Dragon Ball Super 1.Évad 12.Rész");
							d.setMessage("Meg akkarja tekinteni?");
							d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									acti.setClass(getApplicationContext(), PlayActivity.class);
									acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E012.mp4");
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
			}
		});

		db13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d.setTitle("Dragon Ball Super 1.Évad 13.Rész");
				d.setMessage("Meg akkarja tekinteni?");
				d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						acti.setClass(getApplicationContext(), PlayActivity.class);
						acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E013.mp4");
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

		db14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (rewardad != null) {
					           rewardad.show(MainActivity.this, new OnUserEarnedRewardListener() {
						                @Override
						                public void onUserEarnedReward(@NonNull RewardItem rewardItem) {

							                  d.setTitle("Dragon Ball Super 1.Évad 14.Rész");
							d.setMessage("Meg akkarja tekinteni?");
							d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									acti.setClass(getApplicationContext(), PlayActivity.class);
									acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E014.mp4");
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
			}
		});

		db15.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d.setTitle("Dragon Ball Super 1.Évad 15.Rész");
				d.setMessage("Meg akkarja tekinteni?");
				d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						acti.setClass(getApplicationContext(), PlayActivity.class);
						acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E015.mp4");
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

		db16.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (rewardad != null) {
					           rewardad.show(MainActivity.this, new OnUserEarnedRewardListener() {
						                @Override
						                public void onUserEarnedReward(@NonNull RewardItem rewardItem) {

							                  d.setTitle("Dragon Ball Super 1.Évad 16.Rész");
							d.setMessage("Meg akkarja tekinteni?");
							d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									acti.setClass(getApplicationContext(), PlayActivity.class);
									acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E016.mp4");
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
			}
		});

		db17.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d.setTitle("Dragon Ball Super 1.Évad 17.Rész");
				d.setMessage("Meg akkarja tekinteni?");
				d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						acti.setClass(getApplicationContext(), PlayActivity.class);
						acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E017.mp4");
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

		db18.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (rewardad != null) {
					           rewardad.show(MainActivity.this, new OnUserEarnedRewardListener() {
						                @Override
						                public void onUserEarnedReward(@NonNull RewardItem rewardItem) {

							                  d.setTitle("Dragon Ball Super 1.Évad 18.Rész");
							d.setMessage("Meg akkarja tekinteni?");
							d.setPositiveButton("Megtekintem", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									acti.setClass(getApplicationContext(), PlayActivity.class);
									acti.putExtra("url", "https://watch.dragonballhungary.hu/online/dbs/hu/Dragon_Ball_Super_E018.mp4");
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
			}
		});
	}

	private void initializeLogic() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) { Window w = getWindow();  w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS); };
		
		AdView adView1 = new AdView(MainActivity.this);
		adView1.setAdSize(AdSize.BANNER);
		adView1.setAdUnitId("ca-app-pub-9399905616386219/3692748408");
		AdRequest adRequest = new AdRequest.Builder().build();
		adView1.loadAd(adRequest);
		LinearLayout.LayoutParams layoutparams = new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
		banner.addView(adView1,layoutparams);
		AdLoader.Builder builder = new AdLoader.Builder(MainActivity.this, "ca-app-pub-9399905616386219/6457716380");
		
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
				
				
				               nativead.removeAllViews();
				                nativead.addView(adView);
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
		
		        RewardedAd.load(MainActivity.this, "ca-app-pub-9399905616386219/1829002391",
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
		    
		/*next update*/
		/*
d = new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_DARK);
*/
	}
	
	
	@Override
	public void onBackPressed() {
		finish();
	}
	
	@Override
	public void onResume() {
		super.onResume();
		
		
		        AdRequest rewardad_request = new AdRequest.Builder().build();
		
		        RewardedAd.load(MainActivity.this, "ca-app-pub-9399905616386219/1829002391",
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
