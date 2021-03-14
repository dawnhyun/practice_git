// 뉴렉처
// 자바 컬렉션과 제네릭 강의 08 - 연습문제 : 가변크기 컬렉션으로 변경하기

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
		/*
		if (공간이 부족한지 확인)
		{
			공간을 늘려야함
		}
		1. amount개 확장한 새로운 배열 temp를 생성한다.
		2. list에 있는 데이터를 temp 배열로 옮긴다
		3. temp가 참조하는 객체를 list가 참조하게 한다.
		4. 현재 capacity의 값을 +amount 증가시킨다.
		*/

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

public class CollTest03
{	
	public static void main(String[] args)
	{
		GList<Integer> list = new GList<>();
		// <String, Integer> 타입을 두 개 넘기는 것도 가능
		// 대신 기본형은 불가능
		list.add(3);
		list.add(5);
		list.add(6);
		list.add(7);

		int size = list.size();
		System.out.printf("size : %d\n", size);

		for (int i=0; i<list.size(); i++)
			System.out.printf("%d,", list.get(i));
		// add() 안에 가변크기로 변경해주는 조건문이 없을 때는 ArrayIndexOutOfBoundsException 발생
		// 있으면 몇 개를 넣어도 가능! = 컬렉션의 특징	
	}
}