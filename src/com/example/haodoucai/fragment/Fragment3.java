package com.example.haodoucai.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.haodoucai.MainActivity;
import com.example.haodoucai.R;
import com.example.haodoucai.util.SharedPreferencesUtil;

public class Fragment3 extends Fragment {
	SharedPreferencesUtil spUtil;
  @Override
  
public View onCreateView(LayoutInflater inflater, ViewGroup container,
		Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	spUtil= SharedPreferencesUtil.getInstance(getActivity());
	 View layout= inflater.inflate(R.layout.fragment_loding3, null);
	 TextView tvgo= (TextView)layout.findViewById(R.id.tvgo);
	 tvgo.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
	spUtil.setIfLoad();
	Intent intent=new Intent(getActivity(), MainActivity.class);
	startActivity(intent);
	getActivity().finish();
	
			
		}
	});
	return layout;
}
}
