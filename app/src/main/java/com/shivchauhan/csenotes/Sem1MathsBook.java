package com.shivchauhan.csenotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sem1MathsBook extends AppCompatActivity {
    Button b1;
    Button b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem1_maths_book);
        b1 = findViewById(R.id.sem1matrix);
        b2 = findViewById(R.id.sem1vs);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennotes("https://drive.google.com/file/d/14yRuxv4X9cfb-kLyNQagN5iWMo4KFKsC/view?usp=sharing");
            }

            private void opennotes(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennotes("https://drive.google.com/file/d/1roxlBh5E3viKQCTcUk2AS9n4JrPrh_Ff/view?usp=sharing");
            }

            private void opennotes(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));

            }
        });

    }
}