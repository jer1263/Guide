package techmed.guide.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import techmed.guide.R;
import techmed.guide.adapter.RecyclerViewItemPrincipalAdapter;
import techmed.guide.data.Generator;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListMainFragment extends Fragment {


    private RecyclerView recyclerView;
    private RecyclerViewItemPrincipalAdapter adapter;

    public ListMainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_list, container, false);
        recyclerView = (RecyclerView)view.findViewById(R.id.recyclerviewMainActivity);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setLayoutManager(llm);

        adapter = new RecyclerViewItemPrincipalAdapter(getActivity(), Generator.itemPrincipaux());
        recyclerView.setAdapter(adapter);

        return view;
    }

}
