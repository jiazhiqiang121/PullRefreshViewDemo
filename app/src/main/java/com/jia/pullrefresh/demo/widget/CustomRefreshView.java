package com.jia.pullrefresh.demo.widget;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import com.jia.pullrefresh.demo.R;

/**
 * Created by tonyjia on 2018/5/3.
 */
public class CustomRefreshView extends LinearLayout implements PullRefreshLayout.IRefreshView {

    public CustomRefreshView(Context context) {
        super(context, null);
    }

    public CustomRefreshView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CustomRefreshView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        inflate(context, R.layout.pull_refresh_view, this);

    }

    @Override
    public void stop() {

    }

    @Override
    public void doRefresh() {

    }

    @Override
    public void onPull(int offset, int total, int overPull) {

    }
}
