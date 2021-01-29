package com.epam.task.second.logic;

import org.junit.Assert;
import org.junit.Test;

public class CharArrayProcessorTest {
    private CharArrayProcessor charArrayProcessor = new CharArrayProcessor();

    @Test
    public void deleteWordStartingConsonantLetterShouldDeleteWordWhenNoWordStartingConsonantLetter(){

        //given
        String string = new String("abd asda  asd asdaw");

        //when
        String actual = charArrayProcessor.deleteWordStartingConsonantLetter("abd asda  asd asdaw",4);

        //then
        Assert.assertEquals(string, actual);

    }
}
