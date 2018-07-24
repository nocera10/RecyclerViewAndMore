package com.example.aula_01.reciclerviewandmore;

import android.view.View;
import android.widget.TextView;
import android.support.v7.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    private TextView title;

    public MyViewHolder(View view) {
        super(view);
        title = (TextView) view.findViewById(R.id.title);
    }

    public void bind(String s) {
        title.setText(s);
    }
}
