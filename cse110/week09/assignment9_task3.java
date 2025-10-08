public class Task3 {
  public static int print_element(int[] arr, int index) {
    if (index == arr.length - 1) {
      System.out.println(arr[index]);
      return arr[index];      
    }
    System.out.println(arr[index]);   
    return print_element(arr, index + 1);      
  }

  public static void main(String[] args) {
    int[] arr1 = {5, 6, 2, 1, 8, 7};
    int index1 = 2;
    print_element(arr1, index1);
    System.out.println();
    
    int[] arr2 = {13, 12, 19, 21, 31, 55};
    int index2 = 0;
    print_element(arr2, index2);
  }
}