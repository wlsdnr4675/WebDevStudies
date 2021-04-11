package soo.md.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import soo.md.domain.Board;
import soo.md.mapper.BoardMapper;
import soo.md.page.pagination;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardMapper boardMapper;

	@Override
	public List<Map<String,Object>> listS(pagination cri) {
		// TODO Auto-generated method stub
		return boardMapper.boardList(cri);
	}

	@Override
	public Board readS(long seq) {
		// TODO Auto-generated method stub
		return boardMapper.boardRead(seq);
	}

	@Override
	public void insertS(Board board) {
		// TODO Auto-generated method stub
		boardMapper.boardInsert(board);
		
	}

	@Override
	public void updateS(Board board) {
		// TODO Auto-generated method stub
		
		boardMapper.boardUpdate(board);
	}

	@Override
	public void deleteS(long seq) {
		// TODO Auto-generated method stub
		boardMapper.boardDelete(seq);
	}

	@Override
	public int countBoardListTotal() {
		// TODO Auto-generated method stub
		return boardMapper.countBoardList();
		
	}
	
	

}
