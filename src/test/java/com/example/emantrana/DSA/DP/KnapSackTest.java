package com.example.emantrana.DSA.DP;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class KnapSackTest {
    @Test
    public void testKnapSack() {
        KnapSack knapSack = new KnapSack();

        // Test case 1
        int capacity1 = 50;
        int[] weights1 = {10, 20, 30};
        int[] profits1 = {60, 100, 120};
        int numOfItems1 = 3;
        int result1 = knapSack.knapSack(capacity1, weights1, profits1, numOfItems1);
        assertEquals(220, result1);


        int capacity2 = 10;
        int[] weights2 = {2, 5, 1, 9};
        int[] profits2 = {8, 10, 13, 4};
        int numOfItems2 = 4;
        int result2 = knapSack.knapSack(capacity2, weights2, profits2, numOfItems2);
        assertEquals(31, result2);
    }
    @Test
    public void testKnapSack2() {
        KnapSack knapSack = new KnapSack();


        int capacity1 = 50;
        int[] weights1 = {10, 20, 30};
        int[] profits1 = {60, 100, 120};
        int numOfItems1 = 3;
        int result1 = knapSack.knapSack(capacity1, weights1, profits1, numOfItems1);
        assertEquals(220, result1);

        int capacity2 = 10;
        int[] weights2 = {2, 5, 1, 9};
        int[] profits2 = {8, 10, 13, 4};
        int numOfItems2 = 4;
        int result2 = knapSack.knapSack(capacity2, weights2, profits2, numOfItems2);
        assertEquals(31, result2);


        int capacity3 = 20;
        int[] weights3 = {};
        int[] profits3 = {};
        int numOfItems3 = 0;
        int result3 = knapSack.knapSack(capacity3, weights3, profits3, numOfItems3);
        assertEquals(0, result3);


        int capacity4 = 5;
        int[] weights4 = {10, 15, 20};
        int[] profits4 = {30, 25, 40};
        int numOfItems4 = 3;
        int result4 = knapSack.knapSack(capacity4, weights4, profits4, numOfItems4);
        assertEquals(0, result4);


        int capacity5 = 100;
        int[] weights5 = {10, 20, 30};
        int[] profits5 = {60, 100, 120};
        int numOfItems5 = 3;
        int result5 = knapSack.knapSack(capacity5, weights5, profits5, numOfItems5);
        assertEquals(280, result5);
    }
}
