package techmed.guide.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import techmed.guide.R;
import techmed.guide.fragment.ListOrganeFragment;

public class ListOrganeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_organe);
        if(getSupportActionBar() != null){
            getSupportActionBar().setTitle("Organes");
        }

        Fragment fragment = new ListOrganeFragment();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.organeActivityContainer, fragment)
                .commit();
    }

}
