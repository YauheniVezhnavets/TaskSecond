package com.epam.task.second.logic;

import org.junit.Assert;
import org.junit.Test;

public class RegExpProcessorTest {
    private RegExpProcessor regExpProcessor = new RegExpProcessor();


    @Test
    public void deleteWordStartingConsonantLetterShouldNotDeleteWordWhenNoWordStartingConsonantLetter() {

        //given
        String expected = "abd ysda issd asdaw";

        //when
        String actual = regExpProcessor.deleteWordStartingConsonantLetter("abd ysda  issd asdaw", 4);

        //then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void deleteWordStartingConsonantLetterShouldDeleteWordWhenWordStartingConsonantLetter() {

        //given
        String expected = "dbd ysda asdaw";

        //when
        String actual = regExpProcessor.deleteWordStartingConsonantLetter("dbd ysda  kssd asdaw", 4);

        //then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void deleteWordStartingConsonantLetterShouldNotDeleteWordWhenStringIsEmpty() {

        //given
        String expected = "";

        //when
        String actual = regExpProcessor.deleteWordStartingConsonantLetter("", 4);

        //then
        Assert.assertEquals(expected, actual);

    }

}

