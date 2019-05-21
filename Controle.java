import java.util.Scanner;
public class Controle{
	
	public int canal;
	public int volume;
	public int avolume;
	public int bvolume;
	
	public  void LerCanal(){
		System.out.print("Canal: ");
			Scanner ler = new Scanner(System.in);
			canal = ler.nextInt();
				if (canal < 0){
					canal = 1;
				}
	}
		
	public void LerVolume(){
		System.out.print("Volume: ");
			Scanner ler = new Scanner(System.in);
			volume = ler.nextInt();
			if (volume > 100){
				volume = 100;
			}else{
				if (volume < 0){
					volume = 0;
				}
			}
	}
		
	public  void Exibir(){
		System.out.println("Canal atual: " + canal);
			System.out.println("Volume atual: " + volume);
	}
	public  void AVolume(){
		if (volume < 100){
		volume++;
		}
	}
	public  void BVolume(){
		if (volume > 0){
		volume--;
		}
	}
		public  void ACanal(){
		canal++;
	}
	public  void BCanal(){
		if(canal > 0){
		canal--;
		}
	}
	
}
