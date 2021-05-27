import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        //turn request body into map of key-value pairs
        Map<String, String[]> map = req.getParameterMap();

        //check if they input the correct admin info
        if (map.get("email")[0].equals("admin") && map.get("password")[0].equals("password")){
            res.sendRedirect("profile.jsp");
        }
        else res.getWriter().println("You are not an admin.");
    }
}
