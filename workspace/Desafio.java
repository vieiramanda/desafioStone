import java.util.Map;
import java.util.HashMap;

import java.util.ArrayList;
import java.util.List;

public class Desafio{

    /* public static Map<String, Integer> calcular(List<Item> itens, List<String> emails) {
        

    } */

    public static void main(String[] args) {
        
        int option = Leitor.leInteiroDoTeclado("Bem-vindo à Stone!\nEstamos aqui para ajudá-lo a calcular sua compra. Antes de prosseguir, certifique-se de que os arquivos de texto contem as listas de itens e de emails corretos.\nTecle 1 para continuar ou 2 para encerrar\n");
        
        if (option == 1) {
            List<Item> itemsList = new ArrayList<>();
            List<String> emailsList = new ArrayList<>();
        
            Map<String, Integer> result = new HashMap<String, Integer>();
        


            //gerando as listas de itens e emails:
            itemsList = Arquivo.readItems("listItems.txt");

            if (itemsList.isEmpty()) {
                System.out.println("Lista de itens vazia!");
            }else{             
                
                for (Item i : itemsList) {
                    System.out.print(i.toString());
                }
                
                //emailsList = Arquivo.readEmails("listEmails.txt");
            }

        }


        
    } 
    

}
