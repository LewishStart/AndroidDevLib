package com.lewish.start.android_lib.net.exception;

/**
 * author: sundong
 * created at 2017/4/10 15:40
 */
public class OkHttpException extends Exception {
	private static final long serialVersionUID = 1L;

	/**
	 * the server return code
	 */
	private int ecode;

	/**
	 * the server return error message
	 */
	private Object emsg;

	public OkHttpException(int ecode, Object emsg) {
		this.ecode = ecode;
		this.emsg = emsg;
	}

	public int getEcode() {
		return ecode;
	}

	public Object getEmsg() {
		return emsg;
	}
}