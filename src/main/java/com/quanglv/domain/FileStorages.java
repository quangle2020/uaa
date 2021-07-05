package com.quanglv.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "file_storages")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FileStorages extends AbstractAuditingEntity {
    @Id
    @SequenceGenerator(name = "file_storage_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "file_storage_seq")
    @Column(name = "id", nullable = false)
    @NotNull
    private Long id;

    @Column(name = "path")
    private String path;

    @Column(name = "name")
    private String name;

    @Column(name = "storageDays")
    private Integer storage_days;

    @Column(name = "status")
    private String status;
}
