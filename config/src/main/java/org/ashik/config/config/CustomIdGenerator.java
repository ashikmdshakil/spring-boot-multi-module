package org.ashik.config.config;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;
import java.util.Random;

public class CustomIdGenerator implements IdentifierGenerator {

    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) {
        String prefix = "2024"; // Prefix if needed
        int desiredLength = 10; // Desired length of the ID
        StringBuilder sb = new StringBuilder(prefix);
        Random random = new Random();
        while (sb.length() < desiredLength) {
            sb.append(random.nextInt(10)); // Append random digits
        }
        return sb.toString();
    }
}
