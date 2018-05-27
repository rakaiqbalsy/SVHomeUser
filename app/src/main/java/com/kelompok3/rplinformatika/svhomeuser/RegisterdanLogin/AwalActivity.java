package com.kelompok3.rplinformatika.svhomeuser.RegisterdanLogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.kelompok3.rplinformatika.svhomeuser.R;

public class AwalActivity extends AppCompatActivity {

    private Button loginawal, registerawal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_awal);

        loginawal = findViewById(R.id.btnMasukAwal);
        registerawal = findViewById(R.id.btnRegisterAwal);

        loginawal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AwalActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        registerawal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AwalActivity.this, RegistrasiActivity.class);
                startActivity(i);
            }
        });
    }
}
