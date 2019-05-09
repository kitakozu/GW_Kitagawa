package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Session3Servlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//セッションオブジェクトの有無を確認
		HttpSession session =req.getSession(false);

		//あればセッションを終了する
		if(session!=null) {
			session.invalidate();
		}

		//以下、htmlの設定
		resp.setContentType("text/html;charset=Windows-31J");
		PrintWriter out=resp.getWriter();

		out.println("<html>");
		out.println("<head><title>Session Servlet 3</title></head>");
		out.println("<body>");
		out.println("<h1>Session Servlet 3</h1>");
		out.println("<p>セッションを終了しました</p>");
		out.println("</body>");
		out.println("</html>");
	}
}
