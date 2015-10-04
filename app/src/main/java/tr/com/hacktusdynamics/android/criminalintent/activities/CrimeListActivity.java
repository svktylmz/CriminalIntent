package tr.com.hacktusdynamics.android.criminalintent.activities;

import android.content.Intent;
import android.support.v4.app.Fragment;

import tr.com.hacktusdynamics.android.criminalintent.R;
import tr.com.hacktusdynamics.android.criminalintent.fragments.CrimeFragment;
import tr.com.hacktusdynamics.android.criminalintent.fragments.CrimeListFragment;
import tr.com.hacktusdynamics.android.criminalintent.models.Crime;

public class CrimeListActivity extends SingleFragmentActivity implements CrimeListFragment.Callbacks{
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_masterdetail;
    }

    @Override
    public void onCrimeSelected(Crime crime) {
        if(findViewById(R.id.detail_fragment_container) ==null ){ //Running on phone
            Intent intent = CrimePagerActivity.newIntent(this, crime.getId());
            startActivity(intent);
        }else{ //running on tablet
            Fragment newDetail = CrimeFragment.newInstance(crime.getId());
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.detail_fragment_container, newDetail)
                    .commit();
        }
    }
}