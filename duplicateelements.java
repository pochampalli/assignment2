public class duplicateelements
{
    public static void main(String [] args)
    {
        int arr[]={1,1,2,3,4,5,2,7,9,8,7};
        System.out.println("duplicate elements are:");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                    System.out.print(arr[i] +" ");
            }
        }
    }
}