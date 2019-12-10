package entrada;

import javax.swing.JOptionPane;

import hiberjpaaven.model.AreaModel;

public class EntraArea {
	public AreaModel salvar(AreaModel area)
	{
		area.setDescricao(JOptionPane.showInputDialog("Descrição:"));
		return area;
	}

}
