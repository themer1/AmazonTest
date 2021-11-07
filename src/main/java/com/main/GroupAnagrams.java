package com.main;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> aux = getAuxMap(strs);

        List<List<String>> output = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : aux.entrySet()) {
            output.add(entry.getValue());
        }
        return output;
    }

    public Map<String, List<String>> getAuxMap(String[] strs) {
        Map<String, List<String>> output = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if (output.containsKey(sorted)) {
                List<String> temp = output.get(sorted);
                temp.add(str);
                output.put(sorted, temp);
            } else {
                List<String> values = new ArrayList<>();
                values.add(str);
                output.put(sorted, values);
            }
        }
        return output;
    }
}
