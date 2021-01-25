import java.io.FileReader;
import java.io.BufferedReader;

import java.io.IOException;
import java.io.FileNotFoundException;

import java.util.ArrayList;
import java.util.List;

//this class makes the reading files
public class Arquivo{

    public static List<Item> readItems(String pathItems) {
            
        String name;
        int n, price;           //auxiliar variables
        String line;           
        String palavras[];      

        List<Item> temp = new ArrayList<>();
        
        try {
        
            FileReader reader = new FileReader(pathItems);
            BufferedReader buffer = new BufferedReader(reader);
            line = "";
            try {
                
                line = buffer.readLine();
                
                while (line != null) {

                    //spliting the line's data
                    palavras = line.split("/");
                    name = palavras[0];
                    n = Integer.parseInt(palavras[1]);
                    price = Integer.parseInt(palavras[2]);
                    
                    //building the list to be returned
                    Item item = new Item(name, n, price);
                    temp.add(item);
                   
                    line = buffer.readLine();
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

    public static List<String> readEmails(String pathEmails) {
        
        // auxiliar variables
        List<String>  temp = new ArrayList<>();
        String email;          

        try {

            FileReader reader = new FileReader(pathEmails);
            BufferedReader buffer = new BufferedReader(reader);
            email = "";
            try {

                email = buffer.readLine();

                while (email != null) {
                    // building the list to be returned
                    temp.add(email);
                    email = buffer.readLine();
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

}