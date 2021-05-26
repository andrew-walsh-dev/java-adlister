import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CounterServlet", urlPatterns = "/counter")
public class CounterServlet extends HttpServlet{
    private int count = 0;
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        if (req.getParameter("reset").equals("true")){
            this.count = 0;
        }
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println(++this.count);
    }
}
