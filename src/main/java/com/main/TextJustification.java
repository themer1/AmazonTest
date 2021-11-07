package com.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TextJustification {
    /*
     * 1- find value of maximum length of string in array
     * 2- traverse through each string in array
     * 3-   --- constructJustifiedString
     * 3-A  --- a = maxLength - lengthOfString
     * 3-B  --- b = getNumberOfWordsInString
     * 3-C  --- c = a/b - 1
     * 3-D  --- d = a%b
     * 3-E  --- for (0 .. b - 1) -> word + spaces(c)
     * 3-F  ---
     */
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> outputList = new ArrayList<>();
        for (int i = 0; i < words.length - 1; i++) {
            if (words[i].length() == maxWidth) {
                outputList.add(words[i]);
                continue;
            }
            int currentGap = maxWidth - words[i].length();
            String[] splittedWords = words[i].split(" ");
            int spaces = currentGap/splittedWords.length;
            StringBuilder addedSpaces = new StringBuilder();
            for (int k = 0; k < spaces; k++) {
                addedSpaces.append(' ');
            }
            StringBuilder output = new StringBuilder();
            for (int j = 0; j < splittedWords.length - 1; j++) {
                output.append(splittedWords[j]).append(addedSpaces);
            }

            while ((output.length() + splittedWords[splittedWords.length - 1].length()) < maxWidth) {
                output.append(' ');
            }
            output.append(splittedWords[splittedWords.length - 1]);
            outputList.add(output.toString());
        }
        return outputList;
    }

    public int getMaxLength(String[] words) {
        return Arrays.stream(words).map(String::length).max(Integer::compareTo).get();
    }
}
