package com.shivchauhan.csenotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Sem2Chem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem2_chem);
    }
    public void openSem2ChemBooks(View view){
//        Toast.makeText(this, "Opening Books", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,Sem2ChemBook.class);
        startActivity(intent);
    }
}