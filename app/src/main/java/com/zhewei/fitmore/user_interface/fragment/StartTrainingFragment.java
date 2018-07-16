package com.zhewei.fitmore.user_interface.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zhewei.fitmore.R;
import com.zhewei.fitmore.adapter.MainFragmentAdapter;
import com.zhewei.fitmore.adapter.StartTrainingPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class StartTrainingFragment extends Fragment {

    private View m_viewRoot;
    private TabLayout m_tabLayout;
    private ViewPager m_viewPager;

    public StartTrainingFragment() {
        // Required empty public constructor
    }

    public ViewPager GetViewPager() {
        return m_viewPager;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        m_viewRoot = inflater.inflate(R.layout.fragment_start_training, container, false);

        vInitViews();
        return m_viewRoot;
    }

    private void vInitViews() {
        m_tabLayout = (TabLayout) m_viewRoot.findViewById(R.id.tabLayoutStartTraining);
        vInitViewPager();
        m_tabLayout.setupWithViewPager(m_viewPager);
    }

    private void vInitViewPager() {
        m_viewPager = (ViewPager) m_viewRoot.findViewById(R.id.viewPagerStartTraining);
        List<Fragment> listFragments = new ArrayList<>();
        listFragments.add(new RoutineTrainingFragment());
        listFragments.add(new SingleTrainingFragment());
        List<String> listTitles = new ArrayList<>();
        listTitles.add(getResources().getString(R.string.tab_routine));
        listTitles.add(getResources().getString(R.string.tab_single));
        m_viewPager.setAdapter(new MainFragmentAdapter(getChildFragmentManager(), listFragments, listTitles));
    }

}
