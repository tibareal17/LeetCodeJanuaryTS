import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input size of Array");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Input nums");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Input target");
        int target = in.nextInt();

        int res = findIndex(arr, target);
        if (res != -1){
            System.out.println("We have our target by index: " + res);
        }else {
            System.out.println("Target not found");
        }
    }

    public static int findIndex(int[] arr, int target){
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;

        // (7, 12, 16, 99, 156)
        while (left <= right){
            int mid = (right - left) / 2 + left;
            if (arr[mid] == target){
                return mid;
            }else if(arr[mid] < target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static int[] fistAndLastIndex(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;

        // (7, 12, 16, 99, 156)
        int result = -1;
        while (left <= right){
            int mid = (right - left) / 2 + left;
            if (arr[mid] == target){
                result = mid;
                break;
            }else if(arr[mid] < target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (result == -1){
            return new int[] {-1, -1};
        }

        left = result - 1;
        right = result + 1;
        int[] sol = new int[2];
        while (result == target){
            if (arr[left] == target){
                left--;
                sol[0] = left + 1;
            }else if (arr[right] == target){
                right++;
                sol[0] = right - 1;
            }else {
                break;
            }

        }
        return sol;
    }
}