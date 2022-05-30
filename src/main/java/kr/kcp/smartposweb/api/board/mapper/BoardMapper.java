package kr.kcp.smartposweb.api.board.mapper;

import kr.kcp.smartposweb.api.board.domain.entity.Board;

import java.util.List;
import java.util.Optional;

public interface BoardMapper {
    Board save(Board member);
    Optional<Board> findById(Integer id);
    List<Board> findAll();
}
