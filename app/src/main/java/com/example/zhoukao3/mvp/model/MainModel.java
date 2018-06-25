package com.example.zhoukao3.mvp.model;

import com.example.zhoukao3.base.bean.MainBean;
import com.example.zhoukao3.utils.HttpConfig;
import com.example.zhoukao3.utils.OkHttpUtils;
import com.google.gson.Gson;

/**
 * Created by 杨运泽 on 2018/6/25.
 */

public class MainModel {
      public void getNews( final IMainModelCallback iMainModelCallback){
          OkHttpUtils okHttpUtils = OkHttpUtils.getInstance();
          okHttpUtils.doGet(HttpConfig.MAIN_SHUJU, new OkHttpUtils.OkCallback() {
              @Override
              public void getFailure(Exception error) {
                  if (iMainModelCallback!=null) {
                      iMainModelCallback.getFaild(String.valueOf(error));
                  }
              }

              @Override
              public void getResponse(String josn) {

                  MainBean mainBean = new Gson().fromJson(josn, MainBean.class);
                  int i = mainBean.getJson().hashCode();

                  if(0==i){
                      if (iMainModelCallback!=null) {
                          iMainModelCallback.getSuccess(mainBean);
                      }
                  }else{
                      if (iMainModelCallback!=null) {
                          iMainModelCallback.getFaild("请求数据失败");
                      }
                  }


              }
          });

      }

    public interface IMainModelCallback{
        void getSuccess(MainBean newsBean);
        void getFaild(String error);
    }
}
