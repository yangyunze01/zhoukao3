package com.example.zhoukao3.mvp.presenter;

import com.example.zhoukao3.base.BasePresenter;
import com.example.zhoukao3.base.bean.MainBean;
import com.example.zhoukao3.mvp.model.MainModel;
import com.example.zhoukao3.mvp.view.MainView;

/**
 * Created by 杨运泽 on 2018/6/25.
 */

public class MainPresenter  extends BasePresenter<MainView>{
    private MainModel mainModel;

    public MainPresenter(MainView iMainView) {
        super(iMainView);
    }

    @Override
    protected void initModel() {
        mainModel = new MainModel();
    }

    public void getNews() {
        mainModel.getNews( new MainModel.IMainModelCallback() {

            @Override
            public void getSuccess(MainBean newsBean) {
                if (view != null) {
                    view.onSuccess(newsBean);
                }
            }

            @Override
            public void getFaild(String error) {
                if (view != null) {
                    view.onFaild(error);
                }
            }
        });
    }
}
