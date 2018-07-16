package com.zhewei.fitmore.user_interface.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zhewei.fitmore.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RoutineTrainingFragment extends Fragment {


    public RoutineTrainingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d("TAG","onCreateView");
        return inflater.inflate(R.layout.fragment_routine_training, container, false);
    }

}
