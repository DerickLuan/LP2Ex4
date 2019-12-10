package hiberjpaaven.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "professor")
@PrimaryKeyJoinColumn(name = "idpessoa")
public class ProfessorModel extends PessoaModel implements Serializable{
	private int siape;

	public int getSiape() {
		return siape;
	}

	public void setSiape(int siape) {
		this.siape = siape;
	}
	       
}
