public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }


    public int addInt(int a, int b) {
        Strategy s1 = (x, y) -> (x + y);

        return s1.add(a, b);
    }

    public int addString(int a, int b) {
        Strategy s1 = (x, y) -> {
            String x1 = "" + x;
            String y1 = "" + y;
            return Integer.valueOf(x1 + y1);
        };

        return s1.add(a, b);
    }
}



