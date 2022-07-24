package com.example.broadcastreceiver1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import android.widget.Toast;

public class WifiModeChangeReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent){
        if (isWifiModeOn(context.getApplicationContext())){
            Toast.makeText(context, "Wifi is On", Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(context, "Wifi is off", Toast.LENGTH_LONG).show();
        }
    }

    private static boolean isWifiModeOn(Context context) {
        return Settings.System.getInt(context.getContentResolver(),Settings.Global.WIFI_ON,0)!=0;
    }
}
