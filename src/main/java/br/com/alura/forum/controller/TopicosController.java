package br.com.alura.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.controller.Dto.TopicoDto;
import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;

@RestController
public class TopicosController {
    
    @RequestMapping("/topicos")
    public List<TopicoDto> lista(){
        Topico topico = new Topico("Duvida", "Duvida com Spring Boot", new Curso("Spring Boot", "Programaçao"));
        return TopicoDto.converter(Arrays.asList(topico));

    }
}
