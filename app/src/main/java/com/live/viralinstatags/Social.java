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
import com.live.viralinstatags.Socials.Friendss;
import com.live.viralinstatags.Socials.Girlss;
import com.live.viralinstatags.Socials.Goodmornnings;
import com.live.viralinstatags.Socials.Goodnights;
import com.live.viralinstatags.Socials.Guyss;
import com.live.viralinstatags.Socials.Loves;
import com.live.viralinstatags.Socials.Selfiess;
import com.live.viralinstatags.Socials.Socialgenerals;

public class Social extends AppCompatActivity {

    private AdView mAdView;
    InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social);

        // initialize the AdMob app
        MobileAds.initialize(this, getString(R.string.admob_app_id));
        mAdView = (AdView) findViewById(R.id.adView);

        AdRequest adRequest = new AdRequest.Builder()
                .build();
        mAdView.loadAd(adRequest);
    }


    public void Click(View view)
    {
        Intent i=new Intent(Social.this, Selfiess.class);
        startActivity(i);

    }

    public void Click2(View view)
    {
        Intent i=new Intent(Social.this, Socialgenerals.class);
        startActivity(i);

    }


    public void Click3(View view)
    {
        Intent i=new Intent(Social.this,Girlss.class);
        startActivity(i);

    }

    public void Click4(View view)
    {
        Intent i=new Intent(Social.this, Guyss.class);
        startActivity(i);

    }

    public void Click5(View view)
    {
        Intent i=new Intent(Social.this, Loves.class);
        startActivity(i);

    }

    public void Click6(View view)
    {
        Intent i=new Intent(Social.this, Friendss.class);
        startActivity(i);

    }

    public void Click7(View view)
    {
        Intent i=new Intent(Social.this, Goodmornnings.class);
        startActivity(i);

    }

    public void Click8(View view)
    {
        Intent i=new Intent(Social.this, Goodnights.class);
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
