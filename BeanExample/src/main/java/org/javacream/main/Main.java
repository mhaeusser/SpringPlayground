package org.javacream.main;

import org.javacream.keygeneration.KeyGenerator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

    private static ApplicationContext context;

    public static void main(String[] args) {

        if (args.length == 0) {
            System.err.println("One file name needed.");
            return;
        }

        // context = new ClassPathXmlApplicationContext(new String[] { "booksService.xml" });
        // context = new ClassPathXmlApplicationContext(args);

        context = new FileSystemXmlApplicationContext(args);

        KeyGenerator keyGen = (KeyGenerator) context.getBean("randomKeyGeneratorImpl");

        String key = keyGen.next();
        System.out.println(key);
    }
}
