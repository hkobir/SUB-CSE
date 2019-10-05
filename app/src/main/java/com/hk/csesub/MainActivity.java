package com.hk.csesub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.Toast;

import com.hk.csesub.databinding.ActivityMainBinding;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
private ActivityMainBinding binding;

    ExpandableListAdapter expandableListAdapter;
    List<String> semesterTitle;
    HashMap<String, List<String>> semesterListDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        getSupportActionBar().setTitle("Curriculum Semester of SUB");
        init();

    }



    private void init() {
        semesterListDetails = SemesterDataPump.getData();
        semesterTitle = new ArrayList<String>(semesterListDetails.keySet());
        expandableListAdapter = new SemesterAdapter(MainActivity.this,semesterTitle,semesterListDetails);
        binding.expandableListView.setAdapter(expandableListAdapter);

        binding.expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int groupPosition) {
                Toast.makeText(MainActivity.this,semesterTitle.get(groupPosition)+"List Expanded.", Toast.LENGTH_SHORT).show();
            }
        });

        binding.expandableListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {
            @Override
            public void onGroupCollapse(int groupPosition) {
                Toast.makeText(MainActivity.this, semesterTitle.get(groupPosition)+"List Collapsed.", Toast.LENGTH_SHORT).show();
            }
        });


        binding.expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                Toast.makeText(
                        MainActivity.this,
                        semesterTitle.get(groupPosition)
                                + " -> "
                                + semesterListDetails.get(
                                semesterTitle.get(groupPosition)).get(
                                childPosition), Toast.LENGTH_SHORT
                ).show();
                return false;
            }
        });

    }
}
