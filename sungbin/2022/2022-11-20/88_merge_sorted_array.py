class Solution:
    def merge(self, nums1: list[int], m: int, nums2: list[int], n: int) -> None:
        reverse_cursor1, reverse_cursor2 = m-1, n-1
        for right in range(m+n-1, -1, -1):
            if reverse_cursor2 < 0:
                break
            elif reverse_cursor1 >= 0 and nums1[reverse_cursor1] > nums2[reverse_cursor2]:
                nums1[right] = nums1[reverse_cursor1]
                reverse_cursor1 -= 1
            else:
                nums1[right] = nums2[reverse_cursor2]
                reverse_cursor2 -= 1


class TestSolution:
    def __init__(self):
        self.solution = Solution()

    def test_all(self):
        members = (m for m in dir(self) if not m.startswith('__'))
        for member in members:
            if member != 'test_all' and callable(getattr(self, member)):
                getattr(self, member)()

    def test_case1(self):
        nums1, nums2 = [1, 2, 3, 0, 0, 0], [4, 5, 6]
        m, n = len(nums1) - len(nums2), len(nums2)
        expected_result = [1, 2, 3, 4, 5, 6]

        self.solution.merge(nums1, m, nums2, n)

        assert nums1 == expected_result

    def test_case2(self):
        nums1, nums2 = [4, 5, 6, 0, 0, 0], [1, 2, 3]
        m, n = len(nums1) - len(nums2), len(nums2)
        expected_result = [1, 2, 3, 4, 5, 6]

        self.solution.merge(nums1, m, nums2, n)

        assert nums1 == expected_result

    def test_case3(self):
        nums1, nums2 = [1, 1, 1, 0, 0, 0], [1, 2, 3]
        m, n = len(nums1) - len(nums2), len(nums2)
        expected_result = [1, 1, 1, 1, 2, 3]

        self.solution.merge(nums1, m, nums2, n)

        assert nums1 == expected_result

    def test_case4(self):
        nums1, nums2 = [0, 0, 0, 0, 0, 0], [1, 2, 3]
        m, n = len(nums1) - len(nums2), len(nums2)
        expected_result = [0, 0, 0, 1, 2, 3]

        self.solution.merge(nums1, m, nums2, n)

        assert nums1 == expected_result

    def test_case5(self):
        nums1, nums2 = [1, 2, 3, 0, 0, 0], [0, 0, 0]
        m, n = len(nums1) - len(nums2), len(nums2)
        expected_result = [0, 0, 0, 1, 2, 3]

        self.solution.merge(nums1, m, nums2, n)

        assert nums1 == expected_result

    def test_case6(self):
        nums1, nums2 = [1], []
        m, n = len(nums1) - len(nums2), len(nums2)
        expected_result = [1]

        self.solution.merge(nums1, m, nums2, n)

        assert nums1 == expected_result

    def test_case7(self):
        nums1, nums2 = [0], [1]
        m, n = len(nums1) - len(nums2), len(nums2)
        expected_result = [1]

        self.solution.merge(nums1, m, nums2, n)

        assert nums1 == expected_result

    def test_case8(self):
        nums1, nums2 = [], []
        m, n = len(nums1) - len(nums2), len(nums2)
        expected_result = []

        self.solution.merge(nums1, m, nums2, n)

        assert nums1 == expected_result

    def test_case9(self):
        nums1, nums2 = [-1, 0, 2, 3, 0, 0, 0], [-1, 2, 3]
        m, n = len(nums1) - len(nums2), len(nums2)
        expected_result = [-1, -1, 0, 2, 2, 3, 3]

        self.solution.merge(nums1, m, nums2, n)

        assert nums1 == expected_result


if __name__ == '__main__':
    TestSolution().test_all()
