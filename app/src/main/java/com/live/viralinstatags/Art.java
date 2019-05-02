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
import com.live.viralinstatags.Artu.Artgeneralu;
import com.live.viralinstatags.Artu.Artistu;
import com.live.viralinstatags.Artu.Camerau;
import com.live.viralinstatags.Artu.Classicalu;
import com.live.viralinstatags.Artu.Cretiveu;
import com.live.viralinstatags.Artu.Designloversu;
import com.live.viralinstatags.Artu.Designu;
import com.live.viralinstatags.Artu.Fashionu;
import com.live.viralinstatags.Artu.Memesu;
import com.live.viralinstatags.Artu.Styleu;
import com.live.viralinstatags.Artu.Tattosartu;
import com.live.viralinstatags.Artu.Vectoru;

public class Art extends AppCompatActivity {

    private AdView mAdView;
    InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_art);

        // initialize the AdMob app
        MobileAds.initialize(this, getString(R.string.admob_app_id));
        mAdView = (AdView) findViewById(R.id.adView);

        AdRequest adRequest = new AdRequest.Builder()
                .build();
        mAdView.loadAd(adRequest);
    }

    public void Click(View view)
    {
        Intent i=new Intent(Art.this, Memesu.class);
        startActivity(i);

    }


    public void Click2(View view)
    {
        Intent i=new Intent(Art.this, Tattosartu.class);
        startActivity(i);

    }

    public void Click3(View view)
    {
        Intent i=new Intent(Art.this, Camerau.class);
        startActivity(i);

    }

    public void Click4(View view)
    {
        Intent i=new Intent(Art.this, Fashionu.class);
        startActivity(i);

    }

    public void Click5(View view)
    {
        Intent i=new Intent(Art.this, Styleu.class);
        startActivity(i);

    }

    public void Click6(View view)
    {
        Intent i=new Intent(Art.this, Designu.class);
        startActivity(i);

    }

    public void Click7(View view)
    {
        Intent i=new Intent(Art.this, Artistu.class);
        startActivity(i);

    }

    public void Click8(View view)
    {
        Intent i=new Intent(Art.this, Designloversu.class);
        startActivity(i);

    }

    public void Click9(View view)
    {
        Intent i=new Intent(Art.this, Cretiveu.class);
        startActivity(i);

    }

    public void Click10(View view)
    {
        Intent i=new Intent(Art.this, Classicalu.class);
        startActivity(i);

    }
    public void Click11(View view)
    {
        Intent i=new Intent(Art.this, Artgeneralu.class);
        startActivity(i);

    }

    public void Click12(View view)
    {
        Intent i=new Intent(Art.this,Vectoru.class);
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
