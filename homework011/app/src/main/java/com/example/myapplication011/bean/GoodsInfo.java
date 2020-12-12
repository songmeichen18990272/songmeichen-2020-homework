package com.example.myapplication011.bean;

import java.util.ArrayList;

import com.example.myapplication011.R;

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
        this.id = this.seq;
        this.seq++;
    }

    private static int[] listImageArray = {R.drawable.public_01, R.drawable.public_02
            , R.drawable.public_03, R.drawable.public_04, R.drawable.public_05};
    private static String[] listTitleArray = {
            "每日必抢", "口碑生活", "霸霸农场", "嘻哈直播", "更多频道"};
    private static String[] listDescArray = {
            "今日特价惊喜多",
            "口红包包随便挑",
            "新鲜食材农场送，霸霸来帮你去种",
            "直播间里走一波，要啥有啥，超低价",
            "更多惊喜等你拿，惊喜多多，福利多多嘛"};

    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> listArray = new ArrayList<GoodsInfo>();
        for (int i = 0; i < listImageArray.length; i++) {
            listArray.add(new GoodsInfo(listImageArray[i], listTitleArray[i], listDescArray[i]));
        }
        return listArray;
    }

    private static int[] gridImageArray = {R.drawable.pic_01, R.drawable.pic_02, R.drawable.pic_03
            , R.drawable.pic_04, R.drawable.pic_05, R.drawable.pic_06, R.drawable.pic_07
            , R.drawable.pic_08, R.drawable.pic_09, R.drawable.pic_10};
    private static String[] gridTitleArray = {"商场", "超市", "百货", "便利店",
            "地摊", "食杂店", "饭店", "餐厅", "会所", "菜市场"};

    public static ArrayList<GoodsInfo> getDefaultGrid() {
        ArrayList<GoodsInfo> gridArray = new ArrayList<GoodsInfo>();
        for (int i = 0; i < gridImageArray.length; i++) {
            gridArray.add(new GoodsInfo(gridImageArray[i], gridTitleArray[i], null));
        }
        return gridArray;
    }

    private static int[] stagImageArray = {R.drawable.popmart01, R.drawable.popmart02, R.drawable.popmart03
            , R.drawable.popmart04, R.drawable.popmart05, R.drawable.popmart05, R.drawable.popmart06
            , R.drawable.y4, R.drawable.y5, R.drawable.y6, R.drawable.y7
            , R.drawable.y8, R.drawable.k4, R.drawable.k3, R.drawable.k2
            , R.drawable.k1, R.drawable.b1, R.drawable.b2, R.drawable.b3
            , R.drawable.b4, R.drawable.b5, R.drawable.w2, R.drawable.w4};
    private static String[] stagTitleArray = {"促销价", "惊爆款", "跳楼价", "白菜价", "清仓价", "割肉价",
            "实惠价", "一口价", "砍手价", "打折价", "腰斩价", "太冷淡了", "饶了吧", "再练练",
            "嘘嘘", "嗯嗯", "棒棒", "呵呵", "哈哈", "比心", "biu~", "奈斯", "奥里给"};

    public static ArrayList<GoodsInfo> getDefaultStag() {
        ArrayList<GoodsInfo> stagArray = new ArrayList<GoodsInfo>();
        for (int i = 0; i < stagImageArray.length; i++) {
            stagArray.add(new GoodsInfo(stagImageArray[i], stagTitleArray[i], null));
        }
        return stagArray;
    }

    private static int[] combineImageArray = {R.drawable.popmart01, R.drawable.b3
            , R.drawable.trip_01, R.drawable.trip_02, R.drawable.trip_03, R.drawable.trip_04};
    private static String[] combineTitleArray = {
            "盲盒", "包包", "看好了", "领福利", "去下单", "火速发货"};

    public static ArrayList<GoodsInfo> getDefaultCombine() {
        ArrayList<GoodsInfo> combineArray = new ArrayList<GoodsInfo>();
        for (int i = 0; i < combineImageArray.length; i++) {
            combineArray.add(new GoodsInfo(combineImageArray[i], combineTitleArray[i], null));
        }
        return combineArray;
    }

    private static int[] appiImageArray = {R.drawable.dian01, R.drawable.dian02, R.drawable.dian03
            , R.drawable.dian04, R.drawable.dian05, R.drawable.dian06, R.drawable.dian07
            , R.drawable.dian08, R.drawable.dian09, R.drawable.dian10, R.drawable.dian11
            , R.drawable.dian12, R.drawable.dian13, R.drawable.dian14, R.drawable.dian15};
    private static String[] appiTitleArray = {"双十二", "大优惠", "砍手价",
            "劲爆款", "速度点", "快来抢", "去下单", "享优惠", "包快递", "速返利",
            "最低价", "砍到低", "买不起", "奥里给", "下次继续"};

    public static ArrayList<GoodsInfo> getDefaultAppi() {
        ArrayList<GoodsInfo> appiArray = new ArrayList<GoodsInfo>();
        for (int i = 0; i < appiImageArray.length; i++) {
            appiArray.add(new GoodsInfo(appiImageArray[i], appiTitleArray[i], null));
        }
        return appiArray;
    }

}
