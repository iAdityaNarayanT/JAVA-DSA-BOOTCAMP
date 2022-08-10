package com.aditya;
//! --> String is an array of chars.
public class SearchElementInString {
    public static void main(String[] args) {
        String name = "Aditya";
        char target= 'd';
        System.out.println(searchCharacter(name , target));
        System.out.println(searchCharacterUsingForEach(name , target));
    }
// ! using for each loop:
    private static boolean searchCharacterUsingForEach(String name, char target) {
        if(name.length()==0){
            return false;
        }
        for (char element: name.toCharArray()) {
            if (element==target){
                return true;
            }
        }
        return false;
    }

    private static boolean searchCharacter(String name, char target) {
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
