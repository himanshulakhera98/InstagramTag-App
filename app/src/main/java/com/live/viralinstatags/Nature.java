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
import com.live.viralinstatags.Naturev.Amazingv;
import com.live.viralinstatags.Naturev.Beachv;
import com.live.viralinstatags.Naturev.Flowersv;
import com.live.viralinstatags.Naturev.Naturegeneralv;
import com.live.viralinstatags.Naturev.Natureshotv;
import com.live.viralinstatags.Naturev.Skyv;
import com.live.viralinstatags.Naturev.Sunrisev;
import com.live.viralinstatags.Naturev.Sunsetv;

public class Nature extends AppCompatActivity {

    private AdView mAdView;
    InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nature);

        // initialize the AdMob app
        MobileAds.initialize(this, getString(R.string.admob_app_id));
        mAdView = (AdView) findViewById(R.id.adView);

        AdRequest adRequest = new AdRequest.Builder()
                .build();
        mAdView.loadAd(adRequest);
    }


    public void Click(View view)
    {
        Intent i=new Intent(Nature.this, Naturegeneralv.class);
        startActivity(i);

    }


    public void Click2(View view)
    {
        Intent i=new Intent(Nature.this, Amazingv.class);
        startActivity(i);

    }

    public void Click3(View view)
    {
        Intent i=new Intent(Nature.this, Natureshotv.class);
        startActivity(i);

    }

    public void Click4(View view)
    {
        Intent i=new Intent(Nature.this, Skyv.class);
        startActivity(i);

    }

    public void Click5(View view)
    {
        Intent i=new Intent(Nature.this, Sunsetv.class);
        startActivity(i);

    }

    public void Click6(View view)
    {
        Intent i=new Intent(Nature.this, Beachv.class);
        startActivity(i);

    }

    public void Click7(View view)
    {
        Intent i=new Intent(Nature.this,Sunsetv.class);
        startActivity(i);

    }

    public void Click8(View view)
    {
        Intent i=new Intent(Nature.this, Sunrisev.class);
        startActivity(i);

    }

    public void Click9(View view)
    {
        Intent i=new Intent(Nature.this, Flowersv.class);
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
