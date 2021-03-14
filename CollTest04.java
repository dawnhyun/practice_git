// ����ó
// �ڹ� �÷��ǰ� ���׸� ���� 10 - Set/List/Map �ݷ���
// tree �˻��� ���� ��
// linked ����, ������ ���� �� / �˻��� ���� ���� �� ã�ư����ؼ� ��ȿ����

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

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

public class CollTest04
{	
	public static void main(String[] args)
	{
		// ���� ������ ������ Ÿ�� - List
		//GList<Integer> list = new GList<>();
		List<Integer> list = new ArrayList<>();
		list.add(3); // �ε��� 0
		list.add(5); // �ε��� 1
		list.add(6); // �ε��� 2
		list.add(7); // �ε��� 3
		list.add(7); // �ε��� 4
		list.add(7); // �ε��� 5
		System.out.print(list.get(5)); // 7
		System.out.print(list.size()); // 6
		

		// �ߺ��� �����ϴ� ������ ������ ������ �ʿ��� �� Set
		Set<Integer> set = new HashSet<>();
		set.add(3);
		set.add(5);
		set.add(6);
		set.add(7);
		set.add(7);
		set.add(7);
		System.out.print(set.add(7));
		// boolean Ÿ�� - ������ �ִ� ���ڸ� f ������ t
		// �ߺ� ������ �� ������ ex.�ζ� ���� ������ �ߺ� ������ ��
		System.out.print(set.size());
		// 4 - �ߺ� ���x


		// Ŭ������ �������� �ʰ� �Ӽ��� ������ ���е� ������ ������ �ʿ�� �� ��
		Map<String, Object> map = new HashMap<>();
		map.put("id", 3);
		map.put("title", "Hello");// ���� �� �� �������� <String, Object>
		map.put("hit", 12);

		System.out.println(map.get("title"));
	}
}