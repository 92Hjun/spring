package kr.co.jhta.blog.view;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.AbstractView;

import com.google.gson.Gson;

@Component
public class JsonView extends AbstractView {

	@Override
	protected void renderMergedOutputModel(Map<String, Object> model, HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		
		Object data = model.get("data");
		Gson gson = new Gson();
		String text = gson.toJson(data);
		
		
		res.setContentType("application/json;charset=utf-8");
		res.getWriter().write(text);
		
		
	}
}
