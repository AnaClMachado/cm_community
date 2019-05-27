
package javaapplication1;

import java.util.Scanner;

public class Exemplar{
    String  titulo, autor, editora,edicao,ISBN;
    int volume;
    
    
    public void cadastrar_livro(){    
        Exemplar q = new Exemplar();
        Scanner ler = new Scanner(System.in);
        q.ISBN=ler.nextLine();
        q.autor=ler.nextLine();
        q.edicao=ler.nextLine();
        q.titulo=ler.nextLine();
        q.volume=ler.nextInt();
        
    } 
    
    
    /*
    METODOS CRUD LIVRO
    /*
    */
}


