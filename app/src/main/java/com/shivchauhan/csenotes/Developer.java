package com.shivchauhan.csenotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Developer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer);

    }
    public void open_linkedin(View view){
        openlink("https://www.linkedin.com/in/shivchauhan795");
    }
    public void open_youtube(View view){
        openlink("https://www.youtube.com/@shivchauhan795");
    }
    private void openlink(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}