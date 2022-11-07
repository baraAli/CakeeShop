package com.example.cakeeshop;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        getSupportActionBar().hide();
        Button workhours = findViewById(R.id.button2);
        Button startphone = findViewById(R.id.button4);
        workhours.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder( MainActivity.this);
                builder.setMessage("8:00 AM - 12:00 PM\n"+
                                "3:00 PM - 12:00 AM")
                        .setTitle("Work Hours");
                AlertDialog dialog = builder.create();
                dialog.show();
                return false;
            }
        });
        workhours.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText( MainActivity.this,   "Please press long",
                        Toast.LENGTH_LONG).show();
            }
        });
        startphone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("tel:966568475200"));
                startActivity(i);
            }
        });
    }
    public void goSec(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    public void btn(View view) {
        Toast toast = new Toast(this);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER,0,0);
        LayoutInflater ly = getLayoutInflater();
        View view1= ly.inflate(R.layout.toset, (ViewGroup) findViewById(R.id.liner));
        TextView txt = (TextView) view1.findViewById(R.id.textView2);
        txt.setText("welcome to the Shop");
        toast.setView(view1);
        toast.show();
    }
}
