import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProductDiscountCalculatorServlet",urlPatterns = "/discount")
public class ProductDiscountCalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String description = request.getParameter("description");
       double listPrice = Double.parseDouble(request.getParameter("price"));
       double discountPercent = Double.parseDouble(request.getParameter("percent"));

       Double discountAmount = listPrice * discountPercent / 100;
       Double discountPrice = listPrice - discountAmount;

       PrintWriter writer = response.getWriter();
       writer.println("<html>");
       writer.println("<p>Product Description : " + description + "</p>");
       writer.println("<p>List Price : " + listPrice + "</p>");
       writer.println("<p>Discount Percent : " + discountPercent + "</p>");
       writer.println("<p>Discount Amount : " + discountAmount + "</p>" );
       writer.println("<p>Discount Price : " + discountPrice + "</p>" );
       writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
