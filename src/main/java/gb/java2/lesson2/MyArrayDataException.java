package gb.java2.lesson2;

public class MyArrayDataException extends NumberFormatException {
    private int rows;
    private int cols;

    public MyArrayDataException(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;

    }

    @Override
    public String getMessage() {
        System.out.println("Error symbol in array at [" + this.rows + "][" + this.cols + "]");
        return null;
    }
}
