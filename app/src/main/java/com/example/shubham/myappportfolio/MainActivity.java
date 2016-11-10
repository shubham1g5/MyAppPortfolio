package com.example.shubham.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    String[] appNames = new String[]{
            "Popular Movies",
            "Stock Hawk",
            "Build it Bigger",
            "Make Your App Material",
            "Go Ubiquitous",
            "Capstone"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int[] appIds = new int[]{
                R.id.app1_button,
                R.id.app2_button,
                R.id.app3_button,
                R.id.app4_button,
                R.id.app5_button,
                R.id.app6_button
        };
        for (int appId: appIds) {
            findViewById(appId).setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.app1_button:
                showLaunchMessage(appNames[0]);
                break;
            case R.id.app2_button:
                showLaunchMessage(appNames[1]);
                break;
            case R.id.app3_button:
                showLaunchMessage(appNames[2]);
                break;
            case R.id.app4_button:
                showLaunchMessage(appNames[3]);
                break;
            case R.id.app5_button:
                showLaunchMessage(appNames[4]);
                break;
            case R.id.app6_button:
                showLaunchMessage(appNames[5]);
                break;
            default:
                showLaunchMessage("Dude you forgot to specify me!");
        }
    }

    private void showLaunchMessage(String appName) {
        Toast.makeText(this,getResources().getString(R.string.app_launch_msg,appName),Toast.LENGTH_LONG).show();
    }
}
