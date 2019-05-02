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
import com.live.viralinstatags.Entj.Animej;
import com.live.viralinstatags.Entj.Booksj;
import com.live.viralinstatags.Entj.Dancej;
import com.live.viralinstatags.Entj.Disneyj;
import com.live.viralinstatags.Entj.Funj;
import com.live.viralinstatags.Entj.Gamesj;
import com.live.viralinstatags.Entj.Kpopj;
import com.live.viralinstatags.Entj.Moviesj;
import com.live.viralinstatags.Entj.Musicj;
import com.live.viralinstatags.Entj.Musicvideoj;

public class Ent extends AppCompatActivity {

    private AdView mAdView;
    InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ent);

        // initialize the AdMob app
        MobileAds.initialize(this, getString(R.string.admob_app_id));
        mAdView = (AdView) findViewById(R.id.adView);

        AdRequest adRequest = new AdRequest.Builder()
                .build();
        mAdView.loadAd(adRequest);
    }




    public void Click(View view)
    {
        Intent i=new Intent(Ent.this, Musicj.class);
        startActivity(i);

    }

    public void Click2(View view)
    {
        Intent i=new Intent(Ent.this, Gamesj.class);
        startActivity(i);

    }

    public void Click3(View view)
    {
        Intent i=new Intent(Ent.this, Booksj.class);
        startActivity(i);

    }

    public void Click4(View view)
    {
        Intent i=new Intent(Ent.this, Disneyj.class);
        startActivity(i);

    }

    public void Click5(View view)
    {
        Intent i=new Intent(Ent.this, Moviesj.class);
        startActivity(i);

    }

    public void Click6(View view)
    {
        Intent i=new Intent(Ent.this, Animej.class);
        startActivity(i);

    }

    public void Click7(View view)
    {
        Intent i=new Intent(Ent.this, Kpopj.class);
        startActivity(i);

    }

    public void Click8(View view)
    {
        Intent i=new Intent(Ent.this, Funj.class);
        startActivity(i);

    }

    public void Click9(View view)
    {
        Intent i=new Intent(Ent.this, Dancej.class);
        startActivity(i);

    }

    public void Click10(View view)
    {
        Intent i=new Intent(Ent.this, Musicvideoj.class);
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
