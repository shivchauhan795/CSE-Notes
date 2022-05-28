package com.shivchauhan.csenotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openSem1Activity(View view){
//        Toast.makeText(this, "Opening 1st Semester", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,Sem1.class);
        startActivity(intent);
    }
    public void openSem2Activity(View view){
//        Toast.makeText(this, "Opening 2nd Semester", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,Sem2.class);
        startActivity(intent);
    }
    public void contribute(View view){
        Toast.makeText(this, "Thank you!!", Toast.LENGTH_SHORT).show();
        String [] addresses = {"csenoteshelp@gmail.com"};
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("*/*");
        intent.putExtra(Intent.EXTRA_EMAIL, addresses);
//        intent.putExtra(Intent.EXTRA_TEXT,"Thanks for the Support!!");
//        intent.putExtra(Intent.EXTRA_SUBJECT, "This is a subject");
        boolean attachment = false;
        intent.putExtra(Intent.EXTRA_STREAM, attachment);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}