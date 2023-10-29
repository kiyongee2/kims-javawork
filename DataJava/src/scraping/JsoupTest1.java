package scraping;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupTest1 {

	public static void main(String[] args) {
		
		try {
			//url
			String url = "https://www.naver.com";
			
			//Jsoup의 Connection 객체 생성
			Connection conn = Jsoup.connect(url);
			
			//웹 페이지 가져와서 객체 생성
			Document doc = conn.get();
			//System.out.println(doc.html());
			
			Elements elements = doc.select(".shortcut_list > li > a");
			
			for(Element element : elements) {
				String menu = element.select("span.service_name").text();
				//String menu = element.selectFirst("span.service_name").text();
				System.out.println(menu);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
