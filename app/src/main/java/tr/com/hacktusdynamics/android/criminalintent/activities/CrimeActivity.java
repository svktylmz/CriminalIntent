package tr.com.hacktusdynamics.android.criminalintent.activities;

import android.support.v4.app.Fragment;

import tr.com.hacktusdynamics.android.criminalintent.fragments.CrimeFragment;

public class CrimeActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }
}
