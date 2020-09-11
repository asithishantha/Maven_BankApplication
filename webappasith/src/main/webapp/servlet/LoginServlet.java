import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String userName = request.getParameter("userName");
        String accountNumber = request.getParameter("accountNumber");
        String bankAmount = request.getParameter("bankAmount");
        //using request.getParameter , we can get user inputs from login form to this page.

        PrintWriter out = response.getWriter();

// this code block will display the user details to user.
        String title = "======!!!your information !!!======";
        String docType =
                "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";

        out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor = \"#f0f0f0\">\n" +
                "<div class=\"container\"><h1 align = \"center\">" + title + "</h1>\n" +
                "<ul>\n" +
                "  <li><b> User name</b>: "
                + request.getParameter("userName") + "\n" +
                "  <li><b>Account Number</b>: "
                + request.getParameter("accountNumber") + "\n" +
                "  <li><b>Bank Amount</b>: "
                + request.getParameter("bankAmount") + "\n" +
                "</ul>\n" );
        out.println("</div></body>" +
                "</html>");


        // java script onclick button , will redirect user to withdraw. jsp to do the withdraw operation.

        out.println("<button onclick=\"myFunction1()\">withdraw money</button>\n");

        out.println("<script>");
        out.println("function myFunction1() {");
        out.println("location.replace(\"http://localhost:8080/webappasith_war/withdraw.jsp\")");
        out.println("}");
        out.println("</script>");

        // java script onclick button , will redirect user to deposit.jsp to do the deposit operation.
        out.println("<button onclick=\"myFunction2()\">deposit money</button>\n");

        out.println("<script>");
        out.println("function myFunction2() {");
        out.println(" location.replace(\"http://localhost:8080/webappasith_war/depositamount.jsp\")");
        out.println("}");
        out.println("</script>");


        out.println("<style>");

                out.println(" .container {");
                out.println(" position: center;");

                out.println("  margin: 20px;");
                out.println("  max-width: 1400px;");
                out.println("   padding: 16px;");
                out.println("background-color: grey;");
                out.println("  }");

                out.println(" body {");
                out.println("    background-image: url('back.jpg');");
                out.println("   text-align: center;");
                out.println("  }");
                out.println("   </style>");

    }



    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
