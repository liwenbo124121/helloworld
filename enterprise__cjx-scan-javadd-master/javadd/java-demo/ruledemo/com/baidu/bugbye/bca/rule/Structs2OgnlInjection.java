package rule;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.util.TextProviderHelper;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.util.ValueStack;

public class Structs2OgnlInjection {
    public void bad1(HttpServletRequest request) {
        String name = request.getParameter("name");
        TextProviderHelper textProviderHelper = new TextProviderHelper();
        ValueStack stack = ActionContext.getContext().getValueStack();
        String username = textProviderHelper.getText(name,"default",stack);
    }

    public void bad2(HttpServletRequest request) {
        String name = request.getParameter("name");
        StringBuilder sb = new StringBuilder("123");
        sb.append(name);
        TextProviderHelper textProviderHelper = new TextProviderHelper();
        ValueStack stack = ActionContext.getContext().getValueStack();
        String username = textProviderHelper.getText(sb.toString(),"default",stack);
    }

    public void bad3(HttpServletRequest request){
        String name = request.getParameter("name");
        StringBuilder sb = new StringBuilder("123");
        sb.append(name);
        if (!verify(name)) {
            return;
        }
        TextProviderHelper textProviderHelper = new TextProviderHelper();
        ValueStack stack = ActionContext.getContext().getValueStack();
        String username = textProviderHelper.getText(sb.toString(),"default",stack);
    }

    public void good1(HttpServletRequest request){
        String name = request.getParameter("name");
        StringBuilder sb = new StringBuilder("123");
        if (!verify(name)) { // 校验放在使用之前生效
            return;
        }
        sb.append(name);
        TextProviderHelper textProviderHelper = new TextProviderHelper();
        ValueStack stack = ActionContext.getContext().getValueStack();
        String username = textProviderHelper.getText(sb.toString(),"default",stack);
    }

    private boolean verify(String aim){
        return true;
    }
}
