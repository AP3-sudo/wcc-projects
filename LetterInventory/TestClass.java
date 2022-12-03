public class TestClass{
  public static void main(String[] args){

      // tets data
      String str = "seattle";

      // instane with constructor value
      LetterInventory test = new LetterInventory(str);

      // call method
      int[] letters = test.GetInventory();

      // show output
      for(int j=0;j<letters.length;j++){
        System.out.println(letters[j]);
      }

    }
}