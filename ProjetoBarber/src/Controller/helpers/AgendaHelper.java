
package Controller.helpers;

import Model.Agendamento;
import Model.Cliente;
import static Model.DAO.Banco.cliente;
import Model.Servico;
import View.Agenda;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class AgendaHelper {
    
 private final Agenda View;

    public AgendaHelper(Agenda View) {
        this.View = View;
    }    

    public void preencherTabela(ArrayList<Agendamento> agendamentos) {
        DefaultTableModel tableModel = (DefaultTableModel) View.getTabela().getModel();
    tableModel.setNumRows(0);
    
        for (Agendamento agendamento : agendamentos) {
        tableModel.addRow(new Object[]{
        agendamento.getId(),
        agendamento.getCliente().getNome(),
        agendamento.getServico().getDescricao(),
        agendamento.getValor(),
        agendamento.GetDataFormatada(),
        agendamento.GetHoraFormatada(),
        agendamento.getObservacao(),
        
            });
        }
    }

    public void preencherClientes(ArrayList<Cliente> clientes) {
     JComboBox<String> comboBoxCliente = View.getComboBoxCliente();
      DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) View.getComboBoxCliente().getModel();
       
        for (Cliente cliente : clientes) {
            comboBoxModel.addElement(cliente);
        }
        }

    public void preencherServico(ArrayList<Servico> servicos) {
     DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) View.getComboBoxServico().getModel();
       
        for (Servico servico : servicos) {
            comboBoxModel.addElement(servico);
            
        }
    }
    }
