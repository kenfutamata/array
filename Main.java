import java.util.Scanner; 

public class Main{

public static void main(String[]args){
Scanner input = new Scanner(System.in); 
int arr[] = new int[5]; 
int size; 

System.out.print("Enter the size "); 
size = input.nextInt(); 
System.out.println("Enter the size of a array");
for(int i = 0; i < size; i++){

arr[i]= input.nextInt(); 


}
cap2 j1 = new cap2(size, arr); 
j1.display(); 
j1.find();
} 

}