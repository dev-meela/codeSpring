package org.zerock.mapper;

import java.util.List;

import org.zerock.domain.BoardAttachVO;

public interface BoardAttachMapper {

	public void insert(BoardAttachVO vo);
	
	public void delete(String uuid);
	
	public List<BoardAttachVO> findByBno(Long bno);  // 게시물 번호로 첨부파일을 찾음
	
	public void deleteAll(Long bno);
	
	public List<BoardAttachVO> getOldFiles();
}
