package ua.vlad.criminalintent;

import android.support.v4.app.Fragment;
import android.util.Log;

public class CrimeActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }

}
