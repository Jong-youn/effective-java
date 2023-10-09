package com.example.effectivejava.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScoreCollectionTest {

    private ScoreCollection collection;

    @Before
    public void create() {
        collection = new ScoreCollection();
    }

    @Test
    public void answersArithmeticMeanOfTwoNumbers() {
        collection.add(() -> 5);
        collection.add(() -> 7);

        int actualResult = collection.arithmeticMean();

        assertThat(actualResult, equalTo(6));
    }

    @Test(expected=IllegalArgumentException.class)
    public void throwsExceptionWhenAddingNull() {
        collection.add(null);
    }

    @Test
    public void answersZeroWhenNoElementsAdded() {
        assertThat(collection.arithmeticMean(), equalTo(0));
    }

    @Test
    public void doesNotProperlyHandleIntegerOverflow() {
        collection.add(() -> Integer.MAX_VALUE);
        collection.add(() -> 1);

        assertTrue(collection.arithmeticMean() < 0);
    }
}