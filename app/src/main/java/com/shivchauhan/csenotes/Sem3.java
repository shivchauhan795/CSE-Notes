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

public class Sem3 extends AppCompatActivity {
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem3);

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
                Toast.makeText(Sem3.this, "Ad loaded", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAdOpened() {
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
                super.onAdOpened();
            }
        });

    }

    public void open_Sem3_Mathematics(View view) {
        opennotes("https://drive.google.com/drive/folders/1ar2ExE6kpySqO9LaR307lmyln_wsOVHL?usp=sharing");
    }

    public void open_Sem3_Dsa(View view) {
        opennotes("https://drive.google.com/drive/folders/1uT7MnY2P5WWvS0kdSxi_MtaDwuHivwWc?usp=sharing");
    }

    public void open_Sem3_Oops(View view) {
        opennotes("https://drive.google.com/drive/folders/1e4VDrSKev7HPSzz0J9BnBPrm1l92YCK2?usp=sharing");
    }

    public void open_Sem3_De(View view) {
        opennotes("https://drive.google.com/drive/folders/1As1YbNDTLC7IzVsGbYb6l_7JlS2mM1Pk?usp=sharing");
    }

    public void open_Sem3_Dos(View view) {
        opennotes("https://drive.google.com/drive/folders/1g3pwIypv92mtSR-oBx2fmNF-BtXhnBWa?usp=sharing");
    }

    private void opennotes(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}