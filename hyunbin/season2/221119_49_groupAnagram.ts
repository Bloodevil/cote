function groupAnagrams(strs: string[]): string[][] {
 const answer = new Array;
    
    if (strs.length === 1) {
        answer.push(strs);
        return answer;
    }
    
    // 요소를 split해서 순서대로 소팅한 배열을 만들어서 
    // 걔네들끼리 비교를 하는거야
    // 같으면 한 배열에 넣고 
    // 다르면 새 배열에 넣고
    const compareArr = new Array;
    
    for(let i=0; i<strs.length; i++){
        const tempArr = strs[i].split('');
        tempArr.sort();
        const tempStr = tempArr.join('');
        console.log(tempStr);
        compareArr.push(tempStr);
    }
    
    // compareArr.sort();
    console.log(compareArr); // 이러면 이제 순서대로 정렬 끝 
    // 여기서 몇 가지 요소인지 알 수 있음... 
    const doubleArr = new Array;
    for(let i=0; i<compareArr.length ; i++){
        // compareArr랑 strs랑 인덱스는 맞으니까
        // compareArr의 요소들로 비교해서 같으면 해당하는 strs의 인덱스를 넣어준다
        // answer의 요소에 이게 있는지 보고 없으면 추가해주는 식
    }
    return answer; 
}