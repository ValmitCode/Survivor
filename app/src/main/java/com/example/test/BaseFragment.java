package com.example.test;

import android.content.SyncStatusObserver;
import android.os.CountDownTimer;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;

public abstract class BaseFragment extends Fragment {
    public void setFragment(Fragment fragment){
        FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.action_container,fragment).commit();
    }
public void startTimer(){
    new CountDownTimer(100,200) {
        @Override
        public void onTick(long millisUntilFinished) {
            System.out.print("Are you normal? Don' worry ,You will survive if you follow my instructions.");
        }

        @Override
        public void onFinish() {

        }
    }.start();
}
}
