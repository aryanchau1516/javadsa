package GeekforGeeks;

/**
 * 1. Brute Force Approach
In this approach, we check all possible subarrays by iterating over each element of the array and then calculating the sum of all subarrays starting from that element.

Steps:
Loop through each index i.
For each i, loop through each index j (i <= j) and calculate the sum of the subarray from index i to j.
If the sum equals the target sum, return the pair of indices.
Time Complexity: O(n^2)
Space Complexity: O(1) (since we only use the indices)
 */
public class SubArraySum1 {
    public static void main(String[] args) {
        
    }
}
