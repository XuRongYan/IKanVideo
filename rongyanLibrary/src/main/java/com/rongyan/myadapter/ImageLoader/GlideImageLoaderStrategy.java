package com.rongyan.myadapter.ImageLoader;

import android.content.Context;

import com.bumptech.glide.Glide;

/**
 * Created by XRY on 2016/8/31.
 */
public class GlideImageLoaderStrategy implements BaseImageLoaderStrategy {
    @Override
    public void loadImage(Context context, ImageLoader img) {
        loadNormal(context, img);
    }

    private void loadNormal(Context context, ImageLoader img) {
        Glide.with(context).load(img.getUrl()).placeholder(img.getPlaceHolder()).into(img.getImageView());
    }
}
