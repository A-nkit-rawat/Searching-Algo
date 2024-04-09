// Time complexity O(n)

class Insertion_Sort {
        public static void insertionSort(int [] ele){
            for(int i=1;i<ele.length;i++){
                int j=i;
                int key=ele[i];
                while( j>0 && (ele[j-1]>key)){
                        ele[j]=ele[j-1];
                        j--;
                }
                ele[j]=key;
            }
        }
}
