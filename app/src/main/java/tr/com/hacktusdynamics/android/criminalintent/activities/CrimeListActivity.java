package tr.com.hacktusdynamics.android.criminalintent.activities;

import android.support.v4.app.Fragment;

import tr.com.hacktusdynamics.android.criminalintent.fragments.CrimeListFragment;

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}