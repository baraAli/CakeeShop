package com.example.cakeeshop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ImageView i = findViewById(R.id.imageView);
        ImageView ii = findViewById(R.id.imageView4);
        ImageView iii = findViewById(R.id.imageView5);
        ImageView ib = findViewById(R.id.imageView6);

        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText( MainActivity3.this,
                        "Strawberry  cake\n" +
                                "piece 27:SAR",
                        Toast.LENGTH_LONG).show();
            }
        });

        ii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText( MainActivity3.this,
                        "Vanilla  cake\n" +
                                "piece 27:SAR",
                        Toast.LENGTH_LONG).show();
            }
        });
        iii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText( MainActivity3.this,
                        "Travl cake\n" +
                                "piece 27:SAR",
                        Toast.LENGTH_LONG).show();

            }
        });
        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText( MainActivity3.this,
                        " Blueberry cake\n" +
                                "piece 27:SAR",
                        Toast.LENGTH_LONG).show();

            }
        });
    }

    public void Back(View view) {
        Intent i = new Intent(this, MainActivity2.class);
        startActivity(i);
    }

}
