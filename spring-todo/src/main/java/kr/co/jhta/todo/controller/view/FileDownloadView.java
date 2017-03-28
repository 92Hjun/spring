package kr.co.jhta.todo.controller.view;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.AbstractView;

@Component
public class FileDownloadView extends AbstractView{
	
	@Override
	protected void renderMergedOutputModel(Map<String, Object> model, HttpServletRequest req, HttpServletResponse res)throws Exception {
		
		String filename = (String) model.get("filename");
		String directory = (String) model.get("directory");
		
		res.setContentType("application/octet-stream");
		res.setHeader("Content-Disposition", "attachment;filename=" +URLEncoder.encode(filename ,"utf-8"));
		
		// 응답객체의 outputStream은 웹서버에서 브라우저 데이터를 보내는 스트림이다.
		OutputStream out = res.getOutputStream();
		
		
		IOUtils.copy(new FileInputStream(new File(directory, filename)), out);
		
	}
}
