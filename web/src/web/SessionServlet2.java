package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionServlet2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//html表示のための設定
		resp.setContentType("text/html;charset=Windows-31J");
		PrintWriter out = resp.getWriter();

		out.println("<html>");
		out.println("<head><title>Session Servlet 2</title></head>");
		out.println("<body>");
		out.println("<h1>Session Servlet 2</h1>");

		//セッション継続の確認
		//getSessionがfalseの時、
		//セッションを開始しているならそのセッションオブジェクトを
		//開始していないときはnullを返す
		HttpSession session = req.getSession(false);

		//オブジェクトがnullだった場合は開始していないことを表示
		if (session == null) {
			out.println("<p>セッションが開始されていません</p>");
			out.println("</body>");
			out.println("</html>");
			return;
		}

		//オブジェクトがあれば継続していることを表示
		out.println("<p>セッションが継続しています</p>");
		//セッションオブジェクト内のユーザー名をキーで指定して取り出す
		out.println("<p>"+session.getAttribute("loginUser")+"</p>");
		out.println("</body>");
		out.println("</html>");

	}
}
