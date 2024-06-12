public class EvenFibonacciNumbers
{
    public static long sumOfEvenFibonacciNumbers(int bound)
    {
        long termOne = 0, termTwo = 1, nextTerm, sum = 0;

        while(termOne <= bound)
        {
            if(termOne % 2 == 0) sum += termOne;
            nextTerm = termOne + termTwo;
            termOne = termTwo;
            termTwo = nextTerm;
        }

        return sum;
    }

    public static void main(String[] args)
    {
        System.out.println(sumOfEvenFibonacciNumbers(4000000));
    }
}
