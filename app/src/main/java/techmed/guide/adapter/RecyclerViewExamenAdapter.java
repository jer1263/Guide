package techmed.guide.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import techmed.guide.R;
import techmed.guide.activity.ExamenActivity;
import techmed.guide.model.Organe;

/**
 * Created by Jerome on 05/01/2017.
 */
public class RecyclerViewExamenAdapter extends RecyclerView.Adapter<RecyclerViewExamenAdapter.ViewHolder>{
    private Organe organe;
    private Context context;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView name, shortDescription;
        public ViewHolder(View v) {
            super(v);
            name = (TextView)v.findViewById(R.id.item_name);
            shortDescription = (TextView)v.findViewById(R.id.item_subtitle);
        }
    }

    public RecyclerViewExamenAdapter(Context context, Organe organe) {
        this.context = context;
        this.organe = organe;
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
        holder.name.setText(organe.getExamens().get(holder.getAdapterPosition()).getName());
        holder.shortDescription.setText(organe.getExamens().get(holder.getAdapterPosition()).getSubtitle());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, ExamenActivity.class);
                    intent.putExtra("examen", organe.getExamens().get(position));
                    intent.putExtra("nom_organe", organe.getName());
                    context.startActivity(intent);
                }
            });


    }

    @Override
    public int getItemCount() {
        return organe.getExamens().size();
    }
}



