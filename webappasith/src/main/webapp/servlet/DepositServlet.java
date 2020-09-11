import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class DepositServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String amount = request.getParameter("amount");
        String deposited = request.getParameter("deposited");


        int intAmount=Integer.parseInt(amount);
        int intDeposited=Integer.parseInt(deposited);


        PrintWriter out = response.getWriter();



        double balance= deposit(intAmount, intDeposited);
            out.println("<html>");
            out.println("<head>");
            out.println(" <style>");

            out.println(".container {");
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



            out.println("</head>");
            out.println("<body>>");
            out.println("<div class=\"container\">");


            out.println("<h1><b>successfully deposited!!!</b></h1>");

            out.println("<h1><b>your current balance is "+ balance+ "</b></h1>");

        out.println("<button onclick=\"myFunction3()\">withdraw again</button>\n");

        out.println("<script>");
        out.println("function myFunction3() {");
        out.println(" location.replace(\"http://localhost:8080/webappasith_war/withdraw.jsp\")");
        out.println("}");
        out.println("</script>");

        out.println("<button onclick=\"myFunction4()\">deposit again</button>\n");

        out.println("<script>");
        out.println("function myFunction4() {");
        out.println(" location.replace(\"http://localhost:8080/webappasith_war/depositamount.jsp\")");
        out.println("}");
        out.println("</script>");

        out.println("</div>");
            out.println("</body>");

            out.println("</html>");


    }

    public double deposit(double intAmount, double intDeposited) {
        double balance= intAmount + intDeposited;

        return balance;
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }


}
