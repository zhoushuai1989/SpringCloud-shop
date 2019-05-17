package com.wangcai.base;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@Slf4j
public class ResponseBase {
	// 响应code
	private Integer code;
	// 消息内容
	private String msg;
	// 返回data
	private Object data;

	public ResponseBase() {
	}

	public ResponseBase(Integer code, String msg, Object data) {
		super();
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	@Override
	public String toString() {
		return "ResponseBase [cde=" + code + ", msg=" + msg + ", data=" + data + "]";
	}

	public static void main(String[] args) {
		ResponseBase responseBase = new ResponseBase();
		responseBase.setData("123456");
		responseBase.setMsg("success");
		responseBase.setCode(200);
		System.out.println(responseBase.toString());
		log.info("itmayiedu...");
	}
}
