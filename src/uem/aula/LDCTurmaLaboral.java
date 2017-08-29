
package uem.aula;

import java.util.ArrayList;

/**
 *
 * @author Alfredo
 */
public class LDCTurmaLaboral {
   
    private LDCEstudante estudante;
    ArrayList<LDCEstudante> lista;
    
  public void add(LDCEstudante estudante){
      lista.add(estudante);
  }
  
  public double media(){
      double soma=0;
      for (int i = 0; i < lista.size(); i++) {
          soma+=lista.get(i).getMedia();
      }
      return soma/lista.size();
  }
}
