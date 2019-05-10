package com.niuniulove.niuniu.result;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.List;

/***
 * 返回集合值结果
 * @author 李宝
 *
 * @param <T>
 */
public class ListResult<T> extends Result {

	private static final long serialVersionUID = 1L;
	
	public ListResult(){
		this.setResult(ResultCode.SUCCESS);
	}
	
	public static <E> ListResult<E> newListResult() {
		return new ListResult<E>();
	}
	
	/**
	 * 集合值结果
	 */
	private List<T> data;

	public List<T> getData() {
		return data;
	}

	public ListResult<T> setData(List<T> values) {
		this.data = values;
		return this;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this, ToStringStyle.DEFAULT_STYLE, true, true);
	}
}
