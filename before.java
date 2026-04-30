public class before {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int unused = 999; // 坏味道1：未使用变量

        // 计算1
        int sum1 = a + b;
        int mul1 = a * b;
        System.out.println(sum1);
        System.out.println(mul1);

        int x = 30;
        int y = 40;

        // 计算2（坏味道2：重复代码块）
        int sum2 = x + y;
        int mul2 = x * y;
        System.out.println(sum2);
        System.out.println(mul2);
    }
}
