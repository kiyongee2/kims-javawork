package scraping;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class ExchangeRate {
    public static void main(String[] args) {
        try {
            // 환율 정보를 크롤링할 웹페이지 URL
        	String url = "https://finance.naver.com/marketindex/";

            // Jsoup을 사용하여 웹페이지를 가져옴
            Document document = Jsoup.connect(url).get();

            if(document != null) {
	            // 환율 정보가 있는 HTML 요소를 선택. 
	            //Elements contents = document.select(".data_lst li");
	            Elements contents = document.select("ul[class='data_lst'] li");
	            //System.out.println(contents.text());
	            
	            for (Element element : contents) {
	                // 환율 정보를 추출하고 출력함
	                //String currency = element.select("span.blind").text();
	                //String rate = element.select("span.blind").text();
	     
	            	//String rate = element.selectFirst("span.value").text();
	                String currency = element.selectFirst("span.blind").text();
	                String[] currencyName = currency.split(" ");
	                //System.out.println(currencyName[1]);
	                
	                String rate = element.selectFirst("span.value").text();
	
	                System.out.print(currencyName[1] + ":" + rate);
	                //System.out.print(currency + ":" + rate);
	                System.out.println();
	                if(currencyName[1].equals("CNY")) break;
	            }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

