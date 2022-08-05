package com.shivchauhan.csenotes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Login_Register_main extends AppCompatActivity {
    CardView login, register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_register_main);
        login = findViewById(R.id.login);
        register = findViewById(R.id.register);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Login_Register_main.this, "Thanks", Toast.LENGTH_SHORT).show();
                Intent intent  = new Intent(Login_Register_main.this,Login.class);
                startActivity(intent);
                
            }
        });
    }


//    public void openLogin(View view) {
//        Intent intent = new Intent(this, Login.class);
//        startActivity(intent);
//    }

    public void openRegister(View view) {
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }

}