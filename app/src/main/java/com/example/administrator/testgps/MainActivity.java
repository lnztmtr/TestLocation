package com.example.administrator.testgps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnForceOpenLocation;
    private Button btnForceCloseLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnForceOpenLocation=(Button)findViewById(R.id.btn_force_open_location);
        btnForceCloseLocation=(Button)findViewById(R.id.btn_force_close_location);
        btnForceOpenLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DeviceUtil.openGPS(MainActivity.this);
            }
        });
    }
}
