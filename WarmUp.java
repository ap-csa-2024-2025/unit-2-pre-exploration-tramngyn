public class WarmUp
{
  public static void main(String[] args)
  {
    System.out.println(isEven(49));
    System.out.println(isDivisible(25, 5));
  }

  public static boolean isEven(int n)
  {
    return (n % 2 == 0);
  }

  public static boolean isDivisible(int a, int b)
  {
    return(a % b == 0);
  }
}
