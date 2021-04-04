def solution(scoville, K):
    answer = 0
    scoville.sort()

    for i, s in enumerate(scoville):
        if s >= K:
            scoville = scoville[:i+1]
            break
    
    while len(scoville) > 1:
        if scoville[0] < K:
            scoville[1] = scoville[0] + (scoville[1]*2)
            scoville = scoville[1:]
            scoville.sort()
            answer += 1
        else:
            return answer
    if scoville[0] >= K:
        return answer
    return -1
