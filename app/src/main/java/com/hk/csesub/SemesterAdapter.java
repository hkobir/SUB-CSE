package com.hk.csesub;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

public class SemesterAdapter extends BaseExpandableListAdapter {
    private Context context;
    private List<String> semesterTitle;
    private HashMap<String, List<String>> semesterListDetails;

    public SemesterAdapter(Context context, List<String> semesterTitle, HashMap<String, List<String>> semesterListDetails) {
        this.context = context;
        this.semesterTitle = semesterTitle;
        this.semesterListDetails = semesterListDetails;
    }

    @Override
    public int getGroupCount() {
        return this.semesterTitle.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return this.semesterListDetails.get(this.semesterTitle.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return this.semesterTitle.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return this.semesterListDetails.get(this.semesterTitle.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String semesterTitle = (String) getGroup(groupPosition);
        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.item_semester_layout, null);
        }
        TextView semesterTitleTextView = convertView.findViewById(R.id.semesterTitle);
        semesterTitleTextView.setTypeface(null, Typeface.BOLD);
        semesterTitleTextView.setText(semesterTitle);
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        final String expandedSubjectText = (String) getChild(groupPosition, childPosition);
        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.item_subject_layout, null);
        }
        TextView expandedsubjectTextView = convertView.findViewById(R.id.subjectTitle);
        expandedsubjectTextView.setText(expandedSubjectText);
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
