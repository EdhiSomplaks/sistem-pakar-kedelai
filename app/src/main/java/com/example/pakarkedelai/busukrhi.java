package com.example.pakarkedelai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class busukrhi extends AppCompatActivity {

    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busukrhi);

        back = findViewById(R.id.back);

        back.setOnClickListener(v -> {
            Intent intent = new Intent(busukrhi.this, daftar.class);
            finish();
            startActivity(intent);
        });
    }
}