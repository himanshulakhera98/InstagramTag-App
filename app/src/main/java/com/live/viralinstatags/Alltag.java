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
import com.live.viralinstatags.All.Beach;
import com.live.viralinstatags.All.Fall;
import com.live.viralinstatags.All.Flowers;
import com.live.viralinstatags.All.Friends;
import com.live.viralinstatags.All.Girls;
import com.live.viralinstatags.All.Gm;
import com.live.viralinstatags.All.Instagram;
import com.live.viralinstatags.All.Justin;
import com.live.viralinstatags.All.Love;
import com.live.viralinstatags.All.MostPopular;
import com.live.viralinstatags.All.Popular;
import com.live.viralinstatags.All.Raining;
import com.live.viralinstatags.All.Selfies;
import com.live.viralinstatags.All.Snowing;
import com.live.viralinstatags.All.Summer;
import com.live.viralinstatags.All.Winter;

public class Alltag extends AppCompatActivity {

    private AdView mAdView;
    InterstitialAd mInterstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alltag);

        // initialize the AdMob app
        MobileAds.initialize(this, getString(R.string.admob_app_id));
        mAdView = (AdView) findViewById(R.id.adView);

        AdRequest adRequest = new AdRequest.Builder()
                .build();
        mAdView.loadAd(adRequest);

    }


    public void Click(View view)
    {
        Intent i=new Intent(Alltag.this, MostPopular.class);
        startActivity(i);

    }


    public void Clicka(View view)
    {
        Intent i=new Intent(Alltag.this,Popular.class);
        startActivity(i);

    }

    public void Clickc(View view)
    {
        Intent i=new Intent(Alltag.this, Beach.class);
        startActivity(i);

    }

    public void Click4(View view)
    {
        Intent i=new Intent(Alltag.this, Flowers.class);
        startActivity(i);

    }

    public void Click5(View view)
    {
        Intent i=new Intent(Alltag.this, Raining.class);
        startActivity(i);

    }

    public void Click6(View view)
    {
        Intent i=new Intent(Alltag.this, Snowing.class);
        startActivity(i);

    }

    public void Click7(View view)
    {
        Intent i=new Intent(Alltag.this, Summer.class);
        startActivity(i);

    }

    public void Click8(View view)
    {
        Intent i=new Intent(Alltag.this, Fall.class);
        startActivity(i);

    }

    public void Click9(View view)
    {
        Intent i=new Intent(Alltag.this, Winter.class);
        startActivity(i);

    }

    public void Click10(View view)
    {
        Intent i=new Intent(Alltag.this, Selfies.class);
        startActivity(i);

    }
    public void Click11(View view)
    {
        Intent i=new Intent(Alltag.this, Girls.class);
        startActivity(i);

    }

    public void Click12(View view)
    {
        Intent i=new Intent(Alltag.this, Love.class);
        startActivity(i);

    }
    public void Click13(View view)
    {
        Intent i=new Intent(Alltag.this, Friends.class);
        startActivity(i);

    }


    public void Click14(View view)
    {
        Intent i=new Intent(Alltag.this, Gm.class);
        startActivity(i);

    }

    public void Click15(View view)
    {
        Intent i=new Intent(Alltag.this, Justin.class);
        startActivity(i);

    }

    public void Click16(View view)
    {
        Intent i=new Intent(Alltag.this, Instagram.class);
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
