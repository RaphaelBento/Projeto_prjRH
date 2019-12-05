
package br.com.fis.model;

import br.com.fis.utl.Teclado;

public class Empregado { 
	Teclado tc =new Teclado();

   private  String nome;
   private long cpf;
   private int ID;
   
   public Empregado(String nome,long cpf,int ID){
	   this.nome=nome;
	   this.cpf=cpf;
	   this.ID=ID;
   }
   public void setNome(String nome){
   nome=tc.getDevolveString();
   }
   public String getNome(){
       return nome;
   }
   public void setCPF(long cpf){
       cpf=tc.getDevoveLong();
      
   }
   public long getCPF() {
       return cpf;
   }
 

}
