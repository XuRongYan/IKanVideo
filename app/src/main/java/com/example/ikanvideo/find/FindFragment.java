package com.example.ikanvideo.find;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.LinearLayout;

import com.example.ikanvideo.R;
import com.example.ikanvideo.guessYouLike.GuessYouLikeActivity;
import com.example.ikanvideo.hotPlay.HotPlayActivity;
import com.example.ikanvideo.rank.RankActivity;
import com.rongyan.rongyanlibrary.base.BaseFragment;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;


/**
 * A simple {@link Fragment} subclass.
 */
public class FindFragment extends BaseFragment {

    @Bind(R.id.find_rank)
    LinearLayout findRank;
    @Bind(R.id.find_hot_play)
    LinearLayout findHotPlay;
    @Bind(R.id.find_like)
    LinearLayout findLike;

    public static FindFragment newInstance() {

        Bundle args = new Bundle();

        FindFragment fragment = new FindFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected void initViews(View rootView) {

    }

    @Override
    protected int getContentViewID() {
        return R.layout.fragment_find;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    @OnClick({R.id.find_hot_play, R.id.find_like, R.id.find_rank})
    public void click(View view) {
        switch (view.getId()) {
            case R.id.find_hot_play:
                goActivity(HotPlayActivity.class);
                break;
            case R.id.find_like:
                goActivity(GuessYouLikeActivity.class);
                break;
            case R.id.find_rank:
                goActivity(RankActivity.class);
                break;
        }
    }
}
