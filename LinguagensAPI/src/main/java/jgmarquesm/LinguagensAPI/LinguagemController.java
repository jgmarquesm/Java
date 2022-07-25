package jgmarquesm.LinguagensAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class LinguagemController {

    @Autowired
    private LinguagemRepository repositorio;

    @GetMapping("/linguagens")
    public List<Linguagem> obterLinguagens(){
        return repositorio.findAll();
    }

    @PostMapping("/linguagens")
    public Linguagem criarLinguagem(@RequestBody Linguagem linguagem){
        return repositorio.save(linguagem);
    }
}