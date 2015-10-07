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
     // �õ�
		ConnectivityManager manager= (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
		//�õ�wife ���ƶ�
		NetworkInfo wifi= manager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
		NetworkInfo mobile= manager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
		//�� �����ж�
		if(!wifi.isConnected()&& !mobile.isConnected()){
			Toast.makeText(context, "û����������", 1).show();
		}else{
			Toast.makeText(context, "����������", 1).show();
		}
	}

}
