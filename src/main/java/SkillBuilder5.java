/**
 * This class provides various Skill Builder 5 - Array
 * exercises.
 *
 * @author (you)
 * @version (a version number or a date)
 */
public class SkillBuilder5
{
    /**
     * Calculates the prefix average of array data and returns the prefex average
     * in a new array.  The parameter data is never touched and left intact.
     *
     * @param data array of double values on which to calculate the prefix average.
     * @return returns an array containing the prefix average values calculated
     *         from data.
     */
    public static double[] prefixAverage(double[] data)
    {
        double sum = 0;
        double[] sumList = new double[data.length];

        for (int index = 0; index < data.length; index++) {
            sum += data[index];
            sumList[index] = (sum / (index + 1));
        }
    return sumList;
    }

    /**
     * Finds the location in array anArray where value is located.  If anArray
     * does not contain an element equal to value a -1 is returned; otherwise a
     * positive or zero index value is returned.
     * @param searchValue value to look for in the array
     * @param anArray array in which to look for a value
     * @returns index of the value in the array; -1 otherwise.
     */
    public static int  indexOf(int searchValue, int[] anArray)
    {
        for (int index = 0; index < anArray.length; index++) {
            if (anArray[index] == searchValue) {
                return index;
            }
        }
        return -1;
    }

    /**
     * Finds the location in array anArray where string s is located.  If anArray
     * does not contain an element equal to s a -1 is returned; otherwise a
     * positive or zero index value is returned.
     * @param s a string to look for in the array
     * @param anArray array in which to look for a value
     * @returns index of the string s in the array; -1 otherwise.
     */
    public static int  indexOf(String s, String[] anArray)
    {
        for (int index = 0; index < anArray.length; index++) {
            if (anArray[index].equals(s)) {
                return index;
            }
        }
        return -1;
    }

    /**
     * Finds all occurrence of string s in anArray and removes them, returning
     * a new array with all occurrences of s removed.
     * @param s string to search for in array
     * @param anArray array in which to search and remove s
     * @return An array with all occurrences of s removed.
     */
    public static String[] remove(String s, String[] anArray) {
        int notSNum = 0;
        int index2 = 0;

        // Length of newArray determined here and creates dupe array.
        for (int index = 0; index < anArray.length; index++) {
            if (anArray[index].equals(s) == false) {
                notSNum += 1;
            }
        }

        String [] withoutS = new String[notSNum];

        for (int index = 0; index < anArray.length; index++) {
            if (anArray[index].equals(s) == false) {
                withoutS[index2] = anArray[index];
                index2++;
            }
        }
        return withoutS;
    }

    /**
     * Reverses an array of integers.
     * @param anArray the array whose contents should be reversed.
     */
    public static void reverse(int[] anArray)
    {
        int[] reversed = new int[anArray.length];
        if (!(anArray.length == 0 || anArray == null)) {
            for (int index = 0; index < anArray.length; index++) {
                reversed[anArray.length - (index + 1)] = anArray[index];
            }
            for (int index = 0; index < anArray.length; index++) {
                anArray[index] = reversed[index];
            }

        }
    }
}
