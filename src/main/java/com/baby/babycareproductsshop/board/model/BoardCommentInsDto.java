package com.baby.babycareproductsshop.board.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class BoardCommentInsDto {
    @JsonIgnore
    private int icomment;
    @JsonIgnore
    private int iuser;
    @Schema(title = "게시판 PK", description = "")
    private int iboard;
    @Schema(title = "댓글 내용", description = "")
    private String comment;
}
