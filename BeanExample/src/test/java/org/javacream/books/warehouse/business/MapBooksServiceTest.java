package org.javacream.books.warehouse.business;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MapBooksServiceTest {

    @Test
    public void testMapBooksService() {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "bookService.xml" });
        MapBooksService mapBooksService = (MapBooksService) context.getBean("mapBooksService");
        // System.out.println(mapBooksService.getStoreService().toString());
    }
}
