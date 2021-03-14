// 뉴렉처
// 자바 컬렉션과 제네릭 강의 02 - 정수형 콜렉션 구현하기

class IntList
{
	private int[] nums;
	private int current;

	public IntList()
	{
		nums = new int[3];
		current = 0; // add로 추가할 때마다 1, 2
	}
	public void add(int num)
	{
		nums[current] = num;
		current++;
	}

	public void clear()
	{
		// clear 방법 ①
		/*
		for (int i=0; i<current; i++)
			 nums[i] = 1;
		*/
		// 0으로 값을 덮어쓰기 [3][5] → [0][0]
		

		// clear 방법 ②
		//nums = new int[3];
		// 새롭게 만들면 기존 배열은 가비지 컬렉터가 가져감
		// [0][0][0] new!

		// add로 값을 넣지 않는 이상 size는 0이 나오고
		// add하고 1,2 방법으로 clear하면 size는 add한 횟수로 나옴(0이라는 값이 존재하니까)


		current = 0;
		// current가 0이 되면 size도 0
	}

	public int size()
	{
		return current;
		// size는 결국 추가한 횟수!(=current의 개수) 0, 1, 2 → size=3
	}

	public int get(int index)
	{
		if (current <= index)  
			System.out.println("입력한 갯수와 같거나 큰 인덱스 값은 전달할 수 없습니다.");
		return nums[index];
		
		//current는 사용자가 추가한 횟수가 되니까 3번 추가하면 인덱스는 0, 1, 2까지
		//current가 0이다? → 추가가 안돼서 get으로 가져올 수 없다!
	}	
}

public class CollTest00
{	
	public static void main(String[] args)
	{
		IntList list = new IntList();
		list.add(3);
		list.add(5);
		int size = list.size();
		System.out.printf("size : %d\n", size);
		//--==>> size : 2

		list.clear();
		size = list.size();
		System.out.printf("size : %d\n", size);
		//--==>> size : 0

		list.add(7);
		int num = list.get(0);
		System.out.printf("num : %d\n", num);
		/*
		get(int index) 메소드 내 if조건에서 만족하는 값
		current <= index
		   1    <=   0   
		*/
		size = list.size();
		System.out.printf("size : %d\n", size);
		//--==>> size : 1
	}
}