package com.jia.pullrefresh.demo.widget;

import android.content.Context;
import android.support.v4.view.NestedScrollingParent;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

import com.jia.pullrefresh.demo.R;

/**
 * Created by tonyjia on 2018/5/3.
 */
public class PullRefreshWidget extends ViewGroup implements NestedScrollingParent {

    private static final int STATE_NONE = 0;
    private static final int STATE_PULL = 1;
    private static final int STATE_RELEASE = 2;
    private static final int STATE_REFRESHING = 3;
    private int mCurrentState = -1;

    private View mContenView;
    private View mHeaderView;
    private View mFooterView;

    public PullRefreshWidget(Context context) {
        super(context);
    }

    public PullRefreshWidget(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public PullRefreshWidget(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        int count = getChildCount();
        for (int i = 0; i < count; i++) {
            View view = getChildAt(i);

        }
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        if (null == mHeaderView) {
            mHeaderView = createHeaderView();
        }
        if (null == mFooterView) {
            mFooterView = createFooterView();
        }
        addView(mHeaderView);
        addView(mContenView);
        addView(mFooterView);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

    }

    private View createHeaderView() {
        return inflate(getContext(), R.layout.view_header, this);
    }

    private View createFooterView() {
        return inflate(getContext(), R.layout.view_footer, this);
    }

}
