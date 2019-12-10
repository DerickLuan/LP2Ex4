package hiberjpaaven.dao;

import java.util.List;

import hiberjpaaven.model.ProfessorModel;

public class ProfessorDAO extends Conexao{
	
	public void salvar(ProfessorModel professor) {
		getEntityManager().getTransaction().begin();
		getEntityManager().persist(professor);
		getEntityManager().getTransaction().commit();
	}
	
	public void editar(ProfessorModel professor)
	{
		getEntityManager().getTransaction().begin();
		getEntityManager().merge(professor);
		getEntityManager().getTransaction().commit();
	}
	
	public void remover(ProfessorModel professor)
	{
		getEntityManager().getTransaction().begin();
		professor = entityManager.find(ProfessorModel.class, professor.getIdpessoa());
		getEntityManager().remove(professor);
		getEntityManager().getTransaction().commit();
	}
	
	public ProfessorModel buscarId(long id)
	{
		return entityManager.find(ProfessorModel.class, id);
	}
	
	public void buscar()
	{
		
	}
	
	@SuppressWarnings("unchecked")
	public List<ProfessorModel> buscarTodos()
	{
		 return entityManager.createQuery("FROM " + ProfessorModel.class.getName()).getResultList();
	}
}
