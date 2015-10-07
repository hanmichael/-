package com.example.haodoucai.adapter;

import java.util.List;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class LoadingpaperAdapter extends FragmentPagerAdapter {
private List<Fragment> fs;
	public LoadingpaperAdapter(FragmentManager fm,List<Fragment>fs) {
		super(fm);
		this.fs= fs;
		// TODO Auto-generated constructor stub
	}

	@Override
	public Fragment getItem(int position) {
		// TODO Auto-generated method stub
		return fs.get(position);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return fs.size();
	}

}
