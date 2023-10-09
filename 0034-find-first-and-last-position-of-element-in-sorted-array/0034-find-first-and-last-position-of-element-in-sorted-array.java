class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2]; // Initialize an array to store the result [start index, end index].
        ans[0] = findFirst(nums, target); // Call the findFirst method to find the starting index.
        ans[1] = findLast(nums, target);  // Call the findLast method to find the ending index.
        return ans; 
    }

    // This method finds the first occurrence of the target element in a sorted array.
    public int findFirst(int[] arr, int target) {
        int index = -1; // Initialize the index to -1 (not found).
        int low = 0;    // Initialize the low pointer to the start of the array.
        int high = arr.length - 1; // Initialize the high pointer to the end of the array.

        while (low <= high) {
            int mid = low + (high - low) / 2; 

            if (arr[mid] == target) {
                // If the middle element is equal to the target, update the index to the middle,
                // and search in the left half of the array to find the first occurrence.
                index = mid;
                high = mid - 1;
            } else if (arr[mid] > target) {
                // If the middle element is greater, search in the left half of the array.
                high = mid - 1;
            } else {
                // If the middle element is less , search in the right half of the array.
                low = mid + 1;
            }
        }

        return index; // Return the index of the first occurrence (or -1 if not found).
    }

    // This method finds the last occurrence of the target element in a sorted array.
    public int findLast(int[] arr, int target) {
        int index = -1; // Initialize the index to -1 (not found).
        int low = 0;    // Initialize the low pointer to the start of the array.
        int high = arr.length - 1; // Initialize the high pointer to the end of the array.

        // Perform binary search until low is less than or equal to high.
        while (low <= high) {
            int mid = low + (high - low) / 2; // Calculate the middle index.

            if (arr[mid] == target) {
                // If the middle element is equal to the target, update the index to the middle,
                // and search in the right half of the array to find the last occurrence.
                index = mid;
                low = mid + 1;
            } else if (arr[mid] > target) {
                // If the middle element is greater , search in the left half of the array.
                high = mid - 1;
            } else {
                // If the middle element is less , search in the right half of the array.
                low = mid + 1;
            }
        }

        return index; 
    }
}