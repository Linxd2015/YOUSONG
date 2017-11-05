package com.tal.utils;

import com.alibaba.fastjson.JSON;

/**
 * @author whfstudio@163.com
 * @date 2017/11/05
 */
public class CheckUtils {

	/**
	 * 私有化构造器.
	 */
	private CheckUtils() {
	}

	public static CheckUtils getInstance() {
		return SingletonInstance.instance;
	}

	/**
	 * 私有化的内部类.
	 */
	private static class SingletonInstance {
		static CheckUtils instance = new CheckUtils();
	}

	public boolean checkJson(String jsonstr) {
		try {
			JSON.parseObject(jsonstr);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
