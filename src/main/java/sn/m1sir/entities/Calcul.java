package sn.m1sir.entities;

public class Calcul {

    public Integer addition(Integer first, Integer second){
        if (first == null) {
            return null;
        }
        if (second == null) {
            return null;
        }
        return first + second;
    }

    public Integer multiplication(Integer first, Integer second){
        if (first == null) {
            return null;
        }
        if (second == null) {
            return null;
        }
        return first * second;
    }

}
