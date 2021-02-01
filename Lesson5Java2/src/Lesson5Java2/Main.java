package Lesson5Java2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        final int size = 10000000;
        final int h = size / 2;
        float[] arr = new float[size];
        Arrays.fill(arr, 1);
        doInOneThread (arr);
        doInTwoThread (arr, h);
          }

    public static void doInOneThread(float[] arr){
        long a = System.currentTimeMillis();
        change(arr);
        System.out.println(System.currentTimeMillis() - a);
    }

    public static void doInTwoThread (float[]arr, int h){
        long a = System.currentTimeMillis();
        float[]arr1 = new float[h];
        float[]arr2 = new float[h];
        System.arraycopy(arr, 0, arr1, 0, h);
        System.arraycopy(arr, h, arr2, 0, h);
        Thread T1 = new Thread(()->{
            change(arr1);
        });
        Thread T2 = new Thread(()->{
            change(arr2);
        });
        T1.start();
        T2.start();
        while (T1.isAlive() || T2.isAlive());
        System.arraycopy(arr1, 0, arr, 0, h);
        System.arraycopy(arr2, 0, arr, h, h);
        System.out.println(System.currentTimeMillis() - a);
    }

    public static void change(float[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }
}
