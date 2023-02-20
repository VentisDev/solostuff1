package Reas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Stringparse {

    public List<Integer> partitionLabels(String s) {
        var charIndexMap = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length() - 1; i++) {
            charIndexMap.put(s.charAt(i), i);
        }
        var currentIndex = 0;
        var endIndex = 0;

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
                endIndex = Math.max(endIndex, charIndexMap.get(s.charAt(i)));
                if (endIndex == i) {
                    list.add(endIndex - currentIndex + 1);
                    currentIndex = endIndex + 1;
                }
            }
        System.out.println(charIndexMap);
        return list;
    }
}

    // i = 32 ; i > 0 ; i--
    //

//    private void addStringsToArray(List<String> stringParts) {
//        for (String parts : stringParts) {
//            partsSize.add(parts.length());
//        }
//    }
//}


//        System.out.println(s);
//        var characterList = s.toCharArray();
//        int currentCharIndex = 0;
//        for (int i=characterList.length-1; i > currentCharIndex; i--) {
//            if (characterList[i] == characterList[currentCharIndex]) {
//                var string = new StringBuilder();
//                for (int j = currentCharIndex; j < i; j++) {
//                    string.append(characterList[j]);
//                }
//                currentCharIndex = currentCharIndex + i;
//                System.out.println(currentCharIndex);
//                String partition = string.toString();
//                stringParts.add(partition);
//            }
//        }
//        System.out.println(stringParts);
//        addStringsToArray(stringParts);
//        return partsSize;