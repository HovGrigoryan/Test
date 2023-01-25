package algorithms;

public class Polygon {
    static int solution(int n) {
        int poligon = n * ((n - 1) * 2) + 1;
        return poligon;
    }

    public static void main(String[] args) {
        System.out.println(Polygon.solution(5));
    }
}
