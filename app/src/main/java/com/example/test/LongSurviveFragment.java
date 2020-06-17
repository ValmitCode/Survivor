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

public class LongSurviveFragment extends BaseFragment {
    Button buttonСhangeStartLong;
    private LongSurviveViewModel mViewModel;

    public static LongSurviveFragment newInstance() {
        return new LongSurviveFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.long_survive_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        startTimer();
        mViewModel = ViewModelProviders.of(this).get(LongSurviveViewModel.class);

        buttonСhangeStartLong = view.findViewById(R.id.button);
        buttonСhangeStartLong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setFragment(new StartLongSurviveFragment());
            }
        });
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(LongSurviveViewModel.class);
        // TODO: Use the ViewModel
    }

}
