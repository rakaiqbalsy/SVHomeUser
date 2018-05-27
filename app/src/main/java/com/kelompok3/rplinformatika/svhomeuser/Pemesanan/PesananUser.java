package com.kelompok3.rplinformatika.svhomeuser.Pemesanan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.kelompok3.rplinformatika.svhomeuser.Keranjang.KeranjangActivity;
import com.kelompok3.rplinformatika.svhomeuser.Model.Pemesan;
import com.kelompok3.rplinformatika.svhomeuser.R;

public class PesananUser extends AppCompatActivity {


    private TextView nama, rumahku, emailku;
    private Button btnOK;
    private FirebaseDatabase database;
    private DatabaseReference table_user;

    private String userID;
    private FirebaseAuth firebaseAuth;
    private FirebaseAuth.AuthStateListener authStateListener;

    Pemesan pemesan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesanan_user);

        Pemesan pemesan = new Pemesan();

        btnOK = findViewById(R.id.btnOK);
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PesananUser.this, KeranjangActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
