package com.example.test;

import android.arch.lifecycle.ViewModelProviders;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

public class StartLongSurviveFragment extends BaseFragment {
    private TextView textView;
    private Button buttonChangescenarios;
    private Button buttonChangeneeds;
    private Button buttonSurvived;
    private String tmp;
    private String need;
    private StartLongSurviveViewModel mViewModel;

    public static StartLongSurviveFragment newInstance() {
        return new StartLongSurviveFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.start_long_survive_fragment, container, false);
    }
    @Override
    public void onViewCreated(@NonNull final View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(StartLongSurviveViewModel.class);
        textView = view.findViewById(R.id.textView7);
        Spinner spinner = view.findViewById(R.id.spinner);
        Spinner spinner1 = view.findViewById(R.id.spinner3);
        AdapterView.OnItemSelectedListener itemSelectedListener = new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                tmp = (String)parent.getItemAtPosition(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        };
        AdapterView.OnItemSelectedListener itemSelectedListener2 = new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                need = (String)parent.getItemAtPosition(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        };
        spinner1.setOnItemSelectedListener(itemSelectedListener2);
        spinner.setOnItemSelectedListener(itemSelectedListener);
        buttonChangescenarios = view.findViewById(R.id.button4);
        buttonChangescenarios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(need.equals("Signal")){
                    LinearLayout bgElement = (LinearLayout) view.findViewById(R.id.frameLayout2);
                    view.setBackgroundResource(R.color.Red);
                    textView.setText(R.string.Nothing);
                }
                if(tmp.equals("Forest survival") && need.equals("Food and water")){
                    LinearLayout bgElement = (LinearLayout) view.findViewById(R.id.frameLayout2);
                    view.setBackgroundResource(R.drawable.background5);
                    textView.setText(R.string.Forest_survival_scenario_eat);
                }
                if(tmp.equals("Forest survival") && need.equals("General advice")){
                    LinearLayout bgElement = (LinearLayout) view.findViewById(R.id.frameLayout2);
                    view.setBackgroundResource(R.drawable.background5);
                    textView.setText(R.string.Forest_survival_scenario_info);
                }
                if(tmp.equals("Forest survival") && need.equals("Orientation")){
                    LinearLayout bgElement = (LinearLayout) view.findViewById(R.id.frameLayout2);
                    view.setBackgroundResource(R.drawable.background5);
                    textView.setText(R.string.Forest_survival_scenario_navigation);
                }
                if(tmp.equals("Desert survival") && need.equals("Food and water")){
                    LinearLayout bgElement = (LinearLayout) view.findViewById(R.id.frameLayout2);
                    view.setBackgroundResource(R.drawable.background5);
                    textView.setText(R.string.Desert_survival_scenario_eat);
                }
                if(tmp.equals("Desert survival") && need.equals("General advice")){
                    LinearLayout bgElement = (LinearLayout) view.findViewById(R.id.frameLayout2);
                    view.setBackgroundResource(R.drawable.background5);
                    textView.setText(R.string.Desert_survival_scenario_info);
                }
                if(tmp.equals("Desert survival") && need.equals("Orientation")){
                    LinearLayout bgElement = (LinearLayout) view.findViewById(R.id.frameLayout2);
                    view.setBackgroundResource(R.drawable.background5);
                    textView.setText(R.string.Desert_survival_scenario_navigation);
                }
                if(tmp.equals("Open ocean survival") && need.equals("Food and water")){
                    LinearLayout bgElement = (LinearLayout) view.findViewById(R.id.frameLayout2);
                    view.setBackgroundResource(R.drawable.background5);
                    textView.setText(R.string.Open_ocean_survival_scenario_eat);
                }
                if(tmp.equals("Open ocean survival") && need.equals("General advice")){
                    LinearLayout bgElement = (LinearLayout) view.findViewById(R.id.frameLayout2);
                    view.setBackgroundResource(R.drawable.background5);
                    textView.setText(R.string.Open_ocean_survival_scenario_info);
                }
                if(tmp.equals("Open ocean survival") && need.equals("Orientation")){
                    LinearLayout bgElement = (LinearLayout) view.findViewById(R.id.frameLayout2);
                    view.setBackgroundResource(R.drawable.background5);
                    textView.setText(R.string.Open_ocean_survival_scenario_navigation);
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
        mViewModel = ViewModelProviders.of(this).get(StartLongSurviveViewModel.class);
        // TODO: Use the ViewModel
    }

}
