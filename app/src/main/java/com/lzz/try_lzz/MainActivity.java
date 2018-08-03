package com.lzz.try_lzz;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import com.lzz.try_lzz.base.BaseActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends BaseActivity {

    private ListView LV;
    private Map<String, Object> map;
    private SimpleAdapter adapter;
    private List<Map<String, Object>> list;
    private int[] images = {R.mipmap.beiqi,R.mipmap.benteng, R.mipmap.bisu,R.mipmap.changhe};
    private String[] names = {"北汽汽车","现代汽车","北汽汽车1","北汽汽车2"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LV = findViewById(R.id.LV);
        //shuju
        list = new ArrayList<Map<String, Object>>();
        for (int i = 0; i < names.length; i++){
            map = new HashMap<String, Object>();
            map.put("img",images[i]);//放入图片id
            map.put("names",names[i]);
            map.put("jieshao","汽车介绍>>>>>"+names[i]);
            list.add(map);
        }
        Log.d("lzz1》》》》》",list+" ");
        //初始化adapter
        String[] from = {"img","names","jieshao"};
        int[] to = {R.id.prc_image,R.id.prc_names,R.id.prc_jieshao};
        adapter = new SimpleAdapter(this, list, R.layout.item_next, from, to);
        Log.d("lzz1》》》》》",adapter+" ");
        LV.setAdapter(adapter);
//        LV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(MainActivity.this,"点击的positon"+position+">>>>>>id"+id, Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        LV.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
//            @Override
//            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
//                list.remove(position);
//                adapter.notifyDataSetChanged();
//                return true;
//            }
//        });
    }
}
