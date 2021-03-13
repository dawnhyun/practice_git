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

		// nums = new int[3]; ���Ӱ� ����� ���� �迭�� ������ �÷��Ͱ� �������ϱ�

		current = 0; // ���� ����ϱ� 0���� �ʱ�ȭ���ָ� ��
	}

	public int size()
	{
		return current;
	}

	public int get(int index)
	{
		if (current <= index)  // current�� ����ڰ� �߰��� Ƚ���� �Ǵϱ� 3�� �߰��ϸ� �ε����� 0, 1, 2����
			System.out.println("�Է��� �������� ū �ε��� ���� ������ �� �����ϴ�.");
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