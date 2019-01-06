public class SortingUtil {

    public static int[] swap(int[] arr, int i, int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return arr;
    }

    public static int[] bubbleSort(int[] arr)
    {
        boolean sorted= SortingUtil.sorted(arr);
        int lastSwap = arr.length;
        int lastSwapTemp=0;
        while(sorted==false)
        {
            for(int i=0; i<lastSwap; i++)
            {
                if(i+1!=arr.length) {
                    if (arr[i] > arr[i + 1]) {
                        SortingUtil.swap(arr, i, i + 1);
                    }
                }
                lastSwapTemp=i;
            }
            lastSwap=lastSwapTemp;
              sorted=SortingUtil.sorted(arr);

        }
        return arr;
    }

    public static boolean sorted(int[] arr)
    {
        boolean result=true;
        for(int i =0; i <arr.length; i++)
        {
            if(i+1!=arr.length) {
                if (arr[i] > arr[i + 1]) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    public static int[] randIntArr(int count)
    {
        int[] arr = new int[count];
        for(int i=0; i<arr.length; i++)
        {
            arr[i]= (int)(Math.random()*10000);
        }
        return arr;
    }

    public static String printArr(int[] arr)
    {
        String result="";

        for(int num: arr)
        {
            result= result+ " " + num;
        }
        return result;
    }

}
