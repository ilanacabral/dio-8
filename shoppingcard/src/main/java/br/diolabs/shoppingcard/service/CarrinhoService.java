package br.diolabs.shoppingcard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.diolabs.shoppingcard.repository.CarrinhoRepository;
import br.diolabs.shoppingcard.model.Carrinho;
import br.diolabs.shoppingcard.model.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CarrinhoService {

    @Autowired
    private CarrinhoRepository carrinhoRepository;

    public Carrinho salvarCarrinho(Integer id, Item item) {

        Optional<Carrinho> optional = carrinhoRepository.findById(id);
        Carrinho car = null;
        if (optional.isPresent()) {
            car = optional.get();
        } else {
            car = new Carrinho(id);
        }       
        car.getItens().add(item);
        return carrinhoRepository.save(car);
    }

    public List<Carrinho> listarTodos() {
        List<Carrinho> lista = new ArrayList<>();

        carrinhoRepository.findAll().forEach(lista::add);

        return lista;
    }

}
