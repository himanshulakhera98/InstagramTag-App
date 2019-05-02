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
import com.live.viralinstatags.Graphy.Abstractx;
import com.live.viralinstatags.Graphy.Blackx;
import com.live.viralinstatags.Graphy.Capturex;
import com.live.viralinstatags.Graphy.Coolx;
import com.live.viralinstatags.Graphy.Focusx;
import com.live.viralinstatags.Graphy.HDRx;
import com.live.viralinstatags.Graphy.Instaphotox;
import com.live.viralinstatags.Graphy.Likex;
import com.live.viralinstatags.Graphy.Naturex;
import com.live.viralinstatags.Graphy.PhotoArtx;
import com.live.viralinstatags.Graphy.Photox;
import com.live.viralinstatags.Graphy.analogx;
import com.live.viralinstatags.Graphy.macrox;
import com.live.viralinstatags.Graphy.picx;

public class Photography extends AppCompatActivity {

    private AdView mAdView;
    InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photography);
        // initialize the AdMob app
        MobileAds.initialize(this, getString(R.string.admob_app_id));
        mAdView = (AdView) findViewById(R.id.adView);

        AdRequest adRequest = new AdRequest.Builder()
                .build();
        mAdView.loadAd(adRequest);
    }

    public void Click(View view)
    {
        Intent i=new Intent(Photography.this, Photox.class);
        startActivity(i);

    }


    public void Click2(View view)
    {
        Intent i=new Intent(Photography.this, Capturex.class);
        startActivity(i);

    }

    public void Click3(View view)
    {
        Intent i=new Intent(Photography.this, Instaphotox.class);
        startActivity(i);

    }

    public void Click4(View view)
    {
        Intent i=new Intent(Photography.this, picx.class);
        startActivity(i);

    }

    public void Click5(View view)
    {
        Intent i=new Intent(Photography.this, Likex.class);
        startActivity(i);

    }

    public void Click6(View view)
    {
        Intent i=new Intent(Photography.this, Focusx.class);
        startActivity(i);

    }

    public void Click7(View view)
    {
        Intent i=new Intent(Photography.this, Coolx.class);
        startActivity(i);

    }

    public void Click8(View view)
    {
        Intent i=new Intent(Photography.this, macrox.class);
        startActivity(i);

    }

    public void Click9(View view)
    {
        Intent i=new Intent(Photography.this, Naturex.class);
        startActivity(i);

    }

    public void Click10(View view)
    {
        Intent i=new Intent(Photography.this,PhotoArtx.class);
        startActivity(i);

    }
    public void Click11(View view)
    {
        Intent i=new Intent(Photography.this, HDRx.class);
        startActivity(i);

    }

    public void Click12(View view)
    {
        Intent i=new Intent(Photography.this, analogx.class);
        startActivity(i);

    }
    public void Click13(View view)
    {
        Intent i=new Intent(Photography.this, Abstractx.class);
        startActivity(i);

    }


    public void Click14(View view)
    {
        Intent i=new Intent(Photography.this,Instaphotox.class);
        startActivity(i);

    }

    public void Click15(View view)
    {
        Intent i=new Intent(Photography.this, Blackx.class);
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
