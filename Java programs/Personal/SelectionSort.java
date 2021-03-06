public class SelectionSort {
	
        public static int[] selectionSort(int a[]) {
            for (int i = 0; i < a.length; i++) {
                int smallestValue = a[i];
                int smallestIndex = i;
                for (int j = i; j < a.length; j++) {
                    if (a[j] < smallestValue) {
                        smallestValue = a[j];
                        smallestIndex = j;
                    }
                }
                
                if (smallestValue < a[i]) {
                    int temp = a[i];
                    a[i] = a[smallestIndex];
                    a[smallestIndex] = temp;
                }
            }
            return a;
        }
        
        public static void main(String...args) {
            int a[] = {8,9,10,90,78,21,43,21,1,99};
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
            
            System.out.println();
            
            selectionSort(a);
            for (int i = 0 ; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
        }
        
    }

