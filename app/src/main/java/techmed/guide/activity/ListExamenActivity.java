package techmed.guide.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import techmed.guide.R;
import techmed.guide.fragment.ListExamenFragment;
import techmed.guide.model.Organe;

public class ListExamenActivity extends AppCompatActivity {

    private Organe organe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_organe_detail);
        organe = (Organe) getIntent().getSerializableExtra("organe");
        if(organe != null && getSupportActionBar()!=null){
            getSupportActionBar().setTitle(organe.getName());
        }

        Fragment fragment = new ListExamenFragment();
        Bundle extras = new Bundle();
        extras.putSerializable("organe", organe);
        fragment.setArguments(extras);
        getSupportFragmentManager().beginTransaction()
                .add(R.id.detailOrganeActivityContainer, fragment)
                .commit();
    }


}
