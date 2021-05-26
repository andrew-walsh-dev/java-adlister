import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet{
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        String name = req.getParameter("name");
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        if (name != null){
            out.println(String.format("<h1>Hello, %s</h1>",  name));
        }
        else out.println("<h1>Hello, World!</h1>");
    }
}
