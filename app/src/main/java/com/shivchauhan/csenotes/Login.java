package com.shivchauhan.csenotes;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity {
    EditText email, password;
    Button login;
    TextView forgot_password;
    FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = findViewById(R.id.login_email);
        password = findViewById(R.id.login_password);
        login = findViewById(R.id.login);
        forgot_password = findViewById(R.id.forgot_password);

        auth = FirebaseAuth.getInstance();
        if (auth.getCurrentUser() != null) {
            startActivity(new Intent(Login.this, Dashboard.class));
            finish();
        }


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt_email = email.getText().toString();
                String txt_password = password.getText().toString();

                if (txt_email.isEmpty()) {
                    email.setError("Email Required");
                    email.requestFocus();
                } else if (txt_password.isEmpty()) {
                    password.setError("Password Required");
                    password.requestFocus();
                } else {
                    Toast.makeText(Login.this, "Logging In...", Toast.LENGTH_SHORT).show();
                    loginUser(txt_email, txt_password);
                }
            }
        });
    }

    private void loginUser(String txt_email, String txt_password) {

        auth.signInWithEmailAndPassword(txt_email, txt_password).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
            @Override
            public void onSuccess(AuthResult authResult) {
                Toast.makeText(Login.this, "Logged In Successfully", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(Login.this, Dashboard.class));
                finishAffinity();

            }
        });
        auth.signInWithEmailAndPassword(txt_email, txt_password).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(Login.this, "Invalid Credentials", Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void open_forgot_password(View view) {
        Intent intent = new Intent(this, forgot_password.class);
        startActivity(intent);
    }

}