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
import techmed.guide.activity.ExamenActivity;
import techmed.guide.model.Examen;

/**
 * Created by Jerome on 05/01/2017.
 */
public class RecyclerViewExamenAdapter extends RecyclerView.Adapter<RecyclerViewExamenAdapter.ViewHolder>{
    private List<Examen> items;
    private Context context;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView name, shortDescription;
        public ViewHolder(View v) {
            super(v);
            name = (TextView)v.findViewById(R.id.item_name);
            shortDescription = (TextView)v.findViewById(R.id.item_subtitle);
        }


    }

    public RecyclerViewExamenAdapter(Context context, List<Examen> items) {
        this.context = context;
        this.items = items;
    }


    @Override
    public RecyclerViewExamenAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_recyclerview_examen, parent, false);


        return new ViewHolder(v);
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.name.setText(items.get(holder.getAdapterPosition()).getName());
        holder.shortDescription.setText(items.get(holder.getAdapterPosition()).getDescription());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, ExamenActivity.class);
                    intent.putExtra("examen", items.get(position));
                    context.startActivity(intent);
                }
            });


    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}



