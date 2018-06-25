package com.example.zhoukao3;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.zhoukao3.Adapter.MainMyAdapter;
import com.example.zhoukao3.base.BaseActivity;
import com.example.zhoukao3.base.bean.MainBean;
import com.example.zhoukao3.mvp.presenter.MainPresenter;
import com.example.zhoukao3.mvp.view.MainView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity<MainPresenter> implements View.OnClickListener,MainView {

 private RecyclerView recyclerView;
 private List<MainBean.JsonBean> list=new ArrayList<>();
 private MainMyAdapter mainMyAdapter;
    @Override
    public void onClick(View v) {

    }

    @Override
    public Context context() {
        return this;
    }
//成功
    @Override
    public void onSuccess(MainBean loginBean) {
        List<MainBean.JsonBean> data = loginBean.getJson();
        list.addAll(data);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        //设置适配器
        mainMyAdapter=  new MainMyAdapter(list);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(mainMyAdapter);
    }

    @Override
    public void onFaild(String error) {

    }

    @Override
    protected MainPresenter providePresenter() {
        return new MainPresenter(this);
    }

    @Override
    protected int provideLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initDatas() {
       presenter.getNews();
    }

    @Override
    protected void initListener() {

    }

    @Override
    protected void initViews() {
       recyclerView= findViewById(R.id.rv);
    }
}
