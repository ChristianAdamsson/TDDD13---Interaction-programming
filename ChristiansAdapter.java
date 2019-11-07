package com.example.chris.lab2;

import android.content.Context;
        import android.graphics.Color;
        import android.support.annotation.NonNull;
        import android.support.annotation.Nullable;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ArrayAdapter;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

        import java.util.ArrayList;

public class ChristiansAdapter extends BaseExpandableListAdapter {


    public ChristiansAdapter(Context c, ArrayList<String> data){
       // super(c,0,data);
    }

    public void user_online(int id){
        //do stuff
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public View getView(int position,
                        @Nullable View convertView,
                        @NonNull ViewGroup parent) {
        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).
                    inflate(R.layout.activity_main_adapter,
                            parent,false);
        }
        String value = getItem(position);
        TextView holder = convertView.findViewById(R.id.textView);
        holder.setText(value);
        if(position %2 == 0 )
            convertView.setBackgroundColor(Color.BLUE);

        return convertView;
    }

    @Override
    public int getGroupCount() {
        return 0;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return 0;
    }

    @Override
    public Object getGroup(int groupPosition) {
        return null;
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return null;
    }

    @Override
    public long getGroupId(int groupPosition) {
        return 0;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        return null;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        return null;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
}