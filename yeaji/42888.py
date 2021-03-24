def solution(record):
    answer = []
    user_data = {}
    for r in record:
        split = r.split(' ')
        cmd = split[0]
        name = ""
        #[TODO]. merge enter and change. 
        if cmd == "Enter":
            uid, name = split[1], split[2]
            answer.append([uid, "님이 들어왔습니다."])
        elif cmd == "Leave":
            uid = split[1]
            answer.append([uid, "님이 나갔습니다."])
        else:
            uid, name = split[1], split[2]
        if name != "":
            user_data[uid] = name
    result = []
    for a in answer:
        result.append(user_data[a[0]]+a[1])
    return result
