package xmlparse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class OpenApiPharmacyTest1 {
	public static void main(String[] args) throws IOException{
		StringBuilder urlBuilder =
				new StringBuilder("http://apis.data.go.kr/B551182/pharmacyInfoService/getParmacyBasisList");
		urlBuilder.append("?" + URLEncoder.encode("ServiceKey", "UTF-8") + "=Kfh07Rkb5WAsh0TZ1baGNkuP6C3l78vhmJEz7uV9sZiUPOfVZ0sNo84Ay2m0kK1NTBrR4PC8IccsXZg%2B1v5OhQ%3D%3D");
		urlBuilder.append("&" + URLEncoder.encode("ServiceKey", "UTF-8") + "=" + URLEncoder.encode("-", "UTF-8"));
		urlBuilder.append("&" + URLEncoder.encode("pageNo", "UTF-8") + "=" + URLEncoder.encode("1", "UTF-8"));
		
		URL url = new URL(urlBuilder.toString());
		HttpURLConnection conn = (HttpURLConnection)url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Content-type", "application/json");
		System.out.println("Response code: " + conn.getResponseCode());
		
		BufferedReader rd;
		if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
			rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		}else {
			rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
		}
		
		StringBuilder sb = new StringBuilder();
		String line;
		while((line = rd.readLine()) != null) {
			sb.append(line);
		}
		rd.close();
		conn.disconnect();
		System.out.println(sb.toString());
	}

}
