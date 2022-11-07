package rule;

import javax.servlet.http.HttpServletRequest;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ognl.OgnlValueStack;

public class OgnlInjectionCheck2 {
    public void bad1(HttpServletRequest request) {

        String exep = request.getParameter("exep");
        OgnlValueStack stack = (OgnlValueStack) ActionContext.getContext().getValueStack();
        String exep2 = exep;
        String string = stack.findString(exep2);
    }

    public void bad2(HttpServletRequest request) {

        String exep = request.getParameter("exep");
        OgnlValueStack stack = (OgnlValueStack) ActionContext.getContext().getValueStack();
        String exep2 = exep;
        Object value = stack.findValue(exep2);
    }

    public void good1(HttpServletRequest request) {

        String exep = request.getParameter("exep");
        OgnlValueStack stack = (OgnlValueStack) ActionContext.getContext().getValueStack();
        String exep2 = exep;
        if (exep2.equals("12")) {
            exep2 = exep + "2";
        }
        String string = stack.findString(exep2);
    }

    public void good2(HttpServletRequest request) {

        String exep = request.getParameter("exep");
        OgnlValueStack stack = (OgnlValueStack) ActionContext.getContext().getValueStack();
        String exep2 = exep;
        if (exep2.equals("12")) {
            exep2 = exep + "2";
        }
        Object value = stack.findValue(exep2);
    }
}
