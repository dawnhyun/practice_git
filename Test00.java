class IntList
{
	private int[] nums;
	private int current;

	public IntList()
	{
		nums = new int[3];
		current = 0; //1, 2
	}
	public void add(int num)
	{
		nums[current] = num;
		current++;
	}

	public void clear()
	{
		/*for (int i=0; i<current; i++)
			 nums[i] = 0;*/

		// nums = new int[3]; 새롭게 만들면 기존 배열은 가비지 컬렉터가 가져가니까

		current = 0; // 값을 덮어쓰니까 0으로 초기화해주면 돼
	}

	public int size()
	{
		return current;
	}

	public int get(int index)
	{
		if (current <= index)  // current는 사용자가 추가한 횟수가 되니까 3번 추가하면 인덱스는 0, 1, 2까지
			System.out.println("입력한 갯수보다 큰 인덱스 값은 전달할 수 없습니다.");
		return nums[index];
	}
	
}

public class Test00
{	
	public static void main(String[] args)
	{
		IntList list = new IntList();
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
	}
}