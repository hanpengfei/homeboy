package com.vmloft.develop.app.match.notify;

import android.content.Context;

/**
 * Created by lzan13 on 2019/06/08 10:23
 *
 * 自定义发送通知栏通知
 */
public class ANotifier {
    private Context mContext;

    /**
     * 私有的构造方法
     */
    private ANotifier() {
    }

    /**
     * 内部类实现单例模式
     */
    private static class InnerHolder {
        public static ANotifier INSTANCE = new ANotifier();
    }

    public static ANotifier getInstance() {
        return InnerHolder.INSTANCE;
    }
}
