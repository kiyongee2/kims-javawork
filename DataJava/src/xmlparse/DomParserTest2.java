package xmlparse;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DomParserTest2 {

	public static void main(String[] args) {
		//parser를 만들어주는 factory 객체 생성
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		
		try {
			//xml 문서를 파싱할 수 있는 dom parser를 생성
			DocumentBuilder builder = factory.newDocumentBuilder();
			//xml 문서를 파싱해서 자바에서 쓸 수 있는 객체로 리턴해 줌
			Document document = builder.parse("src/xmlparse/dept.xml");

			//1. root element - datalist 가져옴
			Element root = document.getDocumentElement();
			System.out.println("root 엘리먼트의 태그명=>" + root.getTagName());
			
			//2. root element에서 dept 태그에 해당하는 엘리먼트만 추출
			NodeList deptlist = root.getElementsByTagName("dept");
			for(int i=0; i<deptlist.getLength(); i++) {
				Node deptnode = deptlist.item(i);
				System.out.println("노드명: " + deptnode.getNodeName());
				
				//3. deptnode의 하위 노드 추출하기
				NodeList deptnodeChildlist = deptnode.getChildNodes();
				for(int j=0; j<deptnodeChildlist.getLength(); j++) {
					Node deptnodeChildNode = deptnodeChildlist.item(j);
					//공백 노드 미포함 - 반복조건문(for~ if문)
					if(!deptnodeChildNode.getNodeName().equals("#text")) {
						System.out.println("dept 하위 노드명: " + deptnodeChildNode.getNodeName());
						System.out.println("dept 하위 텍스트 노드명: " + deptnodeChildNode.getTextContent());
						System.out.println("==========================================");
					}
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
