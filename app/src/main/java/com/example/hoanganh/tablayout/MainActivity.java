package com.example.hoanganh.tablayout;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.hoanganh.tablayout.Fragment.FirstFragment;
import com.example.hoanganh.tablayout.Fragment.SecondFragment;
import com.example.hoanganh.tablayout.Fragment.ThirdFragment;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        viewPager = (ViewPager) findViewById(R.id.view_pager);

        setUpPager();
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setUpPager() {
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new FirstFragment(), getResources().getString(R.string.tab_layout_a_name));
        viewPagerAdapter.addFragment(new SecondFragment(), getResources().getString(R.string.tab_layout_b_name));
        viewPagerAdapter.addFragment(new ThirdFragment(), getResources().getString(R.string.tab_layout_c_name));
        viewPager.setAdapter(viewPagerAdapter);
    }
}
