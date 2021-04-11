package soo.md.dao;

import java.util.List;
import java.util.Map;

import soo.md.domain.Board;
import soo.md.page.pagination;

public interface BoardDao {
	
	public List<Map<String, Object>> boardList(pagination cri);
	Board boardRead(long seq);
	void boardInsert(Board board);
	void Boardelete(long seq);
	void boardUpdate(Board board);
	int countBoardList();
}
