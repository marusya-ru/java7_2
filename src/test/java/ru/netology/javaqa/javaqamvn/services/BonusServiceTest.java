package ru.netology.javaqa.javaqamvn.services;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class BonusServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources="/data.csv")
    public void testRegisteredUnderLimit(long expected, long amount, boolean isRegistered) {
        BonusService service = new BonusService();

        long actual = service.calculate(amount, isRegistered);

        assertEquals(expected, actual);
    }
}

