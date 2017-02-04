package com.example.vikas.recycler;

/**
 * Created by vikas on 4/2/17.
 */

import java.util.ArrayList;
import java.util.List;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder>
{
    private String[] mSet;
    private List<User> mDataset;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case


        public ImageView imageView1;
        public TextView txtHeader;
        public ImageView imageView2;

        public ViewHolder(View v)
        {
            super(v);
            imageView1=(ImageView)v.findViewById(R.id.icon1);
            txtHeader = (TextView) v.findViewById(R.id.firstLine);
            imageView2=(ImageView)v.findViewById(R.id.icon2);
        }
    }


    // Provide a suitable constructor (depends on the kind of dataset)
    public UserAdapter(ArrayList<User> myDataset)
    {
        mDataset = myDataset;

    }
    public UserAdapter(String[] myDataset)
    {
        mSet = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public UserAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                     int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_list_row, parent, false);
        // set the view's size, margins, paddings and layout parameters
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        User user = mDataset.get(position);
        holder.imageView1.setImageDrawable(user.getmimage1());
        holder.txtHeader.setText(user.getmText1());
        holder.imageView2.setImageDrawable(user.getmimage2());


    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount()
    {
        return mDataset.size();
    }

}