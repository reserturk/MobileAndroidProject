package com.example.tekbasinaingilizce;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class kayitacti extends AppCompatActivity {
    EditText email, password;
   // private FirebaseAuth mAuth;
private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kayitacti);
        email = findViewById(R.id.txtKayitEmail);
        password = findViewById(R.id.txtKayitSifre);


        mAuth = FirebaseAuth.getInstance();

    }


    public void Kayitol1(View view) {

        mAuth.createUserWithEmailAndPassword(email.getText().toString(), password.getText().toString())
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if (task.isSuccessful()) {

                            Intent intent = new Intent(getApplicationContext(),Girisacti.class);
                            startActivity(intent);


                        } else {
                            Toast.makeText(kayitacti.this, "Kayıt işlemi başarısız.", Toast.LENGTH_LONG).show();
                        }

                    }
                });
    }
}
