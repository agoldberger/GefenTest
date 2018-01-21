import java.util.ArrayList;

public class question12 {
    public static void printElementArray(int[][] array){
        for (int[] subArray : array){
            if (subArray != null && subArray.length != 0){
                for (int element : subArray){
                    System.out.print(element + " ");
                }
            }
        }
    }

    public static int[][] getIntermediaryArray(int[][] array){
        int[][] result = new int[array.length][];
        Integer lastInt = null;
        int arrayIndex = 0;
        for (int[] subArray : array){
            if (subArray.length == 0){
                result[arrayIndex] = new int[0];
            } else {
                ArrayList<Integer> newSubArray = new ArrayList<>();
                for (int element : subArray) {
                    if (lastInt == null) {
                        lastInt = element;
                        newSubArray.add(element);
                    } else {
                        if (lastInt + 1 == element) {
                            continue;
                        }
                        lastInt = element;
                        newSubArray.add(element);
                    }
                }
                result[arrayIndex] = newSubArray.stream().mapToInt(i -> i).toArray();
            }
            arrayIndex++;
        }
        return result;
    }
}
