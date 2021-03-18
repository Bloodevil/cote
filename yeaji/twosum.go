func twoSum(nums []int, target int) []int {
    i := 0
    for i < len(nums)-1{
        j := i+1
        for j <= len(nums)-1 {
            if nums[i] + nums[j] == target {
                return []int{i, j}
            }
            j++
        }
        i++
    }
    return []int{}
}
