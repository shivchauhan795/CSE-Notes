package com.shivchauhan.csenotes;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sem1Bee extends AppCompatActivity {
Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem1_bee);

        b1 = findViewById(R.id.Sem1BeeNotes);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennotes("https://drive.google.com/file/d/1AFwbvKnUn2xR6SZFYXrwa1zz3Svme6JE/view?usp=sharing");
            }

            private void opennotes(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));

            }
        });
    }
}