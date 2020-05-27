
package Controller;

import Model.Pessoa;
import View.Cadastro;
import View.NovaTela;

public class ControllerCadastro {

    private final Cadastro view;
    private final ControllerHelperCadastro helper;
    
    public ControllerCadastro(Cadastro view) {
        this.view = view;
        this.helper = new ControllerHelperCadastro(view);
    }

    public void mostrarMensagem(){
        System.out.println("mostrar na tela ");
    
    }
    public void retornaMensagem(){
    this.view.retornaMensagem("retorno de mensagem");
    }  
    
    public void mudarTela() {
      Pessoa p1 = helper.ControlHelperCadastroObter();
      NovaTela novaTela = new NovaTela();
      novaTela.setVisible(true);
    }

  
    }
    
   