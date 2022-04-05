package HomeworkSecond;

public class Main {
    public static void main(String[] args) throws MySizeArrayException, MyArrayDataException {
        stringArray(new String[][]{{"1", "2", "3", "4"},{"3", "3", "2","1"},{"2","1","2","2"},{"3","3","4","4"}});
    }
    public static int stringArray(String[][] array) throws MySizeArrayException, MyArrayDataException {

        int sum = 0;

        if (array.length != 4){
            throw new MySizeArrayException("the size of the array should be 4");
        }
        for (int i=0; i< array.length; i++){
            if (array[i].length !=4){
                throw new MySizeArrayException("the size[i] of the array should be 4");
            }
            for (int j=0; j<array[i].length; j++){
                try {
                    sum = sum+Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("in the cell under the number "+array[i]+":"+array[j]+" conversion failed");
                }
            }
        }
        return sum;
    }
}
