// 뉴렉처
// 자바 컬렉션과 제네릭 강의 10 - Set/List/Map 콜렉션
// tree 검색이 잦을 때
// linked 삽입, 삭제가 잦을 때 / 검색은 참조 값을 다 찾아가야해서 비효율적

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

class GList<T>
{
	private Object[] nums;
	private int current;
	private int capacity; // 처음 잡는 용량
	private int amount;	  // 추가 증가량 카운트

	public GList()
	{
		current = 0;
		capacity = 3;
		amount = 5;
		nums = new Object[capacity];
	}
	public void add(T num)
	{
		if (capacity <= current) // 공간이 모자란 상황
		{
			Object[] temp = new Object[capacity+amount];
			for (int i=0; i<current; i++)
				temp[i] = nums[i];
			nums = temp;
			capacity += amount; 
		}

		nums[current] = num;
		current++;
	}

	public void clear()
	{
		current = 0;
	}

	public int size()
	{
		return current;
	}

	public T get(int index)
	{
		if (current <= index)  
			System.out.println("입력한 갯수와 같거나 큰 인덱스 값은 전달할 수 없습니다.");
		return (T)nums[index];
	}	
}

public class CollTest04
{	
	public static void main(String[] args)
	{
		// 가변 길이의 데이터 타입 - List
		//GList<Integer> list = new GList<>();
		List<Integer> list = new ArrayList<>();
		list.add(3); // 인덱스 0
		list.add(5); // 인덱스 1
		list.add(6); // 인덱스 2
		list.add(7); // 인덱스 3
		list.add(7); // 인덱스 4
		list.add(7); // 인덱스 5
		System.out.print(list.get(5)); // 7
		System.out.print(list.size()); // 6
		

		// 중복을 제거하는 형태의 데이터 수집이 필요할 때 Set
		Set<Integer> set = new HashSet<>();
		set.add(3);
		set.add(5);
		set.add(6);
		set.add(7);
		set.add(7);
		set.add(7);
		System.out.print(set.add(7));
		// boolean 타입 - 기존에 있는 숫자면 f 없으면 t
		// 중복 제거할 때 용이함 ex.로또 랜덤 돌리고 중복 제거할 때
		System.out.print(set.size());
		// 4 - 중복 허용x


		// 클래스를 정의하지 않고 속성과 값으로 구분된 데이터 집합을 필요로 할 때
		Map<String, Object> map = new HashMap<>();
		map.put("id", 3);
		map.put("title", "Hello");// 오류 둘 다 담으려면 <String, Object>
		map.put("hit", 12);

		System.out.println(map.get("title"));
	}
}