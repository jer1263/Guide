package techmed.guide.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import techmed.guide.R;
import techmed.guide.activity.DetailOrganeActivity;
import techmed.guide.activity.ListOrganeActivity;
import techmed.guide.model.Organe;

/**
 * Created by Jerome on 05/01/2017.
 */
public class RecyclerViewOrganeAdapter extends RecyclerView.Adapter<RecyclerViewOrganeAdapter.ViewHolder> {
    private List<Organe> items;
    private Context context;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView name;
        public ViewHolder(View v) {
            super(v);
            name = (TextView)v.findViewById(R.id.item_name);
        }


    }

    public RecyclerViewOrganeAdapter(Context context, List<Organe> items) {
        this.context = context;
        this.items = items;
    }


    @Override
    public RecyclerViewOrganeAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_recyclerview_mainactivity, parent, false);

        return new RecyclerViewOrganeAdapter.ViewHolder(v);
    }


    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public void onBindViewHolder(RecyclerViewOrganeAdapter.ViewHolder holder, int position) {
        holder.name.setText(items.get(position).getName());

            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, DetailOrganeActivity.class);
                    context.startActivity(intent);
                }
            });

    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
