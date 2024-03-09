package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaasHesaplamaParameterizedTest {

    @ParameterizedTest
    @CsvSource({
            "26, 20, 20",
            "25, 25, 0",
            "26, 26, 1000",
            "30, 30, 5000"
    })
    public void testMaasPrimHesaplama(int calisilanGun, int expectedTotalSalary, int expectedBonus) {
        int actualTotalSalary = MaasPrimHesaplama.maasPrimHesaplama(calisilanGun);
        assertEquals(expectedTotalSalary, actualTotalSalary);

        int actualBonus = MaasPrimHesaplama.primHesaplama(calisilanGun);
        assertEquals(expectedBonus, actualBonus);
    }
}
