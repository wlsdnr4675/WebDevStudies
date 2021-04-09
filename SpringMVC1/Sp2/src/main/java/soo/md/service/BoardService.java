package soo.md.service;

import java.util.List;

import soo.md.domain.Board;

public interface BoardService {
	
	List<Board> listS();
	Board readS(long seq);
	void insertS(Board board);
	void updateS (Board board);
	void deleteS(long seq);
	
}
