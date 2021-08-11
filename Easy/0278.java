// 0278. First Bad Version

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
      //implement Binary Search
      int low = 0, high = n, res = 1;

      while( low <= high ) {
      	int mid = low + ((high - low) / 2); //overcome overflow if high is super big

      	if(isBadVersion(mid) == true) {
      		res = mid;
      		high = mid - 1;
      	} else {
      		low = mid + 1;
      	}
      }

      return res;
    }
}

// Check "long" to avoid overflow when you have
// values&sums bigger than 2^31. 
// int is 32bits, long is 64bits