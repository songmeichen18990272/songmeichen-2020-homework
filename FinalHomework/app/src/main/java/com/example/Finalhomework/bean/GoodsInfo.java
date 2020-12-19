package com.example.Finalhomework.bean;

import com.example.Finalhomework.R;

import java.util.ArrayList;

public class GoodsInfo {
    public int pic_id;
    public String title;
    public String desc;
    public boolean bPressed;
    public int id;
    private static int seq = 0;

    public GoodsInfo(int pic_id, String title, String desc) {
        this.pic_id = pic_id;
        this.title = title;
        this.desc = desc;
        this.bPressed = false;
        this.id = seq;
        seq++;
    }


    private static final int[] gridImageArray = {R.drawable.pic_01, R.drawable.pic_02, R.drawable.pic_03
            , R.drawable.pic_04, R.drawable.pic_05, R.drawable.pic_06, R.drawable.pic_07
            , R.drawable.pic_08, R.drawable.pic_09, R.drawable.pic_10};
    private static final String[] gridTitleArray = {"限时抢购", "美妆护肤", "运动器材", "美食集合",
            "限时优惠", "学习用品", "生鲜美食", "家居生活", "保税专区", "新品体验"};

    public static ArrayList<GoodsInfo> getDefaultGrid() {
            ArrayList<GoodsInfo> gridArray = new ArrayList<GoodsInfo>();
            for (int i = 0; i < gridImageArray.length; i++) {
                gridArray.add(new GoodsInfo(gridImageArray[i], gridTitleArray[i], null));
            }
            return gridArray;
    }



    private static final int[] stagImageArray = {R.drawable.b11, R.drawable.b2, R.drawable.b3
            , R.drawable.b4, R.drawable.b5, R.drawable.b7};
    private static final String[] stagTitleArray = {"泡泡玛特", "抽盲盒 收获惊喜", "可爱的比奇", "今天你抽盲盒了吗", "每日一抽", "惊喜多多"};

    public static ArrayList<GoodsInfo> getDefaultStag() {
        ArrayList<GoodsInfo> stagArray = new ArrayList<GoodsInfo>();
        for (int i = 0; i < stagImageArray.length; i++) {
            stagArray.add(new GoodsInfo(stagImageArray[i], stagTitleArray[i], null));
        }
        return stagArray;
    }





}
