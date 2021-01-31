package com.epam.task.second.logic;


import org.apache.log4j.Logger;

public class RegExpProcessor implements StringProcessor {
    private final static org.apache.log4j.Logger LOGGER = Logger.getLogger(RegExpProcessor.class);
    private final String DELETING_WORD_PATTERN = "(?i)^(?=[^aeiouy])[a-z].*";
    private final String WHITESPACE_SEPARATOR = "\\s+";
    private final String EMPTY_LINE = "";
    private final String WHITESPACE_ADD = " ";

    @Override
    public String deleteWordStartingConsonantLetter(String string, int wordLength) {
        LOGGER.info("Method deleteWordStartingConsonantLetter started ");

        if (string.isEmpty()){
            return EMPTY_LINE;
        }


        String[] words = string.split(WHITESPACE_SEPARATOR);

        StringBuilder stringBuilder = new StringBuilder();

        for (String word : words) {
            if (!word.matches(DELETING_WORD_PATTERN)) {
                stringBuilder.append(word);
                stringBuilder.append(WHITESPACE_ADD);
            } else if ((word.matches(DELETING_WORD_PATTERN)) && ((word.length()) != wordLength)) {
                stringBuilder.append(word);
                stringBuilder.append(WHITESPACE_ADD);
            }
        }

        String result = stringBuilder.toString();

        LOGGER.info("Method deleteWordStartingConsonantLetter ended ");

        return result.trim();
    }

    @Override
    public String changeLetterForAnotherLetter(String string, int numberOfLetter, char letter) {

        LOGGER.info("Method changeLetterForAnotherLetter started ");

        if (string.isEmpty()){
            return EMPTY_LINE;
        }

        String[] words = string.split(WHITESPACE_SEPARATOR);

        StringBuilder stringBuilder = new StringBuilder();

        for (String word : words) {
            if (validateIndexNumber(word, numberOfLetter)) {
                stringBuilder.append(replaceLetter(word, numberOfLetter, letter));
            } else {
                stringBuilder.append(word);
            }
            stringBuilder.append(WHITESPACE_ADD);

        }

        String result = stringBuilder.toString();

        LOGGER.info("Method changeLetterForAnotherLetter started ");

        return result.trim();
    }

    private String replaceLetter(String str, int numberOfLetter, char letter) {
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.setCharAt(numberOfLetter-1, letter);
        return stringBuilder.toString();
    }


    private boolean validateIndexNumber(String string, int numberOfLetter) {
        boolean result = false;

        if ((numberOfLetter > 0) && (numberOfLetter <= string.length())) {
            result = true;
        }
        return result;
    }
}

