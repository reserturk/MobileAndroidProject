package com.example.tekbasinaingilizce.Model;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.tekbasinaingilizce.R;

import java.util.ArrayList;

public class konu2anlatimCopy extends Fragment {
    View view;




    public konu2anlatimCopy() {
    }



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

         view=inflater.inflate(R.layout.konu1anlatim,container,false);
         view= inflater.inflate(R.layout.konu1video,container,false);

        return view;
    }

}
