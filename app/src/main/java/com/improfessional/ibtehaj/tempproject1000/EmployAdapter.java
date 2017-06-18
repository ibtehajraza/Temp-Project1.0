package com.improfessional.ibtehaj.tempproject1000;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ibtehaj on 6/15/2017.
 */

public class EmployAdapter extends RecyclerView.Adapter<EmployAdapter.MyViewHolder> {

    private List<Employ> employList;



    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name, designation;

        public MyViewHolder(View view) {
            super(view);
            name = (TextView) view.findViewById(R.id.name);
            designation = (TextView) view.findViewById(R.id.designation);
        }
    }

    EmployAdapter(List<Employ> employList){
        this.employList = employList;
    }



    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.employ_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Employ employ = employList.get(position);
        holder.name.setText(employ.getName());
        holder.designation.setText(employ.getDesignation());


    }

    @Override
    public int getItemCount() {
        return employList.size();
    }


}
