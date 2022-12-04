/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab13;

 import org.junit.jupiter.api.Test;
 import static org.junit.jupiter.api.Assertions.*;

 public class ExcGenTest {

 @Test
 public void testgenExc1() {
 System.out.println("Test: IllegalStateException");
 ExcGen excGen = new ExcGen();
 Exception exception =
 assertThrows(IllegalStateException.class, () ->
 excGen.gen(0));
 assertTrue(exception.getMessage()
 .contains(ExcGen.MESSAGE_1));
 }
 }
