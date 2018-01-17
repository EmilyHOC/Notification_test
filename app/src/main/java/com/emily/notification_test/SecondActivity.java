package com.emily.notification_test;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    private Button btnCancel;
    //声明Notification
    private Notification notification;
    //声明NotificationManager
    private NotificationManager mNotification;
    //标识Notification的id
    private static final  int ID=1;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.second);
        btnCancel=this.findViewById(R.id.btnCancel);
        //获得NotificationManager的实例
        String service=NOTIFICATION_SERVICE;
        mNotification=(NotificationManager)getSystemService(service);
        //获得Notification的实例
        notification=new Notification();
        //设置改图标会在状态栏显示
        int icon=notification.icon=android.R.drawable.stat_sys_phone_call;
        //设置提示信息
        String tickText="Text Notification";
        //设置显示时间
        long when=System.currentTimeMillis();
        notification.icon=icon;
        notification.tickerText=tickText;
        notification.when=when;
        Intent intent=new Intent(this,MainActivity.class);
        PendingIntent pi=PendingIntent.getActivities(this,0, new Intent[]{intent},0);

        mNotification.notify(ID,notification);
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mNotification.cancel(ID);
            }
        });
    }

}
