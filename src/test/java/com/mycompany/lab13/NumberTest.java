/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab13;



 import static org.junit.jupiter.api.Assertions.*;
 import org.junit.jupiter.params.ParameterizedTest;
 import org.junit.jupiter.params.provider.ValueSource;

 public class NumberTest {

 @ParameterizedTest
 @ValueSource(ints = {1, 3, 5, 7, 15, 101})
 void isOddTest(int number) {
 System.out.println("Nieparzystość: " + number);
 assertTrue(Number.isOdd(number));
 }
 }
