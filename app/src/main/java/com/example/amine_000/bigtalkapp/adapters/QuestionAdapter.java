package com.example.amine_000.bigtalkapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.amine_000.bigtalkapp.R;

/**
 * Created by amine_000 on 6/29/2015.
 */
public class QuestionAdapter extends BaseAdapter {
    private Context mContext;
    private String[] questionsText;

    public QuestionAdapter(Context thisContext, String[] questions){
        mContext = thisContext;
        questionsText = questions;
    }

    @Override
    public int getCount() {
        return questionsText.length;
    }

    @Override
    public Object getItem(int position) {
        return questionsText[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if(convertView == null){
            convertView = LayoutInflater.from(mContext).inflate(R.layout.list_item_layout_text, null);
            holder = new ViewHolder();
            holder.starImageView = (ImageView)convertView.findViewById(R.id.circle_image_view);
            holder.closeImageView = (ImageView)convertView.findViewById(R.id.close_image_view);
            holder.text = (TextView)convertView.findViewById(R.id.question_text_view);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder)convertView.getTag();
        }

        String questionText = questionsText[position];

        holder.text.setText(questionText);
        holder.starImageView.setImageResource(R.drawable.black_star);
        holder.closeImageView.setImageResource(R.drawable.close_black);

        return convertView;
    }

    private static class ViewHolder{
        ImageView starImageView;
        ImageView closeImageView;
        TextView text;
    }
}
