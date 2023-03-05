package com.shivchauhan.csenotes;

import androidx.annotation.NonNull;
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

public class Sem2 extends AppCompatActivity {
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem2);

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
            public void onAdFailedToLoad(@NonNull LoadAdError adError) {
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
                Toast.makeText(Sem2.this, "Ad loaded", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAdOpened() {
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
                super.onAdOpened();
            }
        });

    }

    public void open_Sem2_Mathematics(View view) {
        opennotes("https://drive.google.com/drive/folders/14Y_af7BLa86tPGIOU3GVQQHauuF2xot1?usp=sharing");
    }

    public void open_Sem2_Chemistry(View view) {
        opennotes("https://drive.google.com/drive/folders/17aZZxoTqXa8i9g_p-sbZnde-Z8-Q8u29?usp=sharing");
    }

    public void open_Sem2_English(View view) {
        opennotes("https://drive.google.com/drive/folders/14IPz4_FXUE1STBBINe5aTr3WAsKn_ggJ?usp=sharing");
    }

    public void open_Sem2_Pps(View view) {
        opennotes("https://drive.google.com/drive/folders/182ANo6ynVz1ZCY9iB6foyxOZWnMsp113?usp=sharing");
    }

    public void open_Sem2_Workshop(View view) {
        opennotes("https://drive.google.com/drive/folders/1wJuYPHYtK0BGINcAQX8NeaT1Ao3dSDS3?usp=sharing");
    }

    private void opennotes(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));

    }

}