package com.shivchauhan.csenotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Sem2Maths extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem2_maths);
    }
    public void openSem2MathsBooks(View view){
//        Toast.makeText(this, "Opening Books", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,Sem2MathsBook.class);
        startActivity(intent);
    }
}