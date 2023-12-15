public class Arrays{
    static void printarray(int arr3[]){
        System.out.println("\nAnonymous array: ");
        for(int j=0;j<arr3.length;j++){
            System.out.println(" "+arr3[j]);
        }
    }
    public static void main(String args[]){
        int arr1[]= {2,4,2,1};
        int arr2[]= new int[4];
        //copying an array
        System.arraycopy(arr1,0,arr2, 0,4);
        System.out.println("copied array : ");
        for(int i=0;i<arr2.length;i++){
            System.out.print(" "+arr2[i]);
        }
        printarray(new int[]{10,11,12,13});
        //multidimensional array
        int multi[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Multi-dimensional array");
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(" "+multi[i][j]);
            }
        }

    }
}

