package com.example.navigation;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ThirdFragment extends Fragment {

    public ThirdFragment(){
        // require a empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup f1fragment, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_third, f1fragment, false);
    }
}