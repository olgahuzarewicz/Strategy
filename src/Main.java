public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }


    public int add (int a, int b, Strategy strategy){
        return strategy.add(a, b);
}

}
