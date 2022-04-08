package ru.job4j.ex;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactTest {

    @Test (expected = IllegalStateException.class)
    public void calc() {
        new Fact().calc(-6);
    }
}