package com.example.ikanvideo.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.ikanvideo.R;
import com.example.ikanvideo.advertisement.AdvertisementActivity;
import com.rongyan.rongyanlibrary.CommonAdapter.CommonAdapter;
import com.rongyan.rongyanlibrary.CommonAdapter.ViewHolder;
import com.rongyan.rongyanlibrary.rxHttpHelper.entity.Video;

import java.util.List;

/**
 * Created by XRY on 2017/5/23.
 */

public class MyCollectionAdapter extends CommonAdapter<Video> {

    public MyCollectionAdapter(Context context, List<Video> list) {
        super(context, list);
    }

    public MyCollectionAdapter(Context context, List<Video> list, RecyclerView recyclerView) {
        super(context, list, recyclerView);
    }

    @Override
    public int setLayoutId(int position) {
        return R.layout.item_collection;
    }

    @Override
    public void onBindVH(ViewHolder viewHolder, final Video item, int position) {
        viewHolder.setImageUrl(R.id.video_img, item.getImageURL(), R.drawable.ic_failure)
                .setText(R.id.video_title, item.getTitle())
                .setText(R.id.video_news, item.getTitlenew());
        viewHolder.getConvertView().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putSerializable("video", item);
                Intent intent = new Intent(context, AdvertisementActivity.class);
                intent.putExtras(bundle);
                ((Activity) context).startActivityForResult(intent, 1);
            }
        });
    }
}
