public class AddingStrategy2 implements Strategy {

    @Override
    public int add(int a, int b) {
        String a1 = "" + a;
        String b1 = "" + b;
        return Integer.valueOf(a1 + b1);
    }
}
