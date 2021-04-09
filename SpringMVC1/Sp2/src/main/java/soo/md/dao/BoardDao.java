package soo.md.dao;

import java.util.List;

import soo.md.domain.Board;

public interface BoardDao {
	List<Board> boardList();
	Board boardRead(long seq);
	void boardInsert(Board board);
	void Boardelete(long seq);
	void boardUpdate(Board board);
}
