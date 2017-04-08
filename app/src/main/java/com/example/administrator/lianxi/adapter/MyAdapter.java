package com.example.administrator.lianxi.adapter;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.example.administrator.lianxi.R;
import com.example.administrator.lianxi.bean.JsonBean;
import java.util.List;
/**
 * date:${DATA}
 * author:孟淑英
 * function:
 */
public class MyAdapter extends BaseAdapter{
    private final Context mContext;
        private final List<JsonBean.ListBean> mComicsBeen;
        private final ListView mListView;

    public MyAdapter(Context context, ListView listView,List<JsonBean.ListBean> list){
             mContext =context;
             mComicsBeen =list;
            mListView =listView;
         }

        @Override
        public int getCount(){
            return mComicsBeen.size();
        }

        @Override
        public Object getItem(int position){
            return mComicsBeen.get(position);
        }

        @Override
        public long getItemId(int position){
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent){
            ViewHolder viewHolder;
            if(convertView==null){
                convertView=View.inflate(mContext, R.layout.listview_layout,null);
                viewHolder=new ViewHolder();
                viewHolder.textview1= (TextView) convertView.findViewById(R.id.textview1);
                viewHolder.textview2= (TextView) convertView.findViewById(R.id.textview2);
                convertView.setTag(viewHolder);
            }else{
                viewHolder= (ViewHolder) convertView.getTag();
            }
            viewHolder.textview1.setText(mComicsBeen.get(position).getSite_name());
            viewHolder.textview2.setText(mComicsBeen.get(position).getAddress());
            mListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                    Toast.makeText(mContext,mComicsBeen.get(position).getId()+"",Toast.LENGTH_SHORT).show();
                }
            });
            return convertView;
        }
        public class ViewHolder{
            TextView textview1;
            TextView textview2;
        }
}
