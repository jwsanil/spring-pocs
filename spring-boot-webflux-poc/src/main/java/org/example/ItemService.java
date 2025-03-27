package org.example;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ItemService {

    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }


    public Flux<Product> getAllProducts(){

        return itemRepository.findAll();
    }

    public Mono<Product> getProductByid(String id){


        return itemRepository.findById(id);
        //save delete also same retrun types
    }
}
