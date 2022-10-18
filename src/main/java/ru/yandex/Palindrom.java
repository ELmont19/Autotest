package ru.yandex;

public class Palindrom {
    public static void main(String[] args) {
        checkPalindrom1("совыфвавфыва");
    }
    public static void checkPalindrom1(String str){
        String newString="";
        String[] strArr = str.split("");
     for(int i = strArr.length-1; i>=0;i--){
         newString+=strArr[i];
     }
        if(str.equals(newString)){
            System.out.println("это палиндром");
        } else {
            System.out.println("это не палиндром");
        }
    }
}
