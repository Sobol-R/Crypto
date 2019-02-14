package banana.digital.crypto.ui;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

import banana.digital.crypto.ui.fragments.BalanceFragment;
import banana.digital.crypto.ui.fragments.SendFragment;
import banana.digital.crypto.ui.fragments.TransactionsFragment;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0 : return new BalanceFragment();
            case 1 : return new TransactionsFragment();
            case 2 : return new SendFragment();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
