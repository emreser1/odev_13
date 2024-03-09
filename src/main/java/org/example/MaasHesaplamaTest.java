package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(Lifecycle.PER_CLASS)
public class MaasHesaplamaTest {

    private int gunlukMaas;
    private int gunlukPrim;

    @BeforeAll
    public void setup() {
        // Yapılandırma dosyasından değerleri yükle
    	  final String CONFIG_FILE = "config.properties";

        Properties properties = new Properties();
        try {
            properties.load(Paths.get(CONFIG_FILE).toFile().toURI().toURL().openStream());
            gunlukMaas = Integer.parseInt(properties.getProperty("gunlukMaas"));
            gunlukPrim = Integer.parseInt(properties.getProperty("gunlukPrim"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testMaasPrimHesaplama() {
        int calisilanGun = 30; // Örnek çalışılan gün sayısı
        int expectedTotalSalary = calisilanGun * gunlukMaas + (calisilanGun > 25 ? (calisilanGun - 25) * gunlukPrim : 0);

        int actualTotalSalary = MaasPrimHesaplama.maasPrimHesaplama(calisilanGun);

        assertEquals(expectedTotalSalary, actualTotalSalary);
    }

    @Test
    public void testPrimHesaplama() {
        int calisilanGun = 30; // Örnek çalışılan gün sayısı
        int expectedBonus = calisilanGun > 25 ? (calisilanGun - 25) * gunlukPrim : 0;

        int actualBonus = MaasPrimHesaplama.primHesaplama(calisilanGun);

        assertEquals(expectedBonus, actualBonus);
    }
}
