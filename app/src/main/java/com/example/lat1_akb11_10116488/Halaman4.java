package com.example.lat1_akb11_10116488;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Halaman4 extends AppCompatActivity {

    private String KEY_NAME = "kamu";
    private String name;
    TextView sayhi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman4);

        sayhi = (TextView) findViewById(R.id.sayhi);

        Bundle extras = getIntent().getExtras();
        name = extras.getString(KEY_NAME);
        sayhi.setText("Beres! Sekarang "+name+" udah bisa ngecek penggunaan HP mu tiap hari buat bantu kamu ngatur waktu :)");
    }
}
