package com.epam.task.second.logic;

import org.junit.Assert;
import org.junit.Test;

public abstract class StringProcessorTest {
    private StringProcessor stringProcessor = createStringProcessor();
    private String LINE_FOR_CHANGING = "I had never been to London";
    private String LINE_THAT_NO_CHANGES = "I am English man";
    private String LINE_THAT_NO_WORDS_ENOUGH_LENGTH = "I a man";
    private String EMPTY_LINE = "";
    private int NUMBER_OF_SYMBOL = 4;
    private char CHAR_SYMBOL = 'm';


    protected abstract StringProcessor createStringProcessor();


    @Test
    public void deleteWordStartingConsonantLetterShouldDeleteWordWhenWordStartingConsonantLetterAndHaveCorrectNumberOfSymbols() {

        //given
        String expected = "I had never to London";

        //when
        String actual = stringProcessor.deleteWordStartingConsonantLetter(LINE_FOR_CHANGING,NUMBER_OF_SYMBOL);

        //then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void deleteWordStartingConsonantLetterShouldNotDeleteWordWhenWordStartingConsonantLetterAndDidNotHaveCorrectNumberOfSymbols() {

        //given
        String expected = "I am English man";

        //when
        String actual = stringProcessor.deleteWordStartingConsonantLetter(LINE_THAT_NO_CHANGES, NUMBER_OF_SYMBOL);

        //then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void deleteWordStartingConsonantLetterShouldNotDeleteWordWhenStringIsEmpty() {

        //given
        String expected = "";

        //when
        String actual = stringProcessor.deleteWordStartingConsonantLetter(EMPTY_LINE, NUMBER_OF_SYMBOL);

        //then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void changeLetterForAnotherLetterShouldChangeWordWhenWordHaveCorrectLength() {

        //given
        String expected = "I had nevmr beem to Lonmon";

        //when
        String actual = stringProcessor.changeLetterForAnotherLetter(LINE_FOR_CHANGING, NUMBER_OF_SYMBOL, CHAR_SYMBOL);

        //then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void changeLetterForAnotherLetterShouldNotChangeWordWhenWordDoNotHaveCorrectLength() {

        //given
        String expected = "I a man";

        //when
        String actual = stringProcessor.deleteWordStartingConsonantLetter(LINE_THAT_NO_WORDS_ENOUGH_LENGTH, NUMBER_OF_SYMBOL);

        //then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void changeLetterForAnotherLetterShouldReturnEmptyStringWhenStringIsEmpty() {

        //given
        String expected = "";

        //when
        String actual = stringProcessor.deleteWordStartingConsonantLetter(EMPTY_LINE, NUMBER_OF_SYMBOL);

        //then
        Assert.assertEquals(expected, actual);

    }

}


