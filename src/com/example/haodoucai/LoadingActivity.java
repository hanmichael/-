package com.example.haodoucai;

import java.util.ArrayList;
import java.util.List;

import com.example.haodoucai.adapter.LoadingpaperAdapter;
import com.example.haodoucai.fragment.Fragment1;
import com.example.haodoucai.fragment.Fragment2;
import com.example.haodoucai.fragment.Fragment3;

import android.os.Bundle;
import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Menu;

public class LoadingActivity extends FragmentActivity {
ViewPager vpLoading;
List<Fragment> fs= new ArrayList<Fragment>();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_loading);
		vpLoading= (ViewPager) findViewById(R.id.vpLoading);
		// ≥ı ºªØÀÈ∆¨
		initFragments();
		//¥¥Ω®  ≈‰∆˜
		LoadingpaperAdapter adapter= new LoadingpaperAdapter(getSupportFragmentManager(), fs);
		//ÃÓ≥‰  ≈‰∆˜
		vpLoading.setAdapter(adapter);
		
	}

 private void initFragments(){
	 fs.add(new Fragment1());
	 fs.add(new Fragment2());
	 fs.add(new Fragment3());
 }

}
