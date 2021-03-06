package br.com.desbravador.repository;

import br.com.desbravador.entity.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * @author Daniel Queiroz
 */
@RepositoryRestResource(collectionResourceRel = "usuarios", path = "usuarios")
public interface UsuarioRepository extends PagingAndSortingRepository<Usuario, Integer> {

    List<Usuario> findByNome(@Param("nome") String nome);

    @Query("select u from Usuario u where u.id = :id")
    Usuario findById(@Param("id") Integer id);

}
