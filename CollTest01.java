// 뉴렉처
// 자바 컬렉션과 제네릭 강의 05 - Object 콜렉션으로 변경하기
// 02에서 자료형 Object로 변경한 상태

class ObjectList
{
	private Object[] nums;
	private int current;

	public ObjectList()
	{
		nums = new Object[3];
		current = 0;
	}
	public void add(Object num)
	{
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

	public Object get(int index)
	{
		if (current <= index)  
			System.out.println("입력한 갯수와 같거나 큰 인덱스 값은 전달할 수 없습니다.");
		return nums[index];
	}	
}

public class CollTest01
{	
	public static void main(String[] args)
	{
		ObjectList list = new ObjectList();
		list.add("hello");
		list.add(5);
		int size = list.size();
		System.out.printf("size : %d\n", size);
		

		list.clear();
		size = list.size();
		System.out.printf("size : %d\n", size);
		

		list.add(7);
		int num = (Integer)list.get(0);
		System.out.printf("num : %d\n", num);
		// Object → int 형 변환이 필요함
		// (Integer) 해주면 됨 
		// Object의 문제점
		// ① 범용 자료형이다보니 모든 자료형을 다 담는 건 좋지만
		//    어떤 자료형이 담겨있는지 알 수 없고, 
		// ② 알아도 형변환을 해줘야하는 번거로움이 있음
		
		size = list.size();
		System.out.printf("size : %d\n", size);
		
	}
}