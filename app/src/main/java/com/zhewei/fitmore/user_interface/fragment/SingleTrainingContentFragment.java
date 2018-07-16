package com.zhewei.fitmore.user_interface.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.zhewei.fitmore.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SingleTrainingContentFragment extends Fragment {

    private View m_viewRoot;
    private Spinner m_spnWeightUnit;
    private Button m_btnPrepareStart, m_btnReset;

    public SingleTrainingContentFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        m_viewRoot = inflater.inflate(R.layout.fragment_single_training_content, container, false);

        vInitViews();
        vInitControllers();

        return m_viewRoot;
    }

    private void vInitViews() {
        m_btnPrepareStart = (Button) m_viewRoot.findViewById(R.id.btnPrepareStart);
        m_btnReset = (Button) m_viewRoot.findViewById(R.id.btnRest);
        m_spnWeightUnit = (Spinner) m_viewRoot.findViewById(R.id.spnWeightUnit);
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<>(getContext(), R.layout.spinner_drop_down, getResources().getStringArray(R.array.weight_unit));

        m_spnWeightUnit.setAdapter(stringArrayAdapter);
    }

    private void vInitControllers() {
        m_btnPrepareStart.setOnClickListener(m_btnOnClickListener);
        m_btnReset.setOnClickListener(m_btnOnClickListener);
    }

    private View.OnClickListener m_btnOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.btnPrepareStart:
                    ((SingleTrainingFragment) getParentFragment()).vPrepareStart();
                    break;
                case R.id.btnRest:
                    break;
            }
        }
    };

}
