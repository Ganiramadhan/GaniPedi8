package com.example.ganipedi8;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;




public class MainActivity extends AppCompatActivity {
    EditText username, password;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         username = (EditText)
                findViewById(R.id.EditTextView_username);
         password = (EditText)
                findViewById(R.id.EditTextView_password);
         btnLogin = (Button)
                findViewById(R.id.ButtonView_login);

        btnLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String usernameKey = username.getText().toString();
                String passwordKey = password.getText().toString();
                if (usernameKey.equals("admin") && passwordKey.equals("admin")){
                    Toast.makeText(getApplicationContext(), "LOGIN SUKSES", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, Submenu.class);
                    MainActivity.this.startActivity(intent);
                    finish();

                }
                else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage("Username atau Password Anda salah!").setNegativeButton("Retry", null).create().show();
                }
            }
        });

        }
    }

