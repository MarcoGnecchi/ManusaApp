package it.manusaservices.activities;

import it.manusaserveces.activities.R;
import it.manusaservices.fragments.CustomerFragment;
import it.manusaservices.fragments.PaymentsFragment;
import it.manusaservices.fragments.ReportFragment;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import com.viewpagerindicator.TabPageIndicator;

public class ReportActivity extends FragmentActivity {

	private static final String[] CONTENT = new String[] {"Customer", "Payments", "Details"};
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.report);

		FragmentPagerAdapter adapter = new ManusaPagerAdapter(
				getSupportFragmentManager());

		// Set the pager with an adapter
		ViewPager pager = (ViewPager) findViewById(R.id.pager);

		pager.setAdapter(adapter);

		TabPageIndicator indicator = (TabPageIndicator) findViewById(R.id.indicator);
		indicator.setViewPager(pager);

	}

	class ManusaPagerAdapter extends FragmentPagerAdapter {
		
		private int mCount = CONTENT.length;

		
		public ManusaPagerAdapter(FragmentManager fm) {
			super(fm);
		}

		@Override
		public Fragment getItem(int position) {
			switch (position) {
			case 0:
				return ReportFragment.newInstance();
			case 1:
				return PaymentsFragment.newInstance();
			case 2:
				return CustomerFragment.newInstance();

			default:
				return CustomerFragment.newInstance();
			}
		
		}

		@Override
		public CharSequence getPageTitle(int position) {
			return CONTENT[position].toUpperCase();
		}

		@Override
		public int getCount() {
			return CONTENT.length;
		}
		
			
	}
}
