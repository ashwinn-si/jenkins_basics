package com.ashwinsi.jenkins;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MainControllerTest {
    @Autowired
    private MainController mainController;

    @Test
    public void testGetEndPoint(){
        Assertions.assertEquals("aliveeeeeeeeeeeeeeee", mainController.health());
    }
}
