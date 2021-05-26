package com.example.tekbasinaingilizce;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.EmittedSource;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class KurtarmaActi extends AppCompatActivity {

    private Button SifirlaSifre;
    private EditText Email;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kurtarma);

        mAuth = FirebaseAuth.getInstance();

        SifirlaSifre = (Button) findViewById(R.id.btnKurtar);
        Email = (EditText) findViewById(R.id.txtKurtar);

        SifirlaSifre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userEmail = Email.getText().toString();
                if (TextUtils.isEmpty(userEmail)){
                    Toast.makeText(KurtarmaActi.this,"Emailinizi yazınız lütfen",Toast.LENGTH_LONG).show();
                }
                else {
                    mAuth.sendPasswordResetEmail(userEmail).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            if (task.isSuccessful()){
                                Toast.makeText(KurtarmaActi.this,"E-mail'izi kontrol ediniz. İşlem başarılı",Toast.LENGTH_LONG).show();
                                startActivity(new Intent(KurtarmaActi.this,Girisacti.class));

                            }
                            else{Toast.makeText(KurtarmaActi.this,"Kayıtlı E-Mail Bulunamadı",Toast.LENGTH_LONG).show();}
                        }
                    });
                }
            }
        });
    }
}