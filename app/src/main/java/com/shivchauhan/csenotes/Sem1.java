package com.shivchauhan.csenotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Sem1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem1);
    }
    public void openSem1Maths(View view){
//        Toast.makeText(this, "Opening Mathematics", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,Sem1Maths.class);
        startActivity(intent);
    }
    public void openSem1Physics(View view){
//        Toast.makeText(this, "Opening Physics", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,Sem1Physics.class);
        startActivity(intent);
    }
    public void openSem1Bee(View view){
//        Toast.makeText(this, "Opening BEE", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,Sem1Bee.class);
        startActivity(intent);
    }
    public void openSem1Egd(View view){
//        Toast.makeText(this, "Opening EGD", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,Sem1Egd.class);
        startActivity(intent);
    }
}