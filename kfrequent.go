import "container/heap"

func topKFrequent(nums []int, k int) []int {
	m := make(map[int]int)
	for _, n := range nums {
		m[n]++
	}
    
	q := SortedQueue{}
	for key, count := range m {
		heap.Push(&q, &Item{key: key, count: count})
	}
	var result []int
	for len(result) < k {
		item := heap.Pop(&q).(*Item)
		result = append(result, item.key)
	}
	return result
}

type Item struct {
	key   int
	count int
}

type SortedQueue []*Item

func (pq SortedQueue) Len() int {
	return len(pq)
}

func (pq SortedQueue) Less(i, j int) bool {
	return pq[i].count > pq[j].count
}

func (pq SortedQueue) Swap(i, j int) {
	pq[i], pq[j] = pq[j], pq[i]
}

func (pq *SortedQueue) Push(x interface{}) {
	item := x.(*Item)
	*pq = append(*pq, item)
}

func (pq *SortedQueue) Pop() interface{} {
	n := len(*pq)
	item := (*pq)[n-1]
	*pq = (*pq)[:n-1]
	return item
}
