package com.zafu.http.response;

public class BaseResponseBody {
	/**
	 * 返回状态码
	 */
	int code;
	/**
	 * 返回主体内容
	 */
	Object data;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
