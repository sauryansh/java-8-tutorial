package _08functioninterface._4function;

public class _21FunctionExample1 {
    public static String performConcat(String str){
        return _20FunctionExample.addSomeString.apply(str);
    }
    public static void main(String[] args) {
        String result = performConcat("Hello, ");
        System.out.println(result);
    }
}
