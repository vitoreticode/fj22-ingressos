package br.com.caelum.ingresso.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.Duration;

/**
 * Created by nando on 03/03/17.
 */
@Entity // corresponde a tabela de mesmo nome no BDD
public class Filme {

    @Id // PK no BDD
    @GeneratedValue(strategy = GenerationType.IDENTITY) // info ao provedor de persistencia que os ID serão gerados pelo auto incrmento do BDD
    private Integer id;
    private String nome;
    private Duration duracao;
    private String genero;
    
    
    
    /**
     * @deprecated hibernate only
     */
    public Filme() {

    }
    
    public Filme(String nome, Duration duracao, String genero) {
		this.nome = nome;
		this.duracao = duracao;
		this.genero = genero;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Duration getDuracao() {
        return duracao;
    }

    public void setDuracao(long duracao) {
        this.duracao = Duration.ofMinutes(duracao);
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
