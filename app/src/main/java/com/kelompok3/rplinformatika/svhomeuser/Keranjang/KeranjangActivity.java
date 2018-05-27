package com.kelompok3.rplinformatika.svhomeuser.Keranjang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.kelompok3.rplinformatika.svhomeuser.Pemesanan.PesananUser;
import com.kelompok3.rplinformatika.svhomeuser.R;

public class KeranjangActivity extends AppCompatActivity {

    private FirebaseDatabase database;
    private DatabaseReference table_pesanan;

    private EditText cekKTP;
    private Button btnCek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keranjang);

        database = FirebaseDatabase.getInstance();
        table_pesanan = database.getReference("pesanan");

        cekKTP = findViewById(R.id.cekKTP);

        btnCek = findViewById(R.id.btnCek);

        btnCek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                table_pesanan.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        if (dataSnapshot.child(cekKTP.getText().toString().trim()).exists()) {
                            Toast.makeText(KeranjangActivity.this, "ANDA TELAH MEMESAN RUMAH", Toast.LENGTH_LONG).show();
                            Intent i = new Intent(KeranjangActivity.this, PesananUser.class);
                            startActivity(i);
                        }
                        else {
                            Toast.makeText(KeranjangActivity.this, "ANDA BELUM MEMESAN RUMAH", Toast.LENGTH_LONG).show();
                        }
                    }


                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
            }
        });
    }
}
