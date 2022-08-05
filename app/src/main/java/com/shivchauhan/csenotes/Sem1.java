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

public class Sem1 extends AppCompatActivity {
    RelativeLayout original1, original2, original3, original4;
    LinearLayout hidden1, hidden2, hidden3, hidden4;
    CardView cardView1, cardView2, cardView3, cardView4;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem1);


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
                Toast.makeText(Sem1.this, "Ad loaded", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAdOpened() {
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
                super.onAdOpened();
            }
        });


//        Maths
        original1 = findViewById(R.id.mathsOriginal);
        cardView1 = findViewById(R.id.mathsCard);
        hidden1 = findViewById(R.id.mathsDropDown);
        hidden1.setVisibility(View.GONE);

//        Physics
        original2 = findViewById(R.id.physicsOriginal);
        cardView2 = findViewById(R.id.physicsCard);
        hidden2 = findViewById(R.id.physicsDropDown);
        hidden2.setVisibility(View.GONE);

//        bee
        original3 = findViewById(R.id.beeOriginal);
        cardView3 = findViewById(R.id.beeCard);
        hidden3 = findViewById(R.id.beeDropDown);
        hidden3.setVisibility(View.GONE);

//        egd
        original4 = findViewById(R.id.egdOriginal);
        cardView4 = findViewById(R.id.egdCard);
        hidden4 = findViewById(R.id.egdDropDown);
        hidden4.setVisibility(View.GONE);

//        Maths
        original1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (hidden1.getVisibility() == View.VISIBLE) {
                    TransitionManager.beginDelayedTransition(original1,
                            new AutoTransition());
                    hidden1.setVisibility(View.GONE);


                } else {
                    TransitionManager.beginDelayedTransition(original1,
                            new AutoTransition());
                    hidden1.setVisibility(View.VISIBLE);
                }


            }
        });

//        Physics
        original2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (hidden2.getVisibility() == View.VISIBLE) {
                    TransitionManager.beginDelayedTransition(original2,
                            new AutoTransition());
                    hidden2.setVisibility(View.GONE);


                } else {
                    TransitionManager.beginDelayedTransition(original2,
                            new AutoTransition());
                    hidden2.setVisibility(View.VISIBLE);
                }


            }
        });

//        bee
        original3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (hidden3.getVisibility() == View.VISIBLE) {
                    TransitionManager.beginDelayedTransition(original3,
                            new AutoTransition());
                    hidden3.setVisibility(View.GONE);


                } else {
                    TransitionManager.beginDelayedTransition(original3,
                            new AutoTransition());
                    hidden3.setVisibility(View.VISIBLE);
                }


            }
        });

//        egd
        original4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (hidden4.getVisibility() == View.VISIBLE) {
                    TransitionManager.beginDelayedTransition(original4,
                            new AutoTransition());
                    hidden4.setVisibility(View.GONE);


                } else {
                    TransitionManager.beginDelayedTransition(original4,
                            new AutoTransition());
                    hidden4.setVisibility(View.VISIBLE);
                }


            }
        });


    }

    public void openMaths1(View view) {
        Intent intent = new Intent(this, maths1.class);
        startActivity(intent);
    }

    public void openPhysicsUnit1(View view) {
        opennotes("https://drive.google.com/file/d/1N2vuz6cJ6W-QzGYA0LkHPWkuCCU2VRfH/view?usp=sharing");

    }

    public void openPhysicsUnit2(View view) {
        opennotes("https://drive.google.com/file/d/1UyQbpZL3ES3BiCGLyR2u4WAjW7Tr71Na/view?usp=sharing");

    }

    public void openPhysicsUnit3(View view) {
        opennotes("https://drive.google.com/file/d/1HJHSH7CxTYfuRW8Hmi7cneJB2hSUf2rS/view?usp=sharing");

    }

    public void openPhysicsUnit4(View view) {
        opennotes("https://drive.google.com/file/d/12vQ47gUTlb6GYW4o9iMz7PHaHvw-TETw/view?usp=sharing");

    }

    public void openBeeNotes(View view) {
        opennotes("https://drive.google.com/file/d/1AFwbvKnUn2xR6SZFYXrwa1zz3Svme6JE/view?usp=sharing");

    }

    public void openEgdBook(View view) {
        opennotes("https://drive.google.com/file/d/1orpqqZvoC3FVdH4VaFpY5En24dcalAPp/view?usp=sharing");

    }

    private void opennotes(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));

    }

}