package com.epam.task.second.logic;


import java.util.Arrays;
import java.util.List;

public class RegExpProcessor implements StringProcessor {
    private final String REG_EXP = "(?i)^(?=[^aeiouy])[a-z].*";

    @Override
    public String deleteWordStartingConsonantLetter(String str, int wordLength) {

        if (str.isEmpty()) {
            return "Line is empty";
        }

        List<String> words = Arrays.asList(str.split("\\s+"));

        StringBuilder stringBuilder = new StringBuilder();

        for (String word : words) {
            if (!word.matches(REG_EXP)) {
                stringBuilder.append(word);
                stringBuilder.append(" ");
            } else if ((word.matches(REG_EXP)) && ((word.length()) != wordLength)) {
                stringBuilder.append(word);
                stringBuilder.append(" ");
            }
        }

        String result = stringBuilder.toString();

        return result.trim();
    }

    @Override
    public String changeLetterForAnotherLetter(String string, int numberOfLetter, char letter) {

        if (string.isEmpty()) {
            return "Line is empty";
        }


        List<String> words = Arrays.asList(string.split("\\s+"));

        StringBuilder stringBuilder = new StringBuilder();

        for (String word : words) {
            if (validateIndexNumber(word, numberOfLetter)) {
                stringBuilder.append(replaceLetter(word, numberOfLetter, letter));
            } else {
                stringBuilder.append(word);
            }
            stringBuilder.append(" ");

        }

        String result = stringBuilder.toString();

        return result.trim();
    }

    String replaceLetter(String str, int numberOfLetter, char letter) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.setCharAt(numberOfLetter, letter);
        return stringBuilder.toString();
    }


    boolean validateIndexNumber(String string, int numberOfLetter) {
        boolean result = false;

        if ((numberOfLetter > 0) && (numberOfLetter < string.length())) {
            result = true;
        }
        return result;
    }
}

