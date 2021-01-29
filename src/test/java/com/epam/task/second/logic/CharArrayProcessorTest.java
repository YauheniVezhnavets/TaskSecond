package com.epam.task.second.logic;

import org.junit.Assert;
import org.junit.Test;

public class CharArrayProcessorTest {
    private CharArrayProcessor charArrayProcessor = new CharArrayProcessor();

    @Test
    public void deleteWordStartingConsonantLetterShouldDeleteWordWhenNoWordStartingConsonantLetter(){

        //given
        String expected = "abd asda asd asdaw";

        //when
        String actual = charArrayProcessor.deleteWordStartingConsonantLetter("abd asda  asd asdaw",4);

        //then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void deleteWordStartingConsonantLetterShouldDeleteWordWhenWordStartingConsonantLetter() {

        //given
        String expected = "dbd ysda asdaw";

        //when
        String actual = charArrayProcessor.deleteWordStartingConsonantLetter("dbd ysda  kssd asdaw", 4);

        //then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void deleteWordStartingConsonantLetterShouldNotDeleteWordWhenStringIsEmpty() {

        //given
        String expected = "Line is empty";

        //when
        String actual = charArrayProcessor.deleteWordStartingConsonantLetter("", 4);

        //then
        Assert.assertEquals(expected, actual);

    }


    @Test
    public void changeLetterForAnotherLetterShouldDoNotChangeWordWhenNoWordChanging(){

        //given
        String expected = "abd as asd as";

        //when
        String actual = charArrayProcessor.changeLetterForAnotherLetter("abd as  asd as",4,'v');

        //then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void changeLetterForAnotherLetterShouldDeleteWordWhenWordStartingConsonantLetter() {

        //given
        String expected = "dbd ysda asdaw";

        //when
        String actual = charArrayProcessor.deleteWordStartingConsonantLetter("dbd ysda  kssd asdaw", 4);

        //then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void changeLetterForAnotherLetterShouldWriteMessageWhenStringIsEmpty() {

        //given
        String expected = "Line is empty";

        //when
        String actual = charArrayProcessor.deleteWordStartingConsonantLetter("", 4);

        //then
        Assert.assertEquals(expected, actual);

    }
}
