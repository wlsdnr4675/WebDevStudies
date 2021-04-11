package soo.md.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import soo.md.domain.Board;
import soo.md.page.pagination;


@Repository
public interface BoardMapper {
	
	
	List<Map<String,Object>> boardList(pagination cri);
	Board boardRead(long seq);
	void boardInsert(Board board);
	void boardUpdate(Board board);
	void boardDelete(long seq);
	int countBoardList();
}
