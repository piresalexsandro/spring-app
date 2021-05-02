package br.com.alphapires.springBootDocker.contoller;

import br.com.alphapires.springBootDocker.domain.Sneaker;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sneakers")
public class SneakerController {

    @GetMapping
    public ResponseEntity<Sneaker> findSneaker(){

        System.out.println("Live Reload Server esta  funcionano!!!!");

        return ResponseEntity.ok().body(new Sneaker("Black Cement", "Air Jordan 3", 2018));

    }
}
