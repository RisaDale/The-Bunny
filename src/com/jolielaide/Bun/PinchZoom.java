package com.jolielaide.Bun;

import android.content.Context;
import android.view.View;
import android.view.ScaleGestureDetector;
import android.graphics.drawable.Drawable;

/**
 * Created by risadale on 7/17/13.
 */
public class PinchZoom extends View {

    private static final int INVALID_POINTER_ID = -1;

    private Drawable mImage;
    private float mPosX;
    private float mPosy;


    private float mLastTouchX;
    private float mLastTouchY;
    private int mActivePointerId = INVALID_POINTER_ID;

    private ScaleGestureDetector mScaleDetector;
    private float mScaleFactor = 1.f;





    public PinchZoom(Context context, Object o, int i) {
        this(context, null, 0);

        mImage = o.GetResources().getDrawable(context.getResources());




    }
}


// If the image is zoomed , then make the user zoom out to swipe
// the next sideways image
//choose specific coordinates to fire the event
// ie 30/30/30