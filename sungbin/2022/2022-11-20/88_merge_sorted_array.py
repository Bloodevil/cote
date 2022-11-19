class Solution:
    def merge(self, nums1: list[int], m: int, nums2: list[int], n: int) -> None:
        i, j = m-1, n-1
        for right in range(m+n-1, -1, -1):
            if j < 0:
                break
            elif i >= 0 and nums1[i] > nums2[j]:
                nums1[right] = nums1[i]
                i -= 1
            else:
                nums1[right] = nums2[j]
                j -= 1
