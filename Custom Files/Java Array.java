package com.furkan.deneme1;
// 1 paket ismi

import java.util.ArrayList;
//zorunlu aktarma
public class listelerOrnek {
    public static void main(String[] args){

        int listeninUzunlugu = 10; //Zorunlu
        String[] yenidenBoyutlandirilamazListe = new String[listeninUzunlugu];// list length = 10 liste[?] = empy ? = > null
        yenidenBoyutlandirilamazListe[2] = "index3";
      
        //[] sekilde atama yapilir !!
        System.out.println(yenidenBoyutlandirilamazListe[2]);

        //-----------------------------

        ArrayList customList = new ArrayList<String>();
        customList.add("oge index 0");
        
        // normal C dillerinde ki liste add,remove,index vs var yeniden kendisi boyutlandirilabilir
        System.out.println(customList);
        
    }
}