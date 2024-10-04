package com.pmh.ex10.freeboard;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface FreeBoardRepository extends JpaRepository<FreeBoard,Long> {
    // select * from free_board_file where free_board_idx=?
    // List<FileEntity> findByFreeBoardIdx(long freeBoardIdx);


    // import 가 잘못 되어있드라구...

    @Modifying
    @Transactional
    @Query("delete from FreeBoard fb where fb.idx=:idx")
    void testDelete(@Param("idx") Long idx);

}