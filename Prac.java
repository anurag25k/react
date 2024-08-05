public class Prac{
    int start,end;
public void cal(int arr[]){
   for (int i = 0; i < arr.length; i++) {
    start=i;
    for (int j = 0; j < arr.length; j++) {
        end =j;
        int sum=0;
        for (int j2 = start; j2 <= end; j2++) {
            
            System.out.print(arr[j2]+" ");
            sum+=arr[j2];
        } 
        System.out.print("sum="+sum);
        System.out.println();
    }
  
   }

}

public static void main(String[] args){
Prac obj=new Prac();
int arr[] ={1,2,3,4,5};
obj.cal
(arr);
}
}