package com.sreejith824.foodforlife.producers.resource;

import com.sreejith824.foodforlife.producers.domain.Producer;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping (value = "v1/producer/")
public class ProducerResource {

    @PostMapping("/{producerShopId}")
    public Producer saveProducer(@RequestParam String producerShopId, @RequestBody Producer producer) {
        return  new Producer(producerShopId);
    }

    @GetMapping("/{producerShopId}")
    public Producer getProducer(@PathVariable String producerShopId) {
        return  new Producer(producerShopId);
    }


}
