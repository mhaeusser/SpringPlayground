package org.javacream.keygeneration.business;

import org.javacream.config.MyApplicationContext;
import org.javacream.main.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MyApplicationContext.class)
public class UserTest {

    @Autowired
    User user;

    @Test
    public void testUser() {
        System.out.println(user.getName());
    }
}
