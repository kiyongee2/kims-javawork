package exchangeconvert;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class ExchangeRate{
    public static void main(String[] args) {
        try {
            // 환율 정보를 크롤링할 웹페이지 URL
            String url = "https://finance.naver.com/marketindex/";

            // Jsoup을 사용하여 웹페이지를 가져옵니다.
            Document doc = Jsoup.connect(url).get();

            // 환율 정보가 있는 HTML 요소를 선택합니다. 이 부분은 웹페이지의 구조에 따라 다를 수 있습니다.
            Elements exchangeRateElements = doc.select(".data_lst li");

            for (Element element : exchangeRateElements) {
                // 환율 정보를 추출하고 출력합니다.
                //String currency = element.select("span.blind").text();
            	//String rate = element.selectFirst("span.value").text();
            	
                String currency = element.selectFirst("span.blind").text();
                String[] currencyName = currency.split(" ");
                //System.out.println(currencyName[1]);
                
                String rate = element.selectFirst("span.value").text();

                System.out.print(currencyName[1] + ":" + rate);
                System.out.println();
                if(currencyName[1].equals("CNY")) break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

