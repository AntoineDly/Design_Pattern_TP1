package fr.mds.java.design_pattern.tp1;

import java.util.ArrayList;
import java.util.List;

import fr.mds.java.design_pattern.tp1.entities.Entity1;
import fr.mds.java.design_pattern.tp1.singleton.Singleton;

/**
*
* @author tactfactory
*
* - Modifier le programme pour :
*   - 1 : permettre d'accéder n'importe où dans le projet à la liste d'Entity1
*   - 2 : faire en sorte que les ajouts, suppresions sur la liste d'Entity1 soient préservés durant l'exécution du
*       programme
*   - 3 : que les id des éléments dans la liste ne soient plus saisissables par le développeur et qu'ils deviennent
*       auto-incrémentés
*/
public class SingletonTp1 {
  public static void main(String[] args) {

	for (int i = 0; i < 20; i++) {
	    Singleton.getInstance().addInList();
	}
	  
	 Singleton.getInstance().getList();

  }
}
