package com.shivchauhan.csenotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Sem2Pps extends AppCompatActivity {
    Button b1;
    Button b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem2_pps);
        b1 = findViewById(R.id.Ppsbk);
        b2 = findViewById(R.id.PpsFile);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennotes("https://drive.google.com/file/d/10Rm8M_XnWQ_u6VoEOhDxd3HAnMj1nHnf/view?usp=sharing");
            }

            private void opennotes(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennotes("https://drive.google.com/file/d/1Z2JvIBV7X_XPboMo8zx_jbeGsXuUuYUU/view?usp=sharing");
            }

            private void opennotes(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));

            }
        });
    }
}