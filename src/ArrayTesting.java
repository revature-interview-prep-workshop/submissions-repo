import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

public class ArrayTesting {


    static void print2Smallest(int arr[]) {

        int smallest = Integer.MAX_VALUE;
        int biggest = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest = arr[i];
            }
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]>biggest){
                biggest=arr[i];
            }
        }
        System.out.println("the smallest:"+smallest);
        System.out.println("the biggest:"+biggest);
    }

    static int [] rotleft(int[] arr,int d){

        int num = arr.length;
        int [] roArray = new int[num];

        for(int oldIndex=0; oldIndex < num; oldIndex++){

            System.out.println("oldIndex = "+ oldIndex);
            System.out.println("num = "+ num);
            System.out.println("d = "+ d);
            System.out.println("new = "+ (oldIndex+ (num -d))%num);
            int newIndex = (oldIndex+ (num -d))%num;
            roArray[newIndex]=arr[oldIndex];
        }


    return  roArray;
}
}