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
import com.live.viralinstatags.Fashionz.Bestz;
import com.live.viralinstatags.Fashionz.Coolz;
import com.live.viralinstatags.Fashionz.Earringsz;
import com.live.viralinstatags.Fashionz.Eyesz;
import com.live.viralinstatags.Fashionz.FashionGirlz;
import com.live.viralinstatags.Fashionz.Fashionboyz;
import com.live.viralinstatags.Fashionz.Hairz;
import com.live.viralinstatags.Fashionz.Highz;
import com.live.viralinstatags.Fashionz.Makeupz;
import com.live.viralinstatags.Fashionz.Modelz;
import com.live.viralinstatags.Fashionz.Purseloverz;
import com.live.viralinstatags.Fashionz.Shopingz;
import com.live.viralinstatags.Fashionz.Stylishz;
import com.live.viralinstatags.Fashionz.Swaggz;
import com.live.viralinstatags.Fashionz.Tattoosz;
import com.live.viralinstatags.Fashionz.Ultimatez;

public class Fashion extends AppCompatActivity {

    private AdView mAdView;
    InterstitialAd mInterstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fashion);

        // initialize the AdMob app
        MobileAds.initialize(this, getString(R.string.admob_app_id));
        mAdView = (AdView) findViewById(R.id.adView);

        AdRequest adRequest = new AdRequest.Builder()
                .build();
        mAdView.loadAd(adRequest);
    }


    public void Click(View view)
    {
        Intent i=new Intent(Fashion.this, FashionGirlz.class);
        startActivity(i);

    }


    public void Click2(View view)
    {
        Intent i=new Intent(Fashion.this, Fashionboyz.class);
        startActivity(i);

    }

    public void Click3(View view)
    {
        Intent i=new Intent(Fashion.this, Makeupz.class);
        startActivity(i);

    }

    public void Click4(View view)
    {
        Intent i=new Intent(Fashion.this, Tattoosz.class);
        startActivity(i);

    }

    public void Click5(View view)
    {
        Intent i=new Intent(Fashion.this, Highz.class);
        startActivity(i);

    }

    public void Click6(View view)
    {
        Intent i=new Intent(Fashion.this, Earringsz.class);
        startActivity(i);

    }

    public void Click7(View view)
    {
        Intent i=new Intent(Fashion.this, Hairz.class);
        startActivity(i);

    }

    public void Click8(View view)
    {
        Intent i=new Intent(Fashion.this, Stylishz.class);
        startActivity(i);

    }

    public void Click9(View view)
    {
        Intent i=new Intent(Fashion.this, Shopingz.class);
        startActivity(i);

    }

    public void Click10(View view)
    {
        Intent i=new Intent(Fashion.this, Purseloverz.class);
        startActivity(i);

    }
    public void Click11(View view)
    {
        Intent i=new Intent(Fashion.this, Bestz.class);
        startActivity(i);

    }

    public void Click12(View view)
    {
        Intent i=new Intent(Fashion.this, Modelz.class);
        startActivity(i);

    }
    public void Click13(View view)
    {
        Intent i=new Intent(Fashion.this, Coolz.class);
        startActivity(i);

    }


    public void Click14(View view)
    {
        Intent i=new Intent(Fashion.this, Ultimatez.class);
        startActivity(i);

    }

    public void Click15(View view)
    {
        Intent i=new Intent(Fashion.this, Eyesz.class);
        startActivity(i);

    }

    public void Click16(View view)
    {
        Intent i=new Intent(Fashion.this, Swaggz.class);
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
