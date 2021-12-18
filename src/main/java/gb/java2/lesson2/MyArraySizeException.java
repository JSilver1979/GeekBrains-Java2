package gb.java2.lesson2;

public class MyArraySizeException extends ArrayIndexOutOfBoundsException {
    private int size;

    public MyArraySizeException(int size) {
        this.size = size;
    }

    @Override
    public String getMessage() {
        System.err.println("Array size error! Array must be of size: [" + this.size + "][" + this.size + "]");
        return null;
    }

}
