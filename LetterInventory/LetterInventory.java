public class LetterInventory {
    private int[] inventory; // fields - data / state
    private int size;        // 

    public static final int LETTER_COUNT = 26;

    // CONSTRUCTOR default
    // post:
    public LetterInventory(String data) {
      inventory = new int[LETTER_COUNT]; 
      size = 0; //implied?
      data = data.toLowerCase();
      for (int i = 0; i < data.length(); i++) {
         char ch = data.charAt(i);
         if (Character.isLetter(ch)) { 
            inventory[ch - 'a']++;
            size++;
         } 
      }
    }

    public int size() { 
      return size;
    }

    public int[] GetInventory(){
      return inventory;
    }


}