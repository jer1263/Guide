package techmed.guide.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import techmed.guide.R;
import techmed.guide.model.Examen;

/**
 * A placeholder fragment containing a simple view.
 */
public class ExamenFragment extends Fragment {

    private Examen examen;

    public ExamenFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        examen = (Examen) getArguments().getSerializable("examen");
        View view = inflater.inflate(R.layout.fragment_examen, container, false);
        TextView description = (TextView)view.findViewById(R.id.textviewExamenFragment);
        description.setText(examen.getDescription());
        if(examen.getImageId() != 0){
            ImageView image = (ImageView)view.findViewById(R.id.imageviewExamenFragment);
            image.setImageResource(examen.getImageId());
        }
        return view;
    }
}
