package org.veju.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {

    public char firstNonRepeatedCharacter(String  item){
        Map<Character,Integer> map = new HashMap<>();
        for(char a: item.toCharArray()){
            if(map.containsKey(a)){
                map.put(a,map.get(a)+1);
            }else{
                map.put(a,1);
            }
        }
        for(char b:item.toCharArray()){
            if(map.get(b)==1&&b!=' '){
                return b;
            }
        }
        return Character.MIN_VALUE;
    }
}
