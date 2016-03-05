package com.swun.zangchinese.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * SharePreference的封装 
 * @author snail
 *
 */
public class PrefUtils {
	public static final String PREF_NAME = "config";
	
	public static boolean getBoolean(Context ctx, String key,
			boolean defaultValve) {
		//判断之前有没有显示过新手引导
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
