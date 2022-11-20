package com.hq2145.hqpc.repository;

import com.hq2145.hqpc.entity.InstockAdjustment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface InstockAdjustmentRepository extends JpaRepository<InstockAdjustment, Long>, JpaSpecificationExecutor<InstockAdjustment> {
}