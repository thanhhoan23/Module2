public class BinarySearch {
    int binary(int a[], int x) {
        int left = 0;
        int right = a.length - 1;

        for (int i = left; i <= right; i++){
            int mid = (left + right)/2;
            if(a[mid] == x){
                return mid;
            }else if(a[mid] > x){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }
}