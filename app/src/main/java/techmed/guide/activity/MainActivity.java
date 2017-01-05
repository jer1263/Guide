package techmed.guide.activity;

import android.app.Fragment;
import android.app.ListFragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import techmed.guide.R;
import techmed.guide.adapter.RecyclerViewItemPrincipalAdapter;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerViewItemPrincipalAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment fragment = new ListFragment();
        getFragmentManager().beginTransaction()
                .add(R.id.mainActivityContainer, fragment)
                .commit();

    }
}
