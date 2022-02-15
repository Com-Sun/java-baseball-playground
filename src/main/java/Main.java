import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String value = sc.nextLine();
        String[] values = value.split(" ");
        int[] nums = new int [values.length/2 +1];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(values[i * 2]);
        }
        String[] ops = new String[values.length/2];
        for (int i = 0; i < ops.length; i++) {
            ops[i] = values[i*2+1];
        }
        Calculator calculator = new Calculator();
        for (int i = 0; i < ops.length; i++){
            if (ops[i].equals("+")) {
                nums[i+1] = calculator.plus(nums[i], nums[i+1]);
            }
            if (ops[i].equals("-")) {
                nums[i+1] = calculator.minus(nums[i], nums[i+1]);
            }
            if (ops[i].equals("*")) {
                nums[i+1] = calculator.multiple(nums[i], nums[i+1]);
            }
            if (ops[i].equals("/")) {
                nums[i+1] = calculator.divide(nums[i], nums[i+1]);
            }
        }
        System.out.println(nums[nums.length-1]);
    }

}
