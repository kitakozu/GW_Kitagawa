package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionServlet1 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//セッションを開始する
		HttpSession session=req.getSession(true);
		//セッションオブジェクトに情報を入れる
		//(ディクショナリ的なあれ)
		session.setAttribute("loginUser", "KnowledgeTaro");

		//以下、HTMLを表示させる為のプログラム
		resp.setContentType("text/html;charset=Windows-31J");
		PrintWriter out = resp.getWriter();

		out.println("<html>");
		out.println("<head><title>Session Servlet 1</title></head>");
		out.println("<body>");
		out.println("<h1>Session Servlet 1</h1>");
		out.println("<p>セッションを開始しました</p>");
		out.println("</body>");
		out.println("</html>");

	}

}
