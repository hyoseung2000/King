package com.king.backend.domain.cast.repository;

import com.king.backend.domain.cast.entity.CastKo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CastKoRepository extends JpaRepository<CastKo, Long> {
}
