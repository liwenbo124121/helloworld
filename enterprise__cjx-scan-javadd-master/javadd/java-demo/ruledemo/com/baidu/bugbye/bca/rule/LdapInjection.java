package rule;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;
import javax.naming.ldap.InitialLdapContext;
import javax.naming.ldap.LdapName;
import javax.servlet.http.HttpServletRequest;

import org.springframework.ldap.filter.AndFilter;
import org.springframework.ldap.filter.EqualsFilter;

public class LdapInjection {
    public String bad1(String username) throws NamingException {
        Properties props = new Properties();
        props.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
        props.put(Context.PROVIDER_URL, "ldap://ldap.example.com");
        props.put(Context.REFERRAL, "ignore");

        InitialDirContext context = new InitialDirContext(props);

        SearchControls ctrls = new SearchControls();
        ctrls.setReturningAttributes(new String[] {"givenName", "sn"});
        ctrls.setSearchScope(SearchControls.SUBTREE_SCOPE);

        NamingEnumeration<SearchResult>
                answers = context.search("dc=People,dc=example,dc=com", "(uid=" + username + ")", ctrls);
        SearchResult result = answers.next();

        return result.getNameInNamespace();
    }

    public void bad2(String input) throws NamingException {
        //Stub instances
        Properties props = new Properties();
        props.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
        props.put(Context.PROVIDER_URL, "ldap://ldap.example.com");
        props.put(Context.REFERRAL, "ignore");

        SearchControls ctrls = new SearchControls();
        ctrls.setReturningAttributes(new String[]{"givenName", "sn"});
        ctrls.setSearchScope(SearchControls.SUBTREE_SCOPE);

        InitialDirContext  context2 = new InitialDirContext(props);

        NamingEnumeration<SearchResult> answers;

        answers = context2.search(new LdapName("dc=People,dc=example,dc=com"), "(uid=" + input + ")", ctrls);
    }
    public void bad3(String input) throws NamingException {
        //Stub instances
        Properties props = new Properties();
        props.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
        props.put(Context.PROVIDER_URL, "ldap://ldap.example.com");
        props.put(Context.REFERRAL, "ignore");

        SearchControls ctrls = new SearchControls();
        ctrls.setReturningAttributes(new String[]{"givenName", "sn"});
        ctrls.setSearchScope(SearchControls.SUBTREE_SCOPE);

        InitialDirContext  context2 = new InitialDirContext(props);

        NamingEnumeration<SearchResult> answers;
        answers = context2.search(new LdapName("dc=People,dc=example,dc=com"), "(uid=" + input + ")", new Object[0], ctrls);
    }
    public void bad4(String input) throws NamingException {
        //Stub instances
        Properties props = new Properties();
        props.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
        props.put(Context.PROVIDER_URL, "ldap://ldap.example.com");
        props.put(Context.REFERRAL, "ignore");

        SearchControls ctrls = new SearchControls();
        ctrls.setReturningAttributes(new String[]{"givenName", "sn"});
        ctrls.setSearchScope(SearchControls.SUBTREE_SCOPE);

        InitialDirContext  context2 = new InitialDirContext(props);

        NamingEnumeration<SearchResult> answers;

        answers = context2.search("dc=People,dc=example,dc=com", "(uid=" + input + ")", ctrls);
    }
    public void bad5(String input) throws NamingException {
        //Stub instances
        Properties props = new Properties();
        props.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
        props.put(Context.PROVIDER_URL, "ldap://ldap.example.com");
        props.put(Context.REFERRAL, "ignore");

        SearchControls ctrls = new SearchControls();
        ctrls.setReturningAttributes(new String[]{"givenName", "sn"});
        ctrls.setSearchScope(SearchControls.SUBTREE_SCOPE);

        InitialDirContext  context2 = new InitialDirContext(props);

        NamingEnumeration<SearchResult> answers;

        answers = context2.search("dc=People,dc=example,dc=com", "(uid=" + input + ")", new Object[0], ctrls);
    }
    public void bad6(String input) throws NamingException {
        //Stub instances
        Properties props = new Properties();
        props.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
        props.put(Context.PROVIDER_URL, "ldap://ldap.example.com");
        props.put(Context.REFERRAL, "ignore");

        SearchControls ctrls = new SearchControls();
        ctrls.setReturningAttributes(new String[]{"givenName", "sn"});
        ctrls.setSearchScope(SearchControls.SUBTREE_SCOPE);

        InitialLdapContext context3 = new InitialLdapContext();

        NamingEnumeration<SearchResult> answers;

        answers = context3.search(new LdapName("dc=People,dc=example,dc=com"), "(uid=" + input + ")", ctrls);
    }
    public void bad7(String input) throws NamingException {
        //Stub instances
        Properties props = new Properties();
        props.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
        props.put(Context.PROVIDER_URL, "ldap://ldap.example.com");
        props.put(Context.REFERRAL, "ignore");

        SearchControls ctrls = new SearchControls();
        ctrls.setReturningAttributes(new String[]{"givenName", "sn"});
        ctrls.setSearchScope(SearchControls.SUBTREE_SCOPE);

        InitialLdapContext context3 = new InitialLdapContext();

        NamingEnumeration<SearchResult> answers;

        answers = context3.search(new LdapName("dc=People,dc=example,dc=com"), "(uid=" + input + ")", new Object[0], ctrls);
    }
    public void bad8(String input) throws NamingException {
        //Stub instances
        Properties props = new Properties();
        props.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
        props.put(Context.PROVIDER_URL, "ldap://ldap.example.com");
        props.put(Context.REFERRAL, "ignore");

        SearchControls ctrls = new SearchControls();
        ctrls.setReturningAttributes(new String[]{"givenName", "sn"});
        ctrls.setSearchScope(SearchControls.SUBTREE_SCOPE);

        InitialLdapContext context3 = new InitialLdapContext();

        NamingEnumeration<SearchResult> answers;

        answers = context3.search("dc=People,dc=example,dc=com", "(uid=" + input + ")", ctrls);
    }
    public void bad9(String input) throws NamingException {
        //Stub instances
        Properties props = new Properties();
        props.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
        props.put(Context.PROVIDER_URL, "ldap://ldap.example.com");
        props.put(Context.REFERRAL, "ignore");

        SearchControls ctrls = new SearchControls();
        ctrls.setReturningAttributes(new String[]{"givenName", "sn"});
        ctrls.setSearchScope(SearchControls.SUBTREE_SCOPE);

        InitialLdapContext context3 = new InitialLdapContext();

        NamingEnumeration<SearchResult> answers;

        answers = context3.search("dc=People,dc=example,dc=com", "(uid=" + input + ")", new Object[0], ctrls);
    }

