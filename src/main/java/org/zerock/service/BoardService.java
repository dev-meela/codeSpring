package org.zerock.service;

import java.util.List;

import org.zerock.domain.BoardVO;

public interface BoardService {
	
	public void register(BoardVO board);
	
	public BoardVO get(Long bno);  // 반환해야 할 데이터가 있는 메서드는 리턴타입을 지정
	
	public boolean modify(BoardVO board);
	
	public boolean remove(Long bno);
	
	public List<BoardVO> getList();  // 반환해야 할 데이터가 있는 메서드는 리턴타입을 지정
}
