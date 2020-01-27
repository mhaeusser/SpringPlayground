package org.javacream.keygeneration.business;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class RandomKeyGeneratorImplTest {

    // RandomKeyGeneratorImpl randomKeyGenerator = new RandomKeyGeneratorImpl();
    // @Autowired
    // RandomKeyGeneratorImpl randomKeyGenerator;

    @Test
    public void testGetCountryCode() {

        // ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "bookService.xml" });
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext(
                new String[] { "bookService.xml" });
        RandomKeyGeneratorImpl randomKeyGenerator = (RandomKeyGeneratorImpl) context.getBean("randomKeyGeneratorImpl");

        // System.out.println(randomKeyGenerator.getCountryCode());
        // System.out.println(randomKeyGenerator.getPrefiX());

        assertEquals("-de", randomKeyGenerator.getCountryCode());
        assertEquals("TEST", randomKeyGenerator.getPrefiX());

        assertTrue(randomKeyGenerator.next()
                .startsWith(randomKeyGenerator.getCountryCode() + randomKeyGenerator.getPrefiX()));
    }
}
