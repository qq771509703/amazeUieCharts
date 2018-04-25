package com.example.xxf.vo;

public class ResponseVo {
	/**
	 * 访问成功
	 */
	public static int SUCCESS = 200;
	/**
	 * 系统异常
	 */
	public static int EXCEPTION = 500;
	/**
	 * 未授权
	 */
	public static int UNPERMISSION = 400;
	/**
	 * 未登录
	 */
	public static int UNAUTH = 401;
	/**
	 * 系统繁忙
	 */
	public static int BUZY = 300;
	/**
	 * 参数有误
	 */
	public static int PARAM_ERROR = 100;
	
	public ResponseVo() {
		super();
	}
	public ResponseVo(int code) {
		super();
		this.code = code;
	}
	
	public ResponseVo(int code, Object data) {
		super();
		this.code = code;
		this.data = data;
	}
	public ResponseVo(Object data) {
		super();
		this.data = data;
	}
	
	public ResponseVo(int code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
	}

	public ResponseVo(int code, Object data, String msg) {
		super();
		this.code = code;
		this.data = data;
		this.msg = msg;
	}

	/**
	 * 返回码
	 */
	private int code = ResponseVo.SUCCESS;
	/**
	 * 返回数据
	 */
	private Object data;
	/**
	 * 时间戳
	 */
	private long timestamp = System.currentTimeMillis();
	
	private String msg = null;

 
	@Override
	public String toString() {
		return "ResponseVo [code=" + code + ", data=" + data + ", timestamp="
				+ timestamp + ", msg=" + msg + "]";
	}
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
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
