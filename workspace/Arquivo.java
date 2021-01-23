import java.io.FileReader;
import java.io.BufferedReader;

import java.io.IOException;
import java.io.FileNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class Arquivo{

    public static List<Item> readItems(String pathItems) {
            
        String name;
        int n, price;           //auxiliar variables
        String linha;           
        String palavras[];      

        List<Item> temp = new ArrayList<>();
        
        try {
        
            FileReader reader = new FileReader(pathItems);
            BufferedReader buffer = new BufferedReader(reader);
            linha = "";
            try {
                
                linha = buffer.readLine();
                
                while (linha != null) {
                    //System.out.println(linha);

                    //spliting the line's data
                    palavras = linha.split("/");
                    name = palavras[0];
                    n = Integer.parseInt(palavras[1]);
                    price = Integer.parseInt(palavras[2]);
                    
                    //building the list to be returned
                    Item item = new Item(name, n, price);
                    temp.add(item);
                   
                    linha = buffer.readLine();
                }

                reader.close();               
                
            } catch (IOException ex) {
                System.out.println("Erro: nao foi possivel ler o arquivo");
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("Erro: arquivo não encontrado!");
        }
        
        return temp;

    }


    /* public static List<String> readEmails(String pathEmails) {
        List<String> temp;


        return temp;
    } */

}