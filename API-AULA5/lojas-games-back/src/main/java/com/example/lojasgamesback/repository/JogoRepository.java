package com.example.lojasgamesback.repository;
import com.example.lojasgamesback.model.Jogo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JogoRepository extends JpaRepository<Jogo, Integer> {

}
