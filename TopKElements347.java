//347. Top K Frequent Elements

public class TopKElements347 {

    public static int[] topKFrequent(int[] nums, int k) {
    	if(nums.length==1) {
    		return nums;
    	}

      //해쉬 맵 형태로 {숫자:빈번도} 를 저장
    	//Map은 순서유지되지 않고 Key 중복 안됨
    	HashMap<Integer, Integer> kMap = new HashMap<Integer, Integer>();
    	int frequent = 1;
    	for(int i=0;i<nums.length;i++) {
    		//같은 키 값이 있다면 frequent 증가
    		if(kMap.get(nums[i])!=null) {
    			frequent++;
    		}else {
    			frequent=1;
    		}
    		kMap.put(nums[i], frequent);

    		//확인
    		System.out.println("nums[i]="+nums[i]+", frequent="+frequent);
    	}

    	Iterator<Integer> iter = kMap.keySet().iterator();

    	int [] output = new int [k];
    	int j=0;

    	while(iter.hasNext()) {
    		int key = iter.next();
    		int value = kMap.get(key);
    		System.out.println("key="+key+", value="+value);

    		//valueList에 value 값 정렬하기
    		output[j] = key;
    		Arrays.sort(output);
    	}

    	//value 값으로 정렬하면 꺼내도 value라서
    	//key값을 얻어오는 걸 고민해봐야함.

    	//k개 만큼만 'key'를 output에 담기

    	return output;
    }
}
