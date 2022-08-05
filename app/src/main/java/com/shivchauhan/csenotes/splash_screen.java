package com.shivchauhan.csenotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class splash_screen extends AppCompatActivity {
    private static int SPLASH_SCREEN = 1900;
    Animation fade;
    ImageView logo;
    TextView textView, textView1;
    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        // Removes Status Bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // Animations
        fade = AnimationUtils.loadAnimation(this, R.anim.animm);
        logo = findViewById(R.id.splash_logo);
        textView = findViewById(R.id.splash_from);
        textView1 = findViewById(R.id.splash_my_name);

        // Assigning animations to image and text
        logo.setAnimation(fade);
        textView.setAnimation(fade);
        textView1.setAnimation(fade);

        mAuth = FirebaseAuth.getInstance();

        if (mAuth.getCurrentUser() != null) {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(splash_screen.this, Dashboard.class);
                    startActivity(intent);
                    finish();
                }
            }, SPLASH_SCREEN);


        } else {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(splash_screen.this, Login_Register_main.class);
                    startActivity(intent);
                    finish();
                }
            }, SPLASH_SCREEN);


        }


//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                Intent intent = new Intent(splash_screen.this, Login_Register_main.class);
//                startActivity(intent);
//                finish();
//            }
//        }, SPLASH_SCREEN);
    }
}