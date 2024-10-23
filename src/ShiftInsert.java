public class ShiftInsert {
    public int shiftInsert(int[]array, int value, int pos){
//        VALIDATION
        if(array == null || array.length==0){
            throw new IllegalArgumentException("Array is null or empty");

        }
        if(pos < 0 || pos>=array.length){
            throw new IndexOutOfBoundsException("Position is greater than array");
        }
//        SETUP
        int removed = array.length-1;

        for (int i = array.length-1; i > pos ; i--) {
            array[i] = array[i-1];
        }
        array[pos] = value;
//        OUTPUT
        return removed;

    }
    public boolean shiftInt(int [] array, int value, int pos){
        //        VALIDATION
        if(array == null){
            throw new IllegalArgumentException("Array is null or empty");

        }
        if(pos < 0 || pos>=array.length){
            throw new IndexOutOfBoundsException("Position is greater than array");
        }

//        SETUP
        boolean found = true;
        for (int i = array.length; i > pos ; i--) {
            array[i] = array[i-1];
        }
        array[pos] = value;
        if(array[pos] == value){
            return true;
        }
        return found;
    }
}
