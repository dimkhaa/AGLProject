package sn.m1sir.testing;

import org.junit.Test;
import sn.m1sir.entities.Calcul;
import static org.junit.Assert.*;

public class CalculTest {

    //Test Unitaire pour la methode addition de la classe Calcul
    @Test
    public void testAdditionWithPositiveNumber(){
        Calcul calcul = new Calcul();
        double result = calcul.addition(8, 5);
        assertEquals(13, result, 0);
    }

    @Test
    public void testAdditionWithSignNumberDifferent(){
        Calcul calcul = new Calcul();
        double result = calcul.addition(7, -3);
        assertEquals(4, result, 0);

        result = calcul.addition(-10, 6);
        assertEquals(-4, result, 0);
    }

    @Test
    public void testAdditionWithNegativeNumber(){
        Calcul calcul = new Calcul();
        Integer result = calcul.addition(-9, -5);
        assertEquals(-14, result, 0);
    }

    @Test
    public void testAdditionWithNullNumber(){
        Calcul calcul = new Calcul();
        Integer result = calcul.addition(null, 8);
        assertEquals(null, result);

        result = calcul.addition(6, null);
        assertEquals(null, result);

        result = calcul.addition(null, null);
        assertEquals(null, result);
    }


    //Test Unitaire pour la methode multilication de la classe Calcul
    @Test
    public void testMultiplicationWithPositiveNumber(){
        Calcul calcul = new Calcul();
        Integer result = calcul.multiplication(5, 4);
        assertEquals(20, result, 0);
    }

    @Test
    public void testMultiplicationWithSignNumberDifferent(){
        Calcul calcul = new Calcul();
        Integer result = calcul.multiplication(8, -2);
        assertEquals(-16, result, 0);

        result = calcul.multiplication(-3, 6);
        assertEquals(-18, result, 0);
    }

    @Test
    public void testMultiplicationWithNegativeNumber(){
        Calcul calcul = new Calcul();
        Integer result = calcul.multiplication(-4, -6);
        assertEquals(24, result, 0);
    }

    @Test
    public void testMultiplicationWithNullNumber(){
        Calcul calcul = new Calcul();
        Integer result = calcul.multiplication(null, 7);
        assertEquals(null, result);

        result = calcul.multiplication(4, null);
        assertEquals(null, result);

        result = calcul.multiplication(null, null);
        assertEquals(null, result);
    }
}