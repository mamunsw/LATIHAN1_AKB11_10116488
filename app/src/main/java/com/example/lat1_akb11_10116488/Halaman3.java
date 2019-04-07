package com.example.lat1_akb11_10116488;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Halaman3 extends AppCompatActivity {

    EditText fillName, fillAge;
    Button btnNext;
    private String NAMA_KUNCI = "kamu";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman3);

        fillName = (EditText) findViewById(R.id.budi);
        btnNext = (Button) findViewById(R.id.selanjutnya);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = fillName.getText().toString();
                Intent klik = new Intent(Halaman3.this, Halaman4.class);
                klik.putExtra(NAMA_KUNCI, name);
                startActivity(klik);
            }
        });

    }

}
