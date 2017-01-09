package techmed.guide.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import techmed.guide.R;
import techmed.guide.adapter.RecyclerViewOrganeAdapter;
import techmed.guide.data.Generator;

/**
 * A placeholder fragment containing a simple view.
 */
public class ListOrganeFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerViewOrganeAdapter adapter;

    public ListOrganeFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_organe, container, false);
        recyclerView = (RecyclerView)view.findViewById(R.id.recyclerviewOrganes);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setLayoutManager(llm);

        adapter = new RecyclerViewOrganeAdapter(getActivity(), Generator.listOrganes());
        recyclerView.setAdapter(adapter);

        return view;
    }
}
