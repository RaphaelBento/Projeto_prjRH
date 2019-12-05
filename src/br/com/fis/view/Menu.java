
package br.com.fis.view;
import br.com.fis.model.Empregado;
import br.com.fis.utl.Teclado;


public class Menu {
    public static void main(String[] args){
    	   String nome=null;
           int ID=0;
           long CPF=0; 
        	
    	
    	Teclado tc=new Teclado();
    	  Empregado Empre =new Empregado(nome,CPF,ID);
    
     System.out.println("Insira o nome do novo empregado : ");
     tc.setLerString(nome);
     System.out.println("Insira o Identificador único do Funcionário : ");
     tc.setLerInt(ID);
     System.out.println("Insira o CPF do funcionário \n Somente numeros sem ponto ou virgula");
     tc.setLerLong(CPF);
        
      
        
    
        System.out.println("Cpf da classe teclado "+tc.getDevoveLong()+" \n CPF da classe Empregado "+Empre.getCPF());
}
    }
