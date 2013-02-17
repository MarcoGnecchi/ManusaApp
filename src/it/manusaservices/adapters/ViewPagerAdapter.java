package it.manusaservices.adapters;

import java.util.ArrayList;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;

public class ViewPagerAdapter extends PagerAdapter {
	final private ArrayList<View> mViewList;
	final private ArrayList<String> mTitleList;
	
	public ViewPagerAdapter() {
		mViewList = new ArrayList<View>();
		mTitleList = new ArrayList<String>();
	}

	public void addView(View view, String title) {
		if(view == null){return;}
		addView(view, title, false);
	}

	public void addView(View view, String title, boolean isAltered) {
		if(view == null){return;}
		mViewList.add(view);
		mTitleList.add(title.toUpperCase());
	}
	
	public void clear(){
		mViewList.clear();
		mTitleList.clear();
		notifyDataSetChanged();
	}

	@Override
	public void destroyItem(ViewGroup container, int position, Object view) {
		((ViewPager) container).removeView((View) view);
	}

	public int getCount() {
		return mViewList.size();
	}

	public Object getItem(int position) {
		return mViewList.get(position);
	}

	public long getItemId(int position) {
		return position;
	}

	public String getPageTitle(int position) {
		return mTitleList.get(position);
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		return mViewList.get(position);
	}

	@Override
	public Object instantiateItem(ViewGroup container, int position) {
		((ViewPager) container).addView(mViewList.get(position), 0);
		return mViewList.get(position);
	}
	

	@Override
	public boolean isViewFromObject(View view, Object object) {
		return view.equals( object );
	}

	public boolean shouldHideIndicator(){
		if(mViewList == null || getCount() < 2){
			return true;
		}
		return false;
	}

	
}
