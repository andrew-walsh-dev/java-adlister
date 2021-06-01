import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PizzaServlet", urlPatterns = "/pizza-order")
public class PizzaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.sendRedirect("pizzaOrder.jsp");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String sauce = req.getParameter("sauce");
        String crust = req.getParameter("crust");
        String size = req.getParameter("size");
        boolean pepperoni = Boolean.parseBoolean(req.getParameter("pepperoni"));
        boolean pineapple = Boolean.parseBoolean(req.getParameter("pineapple"));
        boolean mushroom = Boolean.parseBoolean(req.getParameter("mushroom"));

        System.out.println("Sauce type: " + sauce);
        System.out.println("Crust type: " + crust);
        System.out.println("Size : " + size);
        System.out.println("Add pepperoni: " + pepperoni);
        System.out.println("Add pineapple: " + pineapple);
        System.out.println("Add mushroom: " + mushroom);
    }
}
