package com.zafu.http.response;

public class BaseResponseBody {
	/**
	 * ����״̬��
	 */
	int code;
	/**
	 * ������������
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
