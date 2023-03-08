package hu.aidstudio.dragonball.beta.player;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

import android.widget.Toast;
import android.widget.VideoView;

import androidx.annotation.NonNull;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import hu.aidstudio.dragonball.beta.R;
import hu.aidstudio.dragonball.beta.menu.DbMainMenuActivity;
import hu.aidstudio.dragonball.beta.sk.SketchwareUtil;

public class PlayActivity extends Activity {

    private Timer _timer = new Timer();

    private String playingstatus = "";
    private String progress = "";
    private String fullscreen = "";
    private String valieee = "";
    private double oo9 = 0;
    private String ssssss = "";
    private String touching = "";
    private String k5 = "";
    private double nextt = 0;
    private double backk = 0;
    private String txt = "";
    private String txt1 = "";
    private String bk = "";
    RewardedAd rewardad;

    private LinearLayout linearmain;
    private LinearLayout secandarymain;
    private LinearLayout linear3;
    private LinearLayout linear1;
    private LinearLayout upword;
    private LinearLayout back;
    private LinearLayout linear17;
    private LinearLayout forwordddd;
    private LinearLayout linear12;
    private TextView love;
    private TextView cuple;
    private LinearLayout playbausbox;
    private LinearLayout linear4;
    private LinearLayout linear11;
    private ImageView imageview2;
    private LinearLayout linear13;
    private ImageView imageview3;
    private LinearLayout linear7;
    private LinearLayout linear9;
    private LinearLayout linear10;
    private ImageView backword;
    private ProgressBar progressbar1;
    private ImageView playpuse;
    private ImageView forword;
    private TextView compdur;
    private TextView textview1;
    private TextView totaldur;
    private SeekBar seekbar1;
    private ImageView imageview1;

    private TimerTask gj;
    private TimerTask eyg;
    private TimerTask pp9;
    private TimerTask sttim;
    private TimerTask kgx;
    private SharedPreferences dd;
    private SharedPreferences dt;
    private TimerTask f7;
    private Intent yyt = new Intent();
    private TimerTask adds;
    private AlertDialog.Builder d;

    @Override
    protected void onCreate(Bundle _savedInstanceState) {
        super.onCreate(_savedInstanceState);
        setContentView(R.layout.play);
        initialize(_savedInstanceState);
        MobileAds.initialize(this);
        initializeLogic();

    }

