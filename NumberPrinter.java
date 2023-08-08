public class NumberPrinter {
    private static int num = 1;

    public NumberPrinter() {
        if (num <= 5) {
            System.out.print(num + " ");
            num++;
            new NumberPrinter(num);
        }
    }

    public NumberPrinter(int num) {
        this();
    }

    public static void main(String[] args) {
        new NumberPrinter();
    }
}
