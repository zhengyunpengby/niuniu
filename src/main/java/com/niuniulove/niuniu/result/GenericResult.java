package com.niuniulove.niuniu.result;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/***
 * 有单个返回值结果
 * @author 李宝
 *
 * @param <T>
 */
public class GenericResult<T> extends Result {

	private static final long serialVersionUID = 1L;
	
	public GenericResult(){
		this.setResult(ResultCode.SUCCESS);
	}
	
	public static <E> GenericResult<E> newGenericResult() {
		return new GenericResult<E>();
	}
	
	/**
	 * @return 单个返回值
	 */
	private T data;

	public T getData() {
		return data;
	}

	public GenericResult<T> setData(T value) {
		this.data = value;
		return this;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this, ToStringStyle.DEFAULT_STYLE, true, true);
	}

}
