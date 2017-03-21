package kr.co.jhta.model2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class FrontControllerServlet extends HttpServlet{
	
	private static Logger logger = Logger.getLogger(FrontControllerServlet.class);
	
	private ApplicationContext context = null;
	
	@Override
	public void init() throws ServletException {
		logger.info("초기화작업 시작");
		String resources = "classpath:/META-INF/spring/applicationContext.xml";
		context = new GenericXmlApplicationContext(resources);
		logger.info("스프링컨테이너 생성 완료");
		logger.info("초기화 작업 완료");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		long startTime = System.currentTimeMillis();
		String url = req.getRequestURI().replace(req.getContextPath(), "");
		logger.debug("["+url+"]요청에 대한 처리 시작");
		logger.info("요청url["+url+"]");
		
		try {
			
			Controller controller = (Controller) context.getBean(url);
			logger.info("요청을 처리할 컨트롤러의 이름:" + controller.getClass().getName());
			String path = controller.exec(req);
			logger.info("이동할 경로: " + path);
			
			
			if (path.startsWith("redirect:")){
				path = path.replaceAll("redirect:", "");
				res.sendRedirect(path);
			}else {
				req.getRequestDispatcher("WEB-INF/views/"+path).forward(req, res);
			}
			logger.debug("["+url+"]요청에 대한 처리 완료");
			long endTime = System.currentTimeMillis();
			logger.info("["+url+"]요청처리에 걸린 시간: " + (endTime - startTime)+"ms");
		} catch (Exception e) {
			logger.error("["+url+"]요청 처리중 에러발생",e);
			throw new ServletException(e);
		}
		
		
		
	}
}
