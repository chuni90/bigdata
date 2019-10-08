package mms.svc;

import java.util.ArrayList;

import mms.model.MemberDTO;

public class MemberService {
	
	ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
	
	
	public MemberService() {
		list = new ArrayList<MemberDTO>();
		list.add(new MemberDTO("aaa", "1234", "lee", 34));
		list.add(new MemberDTO("bbb", "1234", "Jang", 52));
		list.add(new MemberDTO("ccc", "1234", "Kang", 44));
		list.add(new MemberDTO("ddd", "1234", "Lim", 12));
		list.add(new MemberDTO("eee", "1234", "Hong", 18));
	}
	
	public MemberDTO searchMemberById(String id) {
		MemberDTO dto = null;
		for(int i = 0; i < list.size(); i++) {
			if(id.equals(list.get(i).getId())) {
				dto = list.get(i);
				break;
			}
		}
		return dto;
	}
	
	
	public ArrayList<MemberDTO> showAllMember() {
		return list;
	}

	public void addMember(MemberDTO dto) {
		list.add(dto);
	}

	
}
