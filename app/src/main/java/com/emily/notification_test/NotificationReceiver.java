package com.emily.notification_test;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class NotificationReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        //实例化Intent
        Intent i=new Intent();
        //在新任务中启动Activity
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        //设置Intent启动的组件名称
        i.setClass(context,SecondActivity.class);
        //启动Activity，显示通知
        context.startActivity(i);
    }
}
