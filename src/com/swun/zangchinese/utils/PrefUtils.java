package com.swun.zangchinese.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * SharePreference�ķ�װ 
 * @author snail
 *
 */
public class PrefUtils {
	public static final String PREF_NAME = "config";
	
	public static boolean getBoolean(Context ctx, String key,
			boolean defaultValve) {
		//�ж�֮ǰ��û����ʾ����������
		SharedPreferences sp = ctx.getSharedPreferences(PREF_NAME, 
				Context.MODE_PRIVATE);
		return sp.getBoolean(key, defaultValve);
	}
	
	public static void setBoolean(Context ctx, String key,
			boolean value) {
		SharedPreferences sp = ctx.getSharedPreferences(PREF_NAME, 
						Context.MODE_PRIVATE);
		sp.edit().putBoolean(key, value).commit();
	}
}
