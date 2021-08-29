package com.test.entity;

import lombok.Data;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.io.Serializable;

/**
 * @author 53208
 */
@Data
public class Resp<T> implements Serializable{

	private RespStatus status;

	private Object data;

	public Resp(){

	}

	public Resp(RespStatus status,Object data){
		this.status = status;
		this.data = data;
	}



	public Resp setData(Object data) {
		this.data = data;
		return this;
	}

	public RespStatus getStatus() {
		return status;
	}

	public Resp setStatus(RespStatus status) {
		this.status = status;
		return this;
	}

	public static Resp success() {
		return new Resp().setStatus(RespStatus.SUCCESSFUL);
	}

	public static Resp success(String msg) {
		final String c = String.valueOf(RespStatus.SUCCESSFUL);
		final RespStatus s = new RespStatus(RespStatus.SUCCESSFUL.getCode(), msg);
		return new Resp().setStatus(s);
	}

	public static Resp failed() {
		return new Resp().setStatus(RespStatus.FAILED);
	}

	public static Resp failed(String msg) {
		final String c = String.valueOf(RespStatus.CODE_FAILED);
		final RespStatus s = new RespStatus(c, msg);
		return new Resp().setStatus(s);
	}

	public static Resp failed(BindingResult bindingResult){
		final FieldError fieldError = bindingResult.getFieldError();
		final String code = RespStatus.FAILED.getCode();
		final String msg = fieldError.getField()+fieldError.getDefaultMessage();
		final RespStatus s = new RespStatus(code, msg);
		return new Resp().setStatus(s);
	}

	public static Resp failed(FieldError fieldError){
		final String code = RespStatus.FAILED.getCode();
		final String msg = fieldError.getDefaultMessage();
		final RespStatus s = new RespStatus(code, msg);
		return new Resp().setStatus(s);
	}

	public static Resp failed(String code,String msg){
		final RespStatus s = new RespStatus(code, msg);
		return new Resp().setStatus(s);
	}

	public static Resp unauthorized() {
		return new Resp().setStatus(RespStatus.UNAUTHORIZED);
	}

	public static Resp unauthorized(String msg) {
		final String c = String.valueOf(RespStatus.CODE_UNAUTHORIZED);
		final RespStatus s = new RespStatus(c, msg);
		return new Resp().setStatus(s);
	}

	public static boolean isSuccess(Resp resp){
		if (!"0".equals(resp.getStatus().getCode())){
			return false;
		}else {
			return true;
		}
	}
}
