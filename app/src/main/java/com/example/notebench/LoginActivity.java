package com.example.notebench;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity {
private FirebaseAuth mAuth;

private static final String TAG="LoginActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mAuth = FirebaseAuth.getInstance();
    Log.d(TAG, "onCreate: "+mAuth);

        Toast.makeText(this, mAuth.toString(), Toast.LENGTH_SHORT).show();

    }


    @Override
    protected void onStart() {
        super.onStart();

        // check if user is signed in (non-null) and update UI accordingly.

        FirebaseUser currentUser = mAuth.getCurrentUser();
        if(currentUser!=null)
        {

        }
    }
}