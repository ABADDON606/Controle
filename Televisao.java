import java.util.Scanner;
public class Televisao{
	
	public static void main(String[] args){
		int canal;
		int escolha;
		
		Controle control = new Controle();
		
		control.LerCanal();
		control.LerVolume();
		control.Exibir();
		while (true){
		System.out.println("-------------------------- Inicio -------------------------------");
		System.out.println("Para aumentar volume digite 1  e para diminuir digite 2  ");
		System.out.println("E digite 3 para aumentar canal e digite 4 para diminuir canal, caso queira sair digite 5. ");
			Scanner ler = new Scanner(System.in);
			escolha = ler.nextInt();			
			if (escolha == 1){
				control.AVolume();
				}else{
					if (escolha == 2){
					control.BVolume();
					}else{
						if (escolha == 3){
						control.ACanal();
						}else{
							if(escolha == 4){
							control.BCanal();
								}
							}
						}
					}
					if (escolha == 5){
						break;
			}
			control.Exibir();
		}
	}
}
