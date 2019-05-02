package com.live.viralinstatags;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {


    private AdView mAdView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


         Button bt = (Button) findViewById(R.id.share);
        bt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent share = new Intent(Intent.ACTION_SEND);
                share.setType("text/plain");
                share.putExtra(Intent.EXTRA_SUBJECT, "My name");
                share.putExtra(Intent.EXTRA_TEXT, "Share this Application  https://play.google.com/store/apps/details?id="+ getApplicationContext().getPackageName());
                startActivity(Intent.createChooser(share, "Share this App"));


            }
        });

// initialize the AdMob app
        MobileAds.initialize(this, getString(R.string.admob_app_id));
        mAdView = (AdView) findViewById(R.id.adView);

        AdRequest adRequest = new AdRequest.Builder()
                .build();
        mAdView.loadAd(adRequest);

    }

    public void Click(View view)
    {
        Intent i=new Intent(MainActivity.this,Alltag.class);
        startActivity(i);

    }


    public void Click2(View view)
    {
        Intent i=new Intent(MainActivity.this,Photography.class);
        startActivity(i);

    }

    public void Click3(View view)
    {
        Intent i=new Intent(MainActivity.this,Food.class);
        startActivity(i);

    }

    public void Click4(View view)
    {
        Intent i=new Intent(MainActivity.this,Fashion.class);
        startActivity(i);

    }

    public void Click5(View view)
    {
        Intent i=new Intent(MainActivity.this,Like.class);
        startActivity(i);

    }

    public void Click6(View view)
    {
        Intent i=new Intent(MainActivity.this,Travel.class);
        startActivity(i);

    }

    public void Click7(View view)
    {
        Intent i=new Intent(MainActivity.this,Family.class);
        startActivity(i);

    }

    public void Click8(View view)
    {
        Intent i=new Intent(MainActivity.this,Weather.class);
        startActivity(i);

    }

    public void Click9(View view)
    {
        Intent i=new Intent(MainActivity.this,Nature.class);
        startActivity(i);

    }

    public void Click10(View view)
    {
        Intent i=new Intent(MainActivity.this,Celebration.class);
        startActivity(i);

    }
    public void Click11(View view)
    {
        Intent i=new Intent(MainActivity.this,Art.class);
        startActivity(i);

    }

    public void Click12(View view)
    {
        Intent i=new Intent(MainActivity.this,Ent.class);
        startActivity(i);

    }

    public void Click13(View view)
    {
        Intent i=new Intent(MainActivity.this,Social.class);
        startActivity(i);

    }
    public void Click14(View view)
    {
        Intent i=new Intent(MainActivity.this,Ultimate.class);
        startActivity(i);

    }

    public void Click15(View view)
    {
        Intent i=new Intent(MainActivity.this,Other.class);
        startActivity(i);

    }




    public void Click17(View view)
    {

        Intent browserIntent =new Intent(Intent.ACTION_VIEW);
        String URL = "https://play.google.com/store/apps/details?id="+ getApplicationContext().getPackageName();
        browserIntent.setData(Uri.parse(URL));
        startActivity(browserIntent);

    }

    @Override
    public void onPause() {
        if (mAdView != null) {
            mAdView.pause();
        }
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
        if (mAdView != null) {
            mAdView.resume();
        }
    }

    @Override
    public void onDestroy() {
        if (mAdView != null) {
            mAdView.destroy();
        }
        super.onDestroy();
    }

}
