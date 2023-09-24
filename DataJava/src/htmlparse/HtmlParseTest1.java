package htmlparse;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class HtmlParseTest1 {

	public static void main(String[] args) {
		//1.원하는 정보가 있는 HTML 페이지에 접속하기
		try {
			//Jsoup의 Connection 객체 생성
			Connection con = Jsoup.connect("https://finance.naver.com/sise/sise_rise.naver");
		//2. 접속한 페이지의 모든 response하는 데이터를 Jsoup이 제공하는 Document 객체로 변환
			Document document = con.get();
			if(document != null) {
				//3. Jsoup의 Element(html 태그 노드)를 받아 오기
				Elements elements = document.select("table[class='type_2']>tbody>tr");
				//System.out.println(elements.size());
				int size = elements.size();
				for(int i=0; i<size; i++) {
					Element tag = elements.get(i);
					System.out.println(tag.text());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
