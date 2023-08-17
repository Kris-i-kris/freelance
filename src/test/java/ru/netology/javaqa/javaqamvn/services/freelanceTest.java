package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class freelanceTest {


    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/data.csv")
    public void restThreeMonths(int expected, int income, int expenses, int threshold) {
        freelanceService service = new freelanceService();

        //int income = 10_000;
        //int expenses = 3_000;
        //int threshold = 20_000;
        //int expected = 3;

        long actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

    //@Test
    //void restThoMonths() {
    //freelanceService service = new freelanceService();

    //int income = 100_000;
    //int expenses = 60_000;
    //int threshold = 150_000;
    //int expected = 2;

    //long actual = service.calculate(income, expenses, threshold);

    //Assertions.assertEquals(expected, actual);
    //}
}