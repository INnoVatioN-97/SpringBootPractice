package kr.mjc.youngil.web.model1.user;

import kr.mjc.youngil.web.dao.User;
import kr.mjc.youngil.web.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/model1/user/userList")
public class UserListServlet extends HttpServlet {
    @Autowired
    private UserDao userDao;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        List<User> userList = userDao.listUsers(0,100);
        out.println("<html><body><h3>사용자 목록</h3>");
        for(User user:userList) out.format("<p>%s</p>\n", user);
        out.println("</body></html>");
        out.close();
    }
}
