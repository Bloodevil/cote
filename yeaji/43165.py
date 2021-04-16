def solution(numbers, target):
    answer = 0
    number_size = len(numbers)
    if number_size == 1:
        if numbers[0] == target or numbers[0]*-1 == target:
            return 1
        else:
        	return 0
    answer += solution(numbers[1:], target+numbers[0])
    answer += solution(numbers[1:], target-numbers[0])
    return answer
