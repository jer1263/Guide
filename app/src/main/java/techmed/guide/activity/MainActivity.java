package techmed.guide.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import techmed.guide.R;
import techmed.guide.adapter.RecyclerViewItemPrincipalAdapter;
import techmed.guide.fragment.ListMainFragment;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerViewItemPrincipalAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment fragment = new ListMainFragment();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.mainActivityContainer, fragment)
                .commit();

    }
}
