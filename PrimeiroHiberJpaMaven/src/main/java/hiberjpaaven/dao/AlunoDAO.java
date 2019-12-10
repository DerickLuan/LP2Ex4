package hiberjpaaven.dao;

import java.util.List;

import hiberjpaaven.model.AlunoModel;

public class AlunoDAO extends Conexao{
	
	public void salvar(AlunoModel aluno) {
		getEntityManager().getTransaction().begin();
		getEntityManager().persist(aluno);
		getEntityManager().getTransaction().commit();
	}
	
	public void editar(AlunoModel aluno)
	{
		getEntityManager().getTransaction().begin();
		getEntityManager().merge(aluno);
		getEntityManager().getTransaction().commit();
	}
	
	public void remover(AlunoModel aluno)
	{
		getEntityManager().getTransaction().begin();
		aluno = entityManager.find(AlunoModel.class, aluno.getIdpessoa());
		getEntityManager().remove(aluno);
		getEntityManager().getTransaction().commit();
	}
	
	public AlunoModel buscarId(long id)
	{
		return entityManager.find(AlunoModel.class, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<AlunoModel> buscarTodos()
	{
		 return entityManager.createQuery("FROM " + AlunoModel.class.getName()).getResultList();
	}
	
	public AlunoModel buscarCpf(AlunoModel aluno)
	{
		return (AlunoModel) entityManager.createQuery("FROM " + AlunoModel.class.getName() + " WHERE cpf = " + aluno.getCpf());
	}
}
