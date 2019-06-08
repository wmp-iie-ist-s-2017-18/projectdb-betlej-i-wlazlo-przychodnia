/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package przychodnia;
import java.util.*;
/**
 *
 * @author Gall Anonim
 */
public class Pesel {
    public static boolean sprawdz(String pesel){
    int[] wagi = {1, 3, 7, 9, 1, 3, 7 ,9 ,1 ,3};
    
if (pesel.length() != 11) return false;
    int suma = 0;
    
    for (int i = 0; i < 10; i++)
    suma += Integer.parseInt(pesel.substring(i, i+1)) * wagi[i];
    int cyfraKontrolna = Integer.parseInt(pesel.substring(10, 11));
    
    suma %= 10;
    suma = 10 - suma;
    suma %= 10;
    return (suma == cyfraKontrolna);
}

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print ("Podaj numer PESEL: " );
String pesel = sc.nextLine();
System.out.println("Twój PESEL jest " + ((sprawdz(pesel)) ? "poprawny." : "niepoprawny"));
}
}
