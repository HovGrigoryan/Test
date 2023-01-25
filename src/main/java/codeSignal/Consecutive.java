package codeSignal;

import java.util.Arrays;

public class Consecutive {
    public String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static int solution(int[] a) {
        Arrays.sort(a);
        int n = a[a.length - 1] - a[0];
        return n - a.length;
    }

    public static void main(String[] args) {
        int[] a = {6, 2, 3, 5, 8};
        System.out.println(solution(a));

    }

}
