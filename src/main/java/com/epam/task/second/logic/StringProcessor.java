package com.epam.task.second.logic;

public interface StringProcessor  {

   // В каждом слове k-ю букву заменить заданным символом. Если k больше длины слова, корректировку не выполнять.



   // Из текста удалить все слова заданной длины, начинающиеся на согласную букву.

    String deleteWordStartingConsonantLetter(String string, int wordLength);
}
