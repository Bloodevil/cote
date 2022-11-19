# Leetcode - 88. Merge Sorted Array

# Introduction

- 주어진 nums1 배열과 nums2 배열을 정렬하여 합치는 문제이다.
- 정렬된 결과를 nums1에 in-place로 합쳐야 하며, nums1과 nums2에는 각각 m개와 n개의 숫자가 들어있다.

# Solution

## I. 문제 정의

- nums1에는 m개의 숫자들과 n개의 0이 순서대로 들어있다. 이 n개의 0에 숫자를 채우고 nums1을 오름차순으로 정렬된 상태로 만들면 된다.
- 시간 복잡도 O(m+n)으로 문제를 풀기 위해서는 nums1 배열의 길이만큼만 순회하면서 (혹은 그보다 짧게) 연산을 해나가야 한다.
- 또한, In-place로 nums1을 수정하고 extra memory는 O(1)을 목표로 한다.

## II. 뒤에서부터 채워나가기

1. nums1과 nums2의 유효한 숫자가 있는 가장 뒤쪽에 포인터를 하나씩(i, j) 두고, len(nums1)-1 <= right < -1 사이의 인덱스를 뒤에서부터 순회한다.

```python
class Solution:
    def merge(self, nums1: list[int], m: int, nums2: list[int], n: int) -> None:
        i, j = m-1, n-1
        for right in range(len(nums1)-1, -1, -1):
            pass
```

2. 체크할 조건은 아래의 3가지이다.
   1. nums2의 숫자를 모두 nums1에 옮겼다면 순회를 종료한다.
   2. nums1[i]의 숫자가 nums2[j] 보다 크면 nums1[i]를 nums1의 뒤쪽으로 옮기고 i를 앞쪽으로 한 칸 옮긴다.
      - nums1의 숫자를 모두 뒤쪽으로 옮겼다면 대신 2-3을 수행한다.
   3. nums1[i]의 숫자가 nums2[j] 보다 작거나 같으면 nums2[j]를 nums1의 뒤쪽으로 옮기고 j를 앞쪽으로 한 칸 옮긴다.

```python
class Solution:
    def merge(self, nums1: list[int], m: int, nums2: list[int], n: int) -> None:
        i, j = m-1, n-1
        for right in range(len(nums1)-1, -1, -1):
            if j < 0:  # 2-1
                break
            elif i >= 0 and nums1[i] > nums2[j]:  # 2-2
                nums1[right] = nums1[i]
                i -= 1
            else:  # 2-3
                nums1[right] = nums2[j]
                j -= 1
```
