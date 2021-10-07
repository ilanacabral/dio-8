package br.diolabs.shoppingcard.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import java.util.List;
import java.util.ArrayList;

@RedisHash("carrinho")
public class Carrinho {

    @Id
    private Integer id;

    private List<Item> itens;

    public Carrinho(Integer id) {
        this.id = id;
    }

    public Carrinho() {
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public List<Item> getItens() {
        if (itens == null){
            this.itens =  new ArrayList<>();
        }
        return this.itens;
    }

}
