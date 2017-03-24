package id.sch.smktelkom_mlg.project2.xirpl40810132129.malang.adapter;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project2.xirpl40810132129.malang.R;
import id.sch.smktelkom_mlg.project2.xirpl40810132129.malang.model.pasar;

/**
 * Created by rongrong on 24/03/2017.
 */

public class pasarangkot extends RecyclerView.Adapter<pasarangkot.ViewHolder> {

    ArrayList<pasar> pasarList;
    Ipasarangkot mIpasarangkot;

    public pasarangkot(Context context, ArrayList<pasar> pasarList) {
        this.pasarList = pasarList;
        mIpasarangkot = (Ipasarangkot) context;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_angkot_detail, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        pasar Pasar = pasarList.get(position);
        holder.tvJudul.setText(Pasar.judul);
        holder.ivFoto.setImageURI(Uri.parse(Pasar.foto));
    }

    @Override
    public int getItemCount() {
        if (pasarList != null)
            return pasarList.size();
        return 0;
    }

    public interface Ipasarangkot {
        void doClick(int pos);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivFoto;
        TextView tvJudul;
        //TextView tvDeskripsi;

        public ViewHolder(View itemView) {
            super(itemView);
            ivFoto = (ImageView) itemView.findViewById(R.id.imageView);
            tvJudul = (TextView) itemView.findViewById(R.id.textViewJudul);
            //tvDeskripsi = (TextView) itemView.findViewById(R.id.textViewDeskripsi);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mIpasarangkot.doClick(getAdapterPosition());
                }
            });
        }
    }
}
