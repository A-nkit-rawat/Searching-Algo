//Best-average-worst time complexity O(n^2)

public class Selection_Sort {
    public static void selectionSort(int [] ele){
        
        int min;
        for(int i=0;i<ele.length-1;i++){
           
            min=i;

            //getting minimum element on each iteration
            for(int j=i+1;j<ele.length;j++){
                if(ele[j]<ele[min]){
                    min=j;
                }
            }
            
            //swapping minimum element with i-th index
            int temp=ele[i];
            ele[i]=ele[min];
            ele[min]=temp;
        }
       
    }
    
}
