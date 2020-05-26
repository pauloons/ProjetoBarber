
package Controller;

import Controller.helpers.AgendaHelper;
import Model.Agendamento;
import Model.Cliente;
import Model.DAO.AgendamentoDAO;
import Model.DAO.ClienteDAO;
import Model.DAO.ServicoDAO;
import Model.Servico;
import View.Agenda;
import java.util.ArrayList;


public class AgendaController {

 private final Agenda View;
 private final AgendaHelper helper;
        
    public AgendaController(Agenda View) {
        this.View = View;
        this.helper = new AgendaHelper(View);
    }
 public void atualizaTabela(){
     AgendamentoDAO agendamentoDao  = new AgendamentoDAO();
     ArrayList<Agendamento> agendamentos = agendamentoDao.selectAll();
      helper.preencherTabela(agendamentos);
 }   
 public void atualizaCliente(){
     ClienteDAO clientedao = new ClienteDAO();
     ArrayList<Cliente> preencherClientes = clientedao.selectAll();
     helper.preencherClientes(preencherClientes);
}
 public void atualizaServico(){
    ServicoDAO servicodao =  new ServicoDAO();
     ArrayList<Servico> preencherServico = servicodao.selectAll();
 helper.preencherServico(preencherServico);    
 }
 
}