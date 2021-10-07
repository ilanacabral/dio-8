package br.diolabs.shoppingcard.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.diolabs.shoppingcard.model.Carrinho;

@Repository
public interface CarrinhoRepository extends CrudRepository<Carrinho,Integer>{
    
}
