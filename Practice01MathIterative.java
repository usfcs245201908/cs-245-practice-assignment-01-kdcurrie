public class Practice01MathIterative implements Practice01Math{
    public int fact(int n) throws Exception {
        if (n < 0)
            throw new Exception("Number must be greater than 0");

        int a = 1;
        for (int i = 1; i <= n; i++) {
            a = a * i;
        }
        return a;
    }
    public int fib(int n) throws Exception {
        int a = 0;
        int b = 1;
        if (n < 0)
            throw new Exception("Number must be greater than 0");
        if (n == 0)
            return n;
        for (int i = 0; i < n; i++) {
            int c = a;
            a += b;
            b = c;
        }
        return a;
    }
}
