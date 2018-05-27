package com.kelompok3.rplinformatika.svhomeuser.Dashboard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;
import com.kelompok3.rplinformatika.svhomeuser.Bantuan.BantuanActivity;
import com.kelompok3.rplinformatika.svhomeuser.Keranjang.KeranjangActivity;
import com.kelompok3.rplinformatika.svhomeuser.Office.OfficeActivity;
import com.kelompok3.rplinformatika.svhomeuser.R;
import com.kelompok3.rplinformatika.svhomeuser.RegisterdanLogin.LoginActivity;
import com.kelompok3.rplinformatika.svhomeuser.RumahActivity.RumahActivity;

public class Dashboard extends AppCompatActivity {

    private CardView carirumah, pesanan, kantor, bantuan, logout;

    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        firebaseAuth = FirebaseAuth.getInstance();
        carirumah = findViewById(R.id.cardviewCari);
        pesanan = findViewById(R.id.cardviewPesanan);
        kantor = findViewById(R.id.cardviewKantor);
        bantuan = findViewById(R.id.cardviewBantuan);
        logout = findViewById(R.id.cardviewLogout);

        carirumah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Dashboard.this, RumahActivity.class);
                startActivity(i);
            }
        });

        pesanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Dashboard.this, KeranjangActivity.class);
                startActivity(a);
            }
        });

        kantor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(Dashboard.this, OfficeActivity.class);
                startActivity(j);
            }
        });

        bantuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this, BantuanActivity.class);
                startActivity(intent);
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firebaseAuth.signOut();
                finish();
                Intent c = new Intent(Dashboard.this, LoginActivity.class);
                startActivity(c);
            }
        });

    }
}
