package com.example.emantrana.DSA.Backtracking;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NQueensTest {

    @Test
    public void testPlaceQueensWithZeroQueens() {

        NQueens.placeQueens(0);
    }

    @Test
    public void testPlaceQueensWithOneQueen() {

        NQueens.placeQueens(1);

    }

    @Test
    public void testPlaceQueensWithFourQueens() {

        NQueens.placeQueens(4);
    }

    @Test
    public void testPlaceQueensWithEightQueens() {

        NQueens.placeQueens(8);

    }

    @Test
    public void testPlaceQueensWithSixQueens() {

        NQueens.placeQueens(6);
    }

    @Test
    public void testPlaceQueensWithFiveQueens() {

        NQueens.placeQueens(5);
    }

}
