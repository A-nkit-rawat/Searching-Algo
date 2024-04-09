// time complexity O(n^2)
// Optimize version of bubble sort ( best case time complexity is O(n) )

class Bubble_Sort{

    public static void bubbleSort(int [] ele){
        boolean flag=true;
        for(int i=0;i<ele.length-1;i++){
            flag=true;
            for(int j=0;j<(ele.length-1)-i;j++){
                if(ele[j]>ele[j+1]){

                    //swapping
                    int temp=ele[j+1];
                    ele[j+1]=ele[j];
                    ele[j]=temp;
                    flag=false;
                }
            }
            //if no element swap by inner loop, then break
            if(flag==true) break;
        }    
    }
}