package lambda.integer;

public class FuncInterfaceTest2 {

	public static void main(String[] args) {
		
		MyFuncInterface2 fi;
		
		//덧하기 계산
		fi = (x) -> {
			x = x + 10;
			System.out.println(x);
		};
		fi.method(10);
		
		fi = (x) -> System.out.println(x + 10);
		fi.method(10);
		
		//제곱수 계산
		fi = (n) -> System.out.println(n * n);
		fi.method(4);
	}
}
