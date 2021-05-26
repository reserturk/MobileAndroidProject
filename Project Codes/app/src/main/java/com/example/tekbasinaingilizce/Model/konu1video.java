package com.example.tekbasinaingilizce.Model;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.tekbasinaingilizce.R;

public class konu1video extends Fragment {
    View view;




    public konu1video() {
    }



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

         view=inflater.inflate(R.layout.konu1video,container,false);


        return view;
    }

}
