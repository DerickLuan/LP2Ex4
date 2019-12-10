package entrada;

import java.util.List;

import javax.swing.JOptionPane;

import hiberjpaaven.dao.AlunoDAO;
import hiberjpaaven.model.AlunoModel;

public class EntraAluno {
	public AlunoDAO alunoDao = new AlunoDAO();
	
	public AlunoModel salvar(AlunoModel aluno)
	{
		aluno.setNome(JOptionPane.showInputDialog("Nome:"));
		aluno.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade:")));
		aluno.setSexo(JOptionPane.showInputDialog("Sexo:"));
		aluno.setCpf(Integer.parseInt(JOptionPane.showInputDialog("CPF:")));
		aluno.setRa(Integer.parseInt(JOptionPane.showInputDialog("RA:")));
		
		return aluno;
	}
	
	public AlunoModel editar(AlunoModel aluno)
	{
		long id = Long.parseLong(JOptionPane.showInputDialog("ID:"));
		aluno = alunoDao.buscarId(id);
		aluno.setNome(JOptionPane.showInputDialog("Nome:"));
		aluno.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade:")));
		aluno.setSexo(JOptionPane.showInputDialog("Sexo:"));
		aluno.setCpf(Integer.parseInt(JOptionPane.showInputDialog("CPF:")));
		aluno.setRa(Integer.parseInt(JOptionPane.showInputDialog("RA:")));
		
		return aluno;
	}
	
	public AlunoModel remover(AlunoModel aluno)
	{
		long id = Long.parseLong(JOptionPane.showInputDialog("ID:"));
		aluno = alunoDao.buscarId(id);
		return aluno;
	}
	
	public String exibir(AlunoModel aluno)
	{
		aluno.setCpf(Long.parseLong(JOptionPane.showInputDialog("CPF:")));
		aluno = alunoDao.buscarCpf(aluno);
		
		String exibir = "Nome: " + aluno.getNome() + 
						"\nIdade: " + aluno.getIdade() + 
						"\nCPF: " + aluno.getCpf() + 
						"\nSexo: " + aluno.getSexo() + 
						"\nra: " + aluno.getRa();
		
		return exibir;
	}
	
	public String exibirTodos()
	{
		String lista = "";
		List<AlunoModel> alunos = alunoDao.buscarTodos();
		for(AlunoModel aluno : alunos) {
			String exibir = "Nome: " + aluno.getNome() + 
					" Idade: " + aluno.getIdade() + 
					" CPF: " + aluno.getCpf() + 
					" Sexo: " + aluno.getSexo() + 
					" ra: " + aluno.getRa() + "\n";
			lista = lista + exibir;
		}

		return lista;
	}
}
