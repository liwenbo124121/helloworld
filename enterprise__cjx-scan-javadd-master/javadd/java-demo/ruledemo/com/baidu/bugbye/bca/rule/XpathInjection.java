package rule;

import static javax.xml.xpath.XPathConstants.STRING;

import java.io.IOException;
import java.util.Iterator;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XpathInjection {
    public void bad1 (String id) throws XPathExpressionException {
        String query = null;
        StringBuilder sb = new StringBuilder("/id='");
        sb.append(id);
        sb.append("']");
        query = sb.toString();
        XPathFactory factory = XPathFactory.newInstance();
        XPath xpath = factory.newXPath();
        XPathExpression expr = xpath.compile(query);
    }
    public static Node bad2(Node node, String xpathString)
            throws XPathExpressionException {

        final XPathFactory factory = XPathFactory.newInstance();
        final XPath xpath = factory.newXPath();

        final XPathExpression expr = xpath.compile(xpathString);
        return (Node) expr.evaluate(node, XPathConstants.NODE);
    }

    private String bad3(
            final Element element,
            final XPath xpath,
            final String tagName
    ) throws XPathExpressionException {
        return (String) xpath.evaluate(tagName + "/text()", element, STRING);
    }

    public static void bad4(String exp, Element dom) throws XPathExpressionException {
        XPath xpath = XPathFactory.newInstance().newXPath();
        XPathExpression expUserTask = xpath.compile(exp);
        final NodeList nodeList = (NodeList) expUserTask.evaluate(dom, XPathConstants.NODESET);
    }

    public void good1 (String id) throws XPathExpressionException {
        String query = null;
        StringBuilder sb = new StringBuilder("/id='");
        try {
            int uid = Integer.parseInt(id);
            sb.append(uid);
            sb.append("']");
            query = sb.toString();
            XPathFactory factory = XPathFactory.newInstance();
            XPath xpath = factory.newXPath();
            XPathExpression expr = xpath.compile(query);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
