def solution(prices):
    answer = [0]*len(prices)
    stack = [0]
    for i in range(1,len(prices)):
        while stack and prices[stack[-1]] > prices[i]:
            prev = stack[-1]
            answer[prev] = i-prev
            stack.pop()
        stack.append(i)
    for sec in stack:
        answer[sec] = i - sec
    return answer
