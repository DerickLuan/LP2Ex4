package hiberjpaaven;

import javax.swing.JOptionPane;

import entrada.EntraAluno;
import entrada.EntraArea;
import entrada.EntraProfessor;
import hiberjpaaven.dao.AlunoDAO;
import hiberjpaaven.dao.AreaDAO;
import hiberjpaaven.dao.ProfessorDAO;
import hiberjpaaven.model.AlunoModel;
import hiberjpaaven.model.AreaModel;
import hiberjpaaven.model.ProfessorModel;

public class Principal {
	public static boolean op = true;
	public static AlunoDAO alunoDao = new AlunoDAO();
	public static EntraAluno entraAluno = new EntraAluno();
	
	public static ProfessorDAO professorDao = new ProfessorDAO();
	public static EntraProfessor entraProfessor = new EntraProfessor();
	
	public static AreaDAO areaDao = new AreaDAO();
	public static EntraArea entraArea = new EntraArea();
	
	public static void main(String[] args) {
			
		while(op)
		{
			String opcao = JOptionPane.showInputDialog(null, "[1] - Aluno\n[2] - Professor\n[3] - Area\n[4] - Curso\n[0] - Sair", "Menu Principal", JOptionPane.INFORMATION_MESSAGE);

			switch(opcao)
			{
				case "1":
				{
					Aluno();
				}
				break;
				case "2":
				{
					Professor();
				}
				break;
				case "3":
				{
					Area();
				}
				break;
				case "4":
				{
					
				}
				break;
				case "0":
				{
					JOptionPane.showMessageDialog(null, "Saindo...");
					op = false;
				}
				break;
				default: JOptionPane.showMessageDialog(null, "Opção invalida!");
			}//switch
		}//while
	}
	
	public static void Aluno()
	{
		boolean sw = true;
		
		while(sw)
		{
			String opcao = JOptionPane.showInputDialog(null, "[1] - Salvar\n[2] - Editar\n[3] - Remover\n[4] - Exibir\n[5] - Exibir Todos\n[0] - Sair", "Menu Principal", JOptionPane.INFORMATION_MESSAGE);
			switch(opcao)
			{
				case "1":
				{
					AlunoModel aluno = new AlunoModel();
					aluno = entraAluno.salvar(aluno);
					alunoDao.salvar(aluno);
				}
				break;
				case "2":
				{
					AlunoModel aluno = new AlunoModel();
					aluno = entraAluno.editar(aluno);
					alunoDao.editar(aluno);
				}
				break;
				case "3":
				{
					AlunoModel aluno = new AlunoModel();
					aluno = entraAluno.remover(aluno);
					alunoDao.remover(aluno);
				}
				break;
				case "4":
				{
					AlunoModel aluno = new AlunoModel();
					String exibir = entraAluno.exibir(aluno);
					JOptionPane.showMessageDialog(null, exibir);
				}
				break;
				case "5":
				{
					String exibir = entraAluno.exibirTodos();
					JOptionPane.showMessageDialog(null, exibir);
				}
				break;
				case "0":
				{
					JOptionPane.showMessageDialog(null, "Saindo...");
					sw = false;
				}
				break;
				default: JOptionPane.showMessageDialog(null, "Opção invalida!");
			} //switch
		}//while
	}//aluno
	
	public static void Professor()
	{
		boolean sw = true;
		String opcao = JOptionPane.showInputDialog(null, "[1] - Salvar\n[2] - Editar\n[3] - Remover\n[5] - Exibir\n[6] - Exibir Todos\n[0] - Sair", "Menu Principal", JOptionPane.INFORMATION_MESSAGE);
		
		while(sw)
		{
			switch(opcao)
			{
				case "1":
				{
					ProfessorModel professor = new ProfessorModel();
					professor = entraProfessor.salvar(professor);
					professorDao.salvar(professor);
				}
				break;
				case "2":
				{
					ProfessorModel professor = new ProfessorModel();
					professor = entraProfessor.editar(professor);
					professorDao.editar(professor);
				}
				break;
				case "3":
				{
					ProfessorModel professor = new ProfessorModel();
					professor = entraProfessor.remover(professor);
					professorDao.remover(professor);
				}
				break;
				case "4":
				{
					
				}
				break;
				case "5":
				{
					
				}
				break;
				case "0":
				{
					JOptionPane.showMessageDialog(null, "Saindo...");
					sw = false;
				}
				break;
				default: JOptionPane.showMessageDialog(null, "Opção invalida!");
			} //switch
		}//while
	}//aluno
	
	public static void Area()
	{
		boolean sw = true;
		String opcao = JOptionPane.showInputDialog(null, "[1] - Salvar\n[2] - Editar\n[3] - Remover\n[5] - Exibir\n[6] - Exibir Todos\n[0] - Sair", "Menu Principal", JOptionPane.INFORMATION_MESSAGE);
		
		while(sw)
		{
			switch(opcao)
			{
				case "1":
				{
					AreaModel area = new AreaModel();
					area = entraArea.salvar(area);
					areaDao.salvar(area);
				}
				break;
				case "2":
				{
					
				}
				break;
				case "3":
				{
					
				}
				break;
				case "4":
				{
					
				}
				break;
				case "5":
				{
					
				}
				break;
				case "6":
				{
					
				}
				break;
				case "0":
				{
					JOptionPane.showMessageDialog(null, "Saindo...");
					sw = false;
				}
				break;
				default: JOptionPane.showMessageDialog(null, "Opção invalida!");
			} //switch
		}//while
	}//Area
}
