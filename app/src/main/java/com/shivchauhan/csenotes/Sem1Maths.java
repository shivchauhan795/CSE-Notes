package com.shivchauhan.csenotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Sem1Maths extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem1_maths);
    }
    public void openSem1MathsBook(View view){
//        Toast.makeText(this, "Opening...", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,Sem1MathsBook.class);
        startActivity(intent);
    }
}