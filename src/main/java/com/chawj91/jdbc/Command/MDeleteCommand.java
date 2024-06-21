package com.chawj91.jdbc.Command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.chawj91.jdbc.Dao.MemberDao;

public class MDeleteCommand implements MCommand {

	@Override
	public int execute(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String mid = request.getParameter("mid");		
		
		MemberDao memberDao = new MemberDao();
		
		int success = memberDao.deleteMember(mid);
		
		return success;
	}

}
