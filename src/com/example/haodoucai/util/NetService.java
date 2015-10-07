package com.example.haodoucai.util;

import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.IBinder;
import android.util.Log;

public class NetService extends Service {
 NetReceiver netReceiver;
 @Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		netReceiver = new NetReceiver();
		IntentFilter filter = new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
		registerReceiver(netReceiver, filter);
		Log.i("*", "--NetRecevier¼àÌý¿ªÊ¼");
		
	}
	@Override

	public IBinder onBind(Intent arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
		public void onDestroy() {
			// TODO Auto-generated method stub
			super.onDestroy();
			unregisterReceiver(netReceiver);
			Log.i("**", "--NetReceiver ¼àÌý¹Ø±Õ");
		}

}
