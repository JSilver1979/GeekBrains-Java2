package gb.java2.Lesson5;

import java.util.Arrays;

public class HomeWorkApp5 {

    private static final int size = 10_000_000;
    private static final float[] fArr = new float[size];
    private static final Object mon = new Object();

    public static void main(String[] args) {
        Arrays.fill(fArr, 1.0f);
        oneThread(fArr);
        try {
            twoThreads(fArr);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void oneThread(float[] fArray) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < fArray.length; i++) {
            fArray[i] = (float)(fArray[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("Time for 1 Thread: " + (System.currentTimeMillis() - startTime));

    }

    public static void twoThreads(float[] fArray) throws InterruptedException {
        float[] firstArr = new float[fArray.length/2];
        float[] secondArr = new float[fArray.length/2];
        long startTime = System.currentTimeMillis();

        System.arraycopy(fArray,0,firstArr,0,fArray.length/2);
        System.arraycopy(fArray, fArray.length/2+1,secondArr,0,fArray.length/2-1);

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < firstArr.length; i++) {
                synchronized (mon) {
                    firstArr[i] = (float)(firstArr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });
        
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < secondArr.length; i++) {
                synchronized (mon) {
                    secondArr[i] = (float)(secondArr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.arraycopy(firstArr,0,fArray,0,firstArr.length);
        System.arraycopy(secondArr,0,fArray,secondArr.length+1,secondArr.length-1);
        System.out.println("Time for 2 threads: " + (System.currentTimeMillis() - startTime));

    }
}
