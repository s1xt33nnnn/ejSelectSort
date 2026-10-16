public class ejSelectSort {
    public static void main(String[] args) {
        int[] array ={4,7,1,8,3,2,6,8,5,9,10};
        int dancing,temp;
        for (int i = 0; i < array.length; i++){
            dancing = array[i];
            for (int j = i + 1; j < array.length; j++){
                if (array[j]<dancing){
                    temp=dancing;
                    dancing = array[j];
                    array[j] = temp;
                }
            }
            array[i] =dancing;
        }
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
