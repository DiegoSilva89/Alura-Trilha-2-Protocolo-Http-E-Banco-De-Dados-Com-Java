package br.com.alura.loja.modelo;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "produtos") //Para o JPA não considerar o nome da classe como nome da tabela
public class Produto {

    @Id //para informar que este será a chave primária do BD
    @GeneratedValue(strategy = GenerationType.SEQUENCE) //mostra como a chave primária é gerada
    private Long id;
    private String nome;
    private String descricao; //@Column(name = "desc") Caso o nome da coluna fosse outro
    private BigDecimal preco;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
}
