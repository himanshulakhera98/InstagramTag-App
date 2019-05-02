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
import com.live.viralinstatags.Foodp.Dinnerp;
import com.live.viralinstatags.Foodp.Drinkp;
import com.live.viralinstatags.Foodp.Fastfoodp;
import com.live.viralinstatags.Foodp.Generalp;
import com.live.viralinstatags.Foodp.Healthyp;
import com.live.viralinstatags.Foodp.Teap;
import com.live.viralinstatags.Foodp.Vegetablesp;

public class Food extends AppCompatActivity {

    private AdView mAdView;
    InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        // initialize the AdMob app
        MobileAds.initialize(this, getString(R.string.admob_app_id));
        mAdView = (AdView) findViewById(R.id.adView);

        AdRequest adRequest = new AdRequest.Builder()
                .build();
        mAdView.loadAd(adRequest);
    }

    public void Click(View view)
    {
        Intent i=new Intent(Food.this, Teap.class);
        startActivity(i);

    }


    public void Click2(View view)
    {
        Intent i=new Intent(Food.this, Drinkp.class);
        startActivity(i);

    }

    public void Click3(View view)
    {
        Intent i=new Intent(Food.this, Fastfoodp.class);
        startActivity(i);

    }

    public void Click4(View view)
    {
        Intent i=new Intent(Food.this, Vegetablesp.class);
        startActivity(i);

    }

    public void Click5(View view)
    {
        Intent i=new Intent(Food.this, Healthyp.class);
        startActivity(i);

    }

    public void Click6(View view)
    {
        Intent i=new Intent(Food.this, Generalp.class);
        startActivity(i);

    }

    public void Click7(View view)
    {
        Intent i=new Intent(Food.this, Dinnerp.class);
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
