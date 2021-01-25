import java.util.Map;
import java.util.HashMap;

import java.util.ArrayList;
import java.util.List;

public class Desafio{

    public static void main(String[] args) {
        int menu;
        List<Item> itemsList = new ArrayList<>();
        List<String> emailsList = new ArrayList<>();
        Map<String, Integer> finalResult = new HashMap<>();

        do {            
        
            menu = Leitor.leInteiroDoTeclado("Bem-vindo à Stone! Estamos aqui para ajudá-lo a calcular sua compra.\nAntes de prosseguir, certifique-se de que os arquivos de texto contem as listas de itens e de emails corretos.\n[1] Prosseguir\n[2] Encerrar\n");
            
            switch (menu) {
                case 1:
                    String pathItems = Leitor.leStringDoTeclado("Informe o nome do arquivo que contem a lista de itens:");
                    
                    // generating items list:
                    itemsList = Arquivo.readItems(pathItems);

                    if (itemsList.isEmpty()) {
                        System.out.println("Lista de itens vazia! Informe uma lista válida.");
                        break;

                    }else{          
                        //test
                        //for (Item i : itemsList)
                        //    System.out.print(i.toString());                                 
                        
                        String pathEmails = Leitor.leStringDoTeclado("Informe o nome do arquivo que contem a lista de emails:");
                    
                        //generating emails list:
                        emailsList = Arquivo.readEmails(pathEmails);
                        
                        if (itemsList.isEmpty()){
                            System.out.println("Lista de emails vazia! Informe uma lista válida.");
                            break;

                        }else{
                            //test
                            //int nEmails = emailsList.size();
                            //System.out.println("emails = " + nEmails);


                            //calculating                               
                            finalResult = Desafio.calculate(itemsList, emailsList);                          
                            
                            for (String key : finalResult.keySet()) {
                                int value = finalResult.get(key);
                                System.out.println(key + " = " + value + " centavos");
                            }
                            
                            //System.out.println(finalResult);
                    
                        }                        
                    
                    }                    
                    
                    break;             

                default:
                    break;
            }

        }while(menu != 2);
        
    } 
    
    public static Map<String, Integer> calculate(List<Item> items, List<String> emails) {
        int total = 0;
        int value;
        int totalEmails = emails.size();
        Map<String, Integer> map = new HashMap<String,Integer>();

        for (Item i : items)
            total += i.getPrice() * i.getAmount();

        value = total/totalEmails;

        for (int i = 0; i < emails.size(); i++) {            
            
            if (total % totalEmails != 0 && i == emails.size()-1) {
                value += 1;
            }
            
            //building the map
            map.put(emails.get(i), value);
        } 

        return map;
    }
}
