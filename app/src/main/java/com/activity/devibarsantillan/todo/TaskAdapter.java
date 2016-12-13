package com.activity.devibarsantillan.todo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by namai on 12/13/2016.
 */

    public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.MyViewHolder> {
        private Task[] mDataset;


        public static class MyViewHolder extends RecyclerView.ViewHolder {

            public TextView tvTitle;
            public TextView tvDesc;
            public MyViewHolder(View v) {
                super(v);

                tvTitle = (TextView) v.findViewById(R.id.txtTitle);
                tvDesc = (TextView) v.findViewById(R.id.txtDesc);
            }
        }

        // Provide a suitable constructor (depends on the kind of dataset)
        public TaskAdapter(Task[] myDataset) {
            mDataset = myDataset;
        }

        // Create new views (invoked by the layout manager)
        @Override
        public TaskAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                           int viewType) {
            // create a new view
            View v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.card_view, parent, false);
            // set the view's size, margins, paddings and layout parameters
            MyViewHolder vh = new MyViewHolder(v);
            return vh;
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {
            holder.tvTitle.setText(mDataset[position].getTitle());
            holder.tvDesc.setText(mDataset[position].getDesc());
        }

        @Override
        public int getItemCount() {
            return mDataset.length;
        }
}
