package com.xiaoqiang.captcha_library;

/**
 * @author 小强
 *
 * @time 2020/4/27  15:51
 *
 * @desc 位置
 */

public class PositionInfo {

    int left;     //拼图缺块离整张图片左边距离
    int top;      //拼图缺块离整张图片上方距离

    public PositionInfo(int left, int top) {
        this.left = left;
        this.top = top;
    }
}
