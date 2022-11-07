package rule;

import ognl.Node;
import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;

public class OgnlInjectionCheck {
    public void good1(String name) throws OgnlException {
        String exp = null;
        if (name.equals("123")) {
            exp = name + "123";
        }
        // 解析表达式
        Object expression = Ognl.parseExpression(exp);
    }

    public void bad1(String exp) throws OgnlException {
        // 解析表达式
        Object expression = Ognl.parseExpression(exp);
    }

    public void bad2(String exp) throws Exception {

        Object root = new Object();
        OgnlContext context =  (OgnlContext) Ognl.createDefaultContext(null);

        Node node =  (Node) Ognl.compileExpression(context, root, exp);
    }

    public void bad3(String exp) throws OgnlException {
        Object root = new Object();
        // 解析表达式
        Object expression = Ognl.getValue(exp,root);
    }
}
