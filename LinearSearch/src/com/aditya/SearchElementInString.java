package com.aditya;
//! --> String is an array of chars.
public class SearchElementInString {
    public static void main(String[] args) {
        String name = "Aditya";
        char target= 'd';
        System.out.println(saearchCharacter(name , target));
    }

    private static boolean saearchCharacter(String name, char target) {
        if(name.length()==0){
            return false;
        }
        for (int i = 0; i <name.length(); i++) {
            if(target==name.charAt(i)){
                return true;
            }

        }
        return false;
    }
}
