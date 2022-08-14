import java.util.*;
public class MyClass {
  public static String processInput(String inputLine) {
    //Aqui voce pode codificar seu algoritmo e processar a entrada. 
    return inputLine;
  }

  //Este e um exemplo de processamento de entradas (inputs), sinta-se a vontade para altera-lo conforme necessidade da questao.
  public static void main(String args[]) {

    Scanner scanner = new Scanner (System.in);

     

    while (scanner.hasNext() == true) {
      String inputLine = scanner.nextLine();
      System.out.println(processInput(inputLine));

      String testeTwo = "[" + inputLine.replaceAll(" ", ",") + "]";
    

       String testString = testeTwo;
       
       String[] separatedStrings = testString.replaceAll("\\[", "")
           .replaceAll("]", "").split(",");
       
       int[] intArray = new int[separatedStrings.length];
       
       for (int i = 0; i < separatedStrings.length; i++) {
           intArray[i] = Integer.parseInt(separatedStrings[i]);    
       }
       
       System.out.println(Arrays.toString(intArray));

      
      Arrays.sort(intArray);
      for (int i : intArray) {
        System.out.print(i+" ");
      }

    }

    



    
    
  
        



  } 
}