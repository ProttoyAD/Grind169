package Grind169.MergedSortedArray88;

public class Main {
    public static void main(String[] args) {
        int[] a={2,0};
        int[] b={1};
        merge(a,1,b,1);

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {        m=m-1;
        n=n-1;
        for(int i=nums1.length-1; i>=0; i--){
            if (n==-1) break;
            if(m>=0 && nums1[m]>=nums2[n]) {
                nums1[i]=nums1[m];
                m--;
            }
            else {
                nums1[i]=nums2[n];
                n--;
            }
        }

    }
}
