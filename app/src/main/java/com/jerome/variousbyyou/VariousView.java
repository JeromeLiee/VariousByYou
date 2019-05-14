package com.jerome.variousbyyou;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

public class VariousView extends RelativeLayout {
    public VariousView(Context context) {
        super(context);
    }

    public VariousView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public VariousView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }
}
