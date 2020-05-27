
package Controller;

import Model.Pessoa;
import View.Cadastro;


public class ControllerHelperCadastro {

    private final Cadastro view;

    public ControllerHelperCadastro(Cadastro view) {
        this.view = view;
    }
     public void obterNome(){
    String nome = this.view.getTxtNome().getText();
        System.out.println(nome);
    }
    public void obterCpf(){
    String cpf = this.view.getTxtCpf().getText();
        System.out.println(cpf);
    }

    public Pessoa ControlHelperCadastroObter(){
    String nome = this.view.getTxtNome().getText();
    String cpf = this.view.getTxtCpf().getText();
    Pessoa p1 = new Pessoa(nome,cpf);
    return p1;
  }
    
    public void ControlHelperCadastroSetar(Pessoa p1){
    String nome = p1.getNome();
    String cpf = p1.getCpf();
    
    view.getTxtNome().setText(nome);
    view.getTxtCpf().setText(cpf);
    }
    
    public void ControlHelperLimpar(){
    view.getTxtNome().setText("");
    view.getTxtCpf().setText("");
    }
}