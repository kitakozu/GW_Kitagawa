package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ThirdServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//送信されてくるパラメータのエンコーディングの指定
		req.setCharacterEncoding("UTF-8");
		//送信したパラメータの取得（文字列）
		//Third.htmlのnameと同様の名前で呼び出す
		String name=req.getParameter("name");
		String age=req.getParameter("age");
		String gender=req.getParameter("gender");
		String[] gengo= {
				req.getParameter("gengo1"),
				req.getParameter("gengo2"),
				req.getParameter("gengo3")
				};
		String hitokoto=req.getParameter("hitokoto");
		//以下、HTML形式で出力されるためのコード
		resp.setContentType("text/html; charset = UTF-8");
		PrintWriter out=resp.getWriter();

		out.println("<html>");
		out.println("<head>");
		out.println("<body>");

		out.println("<h2>確認画面</h2>");
		out.println("<h2>■お名前</h2>");
		out.println("<h3>　"+name+"</h3>");
		out.println("<h2>■年齢</h2>");
		out.println("<h3>　"+age+"</h3>");
		out.println("<h2>■性別</h2>");
		out.println("<h3>　"+gender+"</h3>");
		out.println("<h2>■興味のある言語</h2>");
		out.println("<h3>");
		for(int i=0;i<gengo.length;i++)
		{
			if(gengo[i]!=null)
			out.print("　"+gengo[i]);
		}
		out.println("</h3>");
		out.println("<h2>■何か一言</h2>");
		out.println("<h3>　"+hitokoto+"</h3>");

		out.println("</body>");
		out.println("</head>");
		out.println("</html>");

		out.close();

	}

}
