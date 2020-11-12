package com.example.homework07.bean;

import com.example.homework07.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "毕奇米奇", "DIMOO初心者", "Pucky加菲猫", "MOLLY的一天", "毕奇睡眠宝宝", "DIMOO社会大学","MOLLY开心火车","skullpanda密林古堡"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "POPMART泡泡玛特 毕奇米奇家族系列盲盒迪士尼联名",
            "POPMART泡泡玛特 MEGA COLLECTION-DIMOO初心者手办摆件",
            "POPMART泡泡玛特 Pucky加菲猫合作款大号",
            "POPMART泡泡玛特 MOLLY的一天系列盲盒潮流手办",
            "POPMART泡泡玛特 毕奇精灵睡眠宝宝盲盒手办",
            "POPMART泡泡玛特 DIMOO社会大学系列盲盒",
            "POPMART泡泡玛特 MOLLY开心火车大派对系列盲盒",
            "POPMART泡泡玛特 skullpanda密林古堡系列盲盒"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {59, 59, 79, 59, 59, 59, 79, 69};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.popmart01_s, R.drawable.popmart02_s, R.drawable.popmart03_s,
            R.drawable.popmart04_s, R.drawable.popmart05_s, R.drawable.popmart06_s,
            R.drawable.popmart07_s, R.drawable.popmart08_s
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.popmart01, R.drawable.popmart02, R.drawable.popmart03,
            R.drawable.popmart04, R.drawable.popmart05, R.drawable.popmart06,
            R.drawable.popmart07, R.drawable.popmart08
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}
