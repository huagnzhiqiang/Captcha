package com.xiaoqiang.captcha_library;

import android.content.Context;


/**
 * @author 小强
 *
 * @time 2020/4/27  15:51
 *
 * @desc 工具类
 */

public class Utils {


    /**
     * dp转px
     */
    public static int dp2px (Context ctx, float dip) {
        float density = ctx.getResources().getDisplayMetrics().density;
        return (int) (dip * density);
    }
}
