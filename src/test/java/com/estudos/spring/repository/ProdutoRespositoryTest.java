package com.estudos.spring.repository;

import com.estudos.spring.model.Produto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ProdutoRespositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private ProdutoRepository produtoRepository;

    @Test
    public void whenFindByName_thenReturnEmployee() {
        // given
        Produto produto = Produto.builder().nome("Produto Teste").build();
        entityManager.persist(produto);
        entityManager.flush();

        // when
        Produto produtoEncontrado = produtoRepository.findByNome(produto.getNome());

        // then
        assertThat(produto.getNome())
                .isEqualTo(produtoEncontrado.getNome());
    }
}
