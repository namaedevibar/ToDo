package com.activity.devibarsantillan.todo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by namai on 12/13/2016.
 */

public class CompletedFragment extends Fragment {

    public CompletedFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        RecyclerView rv = (RecyclerView) rootView.findViewById(R.id.rv);
        rv.setHasFixedSize(true);

        Task[] tasks = {new Task("Done1","Desc","Date","Time","Status"),
                new Task("Done2","Desc","Date","Time","Status"),
                new Task("Done3","Desc","Date","Time","Status"),
                new Task("Done4","Desc","Date","Time","Status"),
                new Task("Done5","Desc","Date","Time","Status")};

        TaskAdapter adapter = new TaskAdapter(tasks);
        rv.setAdapter(adapter);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(llm);

        return rootView;
    }

}
