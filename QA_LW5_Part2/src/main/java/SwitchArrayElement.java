public class SwitchArrayElement {
    static int[] array = {1,2,3,4,5,6,7};

    public int[] switchElement(int[] arr){
        for(int i = 0; i < arr.length / 2; i++){
            int temp = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }

    public void printArray(){
        for(Integer i : array){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        SwitchArrayElement sae = new SwitchArrayElement();
        System.out.println("Starter array:");
        sae.printArray();
        sae.switchElement(array);
        System.out.println("New array:");
        sae.printArray();
    }
}
