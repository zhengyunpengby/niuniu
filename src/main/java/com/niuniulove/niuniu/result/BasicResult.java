package com.niuniulove.niuniu.result;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 无返回值结果
 * @author 李宝
 *
 */
public class BasicResult extends Result{

	private static final long serialVersionUID = 1L;
	
	public BasicResult(){
		this.setResult(ResultCode.SUCCESS);
	}

	public static BasicResult newBasicResult() {
		return new BasicResult();
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this, ToStringStyle.DEFAULT_STYLE, true, true);
	}
}
