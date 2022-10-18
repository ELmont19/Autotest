package ru.yandex;

public class FindOutlier {
    public static void main(String[] args) {
        // int[] exampleTest1 = {Integer.MAX_VALUE, 0, 1};
        //System.out.println(find(exampleTest1));


    }
    static int find(int[] integers) {
        int N=0;
        int even = 0;
        int odd = 0;
        for (int i = 0; i < 3; i++) {
            if (integers[i] % 2 == 0) {
                even++;
            } else
                odd++;
        }
        if (even > odd) {
            for (int i : integers) {
                if (i % 2 != 0) {
                    N = i;
                    break;
                }
            }
        } else {
            for (int i : integers) {
                if (i % 2 == 0) {
                    N = i;
                    break;
                }
            }
        }
        return N;
    }
}
