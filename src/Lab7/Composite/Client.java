package Lab7.Composite;

public class Client {

    public static void main(String[] args) {

        Component htmlPage = new Composite();
        Component html = new Composite("<HTML>");
        htmlPage.addComponent(html);

        Component head = new Composite("<HEAD>");
        html.addComponent(head);
        head.addComponent(new Leaf("<TITLE>Your Title Here</TITLE>"));

        Component body = new Composite("<BODY>");
        html.addComponent(body);

        body.addComponent(new Leaf("CENTER><IMG SRC=\"clouds.jpg\" > </CENTER>"));
        body.addComponent(new Leaf("<a href=\"http://somegreatsite.com\">Link Name</a>"));
        body.addComponent(new Leaf("<H1>This is a Header</H1>"));
        body.addComponent(new Leaf("<H2>This is a Medium Header</H2>"));
        body.addComponent(new Leaf("<B>This is a new paragraph!</B>"));
        body.addComponent(new Leaf("<B><I>This is a new sentence without a paragraph break, in bold italics.</I></B>"));

        html.paint();

    }

}
