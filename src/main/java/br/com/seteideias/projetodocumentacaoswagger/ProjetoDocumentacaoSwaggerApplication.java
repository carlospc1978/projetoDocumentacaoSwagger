package br.com.seteideias.projetodocumentacaoswagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ProjetoDocumentacaoSwaggerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjetoDocumentacaoSwaggerApplication.class, args);
    }

    @RequestMapping(value = "/inicio")
    public String inicio(){
        return "inicio da aplicacao";
    }

}
