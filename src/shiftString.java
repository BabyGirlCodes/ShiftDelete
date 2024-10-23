public class shiftString {
    public boolean String(String[] array, String newText, int pos ){
//       VALIDATION
        if(array == null || array.length==0){
            throw new IllegalArgumentException("Array is null or empty");

        }
        if(pos < 0 || pos>=array.length){
            throw new IndexOutOfBoundsException("Position is greater than array");
        }
//        SETUP
        for(int i = 0; i < array.length; i++){
            if(array[i].length() > newText.length()){

                for (i = array.length - 1; i > pos ; i--) {
                    array[i] = array[i-1];
                }
                array[pos] = newText;

            }
        }

        return true;
    }
}
