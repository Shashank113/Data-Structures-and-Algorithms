package arrayUtils;

public class ArrayPrinter {
    public static String print1dArray(int[] inputArray){
        String arrayToPrint = "[ ";
        for(int element : inputArray){
            arrayToPrint = arrayToPrint + element + " ";
        }
        arrayToPrint = arrayToPrint + "]";
        return arrayToPrint;
    }
}
