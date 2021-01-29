package com.epam.task.second.logic;


import java.util.Arrays;
import java.util.List;

public class RegExpProcessor implements StringProcessor {
    private final String REG_EXP = "(?i)^(?=[^aeiouy])[a-z].*";


    public String deleteWordStartingConsonantLetter(String str, int wordLength) {


        List<String> words = Arrays.asList(str.split("\\s+"));

        StringBuilder stringBuilder = new StringBuilder();

        for (String word : words) {
            if (!word.matches(REG_EXP)) {
                stringBuilder.append(word);
                stringBuilder.append(" ");
            }

            if ((word.matches(REG_EXP)) & ((word.length()) != wordLength)) {
                stringBuilder.append(word);
                stringBuilder.append(" ");
            }
        }


        String result = stringBuilder.toString();


        return result.trim();
    }
}
