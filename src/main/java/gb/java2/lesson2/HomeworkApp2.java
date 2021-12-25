package gb.java2.lesson2;

public class HomeworkApp2 {

    public static void main(String[] args) {

        String[][] myArray = {
                {"1","1","1","1"},
                {"1","1","100","1"},
                {"1","1","1","1"},
                {"1","1","1","2"},
        };
        try {
            System.out.println(getArrayToInt(myArray));
        } catch (MyArraySizeException e) {
            e.getMessage();
        } catch (MyArrayDataException e) {
            e.getMessage();
        }
    }

    public static int getArrayToInt(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (array.length != 4) {
            throw new MyArraySizeException(4);
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {throw new MyArraySizeException(4);}
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i,j);
                }
            }
        }
        return sum;
    }

}
