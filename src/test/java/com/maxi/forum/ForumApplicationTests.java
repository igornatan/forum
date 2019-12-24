package com.maxi.forum;

import com.maxi.forum.controller.dto.DetailsTopicoDto;
import com.maxi.forum.models.Curso;
import com.maxi.forum.models.Topico;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ForumApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void testDetaisl() {
        Topico topico = new Topico("Duvida", "Nao sei", new Curso("Spring", "Programação"));
        DetailsTopicoDto detailsTopicoDto = new DetailsTopicoDto(topico);
    }

}
