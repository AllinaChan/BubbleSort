public class Runner {

    public static void main(String[] args)
    {
        int[] arr= SortingUtil.randIntArr(5);


        System.out.println("Before: ");
        System.out.println(SortingUtil.printArr(arr));

        long time= System.nanoTime();
        SortingUtil.bubbleSort(arr);
        time=System.nanoTime()-time;

        System.out.println("After: ");
        System.out.println(SortingUtil.printArr(arr));
        System.out.println("Time take: "+ time);
    }
}
