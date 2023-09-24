package xmlparse;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

//건강보험심사평가원 약국정보 파싱하기
//url 요청 - xml 띄우기
public class OpenApiPharmacyTest2 {

	public static void main(String[] args) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			//파싱할 InputStream 생성
			//1. 웹 서비스를 제공하는 url에 연결해서 데이터 가져오기
			//1) 접속할 url 정보
			StringBuffer pharm_url = new StringBuffer();
			pharm_url.append("http://apis.data.go.kr/B551182/pharmacyInfoService/getParmacyBasisList");
			pharm_url.append("?ServiceKey=Kfh07Rkb5WAsh0TZ1baGNkuP6C3l78vhmJEz7uV9sZiUPOfVZ0sNo84Ay2m0kK1NTBrR4PC8IccsXZg%2B1v5OhQ%3D%3D");
			
			//2)웹 서버에 접속하기
			URL url = new URL(pharm_url.toString());
			//System.out.println(url.openStream());
			
			//3) 접속해서 response 되는 데이터 읽어 오기
			BufferedInputStream xmlData = new BufferedInputStream(url.openStream());
			Document document = builder.parse(xmlData);
			Element root = document.getDocumentElement();
			System.out.println(root.getTagName());
			
			NodeList nodeList = root.getElementsByTagName("item");
			System.out.println(nodeList.getLength());
			for(int i=0; i<nodeList.getLength(); i++) {
				Node node = nodeList.item(i);
				NodeList itemChildList = node.getChildNodes();
				for(int j=0; j<itemChildList.getLength(); j++) {
					Node itemChild = itemChildList.item(j);
					System.out.println(itemChild.getNodeName() + ":" + 
							itemChild.getTextContent());
				}
				System.out.println();
			}
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		}

	}

}
