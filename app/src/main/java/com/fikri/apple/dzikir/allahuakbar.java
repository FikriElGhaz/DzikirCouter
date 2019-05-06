package com.fikri.apple.dzikir;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class allahuakbar extends AppCompatActivity {


    TextView zikir, nomer;
    Button clik, zikirselajutnya;
    private int tambahangka;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.allahuakbar);

        nomer = findViewById(R.id.nomer);
        clik = findViewById(R.id.clik);
        zikirselajutnya = findViewById(R.id.zikirselanjutnya);


        clik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (tambahangka >= 33) {
                    Toast.makeText(allahuakbar.this, "Angka Maksimal ", Toast.LENGTH_SHORT).show();
                    zikirselajutnya.setVisibility(View.VISIBLE);
                } else {
                    tambahangka = tambahangka + 1;
                    zikirselajutnya.setVisibility(View.GONE);
                }
                nomer.setText(String.valueOf(tambahangka));
            }


        });

        zikirselajutnya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               finish();
            }

        });

    }
}
