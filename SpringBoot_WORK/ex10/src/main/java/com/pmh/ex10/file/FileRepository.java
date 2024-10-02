package com.pmh.ex10.file;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FileRepository extends JpaRepository<FileEntity,Long> {

    List<FileEntity> findByFreeBoardIdx(Long idx);
}
