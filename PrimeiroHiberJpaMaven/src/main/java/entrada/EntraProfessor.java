package entrada;

import javax.swing.JOptionPane;

import hiberjpaaven.dao.ProfessorDAO;
import hiberjpaaven.model.ProfessorModel;

public class EntraProfessor {
	public ProfessorDAO professorDao = new ProfessorDAO();
	
	public ProfessorModel salvar(ProfessorModel professor) 
	{
		professor.setNome(JOptionPane.showInputDialog("Nome:"));
		professor.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade:")));
		professor.setSexo(JOptionPane.showInputDialog("Sexo:"));
		professor.setCpf(Integer.parseInt(JOptionPane.showInputDialog("CPF:")));
		professor.setSiape(Integer.parseInt(JOptionPane.showInputDialog("Siape:")));
		return professor;
	}
	
	public ProfessorModel editar(ProfessorModel professor) 
	{
		long id = Long.parseLong(JOptionPane.showInputDialog("ID:"));
		professor = professorDao.buscarId(id);
		professor.setNome(JOptionPane.showInputDialog("Nome:"));
		professor.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade:")));
		professor.setSexo(JOptionPane.showInputDialog("Sexo:"));
		professor.setCpf(Integer.parseInt(JOptionPane.showInputDialog("CPF:")));
		professor.setSiape(Integer.parseInt(JOptionPane.showInputDialog("Siape:")));
		return professor;
	}
	
	public ProfessorModel remover(ProfessorModel professor)
	{
		long id = Long.parseLong(JOptionPane.showInputDialog("ID:"));
		professor = professorDao.buscarId(id);
		
		return professor;
	}
}
