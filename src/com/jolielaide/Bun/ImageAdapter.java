package com.jolielaide.Bun;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * User: risadale
 * Date: 7/9/13
 * Time: 3:50 PM
 */


public class ImageAdapter  extends BaseAdapter{

    private Context mContext;
    public Integer [] images = {

            R.drawable.fourbunnies, R.drawable.busbunnies,
            R.drawable.drumcirclebunnies,R.drawable.leftspacebunny,
            R.drawable.potatobunnies,R.drawable.romanbunny,
            R.drawable.shellbunny,R.drawable.sleepwellrabbits,
            R.drawable.spacebunnyright,R.drawable.sweaterbunny,
            R.drawable.veganbunnies,R.drawable.drumcirclebunnies,
    };


    public ImageAdapter (Context c) {

        mContext = c;
    }




    /**
     *

     * How many items are in the data set represented by this Adapter.
     *
     * @return Count of items.
     */
    @Override
    public int getCount () {
        return images.length;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Get the data item associated with the specified position in the data set.




     *
     * @param position Position of the item whose data we want within the adapter's
     *                 data set.
     * @return The data at the specified position.
     */
    @Override
    public Object getItem (int position) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Get the row id associated with the specified position in the list.
     *
     * @param position The position of the item within the adapter's data set whose row id we want.
     * @return The id of the item at the specified position.
     */
    @Override
    public long getItemId (int position) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Get a View that displays the data at the specified position in the data set. You can either
     * create a View manually or inflate it from an XML layout file. When the View is inflated, the
     * parent View (GridView, ListView...) will apply default layout parameters unless you use
     * {@link LayoutInflater#inflate(int, ViewGroup, boolean)}
     * to specify a root view and to prevent attachment to the root.
     *
     * @param position    The position of the item within the adapter's data set of the item whose view
     *                    we want.
     * @param convertView The old view to reuse, if possible. Note: You should check that this view
     *                    is non-null and of an appropriate type before using. If it is not possible to convert
     *                    this view to display the correct data, this method can create a new view.
     *                    Heterogeneous lists can specify their number of view types, so that this View is
     *                    always of the right type (see {@link #getViewTypeCount()} and
     *                    {@link #getItemViewType(int)}).
     * @param parent      The parent that this view will eventually be attached to
     * @return A View corresponding to the data at the specified position.
     */

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(images[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(170, 170));
        return imageView;
    }

}




