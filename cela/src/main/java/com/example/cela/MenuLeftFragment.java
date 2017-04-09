package com.example.cela;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.util.Arrays;
import java.util.List;
/**
 * date:${DATA}
 * author:孟淑英
 * function:
 */
public class MenuLeftFragment extends Fragment{
    private View mView;
    private ListView mCategories;
    private List<String> mDatas = Arrays
            .asList("好友动态", "我的话题", "收藏", "活动", "商城");
    private ListAdapter mAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        if (mView == null)
        {
            initView(inflater, container);
        }
        return mView;
    }

    private void initView(LayoutInflater inflater, ViewGroup container)
    {
        mView = inflater.inflate(R.layout.left_menu, container, false);
        mCategories = (ListView) mView
                .findViewById(R.id.list_view);
        mAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, mDatas);
        mCategories.setAdapter(mAdapter);
    }
}
