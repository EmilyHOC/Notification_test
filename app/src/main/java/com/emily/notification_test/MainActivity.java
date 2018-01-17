package com.emily.notification_test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnSend;
    //定义BroadcastReceiver的action
    private static final  String NotificationDemo_Action="com.andyidea.notification.NotificationDemo_Action";

    /*第一次调用Activity活动*/


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSend=this.findViewById(R.id.btnSend);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setAction(NotificationDemo_Action);
                sendBroadcast(intent);
            }
        });

    }
}
