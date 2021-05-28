import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet(name = "GuessServlet", urlPatterns = "/guess")
public class GuessServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        req.getRequestDispatcher("/guess.jsp").forward(req, res);
    }
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
        int guess = Integer.parseInt(req.getParameter("guess"));
        int random = (int) Math.floor((Math.random() * 3) + 1);

        if (random == guess){
            req.getRequestDispatcher("correct.jsp").forward(req, res);
        }
        else {
            req.getRequestDispatcher("incorrect.jsp").forward(req, res);
        }
    }
}
