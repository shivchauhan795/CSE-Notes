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
    RelativeLayout original1, original2, original3, original4, original5, original6;
    LinearLayout hidden1, hidden2, hidden3, hidden4, hidden5, hidden6;
    CardView cardView1, cardView2, cardView3, cardView4, cardView5, cardView6;
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


//        Maths
        original1 = findViewById(R.id.mathsOriginal);
        cardView1 = findViewById(R.id.mathsCard);
        hidden1 = findViewById(R.id.mathsDropDown);
        hidden1.setVisibility(View.GONE);

//        daa
        original2 = findViewById(R.id.daaOriginal);
        cardView2 = findViewById(R.id.daaCard);
        hidden2 = findViewById(R.id.daaDropDown);
        hidden2.setVisibility(View.GONE);

//        os
        original3 = findViewById(R.id.osOriginal);
        cardView3 = findViewById(R.id.osCard);
        hidden3 = findViewById(R.id.osDropDown);
        hidden3.setVisibility(View.GONE);

//        coa
        original4 = findViewById(R.id.coaOriginal);
        cardView4 = findViewById(R.id.coaCard);
        hidden4 = findViewById(R.id.coaDropDown);
        hidden4.setVisibility(View.GONE);


//        uhv
        original5 = findViewById(R.id.uhvOriginal);
        cardView5 = findViewById(R.id.uhvCard);
        hidden5 = findViewById(R.id.uhvDropDown);
        hidden5.setVisibility(View.GONE);

//        evs
        original6 = findViewById(R.id.evsOriginal);
        cardView6 = findViewById(R.id.evsCard);
        hidden6 = findViewById(R.id.evsDropDown);
        hidden6.setVisibility(View.GONE);


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

//        daa
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

//        os
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

//        coa
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

//        uhv
        original5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (hidden5.getVisibility() == View.VISIBLE) {
                    TransitionManager.beginDelayedTransition(original5,
                            new AutoTransition());
                    hidden5.setVisibility(View.GONE);
                } else {
                    TransitionManager.beginDelayedTransition(original5,
                            new AutoTransition());
                    hidden5.setVisibility(View.VISIBLE);
                }
            }
        });

//        evs
        original6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (hidden6.getVisibility() == View.VISIBLE) {
                    TransitionManager.beginDelayedTransition(original6,
                            new AutoTransition());
                    hidden6.setVisibility(View.GONE);
                } else {
                    TransitionManager.beginDelayedTransition(original6,
                            new AutoTransition());
                    hidden6.setVisibility(View.VISIBLE);
                }
            }
        });
    }

    //    MATHEMATICS
    public void open_Sem4_Maths_Module1(View view) {
        opennotes("https://drive.google.com/drive/folders/18bqvaT_uao3J5lbuo1Kb84BX0yV0CJvH?usp=sharing");
    }

    public void open_Sem4_Maths_Module2(View view) {
        opennotes("https://drive.google.com/drive/folders/1P-Z818F1ZHRyP-J4vPD8g-OefUiYOieQ?usp=sharing");
    }

    public void open_Sem4_Maths_Module3(View view) {
        opennotes("https://drive.google.com/drive/folders/1dIbYiuD04-6kX6kvXDTOLnuacQ8aYOMk?usp=sharing");
    }

    public void open_Sem4_Maths_Module4(View view) {
        opennotes("https://drive.google.com/drive/folders/1pyUvF_OKF47uHMq9cbmybrjKDVL5E_9x?usp=sharing");
    }

    public void open_Sem4_Maths_Module5(View view) {
        opennotes("https://drive.google.com/drive/folders/1jz22M1IdPg1IX6y551Iq6AoD-knVoUPr?usp=sharing");
    }

    public void open_Sem4_Maths_lords(View view) {
        opennotes("https://drive.google.com/drive/folders/1kdhFa-isKPR1hG83OXc2yIyrZysdOSe7?usp=sharing");
    }

    public void open_Sem4_Maths_SolvedQP(View view) {
        opennotes("https://drive.google.com/drive/folders/10wuZ-5536YXSyBzHTw3akHnc-mrIkleg?usp=sharing");
    }

    //UHV
    public void open_Sem4_uhv_book(View view) {
        opennotes("https://drive.google.com/drive/folders/1cBSF7_4Ay1BRNbmOlf9gYJnPpziP7h7K?usp=sharing");
    }

    public void open_Sem4_uhv_complete_notes(View view) {
        opennotes("https://drive.google.com/drive/folders/1h8D7G_09gIQ3KL9yKKPSxangP1LdktOv?usp=sharing");
    }

    private void opennotes(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));

    }
}