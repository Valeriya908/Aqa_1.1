package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    void shouldRemainWhenAmountZero() {
        int expected = 1000;
        int actual = service.remain(0);

        assertEquals(expected, actual);
    }

    @Test
    void shouldRemainWhenAmountInsideRangeLimit() {
        int expected = 200;
        int actual = service.remain(800);

        assertEquals(expected, actual);
    }

    @Test
    void shouldRemainWhenAmountMax() {
        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(expected, actual);
    }

    @Test
    void shouldRemainWhenAmountOverMax() {
        int expected = 800;
        int actual = service.remain(1200);

        assertEquals(expected, actual);
    }
}