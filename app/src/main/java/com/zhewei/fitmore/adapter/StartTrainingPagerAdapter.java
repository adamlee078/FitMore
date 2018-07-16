package com.zhewei.fitmore.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.zhewei.fitmore.user_interface.fragment.RoutineTrainingFragment;
import com.zhewei.fitmore.user_interface.fragment.SingleTrainingFragment;

import java.util.List;

public class StartTrainingPagerAdapter extends FragmentPagerAdapter {
    private String[] m_sTitles;

    public StartTrainingPagerAdapter(FragmentManager fm, String[] titles) {
        super(fm);
        m_sTitles = titles;
    }

    @Override
    public Fragment getItem(int iPosition) {
//        switch (iPosition) {
//            case 0:
//                return new RoutineTrainingFragment();
//            case 1:
//                return new RoutineTrainingFragment();
//            default:
//                return null;
//        }
        return new RoutineTrainingFragment();
    }

    @Override
    public int getCount() {
        return m_sTitles.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int iPosition) {
        return m_sTitles[iPosition];
    }
}
