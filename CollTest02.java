// 뉴렉처
// 자바 컬렉션과 제네릭 강의 06 - Generic 이란
// 자료형 부분을 비워놓은 템플릿을 만들고 컴파일에게 필요한 자료형을 말하면 담아서 완성해주는 것
// 값을 넣고 빼는 부분에서 사용자가 전달한 형식으로 자바가 변환해주는 것

class GList<T>
{
	private Object[] nums;
	private int current;

	public GList()
	{
		nums = new Object[3];
		current = 0;
	}
	public void add(T num)
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

	public T get(int index)
	{
		if (current <= index)  
			System.out.println("입력한 갯수와 같거나 큰 인덱스 값은 전달할 수 없습니다.");
		return (T)nums[index];
	}	
}

public class CollTest02
{	
	public static void main(String[] args)
	{
		GList<Integer> list = new GList<>();
		// <String, Integer> 타입을 두 개 넘기는 것도 가능
		// 대신 기본형은 불가능
		list.add(3);
		list.add(5);
		int size = list.size();
		System.out.printf("size : %d\n", size);
		

		list.clear();
		size = list.size();
		System.out.printf("size : %d\n", size);
		

		list.add(7);
		int num = list.get(0);
		System.out.printf("num : %d\n", num);
		
		size = list.size();
		System.out.printf("size : %d\n", size);
		
	}
}