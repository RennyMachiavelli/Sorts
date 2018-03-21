import java.util.Random;
public class Sorts {
    private int[] list = new int[10];

    public Sorts () {
        Random random = new Random();
        for (int i = 0; i < list.length; i++) {
            list[i] = random.nextInt(100);
        }
    }

    public void selection() {
        int smallest, smallestPosition, temp;
        for(int i = 0; i < list.length; i++) {
            smallest = list[i];
            smallestPosition = i;
            for(int j = i + 1; j < list.length; j++) {
                if(list[j] < smallest) {
                    smallest = list[j];
                    smallestPosition = j;
                }
            }
            temp = list[i];
            list[i] = smallest;
            list[smallestPosition] = temp;
        }
    }

    public void insertion() {
        for(int i = 1, j = i -1; i < list.length; i++, j++) {
            int currentNumber = list[i];
            if (currentNumber < list[j]) {
                boolean done = false;
                do {
                    if(j > 0) {
                        list[j + 1] = list[j];
                        j--;
                    }
                    else {
                        list[j] = currentNumber;
                        done = true;
                    }
                }
                while(currentNumber < list[j] && !done);
                if(!done)
                    list[j + 1] = currentNumber;
            }
        }
    }

    public void bubble() {

    }

    public void displayList() {
        for(int i = 0; i < list.length; i++) {
            System.out.print(list[i] + ", ");
        }
        System.out.println();
    }
}
