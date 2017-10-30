package com.darryncampbell.versionupdatetester;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try
        {
            PackageInfo pInfo = this.getPackageManager().getPackageInfo(getPackageName(), 0);
            String version = pInfo.versionName;
            int verCode = pInfo.versionCode;
            TextView txtVersionName = (TextView) findViewById(R.id.txtVersionName);
            TextView txtVersionCode = (TextView) findViewById(R.id.txtVersionCode);
            txtVersionName.setText(version);
            txtVersionCode.setText("" + verCode);
        }
        catch (PackageManager.NameNotFoundException e)
        {
            e.printStackTrace();
        }

    }
}
