package com.chengy.libtest.Utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/8/4.
 * testing show the toast
 */
public class ToastUtil {
    public static void showToast(Context context, String content){
        Toast.makeText(context,content,Toast.LENGTH_SHORT).show();
    }
}
