package com.jackecxzerotwo.tabstask.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.jackecxzerotwo.tabstask.R;
import com.jackecxzerotwo.tabstask.registerController;
import com.jackecxzerotwo.tabstask.songsController;
import com.jackecxzerotwo.tabstask.contactController;
import com.jackecxzerotwo.tabstask.mainViewController;

public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{ R.string.tab_text_Inicio,R.string.tab_text_likedSongs, R.string.tab_text_Contacs, R.string.tab_text_registro};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                mainViewController tab1 = new mainViewController();
                return tab1;
            case 1:
                songsController tab2 = new songsController();
                return tab2;
            case 2:
                contactController tab3 = new contactController();
                return tab3;
            case 3:
                registerController tab4 = new registerController();
                return tab4;

        }
    return null;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 4;
    }
}