import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountCalculator", value = "/discount")
public class DiscountCalculator extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double price = Double.parseDouble(request.getParameter("price"));
        double percent = Double.parseDouble(request.getParameter("percent"));
        String description = request.getParameter("description");
        double discount = (price * percent * 0.01);

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h2>Description: " + description + "</h2>");
        writer.println("<h2>List Price: " + price + "</h2>");
        writer.println("<h2>Discount: " + discount + "</h2>");
        writer.println("</html>");
    }
}

