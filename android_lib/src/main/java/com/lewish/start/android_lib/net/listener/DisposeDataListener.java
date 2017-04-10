package com.lewish.start.android_lib.net.listener;

/**
 * author: sundong
 * created at 2017/4/10 15:41
 */
public interface DisposeDataListener {

	/**
	 * 请求成功回调事件处理
	 */
	public void onSuccess(Object responseObj);

	/**
	 * 请求失败回调事件处理
	 */
	public void onFailure(Object reasonObj);

}
