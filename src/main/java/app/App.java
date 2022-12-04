/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package app;

/**
 *
 * @author Michal
 */
 public class App {

 public static void main(String[] args) {
 (new App()).run(args);
 }

 private double [] data;
 private ProcessData.Action action;
 private Double result;

 private void run(String[] args){
 data = ProcessArgs.getNumbers(args);
 action = ProcessArgs.getAction(args);
 result = new ProcessData().process(action, data);
 System.out.println("Data:");
 for(double x : data) System.out.print(x + " ");
 System.out.println("\nAction: " + action);
 System.out.println("Result=" + result);
 }
 }
