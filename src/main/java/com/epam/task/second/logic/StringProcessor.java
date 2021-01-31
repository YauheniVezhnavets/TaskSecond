package com.epam.task.second.logic;

public interface StringProcessor  {

   // In each word, replace the k-th letter with the given character. If k is greater than the word length, do not do anything.

    String changeLetterForAnotherLetter(String s, int numberOfLetter, char ch);

   // Remove from the text all words of a given length beginning with a consonant letter.

    String deleteWordStartingConsonantLetter(String string, int wordLength);



}
