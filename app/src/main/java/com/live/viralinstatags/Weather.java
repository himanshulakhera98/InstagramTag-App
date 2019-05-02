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
import com.live.viralinstatags.Weatherw.Blueskyw;
import com.live.viralinstatags.Weatherw.Cloudyw;
import com.live.viralinstatags.Weatherw.Coldw;
import com.live.viralinstatags.Weatherw.Fallw;
import com.live.viralinstatags.Weatherw.Icew;
import com.live.viralinstatags.Weatherw.Rainingw;
import com.live.viralinstatags.Weatherw.Springw;
import com.live.viralinstatags.Weatherw.Summerw;
import com.live.viralinstatags.Weatherw.Sunnyw;
import com.live.viralinstatags.Weatherw.Winterw;

public class Weather extends AppCompatActivity {

    private AdView mAdView;
    InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        // initialize the AdMob app
        MobileAds.initialize(this, getString(R.string.admob_app_id));
        mAdView = (AdView) findViewById(R.id.adView);

        AdRequest adRequest = new AdRequest.Builder()
                .build();
        mAdView.loadAd(adRequest);
    }


    public void Click(View view)
    {
        Intent i=new Intent(Weather.this, Coldw.class);
        startActivity(i);

    }


    public void Click2(View view)
    {
        Intent i=new Intent(Weather.this, Winterw.class);
        startActivity(i);

    }

    public void Click3(View view)
    {
        Intent i=new Intent(Weather.this, Blueskyw.class);
        startActivity(i);

    }

    public void Click4(View view)
    {
        Intent i=new Intent(Weather.this, Icew.class);
        startActivity(i);

    }

    public void Click5(View view)
    {
        Intent i=new Intent(Weather.this, Sunnyw.class);
        startActivity(i);

    }

    public void Click6(View view)
    {
        Intent i=new Intent(Weather.this, Summerw.class);
        startActivity(i);

    }

    public void Click7(View view)
    {
        Intent i=new Intent(Weather.this, Fallw.class);
        startActivity(i);

    }

    public void Click8(View view)
    {
        Intent i=new Intent(Weather.this, Cloudyw.class);
        startActivity(i);

    }

    public void Click9(View view)
    {
        Intent i=new Intent(Weather.this, Rainingw.class);
        startActivity(i);

    }

    public void Click10(View view)
    {
        Intent i=new Intent(Weather.this, Springw.class);
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
