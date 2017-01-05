package com.isabelpalomar.appportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Application> applications;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeData();

        //Gets the recycler view by Id and set the initial configuration
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rvApplications);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(llm);
        }

        //Creates a new a instance of ApplicationsRecyclerAdapter, passing the current context and the list of categories
        ApplicationsRecyclerAdapter adapter = new ApplicationsRecyclerAdapter(this, applications);
        if (recyclerView != null) {
            recyclerView.setAdapter(adapter);
        }

    }

    private void initializeData() {
        applications = new ArrayList<>();
        applications.add(new Application(getString(R.string.app_popular_movies), R.color.colorRed));
        applications.add(new Application(getString(R.string.app_stock_hack), R.color.colorPink));
        applications.add(new Application(getString(R.string.app_built_it_bigger), R.color.colorIndigo));
        applications.add(new Application(getString(R.string.app_make_your_app_material), R.color.colorBlue));
        applications.add(new Application(getString(R.string.app_go_ubiquitous), R.color.colorGreen));
        applications.add(new Application(getString(R.string.app_capstone), R.color.colorLightGreen));

    }
}
