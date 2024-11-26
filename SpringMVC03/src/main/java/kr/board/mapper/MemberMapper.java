package kr.board.mapper;

import org.apache.ibatis.annotations.Mapper;

import kr.board.entity.Member;

@Mapper
public interface MemberMapper {
	
	
	public Member registerCheck(String memID);
	public int register(Member m); //성공1, 실패0
	public Member memLogin(Member mvo); // 로그인체크
	public int memUpdate(Member mvo);
	public Member getMember(String memID);
	public void memProfileUpdate(Member mvo);
}
