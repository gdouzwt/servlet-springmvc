package io.zwt.servlet.app06a;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.JspTag;
import javax.servlet.jsp.tagext.SimpleTag;
import java.io.IOException;

public class MyFirstTag implements SimpleTag {
    JspContext jspContext;

    public void doTag() throws IOException {
        System.out.println("doTag");
        jspContext.getOut().print("This is my first tag.");
    }

    public void setParent(JspTag parent) {
        System.out.println("setParent");
    }

    public JspTag getParent() {
        System.out.println("getParent");
        return null;
    }

    public void setJspContext(JspContext jspContext) {
        System.out.println("setJspContext");
        this.jspContext = jspContext;
    }

    public void setJspBody(JspFragment body) {
        System.out.println("setJspBody");
    }
}
