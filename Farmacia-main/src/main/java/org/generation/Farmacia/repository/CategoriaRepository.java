package org.generation.Farmacia.repository;

import java.util.List;

	@Repository
	public interface CategoriaRepository extends JpaRepository<Categoria , Long> {
	public List<Categoria> findAllByTituloContainingIgnoreCase(String titulo); 
}