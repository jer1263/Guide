package techmed.guide.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import techmed.guide.R;
import techmed.guide.fragment.ExamenFragment;
import techmed.guide.model.Examen;

public class ExamenActivity extends AppCompatActivity {

    private Examen examen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        examen = (Examen)getIntent().getExtras().getSerializable("examen");
        setContentView(R.layout.activity_examen);
        if(examen!=null && getSupportActionBar()!=null){
            getSupportActionBar().setTitle(examen.getName());
        }

        Fragment fragment = new ExamenFragment();
        Bundle extras = new Bundle();
        extras.putSerializable("examen", examen);
        fragment.setArguments(extras);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.examenActivityContainer, fragment)
                .commit();
    }

}
