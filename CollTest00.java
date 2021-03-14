// ����ó
// �ڹ� �÷��ǰ� ���׸� ���� 02 - ������ �ݷ��� �����ϱ�

class IntList
{
	private int[] nums;
	private int current;

	public IntList()
	{
		nums = new int[3];
		current = 0; // add�� �߰��� ������ 1, 2
	}
	public void add(int num)
	{
		nums[current] = num;
		current++;
	}

	public void clear()
	{
		// clear ��� ��
		/*
		for (int i=0; i<current; i++)
			 nums[i] = 1;
		*/
		// 0���� ���� ����� [3][5] �� [0][0]
		

		// clear ��� ��
		//nums = new int[3];
		// ���Ӱ� ����� ���� �迭�� ������ �÷��Ͱ� ������
		// [0][0][0] new!

		// add�� ���� ���� �ʴ� �̻� size�� 0�� ������
		// add�ϰ� 1,2 ������� clear�ϸ� size�� add�� Ƚ���� ����(0�̶�� ���� �����ϴϱ�)


		current = 0;
		// current�� 0�� �Ǹ� size�� 0
	}

	public int size()
	{
		return current;
		// size�� �ᱹ �߰��� Ƚ��!(=current�� ����) 0, 1, 2 �� size=3
	}

	public int get(int index)
	{
		if (current <= index)  
			System.out.println("�Է��� ������ ���ų� ū �ε��� ���� ������ �� �����ϴ�.");
		return nums[index];
		
		//current�� ����ڰ� �߰��� Ƚ���� �Ǵϱ� 3�� �߰��ϸ� �ε����� 0, 1, 2����
		//current�� 0�̴�? �� �߰��� �ȵż� get���� ������ �� ����!
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
		get(int index) �޼ҵ� �� if���ǿ��� �����ϴ� ��
		current <= index
		   1    <=   0   
		*/
		size = list.size();
		System.out.printf("size : %d\n", size);
		//--==>> size : 1
	}
}