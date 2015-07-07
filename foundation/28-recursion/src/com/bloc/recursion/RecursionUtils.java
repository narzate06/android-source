package com.bloc.recursion;

import java.lang.Integer;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class RecursionUtils extends Object {
	/*
	 * findMaxRecursively
	 *
	 * Takes a list of numbers and finds the largest among them
	 * using recursive calls.
	 *
	 * @param numbers a list of numbers, can be odd or even numbered
	 * @return the largest number in the list
	 *
	 * Hint: your base case may be a comparison of 2 numbers
	 */
	public static final int findMaxRecursively(List<Integer> numbers) {
		/************************************************
	 	 *	ASSIGNMENT:
	 	 *	Implement this method, the return value must
	 	 *	change
		/************************************************/

        int size = numbers.size();

        if (size == 1) {
             return numbers.get(0);
        }else if (size == 2) {
            return numbers.get(0) > numbers.get(1) ? numbers.get(0) : numbers.get(1);
        }else {
            int half = size/2;
            List<Integer> firstHalf = numbers.subList(0, half);
            List<Integer> secondHalf = numbers.subList(half, size);

            int firstHalfMax = findMaxRecursively(firstHalf);
            int secondHalfMax = findMaxRecursively(secondHalf);

            return firstHalfMax > secondHalfMax ? firstHalfMax : secondHalfMax;
        }
    }


}