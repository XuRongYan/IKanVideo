package com.example.ikanvideo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;


import com.example.ikanvideo.R;
import com.rongyan.rongyanlibrary.CommonAdapter.CommonAdapter;
import com.rongyan.rongyanlibrary.CommonAdapter.ViewHolder;
import com.rongyan.rongyanlibrary.rxHttpHelper.entity.Comment;

import java.util.List;

/**
 * Created by XRY on 2017/7/14.
 */

public class CommentsAdapter extends CommonAdapter<Comment> {
    public CommentsAdapter(Context context, List<Comment> list) {
        super(context, list);
    }

    public CommentsAdapter(Context context, List<Comment> list, RecyclerView recyclerView) {
        super(context, list, recyclerView);
    }

    @Override
    public int setLayoutId(int position) {
        return R.layout.item_comments;
    }

    @Override
    public void onBindVH(ViewHolder viewHolder, Comment item, int position) {
        viewHolder.setText(R.id.item_comments_content, item.getComments())
                .setText(R.id.item_comments_date, item.getComdatetime().replace('T', ' '))
                .setText(R.id.item_comments_name, item.getUsername());
    }
}
