package lang.print.gaps.task5;

public class NumberDivider {
    void divide(int toBeDivided) {
        System.out.println(((float)toBeDivided/5));

    }

    public static void main(String[] args) {
        NumberDivider nd = new NumberDivider();
        nd.divide(14);
    }
}
