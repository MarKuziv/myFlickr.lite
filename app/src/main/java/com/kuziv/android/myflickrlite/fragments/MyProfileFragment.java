package com.kuziv.android.myflickrlite.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kuziv.android.myflickrlite.R;

/**
 * Created by kuziv on 2/27/2016.
 */
public class MyProfileFragment extends Fragment {

    public MyProfileFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.mock_profile_fragment, container, false);
    }
}
