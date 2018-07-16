package com.zhewei.fitmore.user_interface.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.zhewei.fitmore.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SingleTrainingFragment extends Fragment {

    private View m_viewRoot;

    public SingleTrainingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        m_viewRoot = inflater.inflate(R.layout.fragment_single_training, container, false);

        vInitViews();
        vInitControllers();

        return m_viewRoot;
    }

    private void vInitViews() {
        getChildFragmentManager().beginTransaction().replace(R.id.frameContainer, new SingleTrainingContentFragment()).commit();
    }

    private void vInitControllers() {

    }

    public void vPrepareStart() {
        getChildFragmentManager().beginTransaction()
                .setCustomAnimations(R.animator.fragment_slide_right_enter, R.animator.fragment_slide_left_exit)
                .replace(R.id.frameContainer, new CounterFragment())
                .commit();
    }

    public void vReturnContent() {
        getChildFragmentManager().beginTransaction()
                .setCustomAnimations(R.animator.fragment_slide_left_enter, R.animator.fragment_slide_right_exit)
                .replace(R.id.frameContainer, new SingleTrainingContentFragment())
                .commit();
    }

}
