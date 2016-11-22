package com.tecii.android.service;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {

    TextView txtMsg;
    ComponentName service;
    Intent intentMyService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtMsg = (TextView)findViewById(R.id.txtMsg);
        findViewById(R.id.btnStopSer).setOnClickListener(this);
        intentMyService = new Intent(this, MyService.class);
        service = startService(intentMyService);
        txtMsg.setText("MmyService started\n (see LogCat)");
    }

    @Override
    public void onClick(View v){
        try{stopService(intentMyService);
            txtMsg.setText("After stopping service: \n" + service.getClassName());
        } catch (Exception e){
            Toast.makeText(this, e.getMessage(), 1).show();
        }
    }
}
