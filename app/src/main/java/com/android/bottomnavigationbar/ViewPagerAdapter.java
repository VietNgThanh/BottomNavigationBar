package com.android.bottomnavigationbar;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 1:
                return new ClockFragment();
            case 2:
                return new TimerFragment();
            case 3:
                return new StopwatchFragment();
            default:
                return new AlarmFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
