package techmed.guide.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import techmed.guide.R;
import techmed.guide.model.ItemPrincipal;

/**
 * Created by Jerome on 05/01/2017.
 */
public class RecyclerViewItemPrincipalAdapter extends RecyclerView.Adapter<RecyclerViewItemPrincipalAdapter.ViewHolder>{
    private List<ItemPrincipal> items;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView name;
        public ViewHolder(View v) {
            super(v);
            name = (TextView)v.findViewById(R.id.item_name);
        }
    }

    public RecyclerViewItemPrincipalAdapter(List<ItemPrincipal> items) {
        this.items = items;
    }

    @Override
    public RecyclerViewItemPrincipalAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                                          int viewType) {

        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_recyclerview_mainactivity, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.name.setText(items.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}



