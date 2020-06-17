package com.example.test;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class EmergencySurviveFragment extends BaseFragment {
    Button buttonChangeStartEmergency;
    private EmergencySurviveViewModel mViewModel;

    public static EmergencySurviveFragment newInstance() {
        return new EmergencySurviveFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.emergency_survive_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull final View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        startTimer();
        mViewModel = ViewModelProviders.of(this).get(EmergencySurviveViewModel.class);

        buttonChangeStartEmergency = view.findViewById(R.id.button);
        buttonChangeStartEmergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setFragment(new StartEmergencySurviveFragment());
            }
        });
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(EmergencySurviveViewModel.class);
        // TODO: Use the ViewModel
    }
    }
