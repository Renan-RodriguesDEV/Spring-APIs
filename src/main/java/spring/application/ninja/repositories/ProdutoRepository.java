package spring.application.ninja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.application.ninja.models.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
