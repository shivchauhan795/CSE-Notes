package com.shivchauhan.csenotes;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.Toast;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;

public class Dashboard extends AppCompatActivity implements View.OnClickListener, NavigationView.OnNavigationItemSelectedListener {

    CardView c1, c2, c3, c4, c5, c6;
    Toolbar toolbar;

    // Drawer menu
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    static final float END_SCALE = 0.7f;
    ScrollView content;
    ImageButton contribute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(@NonNull InitializationStatus initializationStatus) {
            }
        });


        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        drawerLayout menu hooks
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.navigation_view);
        content = findViewById(R.id.content);
        contribute = findViewById(R.id.contribute);

        navigationDrawer();

        c1 = findViewById(R.id.semester1);
        c2 = findViewById(R.id.semester2);
        c3 = findViewById(R.id.semester3);
        c4 = findViewById(R.id.semester4);
        c5 = findViewById(R.id.semester5);
        c6 = findViewById(R.id.semester6);

        c1.setOnClickListener(this);
        c2.setOnClickListener(this);
        c3.setOnClickListener(this);
        c4.setOnClickListener(this);
        c5.setOnClickListener(this);
        c6.setOnClickListener(this);

        contribute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Dashboard.this, "Thank you for Contribution!!", Toast.LENGTH_SHORT).show();
                String[] addresses = {"csenoteshelp@gmail.com"};
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("*/*");
                intent.putExtra(Intent.EXTRA_EMAIL, addresses);
                boolean attachment = false;
                intent.putExtra(Intent.EXTRA_STREAM, attachment);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });

    }

    public void open_profile(View view) {

    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerVisible(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else
            super.onBackPressed();
    }

    private void navigationDrawer() {

        navigationView.bringToFront();
        navigationView.setNavigationItemSelectedListener(this);
//        navigationView.setCheckedItem(R.id.nav_home); // By default select home button
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (drawerLayout.isDrawerVisible(GravityCompat.START))
                    drawerLayout.closeDrawer(GravityCompat.START);
                else
                    drawerLayout.openDrawer(GravityCompat.START);
            }
        });
        animateNavigationDrawer();
    }

    private void animateNavigationDrawer() {

//        drawerLayout.setScrimColor(getResources().getColor(R.color.cardview_shadow_start_color));
        drawerLayout.addDrawerListener(new DrawerLayout.SimpleDrawerListener() {
                                           @Override
                                           public void onDrawerSlide(View drawerView, float slideOffset) {

                                               // Scale the View based on current slide offset
                                               final float diffScaledOffset = slideOffset * (1 - END_SCALE);
                                               final float offsetScale = 1 - diffScaledOffset;
                                               content.setScaleX(offsetScale);
                                               content.setScaleY(offsetScale);

                                               // Translate the View, accounting for the scaled width
                                               final float xOffset = drawerView.getWidth() * slideOffset;
                                               final float xOffsetDiff = content.getWidth() * diffScaledOffset / 2;
                                               final float xTranslation = xOffset - xOffsetDiff;
                                               content.setTranslationX(xTranslation);
                                           }
                                       }
        );
    }

    @Override
    public void onClick(View v) {

        Intent intent;
        switch (v.getId()) {
            case R.id.semester1:
                intent = new Intent(this, Sem1.class);
                startActivity(intent);
                break;
            case R.id.semester2:
                intent = new Intent(this, Sem2.class);
                startActivity(intent);
                break;
            case R.id.semester3:
                intent = new Intent(this, Sem3.class);
                startActivity(intent);
                break;
            case R.id.semester4:
                intent = new Intent(this, Sem4.class);
                startActivity(intent);
                break;
            case R.id.semester5:
                intent = new Intent(this, Sem5.class);
                startActivity(intent);
                break;
            case R.id.semester6:
                intent = new Intent(this, Sem6.class);
                startActivity(intent);
                break;
        }
    }


    //  on clicking navigation drawer icons
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        Intent intent;
        switch (item.getItemId()) {
            case R.id.sem1:
                intent = new Intent(this, Sem1.class);
                drawerLayout.closeDrawer(GravityCompat.START);
                startActivity(intent);
                break;
            case R.id.sem2:
                intent = new Intent(this, Sem2.class);
                drawerLayout.closeDrawer(GravityCompat.START);
                startActivity(intent);
                break;
            case R.id.sem3:
                intent = new Intent(this, Sem3.class);
                drawerLayout.closeDrawer(GravityCompat.START);
                startActivity(intent);
                break;
            case R.id.sem4:
                intent = new Intent(this, Sem4.class);
                drawerLayout.closeDrawer(GravityCompat.START);
                startActivity(intent);
                break;
            case R.id.sem5:
                intent = new Intent(this, Sem5.class);
                drawerLayout.closeDrawer(GravityCompat.START);
                startActivity(intent);
                break;
            case R.id.sem6:
                intent = new Intent(this, Sem6.class);
                drawerLayout.closeDrawer(GravityCompat.START);
                startActivity(intent);
                break;
            case R.id.share:
                try {
                    //                    For sharing app
                    Intent i = new Intent(Intent.ACTION_SEND);
                    i.setType("text/plain");
                    i.putExtra(Intent.EXTRA_SUBJECT, "CSE Notes");
                    String shareMessage = "";
                    shareMessage = shareMessage + "https://play.google.com/store/apps/details?id=com.shivchauhan.csenotes";
                    i.putExtra(Intent.EXTRA_TEXT, shareMessage);
                    startActivity(Intent.createChooser(i, "Share With"));

                } catch (Exception e) {
                    Toast.makeText(this, "Unable to share this app", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.youtube:
                Uri uri = Uri.parse("https://www.youtube.com/channel/UCjmpH2Ebko0-d0J-7N7y1Uw");
                drawerLayout.closeDrawer(GravityCompat.START);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
                break;
//            case R.id.logout:
//                FirebaseAuth.getInstance().signOut();
//                Toast.makeText(Dashboard.this, "Logged Out", Toast.LENGTH_SHORT).show();
//                startActivity(new Intent(Dashboard.this, Login.class));
//                finish();
//                break;
            case R.id.rateus:
                Uri uri1 = Uri.parse("https://play.google.com/store/apps/details?id=com.shivchauhan.csenotes");
                Intent intent1 = new Intent(Intent.ACTION_VIEW, uri1);
                intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent1);
        }
        return true;
    }
}