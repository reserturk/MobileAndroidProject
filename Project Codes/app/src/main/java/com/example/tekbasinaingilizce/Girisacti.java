package com.example.tekbasinaingilizce;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;

import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Girisacti extends AppCompatActivity {

    EditText emailtext, passwordtext;
    //private FirebaseAuth gauth;
    private FirebaseAuth gauth;

    private LoginButton login;
    CallbackManager callbackManager;
    GoogleSignInClient mGoogleSignInClient;

    private static int RC_SIGN_IN=100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_girisacti);

        emailtext = findViewById(R.id.txtEmail);
        passwordtext = findViewById(R.id.txtSifre);
        gauth = FirebaseAuth.getInstance();
        //FacebookSdk.sdkInitialize(getApplicationContext());
        login = findViewById(R.id.login_button);

         callbackManager = CallbackManager.Factory.create();

        login.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                Intent intent = new Intent(getApplicationContext(), com.example.tekbasinaingilizce.ViewModel.anaMenu.class);
                startActivity(intent);
            }

            @Override
            public void onCancel() {

            }

            @Override
            public void onError(FacebookException error) {

            }
        });

        FirebaseUser user = gauth.getCurrentUser();
        if (user != null) {
            Intent intent = new Intent(getApplicationContext(), chatacti.class);
            startActivity(intent);

        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        callbackManager.onActivityResult(requestCode,resultCode,data);

    }

    public void Kurtar(View view){
        Intent intent = new Intent(getApplicationContext(), KurtarmaActi.class);
        startActivity(intent);
    }
    public void Girisyap(View view) {

        gauth.signInWithEmailAndPassword(emailtext.getText().toString(), passwordtext.getText().toString())
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Intent intent = new Intent(getApplicationContext(), com.example.tekbasinaingilizce.ViewModel.anaMenu.class);
                            startActivity(intent);

                        } else {
                            Toast.makeText(Girisacti.this, "Şifre veya Email Yanlış", Toast.LENGTH_LONG).show();
                        }

                    }
                });

    }

    public void kayitol(View view) {
        Intent intent = new Intent(getApplicationContext(), kayitacti.class);
        startActivity(intent);

    }
}