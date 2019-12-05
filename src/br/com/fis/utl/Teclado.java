
package br.com.fis.utl;

import java.util.Scanner;

public class Teclado {
    private int LerInt;
    private long LerLong;
    private String LerString;
	
	Scanner sc =new Scanner(System.in);

	
	public Teclado() {
		
	}
	public void setLerInt(int Lerint) {
		Lerint=sc.nextInt();
		this.LerInt=Lerint;
	}
	public int getDevolvaInt() {
		return LerInt;
	}
	public void setLerString(String ler) {
	ler=sc.nextLine();
	this.LerString=ler;
	}
	public String getDevolveString() {
		return LerString;
	}
	public void setLerLong(long LerLon) {
		LerLon=sc.nextLong();
		this.LerLong=LerLon;
	}
	public long getDevoveLong() {
		return LerLong;
	}
}