public class LeadersinArray{
public static void main(String[] args){
int arr[]={16, 17, 4, 3, 5, 2};
findLeaderElement(arr);
}

public static void findLeaderElement(int arr[]){
for(int i=0;i<arr.length;i++){
boolean checkForLeader=true;
for(int j=i+1;j<arr.length;j++){
if(arr[j]>arr[i]){
checkForLeader= false;
break;
}
}
if(checkForLeader){
System.out.print(arr[i]+" ");
}
}
}
}
