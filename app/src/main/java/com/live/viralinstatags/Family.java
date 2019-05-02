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
import com.live.viralinstatags.Familyt.Beautifult;
import com.live.viralinstatags.Familyt.Childt;
import com.live.viralinstatags.Familyt.Familyfunt;
import com.live.viralinstatags.Familyt.Fathert;
import com.live.viralinstatags.Familyt.Momt;
import com.live.viralinstatags.Familyt.Parenthoodt;
import com.live.viralinstatags.Familyt.Prilagat;
import com.live.viralinstatags.Familyt.Relativest;
import com.live.viralinstatags.Familyt.Sistert;
import com.live.viralinstatags.Familyt.Smilet;

public class Family extends AppCompatActivity {
    private AdView mAdView;
    InterstitialAd mInterstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        // initialize the AdMob app
        MobileAds.initialize(this, getString(R.string.admob_app_id));
        mAdView = (AdView) findViewById(R.id.adView);

        AdRequest adRequest = new AdRequest.Builder()
                .build();
        mAdView.loadAd(adRequest);
    }


    public void Click(View view)
    {
        Intent i=new Intent(Family.this, Beautifult.class);
        startActivity(i);

    }


    public void Click2(View view)
    {
        Intent i=new Intent(Family.this, Sistert.class);
        startActivity(i);

    }

    public void Click3(View view)
    {
        Intent i=new Intent(Family.this, Familyfunt.class);
        startActivity(i);

    }

    public void Click4(View view)
    {
        Intent i=new Intent(Family.this, Prilagat.class);
        startActivity(i);

    }

    public void Click5(View view)
    {
        Intent i=new Intent(Family.this, Relativest.class);
        startActivity(i);

    }

    public void Click6(View view)
    {
        Intent i=new Intent(Family.this, Smilet.class);
        startActivity(i);

    }

    public void Click7(View view)
    {
        Intent i=new Intent(Family.this, Parenthoodt.class);
        startActivity(i);

    }

    public void Click8(View view)
    {
        Intent i=new Intent(Family.this, Childt.class);
        startActivity(i);

    }

    public void Click9(View view)
    {
        Intent i=new Intent(Family.this, Momt.class);
        startActivity(i);

    }

    public void Click10(View view)
    {
        Intent i=new Intent(Family.this, Fathert.class);
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
