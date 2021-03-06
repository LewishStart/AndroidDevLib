package com.lewish.start.android_lib.adapter.recyclerview;

/**
 * author: sundong
 * created at 2017/3/22 15:57
 */
public interface MultiItemTypeSupport<T> {
    int getLayoutId(int itemType);

    int getItemViewType(int position, T t);
}