package com.example.vfernandez.oviedotourguide;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 4;
    private Context mContext;
    private String tabTitles[];

    public CategoryAdapter(FragmentManager fm) {
        super(fm);
    }

    public CategoryAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
        tabInitializer();
    }

    //Initialize the tabs with their names
    private void tabInitializer() {
        tabTitles = new String[]{
                mContext.getResources().getString(R.string.category_history),
                mContext.getResources().getString(R.string.category_museums),
                mContext.getResources().getString(R.string.category_nature),
                mContext.getResources().getString(R.string.category_food)
        };
    }

    @Override
    public Fragment getItem(int position) {
        CategoryFragment category = new CategoryFragment();
        //For each category it returns the category along with its name
        Bundle b = new Bundle();
        b.putString("category",tabTitles[position]);
        category.setArguments(b);
        return category;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }
}
