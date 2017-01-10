package techmed.guide.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

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


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_detail_organe, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
