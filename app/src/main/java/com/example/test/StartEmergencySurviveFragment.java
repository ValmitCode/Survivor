package com.example.test;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Objects;

public class StartEmergencySurviveFragment extends BaseFragment {
    private TextView textView;
    private Button buttonChangescenarios;
    private Button buttonSurvived;
    private StartEmergencySurviveViewModel mViewModel;
    private String tmp;

    public static StartEmergencySurviveFragment newInstance() {
        return new StartEmergencySurviveFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.start_emergency_survive_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull final View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(StartEmergencySurviveViewModel.class);
        textView = view.findViewById(R.id.textView7);
        Spinner spinner = view.findViewById(R.id.spinner);
        AdapterView.OnItemSelectedListener itemSelectedListener = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                tmp = (String)parent.getItemAtPosition(position);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        };
        spinner.setOnItemSelectedListener(itemSelectedListener);
        buttonChangescenarios = view.findViewById(R.id.button4);
        buttonChangescenarios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(tmp.equals("Terrorists takeover")){
                    textView.setText(R.string.Terrorists_takeover_scenario);
                }
                if(tmp.equals("Shipwreck")){
                    textView.setText(R.string.Shipwreck_scenario);
                }
                if(tmp.equals("Plane crash")){
                    textView.setText(R.string.Plane_crash_scenario);
                }
                if(tmp.equals("Building fire")){
                    textView.setText(R.string.Building_fire_scenario);
                }
            }
        });
        buttonSurvived = view.findViewById(R.id.button5);
        buttonSurvived.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                setFragment(new FinishFragment());
            }
        });
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(StartEmergencySurviveViewModel.class);
        // TODO: Use the ViewModel
    }
}
