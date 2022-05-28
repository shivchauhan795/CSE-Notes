package com.shivchauhan.csenotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Sem2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem2);
    }
    public void openSem2Maths(View view){
//        Toast.makeText(this, "Opening Mathematics", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,Sem2Maths.class);
        startActivity(intent);
    }
    public void openSem2Chemistry(View view){
//        Toast.makeText(this, "Opening Chemistry", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,Sem2Chem.class);
        startActivity(intent);
    }
    public void openSem2Pps(View view){
//        Toast.makeText(this, "Opening PPS", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,Sem2Pps.class);
        startActivity(intent);
    }
    public void openSem2English(View view){
//        Toast.makeText(this, "Opening PPS", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,Sem2English.class);
        startActivity(intent);
    }
    public void openSem2Workshop(View view){
//        Toast.makeText(this, "Opening Workshop", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,Sem2Workshop.class);
        startActivity(intent);
    }

}