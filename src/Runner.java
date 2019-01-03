public class Runner {

    public static void main(String[] args)
    {
        int[] arr= SortingUtil.randIntArr(5);


        System.out.println("Before: ");
        System.out.println(SortingUtil.printArr(arr));

        SortingUtil.bubbleSort(arr);

        System.out.println("After: ");
        System.out.println(SortingUtil.printArr(arr));
    }
}
