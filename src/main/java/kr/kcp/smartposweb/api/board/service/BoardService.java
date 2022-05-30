package kr.kcp.smartposweb.api.board.service;


import kr.kcp.smartposweb.api.board.domain.entity.Board;
import kr.kcp.smartposweb.api.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class BoardService {

    private BoardRepository borderRepository;

    @Autowired
    public BoardService(BoardRepository borderRepository) {
        this.borderRepository = borderRepository;
    }

    public void save( Board board ) {
        borderRepository.save( board) ;
    }

    public List<Board> findAll() {
       return borderRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));
    }

    public Optional<Board> findById( Integer id ) {
        return borderRepository.findById( id );
    }

    public void modify ( Board param ) {

        Optional<Board> foundBoard = borderRepository.findById( param.getId() );

        foundBoard.ifPresent( board -> {
            board.setTitle( param.getTitle() );
            board.setContent( param.getContent() );
        });

        borderRepository.save( param );
    }

    public void delete( Integer id ) {
        borderRepository.deleteById( id );
    }

}
