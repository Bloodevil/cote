def parseChat(chat, user_data):
    """
    input : "{Enter/Leave} {uid} {nickname}" || "{Change}" {uid}"
    output : cmd, uid, updated user_data
    """
    splitted_chat = r.split(' ')
    cmd, uid = splitted_chat[0], splitted_chat[1]
    
    if len(splitted_chat) == 3:
        user_data[uid] = splitted_chat[2]
    return cmd, uid

def solution(record):
    answer = []
    user_data = {}
    for r in record:
        cmd, uid = parseChat(r, user_data)
        #[TODO]. merge enter and change. 
        if cmd == "Enter":
            answer.append([uid, "님이 들어왔습니다."])
        elif cmd == "Leave":
            answer.append([uid, "님이 나갔습니다."])
    result = []
    for a in answer:
        result.append(user_data[a[0]]+a[1])
    return result
