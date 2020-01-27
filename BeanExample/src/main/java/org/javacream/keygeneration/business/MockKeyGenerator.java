package org.javacream.keygeneration.business;

import org.javacream.keygeneration.KeyGenerator;

public class MockKeyGenerator implements KeyGenerator {

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

    @Override
    public String next() {
        return "random";
    }
}
