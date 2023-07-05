package org.veju.hashmap;

import java.util.HashSet;
import java.util.Set;

public class Sets {
    public char firstRepeatedCharacter(String item){
        Set<Character> characterSet = new HashSet<>();
        for(char ch: item.toCharArray()){
            if(characterSet.contains(ch)){
                return ch;
            }else {
                characterSet.add(ch);
            }
        }
        return Character.MIN_VALUE;
    }
}
