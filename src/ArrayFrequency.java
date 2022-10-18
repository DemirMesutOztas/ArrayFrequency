

public class ArrayFrequency {


    static  boolean  isFind(int[] arr, int value, int j) {
        for (int i=0; i<j; i++)
        {
            if (arr[i] == value)
            {
                return true;

            }
        }
        return false;
    }

    public static void main(String[] args) {

        int [] arr = {10, 20, 20, 10, 10, 20, 5, 20, 10};
        int count =0;
        int [] arr2 = new int[arr.length];

       for(int i = 0 ; i<arr.length; i++)
       {
           for (int j =0; j<arr.length; j++)
           {
              // System.out.println(arr[i] + " - " + arr[j]);
               if(arr[i]==arr[j])
               {
                   count++;

               }

           }
           arr2[i]=count;
           count = 0;
       }

        System.out.println("Tekrar Sayıları");

       for(int i =0; i<arr.length; i++)
       {
           if(!(isFind(arr,arr[i],i)))
           {
               System.out.println(arr[i] + " sayısı " + arr2[i] + " kere tekrar edildi" );

           }

       }


    }
}