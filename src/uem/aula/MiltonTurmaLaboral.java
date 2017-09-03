/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.aula;

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Toni Maunde
 * Esta classe especifica o atributo de uma turma(a lista de alunos) e as accoes(metodos) possiveis nela: adicionar estudantes a lista, calcular a media das notas da turma,por meio das medias de cada aluno verificar quais os melhores  
 */
public class MiltonTurmaLaboral {
    Vector<Estudante> listaDeAlunos;
   
    
    /**
     * Este metodo nao recebe parametro. Ele permite adicionar novos estudantes a lista de alunos da turma.
     */
    public void adicionar(){
        int r = Integer.parseInt(JOptionPane.showInputDialog("Quantos alunos deseja registar: ?"));
        listaDeAlunos= new Vector<>(r);
        int i;
        for(i=0; i<listaDeAlunos.size(); i++){
            String n = JOptionPane.showInputDialog("Introduza o nome do Aluno.");
            double n1 = Double.parseDouble(JOptionPane.showInputDialog("Introduza a nota do teste 1"));
            double n2 = Double.parseDouble(JOptionPane.showInputDialog("Introduza a nota do teste 2"));
            double n3 = Double.parseDouble(JOptionPane.showInputDialog("Introduza a nota do teste 3"));
            
            double media= (n1+n2+n3)/3;
            Vector<Double> notas= new Vector<>();
            
            notas.add(n1);
            notas.add(n2);
            notas.add(n3);
            Estudante estudante= new Estudante(n, notas, media);
            listaDeAlunos.add(estudante);
        }
    }
    
    
    /**
     * 
     * @return Este metodo calcula a media das notas da turma inteira e retorna o seu valor
     */
    public double calcularMedia(){
        int i;
        double media=0;
        for(i=0; i<listaDeAlunos.size(); i++) media=media+listaDeAlunos.get(i).getMedia();
        
        return media/(i-1);
       
    }
    
    
    /**
     * Este metodo pega a lista de alunos e verifica a media de cada aluno procurando a maior e a coloca numa lista a parte. Se existem dois ou mais alunos cujas medias iguais e maiores que as dos outros estudantes, eles sao colocados numa lista dos melhores alunos da turma
     */
    public void melhorAluno(){
        String nomeDoMelhor=listaDeAlunos.get(0).getNome();
        double mediaDoMelhor=listaDeAlunos.get(0).getMedia();
        int i;
        
        ArrayList<Estudante> listaDosMelhores= new ArrayList<>();
        
        for(i=1; i<listaDeAlunos.size(); i++){
            if(listaDeAlunos.get(i).getMedia()>mediaDoMelhor){
                mediaDoMelhor=listaDeAlunos.get(i).getMedia();
                nomeDoMelhor=listaDeAlunos.get(i).getNome();
            }
        }
        
        for(i=0; i<listaDeAlunos.size(); i++){
            if(listaDeAlunos.get(i).getMedia()==mediaDoMelhor){
                listaDosMelhores.add(listaDeAlunos.get(i));
            }
        }
        
        if(listaDosMelhores.isEmpty()) JOptionPane.showMessageDialog(null, "O melhor estudante e: \n"+nomeDoMelhor+" \n "+mediaDoMelhor);
        
        else for(i=0; i<listaDosMelhores.size();i++){
            JOptionPane.showMessageDialog(null, "Os melhores estudantes: \n"+listaDosMelhores.get(i).getNome()+"\n "+listaDosMelhores.get(i).getMedia());
        }

    }
    public static void main(String[] args) {
        
    }
}
