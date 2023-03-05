package com.shivchauhan.csenotes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;

public class Sem4 extends AppCompatActivity {
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem4);

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        mAdView.setAdListener(new AdListener() {
            @Override
            public void onAdClicked() {
                // Code to be executed when the user clicks on an ad.
                super.onAdClicked();
            }

            @Override
            public void onAdClosed() {
                // Code to be executed when the user is about to return
                // to the app after tapping on an ad.
                super.onAdClosed();
            }

            @Override
            public void onAdFailedToLoad(LoadAdError adError) {
                // Code to be executed when an ad request fails.
                super.onAdFailedToLoad(adError);
                mAdView.loadAd(adRequest);
            }

            @Override
            public void onAdImpression() {
                // Code to be executed when an impression is recorded
                // for an ad.
                super.onAdImpression();
            }

            @Override
            public void onAdLoaded() {
                // Code to be executed when an ad finishes loading.
                super.onAdLoaded();
                Toast.makeText(Sem4.this, "Ad loaded", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAdOpened() {
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
                super.onAdOpened();
            }
        });

    }

    //    MATHEMATICS
    public void open_Sem4_Mathematics(View view) {
        opennotes("https://drive.google.com/drive/folders/14DoFqGv2AANrVI-8QDezdfyVV78nztoF?usp=sharing");
    }

    public void open_Sem4_Daa(View view) {
        opennotes("https://drive.google.com/drive/folders/1BjNERva92eJpdz4HCOY0AjuU9p3BGibc?usp=sharing");
    }

    public void open_Sem4_Os(View view) {
        opennotes("https://drive.google.com/drive/folders/1oqpG578wUzfS7pI3Qt0EO7wqppkkPmjy?usp=sharing");
    }

    public void open_Sem4_Coa(View view) {
        opennotes("https://drive.google.com/drive/folders/12zyiuY6bLUJLpNFwiF_6s-mZuZ08rjha?usp=sharing");
    }

    public void open_Sem4_Uhv(View view) {
        opennotes("https://drive.google.com/drive/folders/11o7ascU_HO241T2GeuG7qdMXVdQ1FXzm?usp=sharing");
    }

    public void open_Sem4_Evs(View view) {
        opennotes("https://drive.google.com/drive/folders/1mboUjCTG9-eZJc1TjcJFq0zzfp5clR0S?usp=sharing");
    }

    private void opennotes(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));

    }
}