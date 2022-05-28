package com.shivchauhan.csenotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sem2Workshop extends AppCompatActivity {
    Button b1;
    Button b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem2_workshop);
        b1 = findViewById(R.id.W1);
        b2 = findViewById(R.id.W2);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennotes("https://drive.google.com/file/d/1HdgHJ3DLdWm27Qm9JO4N0fYdAtrzb6pE/view?usp=sharing");
            }

            private void opennotes(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennotes("https://drive.google.com/file/d/1eKf_leGza1-IzJvKNOmkUD0jWrrPgNj4/view?usp=sharing");
            }

            private void opennotes(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));

            }
        });
    }
}