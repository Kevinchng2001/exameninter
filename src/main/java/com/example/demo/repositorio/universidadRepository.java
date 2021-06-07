package com.example.demo.repositorio;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.modelo.UNIVERSIDAD;
 

public interface universidadRepository extends JpaRepository<UNIVERSIDAD, Integer> {

	
	UNIVERSIDAD findByCedula(String cedula);

	List<UNIVERSIDAD> findByNombreLike(String nombre);

	List<UNIVERSIDAD> findByNombreAndApellido(String nombre, String apellido);

	List<UNIVERSIDAD> findByNombre(String nombre);

	// JPQL
	@Query("select p from Persona p where p.nombre =  :nombre")
	List<UNIVERSIDAD> buscarPorNombres(@Param("nombre") String nombre);

	@Query("select p from Persona p where p.apellido = :apellido")
	List<UNIVERSIDAD> buscarPorApellido(@Param("apellido") String apellido);

	@Query("select p from Persona p where p.apellido = :apellido and p.nombre = :nombre")
	List<UNIVERSIDAD> buscarPorApellidoYnombre(@Param("apellido") String apellido, @Param("nombre") String nombre);
	
	@Query("select p from Persona p where p.apellido like :nombre")
	List<UNIVERSIDAD> buscarPorNombreLike(@Param("nombre") String nombre);
	
}
