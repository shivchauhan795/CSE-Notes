package com.shivchauhan.csenotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Sem6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem6);
    }

    public void open_Sem5_Wc(View view) {
        opennotes("https://drive.google.com/drive/folders/1Tj4j7X6kp8-olaktid54Etp0KTwZvhTW?usp=sharing");
    }

    public void open_Sem5_Ai(View view) {
        opennotes("https://drive.google.com/drive/folders/1kHVGBjoltWqL-_OVw9rO0-Kc518DrIZ0?usp=sharing");
    }

    public void open_Sem5_Cc(View view) {
        opennotes("https://drive.google.com/drive/folders/1LUvMK-ktmvKw-JtjRFQiXEqY4GTFPgl2?usp=sharing");
    }

    public void open_Sem5_Cd(View view) {
        opennotes("https://drive.google.com/drive/folders/1wAKSqrUJibchiAPpyqZ1JcjA1l1fGyMb?usp=sharing");
    }

    public void open_Sem5_Mad(View view) {
        opennotes("https://drive.google.com/drive/folders/1BEZiSRIvFdCzKwjLnc6nuralYN9QCwEw?usp=sharing");
    }

    public void open_Sem5_Ml(View view) {
        opennotes("https://drive.google.com/drive/folders/1ZGoVcADFA6kIP6m-ks2s9ITQ82Nxxde5?usp=sharing");
    }

    private void opennotes(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));

    }
}