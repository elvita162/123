package com.example.ex05_recyclerview01a;

import java.util.ArrayList;

public class sceneInfo {
    private String description;
    private int imgId;
    private String country;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    public sceneInfo(String description, int imgId) {
        this.description = description;
        this.imgId = imgId;
    }
    public sceneInfo(String description, int imgId, String country) {
        this.description = description;
        this.imgId = imgId;
        this.country=country;
    }


    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getImgId() {
        return imgId;
    }
    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public static sceneInfo[] getMyListDataArray(){
        sceneInfo[] sceneInfo = new sceneInfo[] {
                new sceneInfo("Email", android.R.drawable.ic_dialog_email),
                new sceneInfo("Info", android.R.drawable.ic_dialog_info),
                new sceneInfo("Delete", android.R.drawable.ic_delete),
                new sceneInfo("Dialer", android.R.drawable.ic_dialog_dialer),
                new sceneInfo("Alert", android.R.drawable.ic_dialog_alert),
                new sceneInfo("Map", android.R.drawable.ic_dialog_map),
                new sceneInfo("Email", android.R.drawable.ic_dialog_email),
                new sceneInfo("Info", android.R.drawable.ic_dialog_info),
                new sceneInfo("Delete", android.R.drawable.ic_delete),
                new sceneInfo("Dialer", android.R.drawable.ic_dialog_dialer),
                new sceneInfo("Alert", android.R.drawable.ic_dialog_alert),
                new sceneInfo("Map", android.R.drawable.ic_dialog_map),
        };
        return sceneInfo;
    }
    public static ArrayList<sceneInfo> getMyListDataArrayList(){
        ArrayList<sceneInfo> myList=new ArrayList<sceneInfo>();

        String description= "幾年前在去過美麗的羅騰堡後，對這裡的浪漫童話風情一直戀戀不忘。這座從17世紀就完整保存的德國中世紀歐風小鎮，隨處都是富有歷史特色的可愛建築。羅騰堡同時也是德國浪漫大道的起點，因位在陶伯河上，在這裡也可以眺望河景風光。";
        int imgId=R.drawable.ji;
        String country="德國";
        sceneInfo mysceneInfo=new sceneInfo(description,imgId,country);
        myList.add(mysceneInfo);

        description= "聖托里尼島可說是許多人心目中的夢幻景點首選。這裡位在希臘西北小鎮「伊亞」，最經典就是白牆藍屋頂的建築，與湛藍的愛琴海襯托出美麗的風景。遊走在巷弄間，時刻都會覺得很浪漫，更別說隨手一拍皆是夢幻如畫的美景。";
        imgId=R.drawable.ko;
        country="希臘";
        mysceneInfo=new sceneInfo(description,imgId,country);
        myList.add(mysceneInfo);

        description="日本北海道最出名、也能感受其歷史建築的景點，莫過於日本海濱城市「小樽」，從札幌最快約半小時就可抵達。當火車一路從城市駛向海邊，小樽就在不遠處。不只是情侶在國外旅遊的絕佳景點，也是三五好友適合出遊的魅力景點。";
        imgId=R.drawable.jis;
        country="日本";
        mysceneInfo=new sceneInfo(description,imgId,country);
        myList.add(mysceneInfo);

        description="身為菲律賓第二大城的宿霧，因著西班牙殖民的歷史，隨處可見歐洲建築的痕跡。而宿霧周邊多達160多個小島，個個都獨具特色，如果有預算，跳島是能多方體驗的選擇哦！";
        imgId=R.drawable.jkl;
        country="菲律賓";
        mysceneInfo=new sceneInfo(description,imgId,country);
        myList.add(mysceneInfo);

        description="園內的美麗海水族館擁有世界最大的水槽，大片玻璃後的零距離接觸絕對震撼，黑潮之海的鯨鯊、鬼福魟和琳瑯滿目的魚群都在這裡，來一窺洋海的奧秘吧！"
        ;
        imgId=R.drawable.lp;
        country="沖繩";
        mysceneInfo=new sceneInfo(description,imgId,country);
        myList.add(mysceneInfo);

        description="金碧輝煌的大皇宮，蘊含泰國皇室與宗教歷史，來到這裡可是得準備太陽眼鏡，以免眼睛被金光閃閃的建築刺的睜不開呢" ;
        imgId=R.drawable.qo;
        country="泰國";
        mysceneInfo=new sceneInfo(description,imgId,country);
        myList.add(mysceneInfo);

        description="在河內南方遙遙相望的下龍灣與陸龍灣，各有千秋。下龍灣的喀斯特地形密集矗立，洞穴奇大，險峻的地形錯落在平靜的湖面，轉過一角又是一片開闊山巒。相比之下，陸龍灣河流平穩，還多了鄉野悠閒景色，綠油油的水田映照白雲藍天，不同於空冷神秘的石灰洞地形，卻都有讓人忘憂的魔力。來親自見證電影拍攝的絕世美景吧！" ;
        imgId=R.drawable.ao;
        country="越南";
        mysceneInfo=new sceneInfo(description,imgId,country);
        myList.add(mysceneInfo);

        description="聳立於新加坡都市叢林的天空步道，屬於濱海灣花園，由十八棵人造巨樹撐起，串連成巨大景觀台，同時也是繽紛奪目的百花園。" ;
        imgId=R.drawable.ql;
        country="新加坡";
        mysceneInfo=new sceneInfo(description,imgId,country);
        myList.add(mysceneInfo);


        description="往胡同走去，可以看見三輪車伕的吆喝，左右店家閒聊家常，古樸的青磚灰瓦建築鋪排成一列，多少早是骨董、卻從沒見過的新奇古玩，茶坊的古體字招牌讓人感覺置身清代，來到煙袋斜巷，就是為了這歷史臨場感！" ;
        imgId=R.drawable.fy;
        country="中國";
        mysceneInfo=new sceneInfo(description,imgId,country);
        myList.add(mysceneInfo);

        description="加德滿都的平均海拔約為1,400公尺，是世界上最高的首都之一。 這個高海拔地理位置為城市帶來了四季分明的氣候，同時也吸引了許多登山者來準備攀登鄰近喜馬拉雅山脈。加德滿都可以說是尼泊爾的政治、文化和商業中心，擁有許多歷史悠久的宮殿、寺廟和古老的建築。 儘管城市不大，但它擁有獨特的魅力，吸引不少遊客，從探險家到文化愛好者前往";
        imgId=R.drawable.bgk;
        country="尼泊爾";
        mysceneInfo=new sceneInfo(description,imgId,country);
        myList.add(mysceneInfo);
        return myList;


        }
    public static ArrayList<sceneInfo> getMyListDataArrayListFromFile(){
        return null;
    }
}
