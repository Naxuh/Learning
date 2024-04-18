public class Test {
    public static void main(String[] args)
    {
        System.out.println(f(100));
    }

    public static int f(int n) // f(100)
    {
        if (n == 0) return 0;
        return f(n - 1) + n;
    }
}
