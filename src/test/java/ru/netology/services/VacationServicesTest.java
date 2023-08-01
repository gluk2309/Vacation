package ru.netology.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class VacationServicesTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/Vacation.csv")
    public void testTenThousand(int expected, int income, int expenses, int threshold) {
        VacationServices services = new VacationServices();

        int actual = services.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

}
