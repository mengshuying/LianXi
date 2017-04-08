package com.example.administrator.lianxi.asynctask;
import android.content.Context;
import android.os.AsyncTask;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.example.administrator.lianxi.adapter.MyAdapter;
import com.example.administrator.lianxi.bean.JsonBean;
import com.example.administrator.lianxi.gson.MyGson;
import com.example.administrator.lianxi.http.MyHttp;
import com.example.administrator.lianxi.url.Url;

import java.util.List;

/**
 * date:${DATA}
 * author:孟淑英
 * function:
 */
public class MyAsynctask extends AsyncTask<Void,Void,String>{
      private final ListView mListView;
          private final Context mContext;
    private List<JsonBean.ListBean> mList;
    private MyAdapter mAdapter;

    public MyAsynctask(Context context, ListView List_view){
              mListView =List_view;
              mContext =context;
          }
          @Override
          protected String doInBackground(Void... params) {
              MyHttp hp=new MyHttp();
              String url = hp.getURL(Url.url1);
              return url;
          }
          @Override
          protected void onPostExecute(String s) {
              MyGson son=new MyGson();
              mList = son.jie(s);
              mAdapter = new MyAdapter(mContext,mListView, mList);
              mListView.setAdapter(mAdapter);
              mListView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
                  @Override
                  public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                      mList.remove(position);
                      mAdapter.notifyDataSetChanged();
                      return false;
                  }
              });
              super.onPostExecute(s);
          }
}
