package org.javacream.keygeneration.business;

import java.util.Random;

import org.javacream.keygeneration.KeyGenerator;

public class RandomKeyGeneratorImpl implements KeyGenerator {

    private String countryCode;
    private String prefiX;

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getPrefiX() {
        return prefiX;
    }

    public void setPrefiX(String prefiX) {
        this.prefiX = prefiX;
    }

    // private Random random;
    // {
    // random = new Random(hashCode() * System.currentTimeMillis());
    // }
    private Random random = new Random(hashCode() * System.currentTimeMillis());

    @Override
    public String next() {
        return countryCode + prefiX + random.nextInt();
    }
}
