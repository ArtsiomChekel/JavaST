package com.company.chekel.task1.service;
import com.company.chekel.task1.entity.CustomArray;

public class CustomArrayChangeElementService {
   public void changeElement(CustomArray array) {
       int[] tmp = array.getCustomArray();
       for(int i = 0; i < tmp.length; i++)
       {
           if(tmp[i] < 0)
           {
               tmp[i] = 0;
           }
       }
   }
}
