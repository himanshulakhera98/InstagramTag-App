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
import com.live.viralinstatags.Otherj.GoodLivingj;
import com.live.viralinstatags.Otherj.HDRj;
import com.live.viralinstatags.Otherj.IHDRj;
import com.live.viralinstatags.Otherj.Instagoodj;
import com.live.viralinstatags.Otherj.Macroj;
import com.live.viralinstatags.Otherj.Shopingj;
import com.live.viralinstatags.Otherj.VeryCoolj;
import com.live.viralinstatags.Otherj.mej;
import com.live.viralinstatags.Otherj.repostj;
import com.live.viralinstatags.Otherj.slrj;
import com.live.viralinstatags.Otherj.tbtj;

public class Other extends AppCompatActivity {

    private AdView mAdView;
    InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        // initialize the AdMob app
        MobileAds.initialize(this, getString(R.string.admob_app_id));
        mAdView = (AdView) findViewById(R.id.adView);

        AdRequest adRequest = new AdRequest.Builder()
                .build();
        mAdView.loadAd(adRequest);
    }


    public void Click(View view)
    {
        Intent i=new Intent(Other.this, Instagoodj.class);
        startActivity(i);

    }


    public void Click2(View view)
    {
        Intent i=new Intent(Other.this, tbtj.class);
        startActivity(i);

    }

    public void Click3(View view)
    {
        Intent i=new Intent(Other.this, mej.class);
        startActivity(i);

    }

    public void Click4(View view)
    {
        Intent i=new Intent(Other.this, repostj.class);
        startActivity(i);

    }

    public void Click5(View view)
    {
        Intent i=new Intent(Other.this, GoodLivingj.class);
        startActivity(i);

    }

    public void Click6(View view)
    {
        Intent i=new Intent(Other.this, Shopingj.class);
        startActivity(i);

    }

    public void Click7(View view)
    {
        Intent i=new Intent(Other.this, VeryCoolj.class);
        startActivity(i);

    }

    public void Click8(View view)
    {
        Intent i=new Intent(Other.this, Macroj.class);
        startActivity(i);

    }

    public void Click9(View view)
    {
        Intent i=new Intent(Other.this, slrj.class);
        startActivity(i);

    }

    public void Click10(View view)
    {
        Intent i=new Intent(Other.this, HDRj.class);
        startActivity(i);

    }
    public void Click11(View view)
    {
        Intent i=new Intent(Other.this, IHDRj.class);
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
