package com.example.pakarkedelai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class Tentang extends AppCompatActivity {
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang);

        back = findViewById(R.id.back);

        back.setOnClickListener(v -> {
            Intent intent = new Intent(Tentang.this, MainActivity.class);
            finish();
            startActivity(intent);
        });
    }
}