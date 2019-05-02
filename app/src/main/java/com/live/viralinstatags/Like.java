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
import com.live.viralinstatags.Likek.Commentk;
import com.live.viralinstatags.Likek.FSLCk;
import com.live.viralinstatags.Likek.Followk;
import com.live.viralinstatags.Likek.Likekk;
import com.live.viralinstatags.Likek.Shoutoutsk;

public class Like extends AppCompatActivity {

    private AdView mAdView;
    InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_like);
        // initialize the AdMob app
        MobileAds.initialize(this, getString(R.string.admob_app_id));
        mAdView = (AdView) findViewById(R.id.adView);

        AdRequest adRequest = new AdRequest.Builder()
                .build();
        mAdView.loadAd(adRequest);
    }

    public void Click(View view)
    {
        Intent i=new Intent(Like.this, Followk.class);
        startActivity(i);

    }


    public void Click2(View view)
    {
        Intent i=new Intent(Like.this, Shoutoutsk.class);
        startActivity(i);

    }

    public void Click3(View view)
    {
        Intent i=new Intent(Like.this, Commentk.class);
        startActivity(i);

    }

    public void Click4(View view)
    {
        Intent i=new Intent(Like.this, FSLCk.class);
        startActivity(i);

    }

    public void Click5(View view)
    {
        Intent i=new Intent(Like.this, Likekk.class);
        startActivity(i);

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
