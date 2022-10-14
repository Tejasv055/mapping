package com.example.demo.persistence;

import com.example.demo.domain.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface ModelRepo<T extends Model> extends JpaRepository<T,Long> {

}
