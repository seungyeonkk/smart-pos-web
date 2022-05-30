package kr.kcp.smartposweb.api.board.domain.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "TB_BOARD")
@Entity
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "CONTENT")
    private String content;
}
