package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldRemainWhenAmountZero() {
        int expected = 1000;
        int actual = service.remain(0);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldRemainWhenAmountInsideRangeLimit() {
        int expected = 200;
        int actual = service.remain(800);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldRemainWhenAmountMax() {
        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldRemainWhenAmountOverMax() {
        int expected = 800;
        int actual = service.remain(1200);

        assertEquals(actual, expected);
    }
}