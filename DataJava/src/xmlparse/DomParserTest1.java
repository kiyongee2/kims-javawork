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

public class DomParserTest1 {

	public static void main(String[] args) {
		//parser를 만들어주는 factory 객체 생성
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		
		try {
			//xml 문서를 파싱할 수 있는 dom parser를 생성
			DocumentBuilder builder = factory.newDocumentBuilder();
			//xml 문서를 파싱해서 자바에서 쓸 수 있는 객체로 리턴해 줌
			Document document = builder.parse("src/xmlparse/dept.xml");
			System.out.println(document.toString());
			//root element - datalist 가져옴
			Element root = document.getDocumentElement();
			System.out.println(root.toString());
			System.out.println(root.getTagName());
			System.out.println(root.getFirstChild());
			
			NodeList list = root.getChildNodes();
			System.out.println("child 개수: " + list.getLength()); //공백 포함
			for(int i=0; i<list.getLength(); i++) {
				Node node = list.item(i);
				System.out.println("노드의 이름: " + node.getNodeName());
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
