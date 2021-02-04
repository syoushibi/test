package com.nakamura.utils;

import java.util.UUID;

public class ItemsUtils {
	public static String getImageName(String pictureName) {
		//获取一个永远也不会重复的乱的数字英文字符
		String str = UUID.randomUUID().toString();
		//把字符串中的- 变成空字符
		String startName = str.replace("-", "");
		//截取.jpg
		String endName = pictureName.substring(pictureName.lastIndexOf("."));
		return startName+endName;
	}
}
