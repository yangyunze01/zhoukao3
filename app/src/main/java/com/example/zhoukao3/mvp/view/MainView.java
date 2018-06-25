package com.example.zhoukao3.mvp.view;

import com.example.zhoukao3.base.IView;
import com.example.zhoukao3.base.bean.MainBean;

/**
 * Created by 杨运泽 on 2018/6/25.
 */

public interface MainView extends IView{
    void onSuccess(MainBean loginBean);
    void onFaild(String error);
}
