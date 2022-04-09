package ru.job4j.ex;

import org.junit.Assert;
import org.junit.Test;

public class FactTest {

    @Test (expected = IllegalArgumentException.class)
    public void calc() {
        Fact result = new Fact();
        int expected = 720;
        Assert.assertEquals(expected, result.calc(-1));
    }
}