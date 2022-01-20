package com.dsvellal.calendar.data.processing;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class HelloTest {
    private static List<String> inputs = Arrays.asList("Datta", "", " ", null, "$%#$");
    private static List<String> outputs = Arrays.asList("Hello Datta", "Hello ", "Hello  ", "Hello null", "Hello $%#$");

    @Test
    public void testSayHelloTo() {
        for (int i = 0; i < inputs.size(); i++) {
            assertEquals(outputs.get(i), Hello.sayHelloTo(inputs.get(i)));
        }
    }
}
