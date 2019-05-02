package com.live.viralinstatags;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.live.viralinstatags.Ultimateh.Christmash;
import com.live.viralinstatags.Ultimateh.Gymh;
import com.live.viralinstatags.Ultimateh.Hashh;
import com.live.viralinstatags.Ultimateh.LOLh;
import com.live.viralinstatags.Ultimateh.Makeuph;
import com.live.viralinstatags.Ultimateh.Modelh;
import com.live.viralinstatags.Ultimateh.Nighth;
import com.live.viralinstatags.Ultimateh.Pinkh;
import com.live.viralinstatags.Ultimateh.Preetyh;
import com.live.viralinstatags.Ultimateh.Swagh;
import com.live.viralinstatags.Ultimateh.Weddingh;
import com.live.viralinstatags.Ultimateh.ootdh;

public class Ultimate extends AppCompatActivity {

    private AdView mAdView;
    InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ultimate);

        // initialize the AdMob app
        MobileAds.initialize(this, getString(R.string.admob_app_id));
        mAdView = (AdView) findViewById(R.id.adView);

        AdRequest adRequest = new AdRequest.Builder()
                .build();
        mAdView.loadAd(adRequest);
    }

    public void Click(View view)
    {
        Intent i=new Intent(Ultimate.this, ootdh.class);
        startActivity(i);

    }




    public void Click2(View view)
    {
        Intent i=new Intent(Ultimate.this, Makeuph.class);
        startActivity(i);

    }


    public void Click3(View view)
    {
        Intent i=new Intent(Ultimate.this, Preetyh.class);
        startActivity(i);

    }


    public void Click4(View view)
    {
        Intent i=new Intent(Ultimate.this, Swagh.class);
        startActivity(i);

    }

    public void Click5(View view)
    {
        Intent i=new Intent(Ultimate.this, Modelh.class);
        startActivity(i);

    }

    public void Click6(View view)
    {
        Intent i=new Intent(Ultimate.this, Nighth.class);
        startActivity(i);

    }

    public void Click7(View view)
    {
        Intent i=new Intent(Ultimate.this, Weddingh.class);
        startActivity(i);

    }

    public void Click8(View view)
    {
        Intent i=new Intent(Ultimate.this, Pinkh.class);
        startActivity(i);

    }

    public void Click9(View view)
    {
        Intent i=new Intent(Ultimate.this, Christmash.class);
        startActivity(i);

    }

    public void Click10(View view)
    {
        Intent i=new Intent(Ultimate.this, LOLh.class);
        startActivity(i);

    }
    public void Click11(View view)
    {
        Intent i=new Intent(Ultimate.this, Gymh.class);
        startActivity(i);

    }

    public void Click12(View view)
    {
        Intent i=new Intent(Ultimate.this, Hashh.class);
        startActivity(i);

    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        InterstialAd();
    }

    public void InterstialAd(){

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId(getString(R.string.interstitialAd));

        AdRequest adRequest = new AdRequest.Builder()
                .build();
        // Load ads into Interstitial Ads
        mInterstitialAd.loadAd(adRequest);

        mInterstitialAd.setAdListener(new AdListener() {
            public void onAdLoaded() {
                showInterstitial();
            }
        });
    }

    private void showInterstitial() {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        }
    }


}
