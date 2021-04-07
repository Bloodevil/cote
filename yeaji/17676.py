from datetime import datetime

def str_to_timestamp(s):
    str_split = s.split(" ")
    time = " ".join(str_split[:2])
    duration = float("".join(str_split[-1].replace('s', '')))
    dt = datetime.strptime(time, '%Y-%m-%d %H:%M:%S.%f')
    dtimestamp = datetime.timestamp(dt)*1000
    return int(dtimestamp), int(duration*1000)

def solution(lines):
    answer = 0
    if len(lines) == 1:
        return 1
    converted_lines = []
    for line in lines:
        ts, offset = str_to_timestamp(line)
        converted_lines.append((ts, offset))
    for i, line in enumerate(converted_lines):
        ts = line[0]
        a = 1
        for deal in converted_lines[i+1:]:
            d_ts, offset = deal[0], deal[1]
            if d_ts - ts - offset < 999:
                a+=1
            elif d_ts - ts - offset > 4000:
                break
        if a > answer:
            answer = a
    return answer
