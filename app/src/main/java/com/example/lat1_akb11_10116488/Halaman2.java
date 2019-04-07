package com.example.lat1_akb11_10116488;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Halaman2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman2);
    }

    public void Masuk(View view) {
        Intent klik = new Intent(Halaman2.this, Halaman3.class);
        startActivity(klik);
    }
}
