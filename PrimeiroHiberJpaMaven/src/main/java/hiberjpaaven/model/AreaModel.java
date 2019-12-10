package hiberjpaaven.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import java.io.Serializable;

@Entity
@Table(name = "area")
public class AreaModel implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length = 40, nullable = false)
	private String descricao;
	
	
	public void setId(int id)
	{
		this.id = id;
	}
	public int getId()
	{
		return id;
	}
	public void setDescricao(String descricao)
	{
		this.descricao = descricao;
	}
	public String getDescricao()
	{
		return descricao;
	}
}