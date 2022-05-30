package kr.kcp.smartposweb.api.board.repository;


import kr.kcp.smartposweb.api.board.domain.entity.Board;
import kr.kcp.smartposweb.api.board.mapper.BoardMapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BoardRepository extends JpaRepository<Board, Integer>, BoardMapper {

    @Override
    Board save(Board member);

    @Override
    Optional<Board> findById(Integer id);

    @Override
    List<Board> findAll();

    @Override
    void deleteById(Integer id);
}
