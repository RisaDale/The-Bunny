package com.jolielaide.Bun;

/**
 * Created by risadale on 7/24/13.
 */
import android.view.MotionEvent;

/**
 * Implementation of motion event compatibility that can call Eclair APIs.
 */
class MotionEventCompatEclair {
    public static int findPointerIndex(MotionEvent event, int pointerId) {
        return event.findPointerIndex(pointerId);
    }
    public static int getPointerId(MotionEvent event, int pointerIndex) {
        return event.getPointerId(pointerIndex);
    }
    public static float getX(MotionEvent event, int pointerIndex) {
        return event.getX(pointerIndex);
    }
    public static float getY(MotionEvent event, int pointerIndex) {
        return event.getY(pointerIndex);
    }
}