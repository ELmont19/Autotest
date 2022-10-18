package ru.yandex;

public class Prakticum {
    public static void main(String[] args) {

        SquareDigit s = new SquareDigit();
        System.out.print(s.squareDigits(9119 ));
    }



}

 class SquareDigit {

    public SquareDigit() {
    }

    public int squareDigits(int n) {
        String num = ""+n;
        String result = "";
        String[] numArr = num.split("");
        for(String a:numArr){
            int b = Integer.parseInt(a);
            int square = b*b;
            result+=""+square;
        }
        return Integer.parseInt(result);

    }

}

