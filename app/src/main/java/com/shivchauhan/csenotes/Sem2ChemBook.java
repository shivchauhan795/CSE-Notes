package com.shivchauhan.csenotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sem2ChemBook extends AppCompatActivity {
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem2_chem_book);
        b1 = findViewById(R.id.ch1);
        b2 = findViewById(R.id.ch2);
        b3 = findViewById(R.id.ch3);
        b4 = findViewById(R.id.ch4);
        b5 = findViewById(R.id.ch5);
        b6 = findViewById(R.id.ch6);
        b7 = findViewById(R.id.ch7);
        b8 = findViewById(R.id.ch8);
        b9 = findViewById(R.id.ch9);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennotes("https://drive.google.com/file/d/1-8cvlkRHNpOB-Wy4EjysrJrnp87m1BPx/view?usp=sharing");
            }

            private void opennotes(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennotes("https://drive.google.com/file/d/1gAdENAlbQlgYsfZTNOxrXCzOo8XnzDoj/view?usp=sharing");
            }

            private void opennotes(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennotes("https://drive.google.com/file/d/1YBzcMGzFw4a30FJGfc6nWwdcMwiLnLpK/view?usp=sharing");
            }

            private void opennotes(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennotes("https://drive.google.com/file/d/1uyxWdYfboi6eOQ2taDE6eaJVKE6x82cw/view?usp=sharing");
            }

            private void opennotes(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennotes("https://drive.google.com/file/d/14DrJmwgSBT9EaCdGo_gcjH9VaGyMQXpG/view?usp=sharing");
            }

            private void opennotes(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennotes("https://drive.google.com/file/d/1AKGBmNLALr8LsDzR90t9Y1HBzAGEzPYr/view?usp=sharing");
            }

            private void opennotes(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennotes("https://drive.google.com/file/d/13avf-4TABgZBmwuz0FNaoA-RESd88XvO/view?usp=sharing");
            }

            private void opennotes(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennotes("https://drive.google.com/file/d/1pNNLJ-92tEIN-mjcnYyzbYa6u-RqGbXp/view?usp=sharing");
            }

            private void opennotes(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));

            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennotes("https://drive.google.com/file/d/1vqYxF21aLdlywDTMPIBl6I8Hpen7JX5n/view?usp=sharing");
            }

            private void opennotes(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));

            }
        });
    }
}