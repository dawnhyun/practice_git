// ����ó
// �ڹ� �÷��ǰ� ���׸� ���� 08 - �������� : ����ũ�� �÷������� �����ϱ�

class GList<T>
{
	private Object[] nums;
	private int current;
	private int capacity; // ó�� ��� �뷮
	private int amount;	  // �߰� ������ ī��Ʈ

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
		if (������ �������� Ȯ��)
		{
			������ �÷�����
		}
		1. amount�� Ȯ���� ���ο� �迭 temp�� �����Ѵ�.
		2. list�� �ִ� �����͸� temp �迭�� �ű��
		3. temp�� �����ϴ� ��ü�� list�� �����ϰ� �Ѵ�.
		4. ���� capacity�� ���� +amount ������Ų��.
		*/

		if (capacity <= current) // ������ ���ڶ� ��Ȳ
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
			System.out.println("�Է��� ������ ���ų� ū �ε��� ���� ������ �� �����ϴ�.");
		return (T)nums[index];
	}	
}

public class CollTest03
{	
	public static void main(String[] args)
	{
		GList<Integer> list = new GList<>();
		// <String, Integer> Ÿ���� �� �� �ѱ�� �͵� ����
		// ��� �⺻���� �Ұ���
		list.add(3);
		list.add(5);
		list.add(6);
		list.add(7);

		int size = list.size();
		System.out.printf("size : %d\n", size);

		for (int i=0; i<list.size(); i++)
			System.out.printf("%d,", list.get(i));
		// add() �ȿ� ����ũ��� �������ִ� ���ǹ��� ���� ���� ArrayIndexOutOfBoundsException �߻�
		// ������ �� ���� �־ ����! = �÷����� Ư¡	
	}
}