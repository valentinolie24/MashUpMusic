package com.si5a.mashupmusic;

import java.util.ArrayList;

public class Data {

    public static String[][] data = new String[][] {
            {"たぶん","たぶん · YOASOBI · Ayase | たぶん | ℗ 2020 YOASOBI","tYP-i_tShDY"},
            {"YOASOBI「アンコール」Official Music Video","★Google Pixel 5, Pixel 4a(5G) CMソング | Twitter：https://twitter.com/YOASOBI_staff | Music : Ayase (https://twitter.com/ayase_0404)", "vcGbefQBvJ4"},
            {"YOASOBI「怪物」Official Music Video　(YOASOBI - Monster)","Download＆Streaming配信中:https://orcd.co/kaibutsu | TVアニメ『BEASTARS』第二期オープニングテーマ", "dy90tA3TT1c"},
            {"よくばり / 初音ミク","Ayase × ikura | New Project | Official Twitter (@YOASOBI_staff) https://twitter.com/YOASOBI_staff","RXRrsrjy3_8"}
    };

    public static ArrayList<DataModel> getData() {
        ArrayList<DataModel> dataModelArrayList = new ArrayList<>();
        for(String[] varData : data){
            DataModel dataModel = new DataModel();
            dataModel.setJudul(varData[0]);
            dataModel.setKeterangan(varData[1]);
            dataModel.setVideoid(varData[2]);

            dataModelArrayList.add(dataModel);
        }

        return dataModelArrayList;
    }
}
