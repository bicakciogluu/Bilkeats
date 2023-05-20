package com.omerbicakcioglu.bilkeats.login_signup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.omerbicakcioglu.bilkeats.databinding.ActivitySignUpPageBinding;

import com.omerbicakcioglu.bilkeats.login_signup.profiling_user.ProfilingUser;

public class SignUpPage extends AppCompatActivity {
    private ActivitySignUpPageBinding binding;
    private FirebaseAuth auth;
    private FirebaseStorage firebaseStorage;
    private FirebaseFirestore firebaseFirestore;
    private StorageReference storageReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignUpPageBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        auth = FirebaseAuth.getInstance();
        firebaseFirestore = FirebaseFirestore.getInstance();
        firebaseStorage = FirebaseStorage.getInstance();
        storageReference = firebaseStorage.getReference();


    }

    public void signUpButtonClicked(View view){
        String emailText = binding.emailText.getText().toString();
        String passwordText = binding.passwordText.getText().toString();
        String conPasText = binding.conpas.getText().toString();
        if(passwordText.length()>7 && !(emailText.equals("")) && passwordText.equals(conPasText)){
            auth.createUserWithEmailAndPassword(emailText,passwordText).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                @Override
                public void onSuccess(AuthResult authResult) {
                    Intent intent = new Intent(SignUpPage.this, ProfilingUser.class);
                    startActivity(intent);
                    finish();
                    storageReference.child("Users/" + emailText);
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