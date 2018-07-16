package com.zhewei.fitmore.user_interface.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.zhewei.fitmore.R;
import com.zhewei.fitmore.adapter.MainFragmentAdapter;
import com.zhewei.fitmore.user_interface.fragment.BodyRecordsFragment;
import com.zhewei.fitmore.user_interface.fragment.PlanFragment;
import com.zhewei.fitmore.user_interface.fragment.SettingFragment;
import com.zhewei.fitmore.user_interface.fragment.StartTrainingFragment;
import com.zhewei.fitmore.user_interface.fragment.TrainingRecordsFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Toolbar m_toolbar;
    private ViewPager m_viewPager;
    private BottomNavigationView m_bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vInitViews();
        vInitControllers();
    }

    private void vInitViews() {
        m_bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);
        vInitToolbar();
        vInitViewPager();
    }

    private void vInitControllers() {
        m_bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        m_viewPager.addOnPageChangeListener(m_viewPOnPageChangeListener);
    }

    private void vInitToolbar() {
        m_toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(m_toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowTitleEnabled(false);
    }

    private void vInitViewPager() {
        m_viewPager = (ViewPager) findViewById(R.id.viewPagerMain);
        List<Fragment> listFragments = new ArrayList<>();
        listFragments.add(new StartTrainingFragment());
        listFragments.add(new PlanFragment());
        listFragments.add(new TrainingRecordsFragment());
        listFragments.add(new BodyRecordsFragment());
        listFragments.add(new SettingFragment());
        List<String> listTitles = new ArrayList<>();
        listTitles.add(getResources().getString(R.string.title_start_training));
        listTitles.add(getResources().getString(R.string.title_plan));
        listTitles.add(getResources().getString(R.string.title_training_record));
        listTitles.add(getResources().getString(R.string.title_body_record));
        listTitles.add(getResources().getString(R.string.title_setting));
        m_viewPager.setAdapter(new MainFragmentAdapter(getSupportFragmentManager(), listFragments, listTitles));
    }

    //Listener___Start__________________________________________________________________________________________
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_start:
                    m_viewPager.setCurrentItem(0);
                    return true;
                case R.id.navigation_plan:
                    m_viewPager.setCurrentItem(1);
                    return true;
                case R.id.navigation_training_records:
                    m_viewPager.setCurrentItem(2);
                    return true;
                case R.id.navigation_body_record:
                    m_viewPager.setCurrentItem(3);
                    return true;
                case R.id.navigation_setting:
                    m_viewPager.setCurrentItem(4);
                    return true;
            }
            return false;
        }
    };

    private ViewPager.OnPageChangeListener m_viewPOnPageChangeListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int i, float v, int i1) {
        }

        @Override
        public void onPageSelected(int iPosition) {
            switch (iPosition) {
                case 0:
                    m_bottomNavigationView.setSelectedItemId(R.id.navigation_start);
                    break;
                case 1:
                    m_bottomNavigationView.setSelectedItemId(R.id.navigation_plan);
                    break;
                case 2:
                    m_bottomNavigationView.setSelectedItemId(R.id.navigation_training_records);
                    break;
                case 3:
                    m_bottomNavigationView.setSelectedItemId(R.id.navigation_body_record);
                    break;
                case 4:
                    m_bottomNavigationView.setSelectedItemId(R.id.navigation_setting);
                    break;
            }
        }

        @Override
        public void onPageScrollStateChanged(int i) {
        }
    };

    //Listener___End____________________________________________________________________________________________

}
