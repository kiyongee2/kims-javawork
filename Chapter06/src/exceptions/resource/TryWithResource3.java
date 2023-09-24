package exceptions.resource;

public class TryWithResource3 {

	public static void main(String[] args) throws Exception {
		//try ~ with ~ resource 구문 : close()를 사용하지 않음
		//콘솔 확인 - [닫기] 실행됨
		try(MyResource res1 = new MyResource("res1")) {
			System.out.println(Integer.parseInt(res1.read1()));
			System.out.println(Integer.parseInt(res1.read2()));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
