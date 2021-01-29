package com.epam.task.second;


import com.epam.task.second.logic.CharArrayProcessor;
import com.epam.task.second.logic.RegExpProcessor;
import org.apache.log4j.Logger;

public class Main {

    private final static Logger LOGGER = Logger.getLogger(Main.class);


    public static void main(String[] args) {

        LOGGER.info("Program started");

        try {
            CharArrayProcessor charArrayProcessor = new CharArrayProcessor();
            RegExpProcessor regExpProcessor = new RegExpProcessor();
            charArrayProcessor.deleteWordStartingConsonantLetter("London is a capital of Great Britain",5);
            charArrayProcessor.changeLetterForAnotherLetter("London is a capital of Great Britain",2,'m');
            regExpProcessor.deleteWordStartingConsonantLetter("London is a capital of Great Britain",5);

        } catch (Exception e){
            LOGGER.error(e.getMessage(),e);
        }


        LOGGER.info("Program stopped");
    }
}
