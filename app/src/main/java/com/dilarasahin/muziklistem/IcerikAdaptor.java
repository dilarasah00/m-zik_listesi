package com.dilarasahin.muziklistem;

import android.content.Intent;
import android.renderscript.ScriptGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dilarasahin.muziklistem.databinding.RecyclerRowBinding;

import java.util.ArrayList;

public class IcerikAdaptor extends RecyclerView.Adapter<IcerikAdaptor.IcerikHolder> {

    ArrayList<Icerik> IcerikArraylist;

    public IcerikAdaptor(ArrayList<Icerik> icerikArraylist) {
        IcerikArraylist = icerikArraylist;
    }

    @NonNull
    @Override
    public IcerikHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerRowBinding recyclerRowBinding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new IcerikHolder(recyclerRowBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull IcerikHolder holder, int position) {
        holder.binding.recyclerviewtextview.setText(IcerikArraylist.get(position).kimeait);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.itemView.getContext(),Detay.class);
                intent.putExtra("icerik",IcerikArraylist.get(position));
                holder.itemView.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {

        return IcerikArraylist.size();
    }

    public class IcerikHolder extends RecyclerView.ViewHolder{
        private  RecyclerRowBinding binding;
        public IcerikHolder(RecyclerRowBinding binding) {

            super(binding.getRoot());
            this.binding = binding;


        }
    }
}
