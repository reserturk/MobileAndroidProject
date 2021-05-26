package com.example.tekbasinaingilizce.Model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class K2wpAdapter extends FragmentPagerAdapter {
    private final List<Fragment> fragmentlist = new ArrayList<>();
    private final List<String> fragmentlistTitle = new ArrayList<>();

    public K2wpAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    public K2wpAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentlist.get(position);
    }

    @Override
    public int getCount() {
        return fragmentlistTitle.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentlistTitle.get(position);
    }

    public void AddFragment(Fragment fragment, String Title){
        fragmentlist.add(fragment);
        fragmentlistTitle.add(Title);
    }
}
