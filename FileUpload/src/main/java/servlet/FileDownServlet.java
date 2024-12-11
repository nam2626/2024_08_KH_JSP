package servlet;

import java.io.IOException;
import java.io.File;
import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FileDownServlet
 */
@WebServlet("/fileDown.do")
public class FileDownServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FileDownServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//다운받을 파일의 게시글 번호, 파일번호 
		int bno = Integer.parseInt(request.getParameter("bno"));
		String fno = request.getParameter("fno");
		// ... 차후에 테이블에서 전송할 파일 경로를 받아옴
		String path = "c:\\fileupload\\1.webp";
		
		File file = new File(path);
		response.setHeader("Content-Disposition",
				"attachement;fileName="+file.getName());
		response.setHeader("Content-Transfer-Encoding", "binary");
		response.setContentLength((int)file.length());
		
		//스트림을 이용해서 파일을 읽어서, 클라이언트에게 전송
		try(FileInputStream fis = new FileInputStream(file);
			BufferedOutputStream bos 
						= new BufferedOutputStream(response.getOutputStream())){
			byte[] buffer = new byte[1024 * 1024];
			while(true) {
				int size = fis.read(buffer);
				if(size == -1) break;
				bos.write(buffer,0,size);
				bos.flush();
			}
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
