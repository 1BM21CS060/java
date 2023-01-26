package SEE;

import CIE.*;

public class External extends Internals{
public int[] marksi=new int[5];

public void set(int[] a){
for(int i=0;i<5;i++){
marksi[i]=a[i];
}
}

public void get(){
for(int i=0;i<5;i++){
System.out.println("External marks");
System.out.println("Subject "+i+": "+marksi[i]);
}
}

}
