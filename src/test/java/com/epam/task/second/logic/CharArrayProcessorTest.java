package com.epam.task.second.logic;


public class CharArrayProcessorTest extends StringProcessorTest {


    @Override
    protected StringProcessor createStringProcessor() {
        return new CharArrayProcessor();
    }
}
