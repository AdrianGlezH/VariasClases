/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4;

/**
 *
 * @author dam1
 */
public class Libro {
    //atributos
    String titulo, autor;
    int ano;
    short numPaginas;
    float valoracion;
    
    //metodos       
    public Libro(){             //por defecto
    }           
    
    public  Libro(String titulo1, String autor1, int ano1, short numPaginas1){
        titulo1 = titulo;
        autor1 = autor;
        ano1= ano;
        numPaginas1 = numPaginas;
    }
    
    public void setTitulo (String titulo1){
    titulo = titulo1;
    }
    
    public String getTitulo(String titulo){
    return titulo;
    }
    
    
    public void setAutor (String autor1){
    autor = autor1;
    }
    
     public String getAutor(String autor){
    return autor;
     }

    public void setAno (int ano){
    ano = ano;
    }

     public int getAno(int ano){
     return ano;    
    }
     
    public void setnumPaginas (short numPaginas){
    numPaginas = numPaginas;
    }
    
    public short getnumPaginas (short numPaginas){
    return numPaginas;
    }
    
    public void amosar(Libro obxlibro2){
        
       System.out.println("autor" + obxlibro2.getTitulo(autor) + "ano" + obxlibro2.getAno(ano) + "número de páginas" + obxlibro2.getnumPaginas(numPaginas) );
        
    }                                                                          //4 metodo amosar non devolve nada e visualiza caracteristicas libro

  


}
