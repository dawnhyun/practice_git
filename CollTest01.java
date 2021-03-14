// ����ó
// �ڹ� �÷��ǰ� ���׸� ���� 05 - Object �ݷ������� �����ϱ�
// 02���� �ڷ��� Object�� ������ ����

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
			System.out.println("�Է��� ������ ���ų� ū �ε��� ���� ������ �� �����ϴ�.");
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
		// Object �� int �� ��ȯ�� �ʿ���
		// (Integer) ���ָ� �� 
		// Object�� ������
		// �� ���� �ڷ����̴ٺ��� ��� �ڷ����� �� ��� �� ������
		//    � �ڷ����� ����ִ��� �� �� ����, 
		// �� �˾Ƶ� ����ȯ�� ������ϴ� ���ŷο��� ����
		
		size = list.size();
		System.out.printf("size : %d\n", size);
		
	}
}