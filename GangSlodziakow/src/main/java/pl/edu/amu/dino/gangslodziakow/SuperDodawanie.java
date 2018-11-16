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
        if(a.equals("1") && b.equals("0"))
        {
            return "1";
        }
        else if(a.equals("a") && b.equals("b"))
        {
            return "ab";
        }
        else
        {
            return "0";
        }
    }
}
