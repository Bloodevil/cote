from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def deleteDuplicates(self, head: Optional[ListNode]) -> Optional[ListNode]:
        _head = head
        while _head and _head.next:
            _next = _head.next
            if _head.val == _next.val:
                _head.next = _next.next
                continue
            _head = _next
        return head


class TestSolution:
    def __init__(self):
        self.solution = Solution()

    def _generate_nodes(self, initial_values: list[int]):
        head = node = ListNode(0)
        for val in initial_values:
            node.next = ListNode(val)
            node = node.next
        return head.next

    def _assert_node_values(self, node: ListNode, expected_values: list[int]):
        actual_values, _node, count = [], node, 0
        while _node:
            if count > len(expected_values):
                raise Exception('Error - Found cycle in the ListNode')
            actual_values.append(_node.val)
            _node = _node.next
            count += 1
        assert actual_values == expected_values

    def test_all(self):
        results = []
        members = (
            m for m in dir(self) if not m.startswith('_') and not m.startswith('__')
        )

        for member in members:
            test_method = getattr(self, member)
            if member != 'test_all' and callable(test_method):
                try:
                    test_method()
                    results.append(f'Test:: {member} -- Success')
                except Exception as e:
                    results.append(f'Test:: {member} -- Failed : {e}')

        for result in results:
            print(result)
        print('All tests are done.')

    def test_case1(self):
        initial_values, expected_values = [1, 1, 2], [1, 2]
        head = self._generate_nodes(initial_values=initial_values)

        result = self.solution.deleteDuplicates(head=head)
        self._assert_node_values(node=result, expected_values=expected_values)

    def test_case2(self):
        initial_values, expected_values = [1, 1, 2, 3, 3], [1, 2, 3]
        head = self._generate_nodes(initial_values=initial_values)

        result = self.solution.deleteDuplicates(head=head)
        self._assert_node_values(node=result, expected_values=expected_values)

    def test_case3(self):
        initial_values, expected_values = [], []
        head = self._generate_nodes(initial_values=initial_values)

        result = self.solution.deleteDuplicates(head=head)
        self._assert_node_values(node=result, expected_values=expected_values)

    def test_case4(self):
        initial_values, expected_values = [1], [1]
        head = self._generate_nodes(initial_values=initial_values)

        result = self.solution.deleteDuplicates(head=head)
        self._assert_node_values(node=result, expected_values=expected_values)

    def test_case5(self):
        initial_values, expected_values = [-1, -1, 0, 0, 1, 1], [-1, 0, 1]
        head = self._generate_nodes(initial_values=initial_values)

        result = self.solution.deleteDuplicates(head=head)
        self._assert_node_values(node=result, expected_values=expected_values)

    def test_case6(self):
        initial_values, expected_values = [1] * 1000000, [1]
        head = self._generate_nodes(initial_values=initial_values)

        result = self.solution.deleteDuplicates(head=head)
        self._assert_node_values(node=result, expected_values=expected_values)


if __name__ == '__main__':
    TestSolution().test_all()
