public class FindMissingAndRepeating {
    public int[] findTwoElement(int arr[], int n) {
        
        int[] count = new int[n];
        
        for (int num: arr) {
            count[num-1]++;
        }
        
        int rep = -1, miss = -1;
        for (int i=0;i<n;i++) {
            if (count[i] == 2) rep = i+1;
            if (count[i] == 0) miss = i+1;
            
            if (rep != -1 && miss != -1) break;
        }
        
        return new int[]{rep, miss};
    }
}
