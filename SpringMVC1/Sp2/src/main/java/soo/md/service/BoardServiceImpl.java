package soo.md.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import soo.md.domain.Board;
import soo.md.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardMapper boardMapper;

	@Override
	public List<Board> listS() {
		// TODO Auto-generated method stub
		return boardMapper.boardList();
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
	public Board updateS(long seq) {
		// TODO Auto-generated method stub
		
		return boardMapper.boardUpdate(seq);
	}

	@Override
	public void deleteS(long seq) {
		// TODO Auto-generated method stub
		boardMapper.boardDelete(seq);
	}
	
	

}
