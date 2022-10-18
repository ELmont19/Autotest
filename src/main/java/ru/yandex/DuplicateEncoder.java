package ru.yandex;



    public class DuplicateEncoder {
        public static void main(String[]args){
            System.out.println(encode("   ()(   "));
        }
        static String encode(String word){
            word = word.toLowerCase();
            String newWord="";
            String[] wordArr = word.split("");
            for(String a:wordArr){
                if(word.indexOf(a)==word.lastIndexOf(a)){
                    newWord+="(";
                }
                else {
                    newWord+=")";
                }
            }
            word = newWord;
            return word;
        }
    }
