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
import com.live.viralinstatags.Celebrationf.Celebratef;
import com.live.viralinstatags.Celebrationf.Celebrationfirstf;
import com.live.viralinstatags.Celebrationf.Creepyf;
import com.live.viralinstatags.Celebrationf.Instapartyf;
import com.live.viralinstatags.Celebrationf.Musicf;
import com.live.viralinstatags.Celebrationf.Nighttimef;
import com.live.viralinstatags.Celebrationf.Partyf;
import com.live.viralinstatags.Celebrationf.Partytimef;
import com.live.viralinstatags.Celebrationf.Scaryf;
import com.live.viralinstatags.Celebrationf.Sweetf;

public class Celebration extends AppCompatActivity {

    private AdView mAdView;
    InterstitialAd mInterstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celebration);

        // initialize the AdMob app
        MobileAds.initialize(this, getString(R.string.admob_app_id));
        mAdView = (AdView) findViewById(R.id.adView);

        AdRequest adRequest = new AdRequest.Builder()
                .build();
        mAdView.loadAd(adRequest);
    }



    public void Click(View view)
    {
        Intent i=new Intent(Celebration.this, Celebrationfirstf.class);
        startActivity(i);

    }


    public void Click2(View view)
    {
        Intent i=new Intent(Celebration.this, Nighttimef.class);
        startActivity(i);

    }

    public void Click3(View view)
    {
        Intent i=new Intent(Celebration.this,Instapartyf.class);
        startActivity(i);

    }

    public void Click4(View view)
    {
        Intent i=new Intent(Celebration.this, Partytimef.class);
        startActivity(i);

    }

    public void Click5(View view)
    {
        Intent i=new Intent(Celebration.this, Celebratef.class);
        startActivity(i);

    }

    public void Click6(View view)
    {
        Intent i=new Intent(Celebration.this, Creepyf.class);
        startActivity(i);

    }

    public void Click7(View view)
    {
        Intent i=new Intent(Celebration.this, Scaryf.class);
        startActivity(i);

    }

    public void Click8(View view)
    {
        Intent i=new Intent(Celebration.this, Musicf.class);
        startActivity(i);

    }

    public void Click9(View view)
    {
        Intent i=new Intent(Celebration.this, Partyf.class);
        startActivity(i);

    }

    public void Click10(View view)
    {
        Intent i=new Intent(Celebration.this, Sweetf.class);
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
