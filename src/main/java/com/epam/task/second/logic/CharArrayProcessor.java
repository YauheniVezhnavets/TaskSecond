package com.epam.task.second.logic;

import org.apache.log4j.Logger;

import java.util.Arrays;


public class CharArrayProcessor implements StringProcessor {
    private final static org.apache.log4j.Logger LOGGER = Logger.getLogger(CharArrayProcessor.class);
    private final String WHITESPACE_SEPARATOR = "\\s+";
    private final String WHITESPACE_ADD = " ";
    private final String EMPTY_LINE = "";
    private final char[] VOWELS = {'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U', 'y', 'Y'};

    @Override
    public String changeLetterForAnotherLetter(String string, int numberOfLetter, char letter) {
        LOGGER.info("Method changeLetterForAnotherLetter started ");

        if (string.isEmpty()) {
            return EMPTY_LINE;
        }

        String[] words = string.split(WHITESPACE_SEPARATOR);

        StringBuilder stringBuilder = new StringBuilder();

        for (String word : words) {
            if (validateIndexNumber(word, numberOfLetter)) {
                stringBuilder.append(changeLetter(word, numberOfLetter, letter));
            } else {
                stringBuilder.append(word);
            }
            stringBuilder.append(WHITESPACE_ADD);

        }

        String result = stringBuilder.toString();

        LOGGER.info("Method changeLetterForAnotherLetter ended ");

        return result.trim();

    }


    private boolean validateIndexNumber(String string, int numberOfLetter) {
        boolean result = false;

        if ((numberOfLetter > 0) && (numberOfLetter <= string.length())) {
            result = true;
        }
        return result;
    }

    private String changeLetter(String string, int numberOfLetter, char letter) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] charsArray = string.toCharArray();
        for (int j = 0; j < charsArray.length; j++) {
            if (j == numberOfLetter - 1) {
                charsArray[j] = letter;
            }
            stringBuilder.append(charsArray[j]);
        }
        String result = stringBuilder.toString();

        return result.trim();
    }


    @Override
    public String deleteWordStartingConsonantLetter(String string, int wordLength) {

        LOGGER.info("Method deleteWordStartingConsonantLetter started ");

        if (string.isEmpty()) {
            return EMPTY_LINE;
        }

        String[] words = string.split(WHITESPACE_SEPARATOR);

        StringBuilder stringBuilder = new StringBuilder();

        for (String word : words) {
            if (validate(word)) {
                stringBuilder.append(word);
                stringBuilder.append(WHITESPACE_ADD);
            } else if (!validate(word) && ((word.length()) != wordLength)) {
                stringBuilder.append(word);
                stringBuilder.append(WHITESPACE_ADD);
            }
        }

        String result = stringBuilder.toString();

        LOGGER.info("Method deleteWordStartingConsonantLetter ended ");

        return result.trim();
    }

    private boolean validate(String string) {
        char[] charsArray = string.toCharArray();
        boolean result = false;
        for (char ch : VOWELS) {
            if (ch == charsArray[0]) {
                result = true;
                break;
            }
        }
        return result;
    }
}
