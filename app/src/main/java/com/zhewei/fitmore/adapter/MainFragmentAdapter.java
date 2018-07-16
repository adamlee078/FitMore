package com.zhewei.fitmore.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

public class MainFragmentAdapter extends FragmentPagerAdapter {
    private List<Fragment> m_listFragments;
    private List<String> m_listTitles;

    public MainFragmentAdapter(FragmentManager fm, List<Fragment> listFragments, List<String> listTitles) {
        super(fm);

        m_listFragments = listFragments;
        m_listTitles = listTitles;
    }

    @Override
    public Fragment getItem(int iPosition) {
        return m_listFragments.get(iPosition);
    }

    @Override
    public int getCount() {
        return m_listFragments.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return m_listTitles.get(position);
    }
}
