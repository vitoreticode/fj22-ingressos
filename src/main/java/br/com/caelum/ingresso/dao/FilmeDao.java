package br.com.caelum.ingresso.dao;

import br.com.caelum.ingresso.model.Filme;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by nando on 03/03/17.
 */
@Repository // define que a classe como pertencente a camada de persistencia
public class FilmeDao {

    @PersistenceContext // local onde ficam armazenados os objetos/entidades que estão sendo manipulados pelo entity manager
    private EntityManager manager; // responsavel pelo CRUD no BDD


    public Filme findOne(Integer id) {
        return manager.find(Filme.class, id);
    }

    public void save(Filme filme) {
        manager.persist(filme);
    }

    public List<Filme> findAll() {
        return manager.createQuery("select f from Filme f", Filme.class).getResultList();
    }

    public void delete(Integer id) {
        manager.remove(findOne(id));
    }
}
