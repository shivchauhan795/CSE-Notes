package com.shivchauhan.csenotes;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class forgot_password extends AppCompatActivity {
    EditText reset_email_pass;
    Button reset_password;
    FirebaseAuth auth;
    String mail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        reset_password = findViewById(R.id.reset_password);
        reset_email_pass = findViewById(R.id.reset_email_pass);

        reset_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                auth = FirebaseAuth.getInstance();
                validate();
            }
        });

    }

    private void validate() {
        mail = reset_email_pass.getText().toString();
        if (mail.isEmpty()) {
            Toast.makeText(forgot_password.this, "Please Enter Your Mail", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(forgot_password.this, "Sending Mail...", Toast.LENGTH_SHORT).show();
            forgetpass();
        }
    }

    private void forgetpass() {

        auth.sendPasswordResetEmail(mail).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if (task.isSuccessful()) {
                    Toast.makeText(forgot_password.this, "Check Your Mail Box Or Spam Folder", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(forgot_password.this, "Enter Your Registered Mail", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}