// ����ó
// �ڹ� �÷��ǰ� ���׸� ���� 06 - Generic �̶�
// �ڷ��� �κ��� ������� ���ø��� ����� �����Ͽ��� �ʿ��� �ڷ����� ���ϸ� ��Ƽ� �ϼ����ִ� ��
// ���� �ְ� ���� �κп��� ����ڰ� ������ �������� �ڹٰ� ��ȯ���ִ� ��

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
			System.out.println("�Է��� ������ ���ų� ū �ε��� ���� ������ �� �����ϴ�.");
		return (T)nums[index];
	}	
}

public class CollTest02
{	
	public static void main(String[] args)
	{
		GList<Integer> list = new GList<>();
		// <String, Integer> Ÿ���� �� �� �ѱ�� �͵� ����
		// ��� �⺻���� �Ұ���
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