    public void bad10(HttpServletRequest request) throws NamingException {
        Properties props = new Properties();
        props.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
        props.put(Context.PROVIDER_URL, "ldap://ldap.example.com");
        props.put(Context.REFERRAL, "ignore");

        SearchControls ctrls = new SearchControls();
        ctrls.setReturningAttributes(new String[]{"givenName", "sn"});
        ctrls.setSearchScope(SearchControls.SUBTREE_SCOPE);

        DirContext ctx = new InitialDirContext(props);
        String userName = request.getParameter("UserName");
        String password= request.getParameter("Password");
        NamingEnumeration employees = ctx.search("ou=People,dc=example,dc=com",
                "(&"+userName+password+")",ctrls);
    }

    public void good1(String userName) throws NamingException {
        Properties props = new Properties();
        props.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
        props.put(Context.PROVIDER_URL, "ldap://ldap.example.com");
        props.put(Context.REFERRAL, "ignore");

        SearchControls ctrls = new SearchControls();
        ctrls.setReturningAttributes(new String[]{"givenName", "sn"});
        ctrls.setSearchScope(SearchControls.SUBTREE_SCOPE);

        DirContext ctx = new InitialDirContext(props);
        AndFilter groupFilter = new AndFilter();
        groupFilter.and(new EqualsFilter("objectclass","groupOfNames"));
        groupFilter.and(new EqualsFilter("member","uid="+userName+",ou=users,o=packtPublisher"));
        NamingEnumeration<SearchResult> answers = ctx.search("dc=People,dc=example,dc=com", groupFilter.toString(), ctrls);
    }
}
