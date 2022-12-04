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
 import java.util.List;
 import java.util.ArrayList;
 import app.ProcessData.Action;

 public class ProcessArgs {

 /*
 Wyszukuje w tablicy stringów pozycję, która może być
 zinterpretowana jako wartość typu ProcessData.Action.
 Wielkość czcionki nie ma znaczenia. Obowiązuje
 pierwsze dopasowanie. Jeżeli nie znajdzie to zwraca
 wartość UNDEFINE.
 */
 public static Action getAction(String[] args) {
 throw new IllegalStateException("Not implemented yet");
 }
 
 /*
 Wyszukuje w tablicy stringów pozycje, które mogą być
 zinterpretowane jako liczby. Tworzy z tych liczb
 tablicę. Jeżeli nie ma liczb to zwraca pustą tablicę.
 */
 public static double [] getNumbers(String[] args) {
 throw new IllegalStateException("Not implemented yet");
 }
 }