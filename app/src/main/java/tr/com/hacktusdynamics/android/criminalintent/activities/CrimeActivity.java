package tr.com.hacktusdynamics.android.criminalintent.activities;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import tr.com.hacktusdynamics.android.criminalintent.R;

public class CrimeActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime);
    }

}
