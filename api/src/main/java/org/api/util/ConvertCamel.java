package org.api.util;

public class ConvertCamel {

	/**
	 * 把待下划线的字符串转化为驼峰格式的字符串
	 * 
	 * @param param
	 * @return
	 */
	public static String underlineToCamel(String param) {
		String[] params = param.split("_");
		int len = params.length;
		if (len > 1) {
			StringBuilder result = new StringBuilder();
			String str = null;
			result.append(params[0]);
			for (int i = 1; i < len; i++) {
				str = params[i];
				result.append(str.replaceFirst("^[a-z]", String.valueOf(str.charAt(0)).toUpperCase()));
			}
			return result.toString();
		} else {
			return param;
		}
	}
}
