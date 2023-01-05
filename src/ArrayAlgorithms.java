public class ArrayAlgorithms {

    /** Prints each String in wordList, on its own line, followed by “!”.
     *  Does NOT mutate (modify) wordList.
     *  PRECONDITION: wordList.length > 0
     *
     *  @param wordList  original array of Strings; does not get modified
     */
    public static void printExclamation(String[] wordList)
    {
        for (int i = 0; i < wordList.length; i++ ) {
            System.out.println(wordList[i] + "!");
        }
    }

    /** Adds a “!” to the end of each String in wordList (does not print).
     *  DOES mutate (modify) original wordList.
     *  PRECONDITION: wordList.length > 0
     *
     *  @param wordList  original array of Strings, modified by method
     */
    public static void addExclamation(String[] wordList)
    {
        for (int i = 0; i < wordList.length; i++) {
            wordList[i] = wordList[i] + "!";
        }
    }



    /** Returns the sum of all values in numList.
     *  Does NOT mutate (modify) numList.
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  array of integers to find sum
     *  @return  the sum of all numbers in the list
     */
    public static int sum(int[] numList)
    {
        int totalSum = 0;
        for (int i = 0; i < numList.length; i++) {
            totalSum += numList[i];
        }
        return totalSum;
    }

    /** Returns the average of all values in numList, as a double.
     *  Does NOT mutate (modify) numList.
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  array of integers to find average
     *  @return  the average of all numbers in the list
     *
     *  Use your sum method for this! (don’t rewrite that logic!)
     */
    public static double average(int[] numList)
    {
        int totalSum = 0;
        double totalNums = numList.length ;
        for (int i = 0; i < numList.length; i++) {
            totalSum += numList[i];
        }
        double average = ((double)totalSum) / totalNums;
        return average;
    }


    /** Returns the value in numList that represents the minimum value in numList.
     *  Does NOT mutate (modify) numList.
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  array of integers to find minimum
     *  @return  the minimum value in the array
     */
    public static int minimum(int[] numList)
    {
        int smallNum = 0;
        for (int i = 0; i < numList.length -1; i++) {
            if (numList[i] < numList[i+1]) {
                smallNum = numList[i];
            }
        }
        return smallNum;
    }


    /** Returns the value in numList that represents the maximum value in numList.
     *  Does NOT mutate (modify) numList.
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  array of integers to find maximum
     *  @return  the maximum value in the array
     */
    public static int maximum(int[] numList)
    {
        int bigNum = 0;
        for (int i = 0; i < numList.length - 1; i++) {
            if (numList[i] > numList[i+1]) {
                bigNum = numList[i];
            }
        }
        return bigNum;
    }



}
