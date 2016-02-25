package com.crivero.gravilityprueba.presentation.main.adapter;

import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.crivero.gravilityprueba.R;
import com.crivero.gravilityprueba.application.Gravility;
import com.crivero.gravilityprueba.common.ImageLoader;
import com.crivero.gravilityprueba.objects.Entry;

import java.util.List;

/**
 * Created by crivero on 23/02/2016.
 */
public class MainEntryAdapter extends ArrayAdapter<Entry> {
    AppCompatActivity activity;
    List<Entry> data;
    private final int layoutResourceId;

    public MainEntryAdapter(AppCompatActivity activity, int layoutResourceId, List<Entry> data) {
        super(activity, layoutResourceId, data);
        this.activity = activity;
        this.data = data;
        this.layoutResourceId = layoutResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        ViewHolder holder = null;

        if(row == null)
        {
            LayoutInflater inflater = (activity.getLayoutInflater());
            row = inflater.inflate(layoutResourceId, parent, false);

            holder = new ViewHolder();
            holder.tvTitle = (TextView)row.findViewById(R.id.tv_title);
            holder.tvSubTitle = (TextView)row.findViewById(R.id.tv_sub_title);
            holder.imgLogo = (ImageView)row.findViewById(R.id.img_logo);
            row.setTag(holder);
        }
        else
        {
            holder = (ViewHolder)row.getTag();
        }

        Entry entry = data.get(position);

        holder.tvTitle.setText(entry.getImName().getLabel());
        holder.tvSubTitle.setText(entry.getTitle().getLabel());
        ImageLoader imgLoader = new ImageLoader(activity.getApplicationContext());
        imgLoader.DisplayImage(entry.getImImage().get(1).getLabel(), R.drawable.ic_launcher, holder.imgLogo);


        return row;
    }

    static class ViewHolder
    {
        TextView tvTitle;
        TextView tvSubTitle;
        ImageView imgLogo;


    }

}
