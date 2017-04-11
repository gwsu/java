
import java.io.File;
import java.util.Stack;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
/**
 * 
 * @author Rick
 * 
 */
public class SaxTest2 {
	public static void main(String[] args) throws Exception {
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser parser = factory.newSAXParser();
		parser.parse(new File("struts.xml"), new MyHandler2());
	}
}

class MyHandler2 extends DefaultHandler {
	private Stack<String> stack = new Stack<String>();

	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		System.out.println(qName+"-----------------startElement()----------------------");
		stack.push(qName);
		for (int i = 0; i < attributes.getLength(); i++) {
			String attrName = attributes.getQName(i);
			String attrValue = attributes.getValue(i);

			System.out.print(attrName + "=" + attrValue+"  ");
		}
		System.out.println();
	}

	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		System.out.println("------------------character()-----------------------");
		String tag = stack.peek();
	}

	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		System.out.println("------------------endElement()-----------------");
		stack.pop(); // 表示该元素已经解析完毕，需要从栈中弹出
	}
}
