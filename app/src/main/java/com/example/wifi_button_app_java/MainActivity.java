package com.example.wifi_button_app_java;

import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button on, off;
    WifiManager wifiManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        on = findViewById(R.id.button);
        off = findViewById(R.id.button2);
        wifiManager = (WifiManager) getApplicationContext().getSystemService(WIFI_SERVICE);

        on.setOnClickListener(v -> wifiManager.setWifiEnabled(true));

        off.setOnClickListener(v -> wifiManager.setWifiEnabled(false));
    }
}