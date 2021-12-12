package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTestJUJupiter {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldRemainWhenAmountZero() {
        int expected = 1000;
        int actual = service.remain(0);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldRemainWhenAmountInsideRangeLimit() {
        int expected = 200;
        int actual = service.remain(800);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldRemainWhenAmountMax() {
        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldRemainWhenAmountOverMax() {
        int expected = 800;
        int actual = service.remain(1200);

        assertEquals(expected, actual);
    }
}