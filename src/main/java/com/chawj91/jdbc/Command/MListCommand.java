package com.chawj91.jdbc.Command;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.chawj91.jdbc.Dao.*;
import com.chawj91.jdbc.dto.*;

public class MListCommand implements MCommand {
	@Override
	public int execute(Model model) {
		// TODO Auto-generated method stub
				
		MemberDao memberDao = new MemberDao();
		ArrayList<MemberDto> mDtos = memberDao.listMember();
		
		model.addAttribute("mDtos", mDtos);
		
		return 0;
	}
}
