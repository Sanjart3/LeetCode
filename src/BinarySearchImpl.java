public class BinarySearchImpl {
    public static void main(String[] args){
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        BinarySearchImpl bs = new BinarySearchImpl();
        System.out.println(bs.binarySearch(arr, 9));
    }

    public int binarySearch(int[] arr, int target){
        int low=0, high=arr.length;
        while (arr[(low+high)/2]!=target){
            if (high-low==1) return -1;
            if (arr[(low+high)/2]>target) high = (low+high)/2;
            else low = (high+low)/2;
        }
        return (high+low)/2+1;
    }

    public static int binarySearchFromBook(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}
