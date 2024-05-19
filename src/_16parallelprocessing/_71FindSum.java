package _16parallelprocessing;

import java.util.stream.IntStream;

public class _71FindSum {
    private static int total;

    public static void main(String[] args) {
         IntStream.rangeClosed(1,1000)
                 .parallel()
                .forEach(_71FindSum::performSum);
        System.out.println(_71FindSum.total);
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public static void performSum(int input){
        total+=input;
    }
}
