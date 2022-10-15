/*Crear un método que obtenga el resultado de 
elevar un número a otro. Ambos números se deben pasar como parámetros
 */
package com.mycompany.s6;

public class E7 {
    public static void main(String[] args)
{
    int base=2;
    int exp=0;
    System.out.println(base+" elevado a "+exp+" = "+poten(base, exp));
}
//método que devuelve base elevado a exp
//ejemplo: base = 2 y exp = 4 -> 4
static int poten(int base, int exp)
{
        switch (exp) {
            case 0:
                return 1; // cualquier número elevado a cero es 1
            case 1:
                return base;
            default:
                return base * poten(base,exp-1);
        }
}
}
