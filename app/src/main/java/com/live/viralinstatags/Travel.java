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
import com.live.viralinstatags.Travelq.Adventureq;
import com.live.viralinstatags.Travelq.Amazingq;
import com.live.viralinstatags.Travelq.Destinationq;
import com.live.viralinstatags.Travelq.Fantasticq;
import com.live.viralinstatags.Travelq.Happyq;
import com.live.viralinstatags.Travelq.Motocyclesq;
import com.live.viralinstatags.Travelq.Salouq;
import com.live.viralinstatags.Travelq.Travelfirstq;
import com.live.viralinstatags.Travelq.Travellingq;
import com.live.viralinstatags.Travelq.Tripq;
import com.live.viralinstatags.Travelq.Vectionq;

public class Travel extends AppCompatActivity {

    private AdView mAdView;
    InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel);

        // initialize the AdMob app
        MobileAds.initialize(this, getString(R.string.admob_app_id));
        mAdView = (AdView) findViewById(R.id.adView);

        AdRequest adRequest = new AdRequest.Builder()
                .build();
        mAdView.loadAd(adRequest);
    }


    public void Click(View view)
    {
        Intent i=new Intent(Travel.this, Travelfirstq.class);
        startActivity(i);

    }


    public void Click2(View view)
    {
        Intent i=new Intent(Travel.this, Motocyclesq.class);
        startActivity(i);

    }

    public void Click3(View view)
    {
        Intent i=new Intent(Travel.this, Fantasticq.class);
        startActivity(i);

    }

    public void Click4(View view)
    {
        Intent i=new Intent(Travel.this, Adventureq.class);
        startActivity(i);

    }

    public void Click5(View view)
    {
        Intent i=new Intent(Travel.this, Amazingq.class);
        startActivity(i);

    }

    public void Click6(View view)
    {
        Intent i=new Intent(Travel.this, Vectionq.class);
        startActivity(i);

    }

    public void Click7(View view)
    {
        Intent i=new Intent(Travel.this, Destinationq.class);
        startActivity(i);

    }

    public void Click8(View view)
    {
        Intent i=new Intent(Travel.this,Travellingq.class);
        startActivity(i);

    }

    public void Click9(View view)
    {
        Intent i=new Intent(Travel.this, Tripq.class);
        startActivity(i);

    }

    public void Click10(View view)
    {
        Intent i=new Intent(Travel.this, Salouq.class);
        startActivity(i);

    }
    public void Click11(View view)
    {
        Intent i=new Intent(Travel.this, Happyq.class);
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
