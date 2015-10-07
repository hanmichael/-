package com.example.haodoucai;

import com.example.haodoucai.util.NetReceiver;
import com.example.haodoucai.util.SharedPreferencesUtil;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.Window;

public class WelcomeActivity extends Activity {
	SharedPreferencesUtil spUtil;
	// 线程
	Handler myHandler = new Handler();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_welcome);
		spUtil = SharedPreferencesUtil.getInstance(this);
		// 启动Ner
		startService(new Intent(this, NetReceiver.class));
		myHandler.postDelayed(runInstance, 2000);
	}

	Runnable runInstance = new Runnable() {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			// 判断之前是否进入过首页
			boolean ifLoad = spUtil.getIfLoad();
			if (ifLoad) {
				Intent intent = new Intent(WelcomeActivity.this,
						MainActivity.class);
				startActivity(intent);
			} else {
				Intent intent = new Intent(WelcomeActivity.this,
						LoadingActivity.class);
				startActivity(intent);
			}
			WelcomeActivity.this.finish();
		}
	};

}
