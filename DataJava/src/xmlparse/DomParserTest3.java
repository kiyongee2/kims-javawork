package xmlparse;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DomParserTest3 {

	public static void main(String[] args) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse("src/xmlparse/dept.xml");
			Element root = document.getDocumentElement();
			
			NodeList deptlist = root.getElementsByTagName("dept");
			for(int i=0; i<deptlist.getLength(); i++) {
				Node deptnode = deptlist.item(i);
				System.out.print((i+1) + "번 노드, ");
				System.out.println("노드명: " + deptnode.getNodeName());
				
				//dept 엘리먼트 속성을 추출
				//Map 관리 - 속성명과 속성값을 저장
				//deptnode의 모든 속성 추출 - NameNodeMap으로 관리
				NamedNodeMap attrlist = deptnode.getAttributes();
				System.out.print(", dept 노드의 속성 개수=> " + attrlist.getLength());
				for(int j=0; j<attrlist.getLength(); j++) {
					Node attr = attrlist.item(j);
					System.out.println(", 속성명: " + attr.getNodeName() 
							+ "(" + attr.getNodeValue() + ")");
				}
			}
			
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
