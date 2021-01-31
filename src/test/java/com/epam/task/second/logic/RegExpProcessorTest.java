package com.epam.task.second.logic;


public class RegExpProcessorTest extends StringProcessorTest {


    @Override
    protected StringProcessor createStringProcessor() {
        return new RegExpProcessor();
    }
}