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
import techmed.guide.activity.ListExamenActivity;
import techmed.guide.activity.ListOrganeActivity;
import techmed.guide.data.Generator;
import techmed.guide.model.ItemPrincipal;
import techmed.guide.model.Organe;

/**
 * Created by Jerome on 05/01/2017.
 */
public class RecyclerViewItemPrincipalAdapter extends RecyclerView.Adapter<RecyclerViewItemPrincipalAdapter.ViewHolder>{
    private List<ItemPrincipal> items;
    private Context context;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView name;
        public ViewHolder(View v) {
            super(v);
            name = (TextView)v.findViewById(R.id.item_name);
        }


    }

    public RecyclerViewItemPrincipalAdapter(Context context, List<ItemPrincipal> items) {
        this.context = context;
        this.items = items;
    }


    @Override
    public RecyclerViewItemPrincipalAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_recyclerview_mainactivity, parent, false);


        return new ViewHolder(v);
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.name.setText(items.get(position).getName());
        if(position == 0){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, ListExamenActivity.class);
                    intent.putExtra("organe", new Organe("Examens", Generator.listExamens()));
                    context.startActivity(intent);
                }
            });
        } else if(position == 1){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, ListOrganeActivity.class);
                    context.startActivity(intent);
                }
            });
        }

    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}



