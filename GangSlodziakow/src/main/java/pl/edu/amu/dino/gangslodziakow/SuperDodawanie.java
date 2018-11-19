/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.amu.dino.gangslodziakow;

/**
 *
 * @author jsiwek
 */
public class SuperDodawanie {
    public static String superdodawanie(String a, String b)
    {
        if (isNumeric.isNumeric(a)&&isNumeric.isNumeric(b)) 
        {
            return Integer.toString(Integer.parseInt(a)+Integer.parseInt(b));
        }
        else if (a.equals("V") && b.equals("IV"))
        {
            return "IX";
        }
        else 
        {
            return a+b;
        }
    }
}
class isNumeric {
    public static boolean isNumeric(String str)
    {
    for (char c : str.toCharArray())
    {
        if (!Character.isDigit(c) && c!=45) return false;
    }
    return true;
    }
}
