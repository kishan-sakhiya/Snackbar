package com.rku_18fotca11036.snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    Button btnDefault,btnAction,btnCustom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAction = findViewById(R.id.btnAction);
        btnDefault = findViewById(R.id.btnDefault);
        btnCustom = findViewById(R.id.btnCustom);

        btnDefault.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, R.string.d_s, Snackbar.LENGTH_LONG).show();
            }
        });

        btnAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar.make(v,"Internet Required",BaseTransientBottomBar.LENGTH_INDEFINITE);
                snackbar.setAction("Retrive", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "ok", Toast.LENGTH_SHORT).show();
                    }
                });
                snackbar.show();
            }
        });

        btnCustom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar.make(v, "Internet Required", BaseTransientBottomBar.LENGTH_INDEFINITE);
                
                snackbar.setAction("retrive", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "ok", Toast.LENGTH_SHORT).show();
                    }
                });
                snackbar.setBackgroundTint(getResources().getColor(R.color.snack_bg));
                snackbar.setActionTextColor(getResources().getColor(R.color.snack_btn));
                snackbar.setTextColor(getResources().getColor(R.color.snack_txt));
//                snackbar.setDuration(5000);
                snackbar.show();
            }
        });
    }
}