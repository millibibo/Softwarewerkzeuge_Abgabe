package com.example.semesteraufgabe.ui.main;

/**
 * Programmierung 4
 * SS21
 * @author Philine Hörnemann (m28064)
 */

import android.content.Context;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.semesteraufgabe.R;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    String LOGTAG = "SectionPageAdapter";

    //Tabs
    @StringRes
    private static final int[] TAB_TITLES = new int[]{
            R.string.tab_little, R.string.tab_middle, R.string.tab_big
    };
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }


    /**
     * Tabs Little, Middle und Big werden erstellt
     * @param position
     * @return
     */
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                LittleFragment fragmentlittle = new LittleFragment();
                Log.i(LOGTAG, "LittleFragment erstellt");
                return fragmentlittle;
            case 1:
                MiddleFragment fragmentmiddle = new MiddleFragment();
                Log.i(LOGTAG, "MiddleFragment erstellt");
                return fragmentmiddle;
            case 2:
                BigFragment fragmentbig = new BigFragment();
                Log.i(LOGTAG, "BigFragment erstellt");
                return fragmentbig;
            default: return null;
        } // switch
    }

    /**
     * Titel des jeweiligen Tabs
     * @param position
     * @return
     */
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    /**
     * Anzahl der Tabs
     * @return
     */
    @Override
    public int getCount() {
        return TAB_TITLES.length;
    }

    public static int count() {
        return  TAB_TITLES.length;
    }

}