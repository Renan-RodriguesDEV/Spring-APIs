package spring.application.ninja.services;

import java.util.List;

import org.springframework.stereotype.Service;

import spring.application.ninja.models.Produto;
import spring.application.ninja.repositories.ProdutoRepository;

@Service
public class ProdutoService {
    private ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public Produto saveProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    public List<Produto> findAllProdutos() {
        return produtoRepository.findAll();
    }

    public Produto findByID(Long id) {
        return produtoRepository.getReferenceById(id);
    }
}
