def solution(brown, yellow):
    vertical = 3
    total = brown + yellow
    while total/vertical >= vertical:
        if total%vertical != 0:
            vertical += 1
            continue
        if ((vertical-2)*((total/vertical)-2) == yellow) and (vertical*(total/vertical) == total):
            return [(total/vertical), vertical]
        vertical += 1
    return []
