package com.example.administrator.testgps;

import android.content.Context;

public class DeviceUtil {
    public static final void openGPS(Context context) {
        //方法一：无效
//        Intent GPSIntent = new Intent();
//        GPSIntent.setClassName("com.android.settings",
//                "com.android.settings.widget.SettingsAppWidgetProvider");
//        GPSIntent.addCategory("android.intent.category.ALTERNATIVE");
//        GPSIntent.setData(Uri.parse("custom:3"));
//        try {
//            PendingIntent.getBroadcast(context, 0, GPSIntent, 0).send();
//        } catch (PendingIntent.CanceledException e) {
//            e.printStackTrace();
//        }
    }
}
