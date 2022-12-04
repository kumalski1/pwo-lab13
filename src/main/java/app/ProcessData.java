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
 public class ProcessData {

 public enum Action {UNDEFINE, SUM, MAX}

 public Double process(Action action, double [] numbers){
 switch(action){
 case SUM: return sum(numbers);
 case MAX: return max(numbers);
 default : return null;
 }
 }

 /*
16 Sumuje liczby przekazane jako tablica i zwraca wynik.
17 Jeżeli tablica jest pusta, to zwraca null.
18 */
 private Double sum(double [] numbers){
 throw new IllegalStateException("Not implemented yet");
 }

 /*
24 Przeszukuje przekazaną tablicę liczb i zwraca
25 maksymalną. Jeżeli tablica jest pusta, to zwraca null.
26 */
 private Double max(double [] numbers) {
 throw new IllegalStateException("Not implemented yet");
 }
 }