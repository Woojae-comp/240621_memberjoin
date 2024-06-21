package com.chawj91.jdbc.Command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.chawj91.jdbc.Dao.*;

public class MJoinCommand implements MCommand {

	@Override
	public int execute(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String mid = request.getParameter("mid");
		String mpw = request.getParameter("mpw");
		String mname = request.getParameter("mname");
		String memail = request.getParameter("memail");
		
		MemberDao memberDao = new MemberDao();
		
		int success = memberDao.joinMember(mid, mpw, mname, memail);
		
		return success;
	}

}