package br.diolabs.shoppingcard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.diolabs.shoppingcard.service.CarrinhoService;

import br.diolabs.shoppingcard.model.*;
import java.util.List;

import javax.validation.Valid;

@RestController
@RequestMapping("/carrinho")
public class CarrinhoController {
    @Autowired
    private CarrinhoService carrinhoService;


    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Carrinho> listarTodos(){
        return carrinhoService.listarTodos();
    }



    @PostMapping("/{id}")    
    @ResponseStatus(HttpStatus.CREATED)
    public Carrinho salvar(@Valid @PathVariable Integer id, @Valid @RequestBody Item item){       
        return carrinhoService.salvarCarrinho(id,item);
    }
}
