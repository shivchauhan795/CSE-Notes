package com.shivchauhan.csenotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Sem5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem5);
    }

    public void open_Sem5_Flat(View view) {
        opennotes("https://drive.google.com/drive/folders/1aUkw5RrzmsNdGYFCvLOyipJRp8aPHvI3?usp=sharing");
    }

    public void open_Sem5_Dbms(View view) {
        opennotes("https://drive.google.com/drive/folders/1AijZUxnsRs8QBAbzfiTP8qn3wwQtO4pE?usp=sharing");
    }

    public void open_Sem5_Se(View view) {
        opennotes("https://drive.google.com/drive/folders/130LACpcfHc7IAW_OsjWebg3wBnd1TWzr?usp=sharing");
    }

    public void open_Sem5_Wt(View view) {
        opennotes("https://drive.google.com/drive/folders/13KuNrpRB-5fOYNHUwGYTGabXF31iUU1z?usp=sharing");
    }

    public void open_Sem5_Erp(View view) {
        opennotes("https://drive.google.com/drive/folders/1ZEbkDPNwt7h3i32R8en599PqNeh6DzEB?usp=sharing");
    }

    public void open_Sem5_Coi(View view) {
        opennotes("https://drive.google.com/drive/folders/1Z8tfUO3sNLKzlHIGwprNDa7_Ezxn4krJ?usp=sharing");
    }

    public void open_Sem5_Cn(View view) {
        opennotes("https://drive.google.com/drive/folders/1ADAd3f7NnoAutVCembONf1Fp7e_dOke_?usp=sharing");
    }

    private void opennotes(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));

    }
}