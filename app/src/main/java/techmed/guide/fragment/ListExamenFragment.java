package techmed.guide.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import techmed.guide.R;
import techmed.guide.adapter.RecyclerViewExamenAdapter;
import techmed.guide.model.Organe;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListExamenFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerViewExamenAdapter adapter;
    private Organe organe;

    public ListExamenFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        organe = (Organe)getArguments().getSerializable("organe");

        View view = inflater.inflate(R.layout.fragment_list_examen, container, false);
        recyclerView = (RecyclerView)view.findViewById(R.id.recyclerviewListExamen);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setLayoutManager(llm);

        adapter = new RecyclerViewExamenAdapter(getActivity(), organe);
        recyclerView.setAdapter(adapter);

        return view;
    }

}
