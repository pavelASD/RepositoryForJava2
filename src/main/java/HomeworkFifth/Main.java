package HomeworkFifth;

public class Main {

    static final int size = 10_000_000;
    static final int h = size / 2;

    public static void main(String[] args) throws InterruptedException {
        firstMethod();
        secondMethod();
    }


    public static void firstMethod(){


        float[] arr = new float[size];


        for (int i = 0; i<arr.length; i++){
            arr[i] = 1.0f;
        }

        long start = System.currentTimeMillis();

        for (int i=0; i<arr.length; i++){
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        long finish = System.currentTimeMillis();

        long result = finish - start;
        System.out.println("result from first method: "+result);
//        for (float i:arr){
//            System.out.println(i);
//        }
    }

    public static void secondMethod() throws InterruptedException {

        float[] arr = new float[size];
        float[] arr1 = new float[h];
        float[] arr2 = new float[h];


        for (int i = 0; i<arr.length; i++){
            arr[i] = 1.0f;
        }

        long start = System.currentTimeMillis();


        Thread threadFirst = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0; i<arr.length; i++) {
                    arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });



        Thread threadSecond = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });

        threadFirst.start();
        threadSecond.start();
        threadFirst.join();
        threadSecond.join();

        long finish = System.currentTimeMillis();


        System.arraycopy(arr, 0, arr1, 0, h);
        System.arraycopy(arr, h, arr2, 0, h);
        System.arraycopy(arr2, 0, arr2, 0, arr2.length);
        System.arraycopy(arr1, 0, arr1, 0, arr1.length);

        long result = finish - start;
        System.out.println("result from second method: "+result);
    }
}
