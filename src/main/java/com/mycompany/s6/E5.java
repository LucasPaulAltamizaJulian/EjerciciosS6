/*Crea un método que obtenga el factorial de un número N. Se debe pasar como parámetro el número N
 */
package com.mycompany.s6;

public class E5 {
    public static void main(String[] args)
{
    //obtier factorial de n
    int n = 4;
    System.out.println(n+"! = "+fact(n));
}
//método que devuelve el factorial de n
//ejemplo: n = 4 -> 4x3x2x1
static int fact(int n)
{
    if(n>1) return n * fact(n-1);
    else return 1;
}
}
