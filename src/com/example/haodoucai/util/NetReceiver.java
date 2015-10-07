package com.example.haodoucai.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

public class NetReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
     // 得到
		ConnectivityManager manager= (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
		//得到wife 和移动
		NetworkInfo wifi= manager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
		NetworkInfo mobile= manager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
		//再 进行判断
		if(!wifi.isConnected()&& !mobile.isConnected()){
			Toast.makeText(context, "没有网络连接", 1).show();
		}else{
			Toast.makeText(context, "有网络连接", 1).show();
		}
	}

}
