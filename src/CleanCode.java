public class CleanCode {
    static class FindNumbers
    {
        int SmallestNumber;
        int LargestNumber;
    }
    static FindNumbers maxMinNumber(int numbersList[], int SizeOfArray)
    {
        FindNumbers findNumbers = new FindNumbers();
        int i;
        if (SizeOfArray == 1)
        {
            findNumbers.LargestNumber = numbersList[0];
            findNumbers.SmallestNumber = numbersList[0];
            return findNumbers;
        }

        if (numbersList[0] > numbersList[1])
        {
            findNumbers.LargestNumber = numbersList[0];
            findNumbers.SmallestNumber = numbersList[1];
        }
        else
        {
            findNumbers.LargestNumber = numbersList[1];
            findNumbers.SmallestNumber = numbersList[0];
        }

        for (i = 2; i < SizeOfArray; i++)
        {
            if (numbersList[i] > findNumbers.LargestNumber)
            {
                findNumbers.LargestNumber = numbersList[i];
            }
            else if (numbersList[i] < findNumbers.SmallestNumber)
            {
                findNumbers.SmallestNumber = numbersList[i];
            }
        }

        return findNumbers;
    }

    public static void main(String []args)
    {
        int numbersList[] = {1000, 11, 445, 1, 330, 3000};
        int LengthOfArray = numbersList.length;
        FindNumbers findNumbers = maxMinNumber(numbersList, LengthOfArray);
        System.out.printf("\n Smallest Number : %d", findNumbers.SmallestNumber);
        System.out.printf("\n Largest Number : %d", findNumbers.LargestNumber);
    }
}
