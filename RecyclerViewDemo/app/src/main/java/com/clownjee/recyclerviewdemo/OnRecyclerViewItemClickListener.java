package com.clownjee.recyclerviewdemo;

import android.view.View;

/**
 * Created by Taki on 2017/2/27.
 */
public interface OnRecyclerViewItemClickListener {

    void onItemClickListener(View view, int position);

    void onItemLongClickListener(View view, int position);
}
