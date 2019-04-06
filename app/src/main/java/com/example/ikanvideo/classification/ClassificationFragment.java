package com.example.ikanvideo.classification;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ikanvideo.R;

import com.example.ikanvideo.adapter.MainViewPagerAdapter;
import com.rongyan.rongyanlibrary.base.BaseFragment;
import com.rongyan.rongyanlibrary.rxHttpHelper.http.ActivityLifeCycleEvent;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import rx.subjects.PublishSubject;


/**
 * A simple {@link Fragment} subclass.
 */
public class ClassificationFragment extends BaseFragment {
    @Bind(R.id.classification_tab)
    TabLayout tabLayout;
    @Bind(R.id.classification_viewpager)
    ViewPager viewPager;
    private ClassificationContract.Presenter mPresenter;
    private ArrayList<BaseFragment> fragments = new ArrayList<>();
    private ArrayList<String> titleList = new ArrayList<>();
    private static PublishSubject<ActivityLifeCycleEvent> lifeCycleEventPublishSubject;

    public static ClassificationFragment newInstance(PublishSubject<ActivityLifeCycleEvent> lifeCycleEventPublishSubject) {

        Bundle args = new Bundle();
        ClassificationFragment.lifeCycleEventPublishSubject = lifeCycleEventPublishSubject;
        ClassificationFragment fragment = new ClassificationFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected void initViews(View rootView) {
        titleList.add(ClassificationActivity.title);
        titleList.add("筛选");
        BaseFragment classTabFragment = ClassTabFragment.newInstance();
        BaseFragment filterFragment = FilterFragment.newInstance();
        new ClassificationPresenter((ClassificationContract.View) classTabFragment, getContext(), lifeCycleEventPublishSubject);
        fragments.add(classTabFragment);
        fragments.add(filterFragment);
        MainViewPagerAdapter adapter = new MainViewPagerAdapter(getActivity().getSupportFragmentManager(), fragments, titleList);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    protected int getContentViewID() {
        return R.layout.fragment_classification;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
