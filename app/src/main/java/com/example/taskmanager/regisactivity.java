package com.example.taskmanager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class regisactivity extends AppCompatActivity {

    private EditText mail;
    private EditText pass;
    private Button btnreg;
    private TextView logtext;

    private FirebaseAuth mAuth;

    private ProgressDialog mDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regisactivity);

        mAuth = FirebaseAuth.getInstance();

        mail = findViewById(R.id.regem);
        pass = findViewById(R.id.regpass);
        btnreg = findViewById(R.id.regbtn);
        logtext = findViewById(R.id.logintext);

        logtext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String memail = mail.getText().toString().trim();
                String mpass = pass.getText().toString().trim();

                if(TextUtils.isEmpty(memail)){
                    mail.setError("Required Field!");
                }

                if(TextUtils.isEmpty(mpass)){
                    pass.setError("Required Field!");
                }

                mDialog.setMessage("Processing");
                mDialog.show();

                mAuth.createUserWithEmailAndPassword(memail,mpass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if(task.isSuccessful()){

                            Toast.makeText(regisactivity.this, "Successful!", Toast.LENGTH_SHORT).show();

                            startActivity(new Intent(getApplicationContext(),homeact.class));

                            mDialog.dismiss();

                        }
                        else{
                            Toast.makeText(regisactivity.this, "Problem!", Toast.LENGTH_SHORT).show();
                            mDialog.dismiss();
                        }

                    }
                });

            }
        });

    }
}
