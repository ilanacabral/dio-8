package br.diolabs.shoppingcard.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import lombok.Getter;
import lombok.Setter;

@RedisHash("item")
@Getter
@Setter
public class Item {

    @Id
    private Integer idProduto;

    private Integer quantidade;

    
}
