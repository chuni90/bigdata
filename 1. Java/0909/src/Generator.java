/*어떤 자연수 n이 있을 때, d(n)을 n의 각 자릿수 숫자들과 n 자신을 더한 숫자라고 정의하자.

예를 들어

d(91) = 9 + 1 + 91 = 101
이 때, n을 d(n)의 제네레이터(generator)라고 한다. 위의 예에서 91은 101의 제네레이터이다.

어떤 숫자들은 하나 이상의 제네레이터를 가지고 있는데, 101의 제네레이터는 91 뿐 아니라 100도 있다. 
그런데 반대로, 제네레이터가 없는 숫자들도 있으며, 이런 숫자를 인도의 수학자 Kaprekar가 셀프 넘버(self-number)라 이름 붙였다.
예를 들어 1, 3, 5, 7, 9, 20, 31 은 셀프 넘버 들이다.

1 이상이고 5000 보다 작은 모든 셀프 넘버들의 합을 구하라.*/

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
