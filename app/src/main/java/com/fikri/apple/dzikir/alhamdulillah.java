package com.fikri.apple.dzikir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class alhamdulillah extends AppCompatActivity {


    TextView zikir, nomer;
    Button clik, zikirselajutnya;
    private int tambahAngka;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alhamdulillah);

        nomer = findViewById(R.id.nomer);
        clik = findViewById(R.id.clik);
        zikirselajutnya = findViewById(R.id.zikirselanjutnya);


        clik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (tambahAngka >= 33) {
                    Toast.makeText(alhamdulillah.this, "Angka Maksimal ", Toast.LENGTH_SHORT).show();
                    zikirselajutnya.setVisibility(View.VISIBLE);
                } else {
                    tambahAngka = tambahAngka + 1;
                    zikirselajutnya.setVisibility(View.GONE);
                }
                nomer.setText(String.valueOf(tambahAngka));
            }


        });

        zikirselajutnya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent alhamdulillah = new Intent(alhamdulillah.this, allahuakbar.class);
                startActivity(alhamdulillah);
                finish();
            }

        });

    }
}
