package com.epam.task.second.logic;


import java.util.Arrays;
import java.util.List;

public class CharArrayProcessor implements StringProcessor {

    @Override
    public String changeLetterForAnotherLetter(String string, int numberOfLetter, char letter) {
        if (string.isEmpty()) {
            return "Line is empty";
        }


        List<String> words = Arrays.asList(string.split("\\s+"));

        StringBuilder stringBuilder = new StringBuilder();

        for (String word : words) {
            if (validateIndexNumber(word, numberOfLetter)) {
                stringBuilder.append(changeLetter(word, numberOfLetter, letter));
            } else {
                stringBuilder.append(word);
            }
            stringBuilder.append(" ");

        }

        String result = stringBuilder.toString();

        return result.trim();
    }


    boolean validateIndexNumber(String string, int numberOfLetter) {
        boolean result = false;

        if ((numberOfLetter > 0) && (numberOfLetter < string.length())) {
            result = true;
        }
        return result;
    }

    String changeLetter(String string, int i, char letter) {
        char[] charsArray = string.toCharArray();
        charsArray[i] = letter;
        return charsArray.toString();
    }


    // Из текста удалить все слова заданной длины, начинающиеся на согласную букву.
    @Override
    public String deleteWordStartingConsonantLetter(String str, int wordLength) {
        if (str.isEmpty()) {
            return "Line is empty";
        }

        List<String> words = Arrays.asList(str.split("\\s+"));

        StringBuilder stringBuilder = new StringBuilder();

        for (String word : words) {
            if (validate(word)) {
                stringBuilder.append(word);
                stringBuilder.append(" ");
            } else if (!validate(word) && ((word.length()) != wordLength)) {
                stringBuilder.append(word);
                stringBuilder.append(" ");
            }
        }

        String result = stringBuilder.toString();

        return result.trim();
    }

     boolean validate(String string) {
        char[] charsArray = string.toCharArray();
        boolean result = false;
        char[] vowels = {'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U', 'y', 'Y'};
        for (char ch : vowels) {
            if (ch == charsArray[0]) {
                result = true;
            }
        }
        return result;
    }
}
