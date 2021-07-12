package com.quanglv.repository;

import com.quanglv.domain.FileStorages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilesStoragesRepository extends JpaRepository<FileStorages, String> {
}
