import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		
		Tarefa tarefa = new Tarefa("Fazer lista de exercícios", 1.0);
		
		ItemTarefa item1 = new ItemTarefa("Lista 1", 100.0);
		ItemTarefa item2 = new ItemTarefa("Lista 2", 50.0);
         	
		item1.concluir("21/03/2021");
		
		tarefa.adicionaItem(item1);
		tarefa.adicionaItem(item2);
		
		item2.concluir("01/04/2021");
		
		System.out.println(item1);
		System.out.println(item2);
	}

}
