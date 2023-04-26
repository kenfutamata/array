public class cap2{

private int num1;
private int sum = 0; 
private double avg = 0; 
private int arr[] = new int[5];
private int largest; 
public cap2(int num1, int arr[] ){

this.num1 = num1; 
this.arr = arr; 
}

public int getSize(){
return num1; 

}

public int[] getarr(){
return arr;

}

public int getSum(){

return sum; 
}
public int sum(){

for(int i = 0 ; i <num1; i++){
sum=sum+arr[i];


}
return sum;
}

public double getAvg(){
return avg;
}

public double avg(){
for(int i = 0 ; i <num1; i++){
avg= sum/getSize();


}
return avg; 

}
public void display(){

for(int i = 0 ; i <num1; i++){
System.out.print(" "+arr[i]); 
}
System.out.print("\nSum is "+sum()); 
System.out.print("\nAverage is "+avg());
System.out.print("\nlargest is "+largest());
System.out.print("\nsmallest is "+smallest());
}

public int largest(){
for(int i = 0 ; i <num1; i++){
if(arr[i]>=largest){

largest = arr[i]; 
}


}
return largest; 

}


public int smallest(){
int smallest = arr[0];
for(int i = 0 ; i <num1; i++){
if(arr[i]<=smallest){

smallest = arr[i]; 
}


}
return smallest; 

}

public void find(){
int flag = 0; 
int i = 0; 
for( i = 0 ; i <num1; i++){
   if(arr[i]==largest()){
   flag =1; 
   break; 
 }else {
      flag =0; 
  }
 }
   if(flag == 1){
   System.out.print("\nElement found "+(i+1));
   
   }




}
}








