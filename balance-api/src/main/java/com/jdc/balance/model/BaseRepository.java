package com.jdc.balance.model;

import com.jdc.balance.api.output.PageInfo;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@NoRepositoryBean
public interface BaseRepository<T, ID> extends JpaRepository<T, ID> {

    <R> Page<R> search(Function<CriteriaBuilder, CriteriaQuery<R>> queryFunction,
                       Function<CriteriaBuilder, CriteriaQuery<Long>> countFunction, int page, int size);

    <R> List<R> search(Function<CriteriaBuilder, CriteriaQuery<R>> queryFunction);

    <R> Optional<R> searchOne(Function<CriteriaBuilder, CriteriaQuery<R>> queryFunction);

    Long count(Function<CriteriaBuilder, CriteriaQuery<Long>> queryFunction);
}
