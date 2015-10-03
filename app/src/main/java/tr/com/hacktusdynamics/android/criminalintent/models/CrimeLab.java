package tr.com.hacktusdynamics.android.criminalintent.models;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import tr.com.hacktusdynamics.android.criminalintent.database.CrimeBaseHelper;

public class CrimeLab {
    private static CrimeLab sCrimeLab;
    private List<Crime> mCrimes;

    private Context mContext;
    private SQLiteDatabase mDataBase;

    public static CrimeLab get(Context context){
        if(sCrimeLab == null){
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    private CrimeLab(Context context){
        mContext = context.getApplicationContext();
        mDataBase = new CrimeBaseHelper(mContext).getWritableDatabase();
        mCrimes = new ArrayList<>();
        //create100DummyCrimes();
    }

    public List<Crime> getCrimes(){
        return mCrimes;
    }

    public Crime getCrime(UUID id){
        for(Crime crime : mCrimes){
            if(crime.getId().equals(id)) return crime;
        }
        return null;
    }

    public void addCrime(Crime c){
        mCrimes.add(c);
    }

/*
    private void create100DummyCrimes() {
        for(int i = 0; i < 100; i++){
            Crime crime = new Crime();
            crime.setTitle("Crime #: " + i);
            crime.setSolved(i%2 == 0); //every other one
            mCrimes.add(crime);
        }
    }
*/

}
