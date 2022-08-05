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

public class Sem2 extends AppCompatActivity {
    RelativeLayout original1, original2, original3, original4, original5;
    LinearLayout hidden1, hidden2, hidden3, hidden4, hidden5;
    CardView cardView1, cardView2, cardView3, cardView4, cardView5;
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
                Toast.makeText(Sem2.this, "Ad loaded", Toast.LENGTH_SHORT).show();
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

//        chemistry
        original2 = findViewById(R.id.chemistryOriginal);
        cardView2 = findViewById(R.id.chemistryCard);
        hidden2 = findViewById(R.id.chemistryDropDown);
        hidden2.setVisibility(View.GONE);

//        english
        original3 = findViewById(R.id.englishOriginal);
        cardView3 = findViewById(R.id.englishCard);
        hidden3 = findViewById(R.id.englishDropDown);
        hidden3.setVisibility(View.GONE);

//        pps
        original4 = findViewById(R.id.ppsOriginal);
        cardView4 = findViewById(R.id.ppsCard);
        hidden4 = findViewById(R.id.ppsDropDown);
        hidden4.setVisibility(View.GONE);


//        workshop
        original5 = findViewById(R.id.workshopOriginal);
        cardView5 = findViewById(R.id.workshopCard);
        hidden5 = findViewById(R.id.workshopDropDown);
        hidden5.setVisibility(View.GONE);

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

//        chemistry
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

//        english
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

//        pps
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

//        workshop
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


    }

    public void openMaths2(View view) {
        Intent intent = new Intent(this, maths2.class);
        startActivity(intent);
    }

    public void openChem(View view) {
        Intent intent = new Intent(this, chem.class);
        startActivity(intent);
    }

    public void m2Table(View view) {
        opennotes("https://drive.google.com/file/d/1HRirWlT2arNGHMl4YHr4xAdCW99isC3u/view?usp=sharing");

    }

    public void openEngNotes(View view) {
        opennotes("https://drive.google.com/file/d/1k-fsXB4av6ZGrB3Hga86Bq8I5V3plKPD/view?usp=sharing");

    }

    public void openEngFile(View view) {
        opennotes("https://drive.google.com/file/d/1cNzA9loXwWsoc0vj7FjAqMYmOJOHmDO1/view?usp=sharing");

    }

    public void openEngQB(View view) {
        opennotes("https://drive.google.com/file/d/1kJR_6_ZjzL6vo7Ws5uz8ai0rlVQoOSpF/view?usp=sharing");

    }

    public void openPpsBook(View view) {
        opennotes("https://drive.google.com/file/d/10Rm8M_XnWQ_u6VoEOhDxd3HAnMj1nHnf/view?usp=sharing");

    }

    public void openPpsFile(View view) {
        opennotes("https://drive.google.com/file/d/1Z2JvIBV7X_XPboMo8zx_jbeGsXuUuYUU/view?usp=sharing");

    }

    public void openWorkshopBook(View view) {
        opennotes("https://drive.google.com/file/d/1HdgHJ3DLdWm27Qm9JO4N0fYdAtrzb6pE/view?usp=sharing");

    }

    public void openWorkshopQues(View view) {
        opennotes("https://drive.google.com/file/d/1eKf_leGza1-IzJvKNOmkUD0jWrrPgNj4/view?usp=sharing");

    }

    private void opennotes(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));

    }

}