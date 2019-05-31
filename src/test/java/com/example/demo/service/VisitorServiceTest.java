package com.example.demo.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class VisitorServiceTest {

    @InjectMocks
    private VisitorService underTest;

    @Test
    public void test_addShouldReturnValidNumber() {
        // GIVEN
        int a = 4;
        int b = 5;

        // EXPECTED
        int expected = 9;

        // RESULT
        Assert.assertEquals(expected, underTest.add(a, b));
    }
}