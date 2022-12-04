/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.lab13;

/**
 *
 * @author Michal
 */
 public class Text {

 static boolean cont5Dig(String str){
 return str.replaceAll("[^0-9]", "").length()==5;
 }
 }