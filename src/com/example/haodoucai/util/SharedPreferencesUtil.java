package com.example.haodoucai.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class SharedPreferencesUtil {
	private static SharedPreferences sp;
	private static SharedPreferencesUtil sharedPreferencesUtil;

	private SharedPreferencesUtil(Context context) {
		if (sp == null) {
			sp = context.getSharedPreferences("info", context.MODE_PRIVATE);
		}

	}
	public static SharedPreferencesUtil getInstance(Context context){
		if(sharedPreferencesUtil==null){
			sharedPreferencesUtil= new SharedPreferencesUtil(context);
			
		}
		return sharedPreferencesUtil;
	}
	/**
	 * �õ��Ƿ���ع�
	 * 
	 */
	public static boolean getIfLoad(){
		return sp.getBoolean("isLoad",false);
	}
	/**
	 * �����Ƿ���ع�
	 */
	  public static void setIfLoad(){
		  Editor editor= sp.edit();
		  editor.putBoolean("isLoad", true);
		  editor.commit();
	  }

}
