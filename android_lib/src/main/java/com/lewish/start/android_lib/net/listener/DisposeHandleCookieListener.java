package com.lewish.start.android_lib.net.listener;

import java.util.ArrayList;

/**
 * author: sundong
 * created at 2017/4/10 15:40
 */
public interface DisposeHandleCookieListener extends DisposeDataListener
{
	public void onCookie(ArrayList<String> cookieStrLists);
}
