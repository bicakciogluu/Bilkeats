package com.omerbicakcioglu.bilkeats.login_signup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.omerbicakcioglu.bilkeats.databinding.ActivitySignUpPageBinding;

import com.omerbicakcioglu.bilkeats.R;
import com.omerbicakcioglu.bilkeats.main.MainActivity;

public class SignUpPage extends AppCompatActivity {
    private ActivitySignUpPageBinding binding;
    private FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignUpPageBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        auth = FirebaseAuth.getInstance();


    }

    public void signUpButtonClicked(View view){
        String emailText = binding.emailText.getText().toString();
        String passwordText = binding.passwordText.getText().toString();
        String conPasText = binding.conpas.getText().toString();
        if(passwordText.length()>7 && !(emailText.equals("")) && passwordText.equals(conPasText)){
            auth.createUserWithEmailAndPassword(emailText,passwordText).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                @Override
                public void onSuccess(AuthResult authResult) {
                    Intent intent = new Intent(SignUpPage.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(SignUpPage.this, e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                }
            });
        }
        else{
            Toast.makeText(this, "Somethig went wrong, please check the password and email again.", Toast.LENGTH_SHORT).show();
        }
    }
          public void haveAccountClicked(View view){
              startActivity(new Intent(SignUpPage.this, LoginPage.class));
          }
}