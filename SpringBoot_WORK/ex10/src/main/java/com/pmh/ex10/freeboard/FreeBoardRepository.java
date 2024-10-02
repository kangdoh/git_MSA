package com.pmh.ex10.freeboard;

import com.pmh.ex10.file.FileEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface FreeBoardRepository extends JpaRepository<FreeBoard,Long> {

    // select * from free_board_file where free_board_idx=?
//    List<FileEntity> findByFreeBoardIdx(long freeBoardIdx);


}