    private void initialize(Bundle _savedInstanceState) {
        linearmain = findViewById(R.id.linearmain);
        secandarymain = findViewById(R.id.secandarymain);
        linear3 = findViewById(R.id.linear3);
        linear1 = findViewById(R.id.linear1);
        upword = findViewById(R.id.upword);
        back = findViewById(R.id.back);
        linear17 = findViewById(R.id.linear17);
        forwordddd = findViewById(R.id.forwordddd);
        linear12 = findViewById(R.id.linear12);
        love = findViewById(R.id.love);
        cuple = findViewById(R.id.cuple);
        playbausbox = findViewById(R.id.playbausbox);
        linear4 = findViewById(R.id.linear4);
        linear11 = findViewById(R.id.linear11);
        imageview2 = findViewById(R.id.imageview2);
        linear13 = findViewById(R.id.linear13);
        imageview3 = findViewById(R.id.imageview3);
        linear7 = findViewById(R.id.linear7);
        linear9 = findViewById(R.id.linear9);
        linear10 = findViewById(R.id.linear10);
        backword = findViewById(R.id.backword);
        progressbar1 = findViewById(R.id.progressbar1);
        playpuse = findViewById(R.id.playpuse);
        forword = findViewById(R.id.forword);
        compdur = findViewById(R.id.compdur);
        textview1 = findViewById(R.id.textview1);
        totaldur = findViewById(R.id.totaldur);
        seekbar1 = findViewById(R.id.seekbar1);
        imageview1 = findViewById(R.id.imageview1);
        dd = getSharedPreferences("dd", Activity.MODE_PRIVATE);
        dt = getSharedPreferences("dt", Activity.MODE_PRIVATE);
        d = new AlertDialog.Builder(this);

        linear3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _view) {
                linear3.setVisibility(View.GONE);
                touching = "";
            }
        });

        linear1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _view) {
                linear3.setVisibility(View.VISIBLE);
                touching = "ON";
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _view) {
                if (bk.equals("")) {
                    bk = "ok";
                    f7 = new TimerTask() {
                        @Override
                        public void run() {
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    linear3.setVisibility(View.VISIBLE);
                                    bk = "";
                                }
                            });
                        }
                    };
                    _timer.schedule(f7, (int)(300));
                }
                else {
                    f7.cancel();
                    bk = "";
                    if (Double.parseDouble(love.getText().toString()) > 5000) {
                        vidview.seekTo((int)(vidview.getCurrentPosition() - 5000));
                        txt = "《-0.5";
                        SketchwareUtil.showMessage(getApplicationContext(), txt);
                        _finisg();
                    }
                }
            }
        });

        forwordddd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _view) {
                if (bk.equals("")) {
                    bk = "ok";
                    f7 = new TimerTask() {
                        @Override
                        public void run() {
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    linear3.setVisibility(View.VISIBLE);
                                    bk = "";
                                }
                            });
                        }
                    };
                    _timer.schedule(f7, (int)(300));
                }
                else {
                    f7.cancel();
                    bk = "";
                    if (Double.parseDouble(cuple.getText().toString()) > (Double.parseDouble(love.getText().toString()) + 10000)) {
                        vidview.seekTo((int)(vidview.getCurrentPosition() + 10000));
                        txt = "+ 0.10》";
                        SketchwareUtil.showMessage(getApplicationContext(), txt);
                        _finisg();
                    }
                }
            }
        });

        imageview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _view) {
                vidview.pause();
                playingstatus = "";

                if (rewardad != null) {
                    rewardad.show(PlayActivity.this, new OnUserEarnedRewardListener() {
                        @Override
                        public void onUserEarnedReward(@NonNull RewardItem rewardItem) {

                            d.setTitle("Letöltés");
                            d.setMessage("Biztos le akkarja tölteni?");
                            d.setPositiveButton("Letöltöm", new DialogInterface.OnClickListener() {
                               @Override
                                public void onClick(DialogInterface _dialog, int _which) {
                                 /* */
                                    yyt.setAction(Intent.ACTION_VIEW);
                                    yyt.setData(Uri.parse(getIntent().getStringExtra("url")));
                                    startActivity(yyt);


                                //   Toast.makeText(PlayActivity.this, "Letöltés még nem érhető el!", Toast.LENGTH_SHORT).show();
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

        backword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _view) {
                if (Double.parseDouble(love.getText().toString()) > 5000) {
                    vidview.seekTo((int)(vidview.getCurrentPosition() - 5000));
                    txt = "《-0.5";
                    SketchwareUtil.showMessage(getApplicationContext(), txt);
                    _finisg();
                }
            }
        });

        playpuse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _view) {
                if (vidview.isPlaying())
                {
                    vidview.pause();
                    playingstatus = "";
                    playpuse.setImageResource(R.drawable.playarrow);
                }
                else {

                    vidview.start();
                    playingstatus = "PLAY";
                    playpuse.setImageResource(R.drawable.pause);
                    _finisg();
                }
            }
        });

        forword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _view) {
                if (Double.parseDouble(cuple.getText().toString()) > (Double.parseDouble(love.getText().toString()) + 10000)) {
                    vidview.seekTo((int)(vidview.getCurrentPosition() + 10000));
                    txt = "+ 0.10》";
                    SketchwareUtil.showMessage(getApplicationContext(), txt);
                    _finisg();
                }
            }
        });

        seekbar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar _param1, int _param2, boolean _param3) {
                final int _progressValue = _param2;
                compdur.setText(String.valueOf((long)((_progressValue / 1000) / 60)).concat(":".concat(String.valueOf((long)((_progressValue / 1000) % 60)))));
                valieee = String.valueOf((long)(_progressValue));
            }

            @Override
            public void onStartTrackingTouch(SeekBar _param1) {
                progress = "stop";
            }

            @Override
            public void onStopTrackingTouch(SeekBar _param2) {
                vidview.seekTo((int)(seekbar1.getProgress()));
                progress = "";
                _finisg();
            }
        });

        imageview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _view) {
                _finisg();
                if (fullscreen.equals("")) {
                    imageview1.setImageResource(R.drawable.fsecist);
                    setRequestedOrientation(android.content.pm.ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
                    fullscreen = "ON";
                }
                else {
                    imageview1.setImageResource(R.drawable.switchfs);
                    setRequestedOrientation(android.content.pm.ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED);
                    fullscreen = "";
                }
            }
        });
    }

    private void initializeLogic() {

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);


        imageview3.setVisibility(View.INVISIBLE);
        _load_rewarded();
        seekbar1.getProgressDrawable().setColorFilter(Color.parseColor("#FFFFFF"), PorterDuff.Mode.SRC_IN);
        seekbar1.getThumb().setColorFilter(Color.parseColor("#FFFFFF"), PorterDuff.Mode.SRC_IN);
        _Videoplayer(getIntent().getStringExtra("url"));
        playpuse.setVisibility(View.GONE);
        _cupl();
        _loading();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        adds = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        vidview.pause();
                        playingstatus = "";
                        playpuse.setImageResource(R.drawable.playarrow);
                        if (rewardad != null) {
                            rewardad.show(PlayActivity.this, new OnUserEarnedRewardListener() {
                                @Override
                                public void onUserEarnedReward(@NonNull RewardItem rewardItem) {

                                //    vidview.start();
                                }
                            });

                        }
                    }
                });
            }
        };
        _timer.schedule(adds, (int)(600000));
    }



    @Override
    public void onBackPressed() {
        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        finish();
    }


    @Override
    public void onResume() {

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);

        playingstatus = "";

        super.onResume();
        _load_rewarded();
    }
    public void _extra() {
    }
    VideoView vidview;
    MediaController mediaControls;
    {

    }


    public void _Videoplayer(final String _videourl) {
        //Need this block for internet connection

        vidview = new VideoView(this);
        vidview.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
        vidview.getDuration();

        //change linear1 with your linear view
        linear1.addView(vidview);

        mediaControls = new MediaController(this); mediaControls.setAnchorView(vidview);

        Uri vidUri = Uri.parse(_videourl);
        vidview.setVideoURI(vidUri);
        //Start video player
        vidview.start();
        playingstatus = "PLAY";
        playpuse.setImageResource(R.drawable.pause);
    }


    public void _cupl() {
        gj = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        cuple.setText(String.valueOf(vidview.getDuration()));
                        totaldur.setText(String.valueOf((long)((Double.parseDouble(cuple.getText().toString()) / 1000) / 60)).concat(":".concat(String.valueOf((long)((Double.parseDouble(cuple.getText().toString()) / 1000) % 60)))));
                        seekbar1.setMax((int)Double.parseDouble(cuple.getText().toString()));
                        love.setText(String.valueOf(vidview.getCurrentPosition()));
                        compdur.setText(String.valueOf((long)((Double.parseDouble(love.getText().toString()) / 1000) / 60)).concat(":".concat(String.valueOf((long)((Double.parseDouble(love.getText().toString()) / 1000) % 60)))));
                        if (progress.equals("")) {
                            seekbar1.setProgress((int)Double.parseDouble(love.getText().toString()));
                        }
                        if (totaldur.getText().toString().equals(compdur.getText().toString())) {

                        }
                        else {
                            dd.edit().putString(getIntent().getStringExtra("posi"), compdur.getText().toString().concat(" / ".concat(totaldur.getText().toString()))).apply();
                        }
                        if (SketchwareUtil.getDisplayHeightPixels(getApplicationContext()) > SketchwareUtil.getDisplayWidthPixels(getApplicationContext())) {
                            //normal size
                            imageview1.setImageResource(R.drawable.switchfs);
                            fullscreen = "";
                        }
                        else {
                            //fullscreen size
                            imageview1.setImageResource(R.drawable.fsecist);
                            fullscreen = "ON";
                        }
                    }
                });
            }
        };
        _timer.scheduleAtFixedRate(gj, (int)(0), (int)(5));
        _finishplay();
    }




    public void _loading() {
        gj = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        if (compdur.getText().toString().equals(totaldur.getText().toString())) {

                        }
                        else {
                            if (playingstatus.equals("")) {
                                oo9 = 0;
                                progressbar1.setVisibility(View.GONE);
                                playpuse.setVisibility(View.VISIBLE);
                            }
                            else {
                                ssssss = love.getText().toString();
                                eyg = new TimerTask() {
                                    @Override
                                    public void run() {
                                        runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {
                                                if (love.getText().toString().equals(ssssss)) {
                                                    oo9++;
                                                    playpuse.setVisibility(View.GONE);
                                                    progressbar1.setVisibility(View.VISIBLE);
                                                }
                                                else {
                                                    oo9 = 0;
                                                    progressbar1.setVisibility(View.GONE);
                                                    playpuse.setVisibility(View.VISIBLE);
                                                    sttim = new TimerTask() {
                                                        @Override
                                                        public void run() {
                                                            runOnUiThread(new Runnable() {
                                                                @Override
                                                                public void run() {
                                                                    if (k5.equals("")) {
                                                                        linear3.setVisibility(View.GONE);
                                                                        k5 = "ok";
                                                                    }
                                                                }
                                                            });
                                                        }
                                                    };
                                                    _timer.schedule(sttim, (int)(100));
                                                }
                                            }
                                        });
                                    }
                                };
                                _timer.schedule(eyg, (int)(5));
                            }
                        }
                    }
                });
            }
        };
        _timer.scheduleAtFixedRate(gj, (int)(0), (int)(55));
    }


    public void _finishplay() {

    }


    public void _finisg() {

    }


    public void _load_rewarded() {


        AdRequest rewardad_request = new AdRequest.Builder().build();

        RewardedAd.load(PlayActivity.this, "ca-app-pub-9399905616386219/1829002391",
                rewardad_request, new RewardedAdLoadCallback() {


                    @Override
                    public void onAdLoaded(@NonNull RewardedAd rewardedAd) {

                        rewardad = rewardedAd;


                    }
                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {

                        rewardad = null;




                    }


                });

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