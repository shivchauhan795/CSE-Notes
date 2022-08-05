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
    RelativeLayout original1, original2, original3, original4, original5;
    LinearLayout hidden1, hidden2, hidden3, hidden4, hidden5;
    CardView cardView1, cardView2, cardView3, cardView4, cardView5;
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


//        Maths
        original1 = findViewById(R.id.mathsOriginal);
        cardView1 = findViewById(R.id.mathsCard);
        hidden1 = findViewById(R.id.mathsDropDown);
        hidden1.setVisibility(View.GONE);

//        dsa
        original2 = findViewById(R.id.dsaOriginal);
        cardView2 = findViewById(R.id.dsaCard);
        hidden2 = findViewById(R.id.dsaDropDown);
        hidden2.setVisibility(View.GONE);

//        oops
        original3 = findViewById(R.id.oopsOriginal);
        cardView3 = findViewById(R.id.oopsCard);
        hidden3 = findViewById(R.id.oopsDropDown);
        hidden3.setVisibility(View.GONE);

//        de
        original4 = findViewById(R.id.deOriginal);
        cardView4 = findViewById(R.id.deCard);
        hidden4 = findViewById(R.id.deDropDown);
        hidden4.setVisibility(View.GONE);


//        dos
        original5 = findViewById(R.id.dosOriginal);
        cardView5 = findViewById(R.id.dosCard);
        hidden5 = findViewById(R.id.dosDropDown);
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

//        dsa
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

//        oops
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

//        de
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

//        dos
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

    //    MATHEMATICS
    public void open_Sem3_Maths_Module1(View view) {
        opennotes("https://drive.google.com/drive/folders/1vQ3TJkt-030pR4K9fm33CdA5TsAvnXqO?usp=sharing");
    }

    public void open_Sem3_Maths_Module2(View view) {
        opennotes("https://drive.google.com/drive/folders/1lRhMqvfsfFY_ZKWCoiwwg1HVeC1shGF9?usp=sharing");
    }

    public void open_Sem3_Maths_Module3(View view) {
        opennotes("https://drive.google.com/drive/folders/1b_bBxDO02TEM3kVOCSSrEMj0gsbDm9yJ?usp=sharing");
    }

    public void open_Sem3_Maths_Module4(View view) {
        opennotes("https://drive.google.com/drive/folders/16h-9W0bSY99IJ1GIogi-bhd5IUOtLAOL?usp=sharing");
    }

    public void open_Sem3_Maths_Formula(View view) {
        opennotes("https://drive.google.com/file/d/1IMafqRFgIUjiqS57CN9OvlqPFIMPKh0S/view?usp=sharing");
    }

    //    DSA
    public void open_Sem3_dsa_Module1(View view) {
        opennotes("https://drive.google.com/drive/folders/184sl8GwYu66bPBLCNlboiXxFx_3jJ9M6?usp=sharing");
    }

    public void open_Sem3_dsa_Module2(View view) {
        opennotes("https://drive.google.com/drive/folders/1FMLRUMfyfyGROLnvm_aSI1iyDycDCDPe?usp=sharing");
    }

    public void open_Sem3_dsa_Module3(View view) {
        opennotes("https://drive.google.com/drive/folders/1WlVlxXhAnrBQTMbWbhaaJFDNysv_xbU6?usp=sharing");
    }

    public void open_Sem3_dsa_Module4(View view) {
        opennotes("https://drive.google.com/drive/folders/15BM-jDFiRWNpyYKA9XYmJe9ybtI3alJu?usp=sharing");
    }

    public void open_Sem3_dsa_Module5(View view) {
        opennotes("https://drive.google.com/drive/folders/1uZG8V1RjC_HkJZNopbFpGCkKVpFVhbNe?usp=sharing");
    }

    public void open_Sem3_dsa_solved_QP(View view) {
        opennotes("https://drive.google.com/drive/folders/1Scw0eJOQezjHd5O8YCZ8spzYagEW5KeQ?usp=sharing");
    }

    //    OOPS
    public void open_Sem3_oops_Module1(View view) {
        opennotes("https://drive.google.com/drive/folders/1FMPH-MnSVPWme0Job0aV6CM0KBw2V_8e?usp=sharing");
    }

    public void open_Sem3_oops_Module2(View view) {
        opennotes("https://drive.google.com/drive/folders/1PhNKk8Dlz4EF1OZNsmro6oTR3vTwCqjn?usp=sharing");
    }

    public void open_Sem3_oops_Module3(View view) {
        opennotes("https://drive.google.com/drive/folders/1BX55fl00PbnhPUpyPHzq9CP-aLWN_Kjt?usp=sharing");
    }

    public void open_Sem3_oops_Module4(View view) {
        opennotes("https://drive.google.com/drive/folders/1FzZwDRppCb92MwV7gk9P8g9uQTH9Jc3_?usp=sharing");
    }

    public void open_Sem3_oops_Module5(View view) {
        opennotes("https://drive.google.com/drive/folders/1XRGVUMeoWqJhhLP5RIdXj1qTDcUhTtTI?usp=sharing");
    }

    public void open_Sem3_oops_book(View view) {
        opennotes("https://drive.google.com/drive/folders/1KUrsMKQvA8SYF41VEpASd0LAAizpjhEw?usp=sharing");
    }

    //    DE
    public void open_Sem3_de_books(View view) {
        opennotes("https://drive.google.com/drive/folders/1zicF5SZSCFIJXuZ12SU7OP1jtj-bE1i4?usp=sharing");
    }

    public void open_Sem3_de_ppts(View view) {
        opennotes("https://drive.google.com/drive/folders/1bcOLSwjYs3Zb1ZjMA1Wtf29_GEfFMvOC?usp=sharing");
    }

    //    DOS
    public void open_Sem3_dos_teacher_notes(View view) {
        opennotes("https://drive.google.com/drive/folders/1g3pwIypv92mtSR-oBx2fmNF-BtXhnBWa?usp=sharing");
    }


    private void opennotes(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));

    }
}