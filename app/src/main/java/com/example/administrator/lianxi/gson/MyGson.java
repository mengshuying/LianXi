package com.example.administrator.lianxi.gson;
import com.example.administrator.lianxi.bean.JsonBean;
import com.google.gson.Gson;
import java.util.List;
/**
 * date:${DATA}
 * author:孟淑英
 * function:
 */
public class MyGson {
    public List<JsonBean.ListBean> jie(String stt){
        Gson gson=new Gson();
        JsonBean jsonBean = gson.fromJson(stt, JsonBean.class);
        List<JsonBean.ListBean> list = jsonBean.getList();
        return list;
    }
}
