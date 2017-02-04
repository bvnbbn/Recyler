package com.example.vikas.recycler;

/**
 * Created by vikas on 4/2/17.
 */

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;;import java.util.ArrayList;

public class BlankFragment extends Fragment
{
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    ArrayList<User> myDataset= new ArrayList<User>();

    public BlankFragment()
    {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_blank, container, false);

        RecyclerView rv = (RecyclerView) rootView.findViewById(R.id.rv_recycler_view);
        rv.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        mAdapter = new UserAdapter(myDataset);
        rv.setAdapter(mAdapter);
        prepareMovieData(getResources());








     //   UserAdapter adapter = new UserAdapter(new String[]{"test one", "test two", "test three", "test four", "test five" , "test six" , "test seven"});
       // rv.setAdapter(adapter);

      //  LinearLayoutManager llm = new LinearLayoutManager(getActivity());
       // rv.setLayoutManager(llm);

        return rootView;
    }
    private void prepareMovieData(Resources res)
    {

        User user = new User(res.getDrawable(R.drawable.ic_launcher),"User1",res.getDrawable(R.drawable.ic_launcher));
        myDataset.add(user);
        user = new User(res.getDrawable(R.drawable.ic_launcher),"User2",res.getDrawable(R.drawable.ic_launcher));
        myDataset.add(user);
        user = new User("                 Content1",res.getDrawable(R.drawable.ic_launcher));
        myDataset.add(user);
        user = new User("                 Content2",res.getDrawable(R.drawable.ic_launcher));
        myDataset.add(user);
        user = new User("                 Choice1",res.getDrawable(R.drawable.ic_launcher));
        myDataset.add(user);
        user = new User("                 Content3",res.getDrawable(R.drawable.ic_launcher));
        myDataset.add(user);
        user = new User(res.getDrawable(R.drawable.ic_launcher),"User3",res.getDrawable(R.drawable.ic_launcher));
        myDataset.add(user);
        user = new User("                 Choice3",res.getDrawable(R.drawable.ic_launcher));
        myDataset.add(user);
        user = new User("                 Choice4",res.getDrawable(R.drawable.ic_launcher));
        myDataset.add(user);
    }


}