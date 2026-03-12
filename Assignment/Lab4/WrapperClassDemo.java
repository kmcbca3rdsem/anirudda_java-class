package Assignment.Lab4;

public class WrapperClassDemo {
    public static void main(String[] args) {
        int num = 42;
        Integer integerNum = Integer.valueOf(num);  // or Integer num = num; (Autoboxing)
        System.out.println("Integer value: " + integerNum);

        int unboxedNum = integerNum.intValue();
        System.out.println("Unboxed int value: " + unboxedNum);
    }
}