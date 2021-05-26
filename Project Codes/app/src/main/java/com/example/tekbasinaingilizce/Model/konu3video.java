package com.example.tekbasinaingilizce.Model;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.tekbasinaingilizce.R;

public class konu3video extends Fragment {
    View view;




    public konu3video() {
    }



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

         view=inflater.inflate(R.layout.konu3video,container,false);


        return view;
    }

}
