/*� �ڿ��� n�� ���� ��, d(n)�� n�� �� �ڸ��� ���ڵ�� n �ڽ��� ���� ���ڶ�� ��������.

���� ���

d(91) = 9 + 1 + 91 = 101
�� ��, n�� d(n)�� ���׷�����(generator)��� �Ѵ�. ���� ������ 91�� 101�� ���׷������̴�.

� ���ڵ��� �ϳ� �̻��� ���׷����͸� ������ �ִµ�, 101�� ���׷����ʹ� 91 �� �ƴ϶� 100�� �ִ�. 
�׷��� �ݴ��, ���׷����Ͱ� ���� ���ڵ鵵 ������, �̷� ���ڸ� �ε��� ������ Kaprekar�� ���� �ѹ�(self-number)�� �̸� �ٿ���.
���� ��� 1, 3, 5, 7, 9, 20, 31 �� ���� �ѹ� ���̴�.

1 �̻��̰� 5000 ���� ���� ��� ���� �ѹ����� ���� ���϶�.*/

public class Generator {
	int moc, na1, na2, na3, self, sum=0;
	static int total=0;
	static int[] num_list = new int[5000];
	static int[] num_list2 = new int[5000];
	
	
	
//	public Generator(int x) {
//		if (x < 100) {
//		moc = x / 10;
//		na1 = x % 10;
//		self = x;
//		sum = moc + na1 + self;
//		System.out.println(sum);
//		} else if(x < 1000) {
//			moc = x / 100;
//			na1 = x % 10;
//			na2 = x % 100;
//			self = x;
//			sum = moc + na1 + na2 + self;
//			System.out.println(sum);
//		} 
//	}
//	
	public Generator(int x) {
			if (x < 10) {
				na1 = x;
				self = x;
				sum = na1 + self;
			}else if (x < 100) {
				moc = x / 10;
				na1 = x % 10;
				self = x;
				sum = moc + na1 + self;
			}else if(x < 1000) {
				moc = x / 100;
				na1 = x % 10;
				na2 = x % 100;
				self = x;
				sum = moc + na1 + na2 + self;
				
			} 
//		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		
//		Generator g = new Generator(100);
		
		for (int i=0; i<5000; i+=1) {
			Generator g = new Generator(i);
			num_list[i] = g.sum;
		}
		
		for	(int j=1; j<5000; j+=1) {
			num_list2[j-1] = j;
		}

		for (int ii = 0; ii<1000; ii+=1) {
			for	(int jj=0; jj<1000; jj+=1) {
				if(num_list[ii] == num_list2[jj]);
					total = total + num_list2[jj];
					System.out.println(num_list2[jj]);
			}
		}
//		System.out.println(total);
		
	}

}
