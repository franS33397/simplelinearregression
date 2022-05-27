/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplelinearregression;
/**
 *
 * @author Fran33
 */


/****** */

import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;

public class Agent_SimpleLinearRegression extends Agent {

  protected void setup() {
    System.out.println("Agent "+getLocalName()+" started.");
    addBehaviour(new MyOneShotBehaviour());
  } 

  private class MyOneShotBehaviour extends OneShotBehaviour {

    public void action() {
        SimpleLinearRegression simple = new SimpleLinearRegression();
        Datos data = new Datos();
        data.imprime();
        simple.formula(data.datosX, data.datosY);
        onEnd();
    } 
    
    public int onEnd() {
      myAgent.doDelete();   
      return super.onEnd();
    } 
  }    // END of inner class ...Behaviour
}
/***** */

/*
public class Agent_SimpleLinearRegression extends Agent {
    
    //@Override
    public static void main(String[] args){
    SimpleLinearRegression simple = new SimpleLinearRegression();
    simple.formula();
    }
    

}
*/
