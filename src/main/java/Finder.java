public class Finder {

    public Integer findMax(int[] intArray) {
        if(intArray == null || intArray.length < 1) {
            return null;
        } else {
            int max = intArray[0];
            for(int i = 0; i < intArray.length; i++) {
                if(max < intArray[i]) {
                    max = intArray[i];
                }
            }
            return max;
        }
    }
    public Integer findMin(int[] intArray) {
        if(intArray == null || intArray.length < 1) {
            return null;
        } else {
            int min = intArray[0];
            for(int i = 0; i < intArray.length; i++) {
                if(min > intArray[i]) {
                    min = intArray[i];
                }
            }
            return min;
        }
    }
}
