package hiberjpaaven.dao;

import hiberjpaaven.model.AreaModel;

public class AreaDAO extends Conexao{
	public void salvar(AreaModel area) 
	{
		getEntityManager().getTransaction().begin();
		getEntityManager().persist(area);
		getEntityManager().getTransaction().commit();
	}
	public void editar(AreaModel area)
	{
		getEntityManager().getTransaction().begin();
		getEntityManager().merge(area);
		getEntityManager().getTransaction().commit();
	}
	
	public void remover()
	{
		
	}
	
	public void buscar()
	{
		
	}
	
	public void buscarTodos()
	{
		
	}
}
