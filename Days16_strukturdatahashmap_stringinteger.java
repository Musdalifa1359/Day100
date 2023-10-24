
package com.mycompany.days16_strukturdatahashmap_stringinteger;

import java.util.HashMap;

public class Days16_StrukturdataHashMap_StringInteger {

    public static void main(String[] args) {
     HashMap<String, Integer> people = new HashMap<String, Integer>();
     people.put("ifa", 21);
     people.put("dini", 19);
     people.put("faras", 20);
     
     for(String i: people.keySet()){
         System.out.println("key:" + i + "value:" + people.get(i));
     }
     
    }
}
