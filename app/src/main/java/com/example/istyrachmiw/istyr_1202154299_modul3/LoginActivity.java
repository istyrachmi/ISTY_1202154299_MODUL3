package com.example.istyrachmiw.istyr_1202154299_modul3;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText user, pass; //membuat variabel
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //mendefinisikan variabel dan menghubungkan dengan layout
        user = (EditText)findViewById(R.id.username);
        pass = (EditText)findViewById(R.id.password);
        login = (Button) findViewById(R.id.button_login);
        //kondisi yang terjadi apabila Login
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usernameKey = user.getText().toString();
                String passwordKey = pass.getText().toString();

                if (usernameKey.equals("EAD") && passwordKey.equals("MOBILE")){
                    Toast.makeText(getApplicationContext(),"Login is Sucess",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    intent.putExtra("admin", usernameKey);
                    LoginActivity.this.startActivity(intent);
                } else{
                    AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this);
                    builder.setMessage("Username or password is Wrong !").setNegativeButton("Please Retry...", null).create().show();
                }
            }
        });
    }
}